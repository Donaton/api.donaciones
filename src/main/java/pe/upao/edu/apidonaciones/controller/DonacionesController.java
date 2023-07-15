package pe.upao.edu.apidonaciones.controller;

import pe.upao.edu.apidonaciones.bean.CarpetaWatcher;
import pe.upao.edu.apidonaciones.bean.CasoBean;
import pe.upao.edu.apidonaciones.bean.DonacionBean;
import pe.upao.edu.apidonaciones.repository.Damnificado;
import pe.upao.edu.apidonaciones.repository.Desastre;
import pe.upao.edu.apidonaciones.repository.Ubicacion;
import pe.upao.edu.apidonaciones.service.*;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/apiDonaciones")
public class DonacionesController {
	
	private final ResourceLoader resourceLoader;

	
	@Autowired
	private UbicacionService ubicacionServicio;
	
	@Autowired
	private DamnificadoService damnificadoService;
	
	@Autowired
	private DesastreService desastreService;
	
	@Autowired
	private CasoService casoService;
	
	@Autowired
	 public DonacionesController(ResourceLoader resourceLoader) {
	        this.resourceLoader = resourceLoader;
	 }

	//STORE PROCEDURE LISTAR UBICACIONES
	@RequestMapping(value ="/ubicacion/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarUbicaciones() throws Exception{
		
		String data = ubicacionServicio.listar("");
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE GUARDAR UBICACIONES
	@RequestMapping(value ="/ubicacion/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> registrarUbicacion(@RequestBody Ubicacion ubicacion) throws Exception{
		
		String data = ubicacionServicio.registrar(ubicacion);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE EDITAR UBICACIONES
	@RequestMapping(value ="/ubicacion/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> editarUbicacion(@RequestBody Ubicacion ubicacion) throws Exception{
		
		String data = ubicacionServicio.editar(ubicacion);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE ELIMINAR UBICACIONES
	@RequestMapping(value ="/ubicacion/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarUbicacion(@PathVariable("id")int id) throws Exception{
		
		String data = ubicacionServicio.eliminar(id);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//DAMNIFICADOS
	
	//STORE PROCEDURE LISTAR DAMNIFICADOS
	@RequestMapping(value ="/damnificado/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarDamnificado() throws Exception{
		
		String data = damnificadoService.listar("");
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE GUARDAR DAMNIFICADOS
	@RequestMapping(value ="/damnificado/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> registrarDamnificado(@RequestBody Damnificado damnificado) throws Exception{
		
		String data = damnificadoService.registrar(damnificado);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE EDITAR DAMNIFICADOS
	@RequestMapping(value ="/damnificado/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> editarDamnificado(@RequestBody Damnificado damnificado) throws Exception{
		
		String data = damnificadoService.editar(damnificado);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE ELIMINAR DAMNIFICADOS
	@RequestMapping(value ="/damnificado/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarDamnificado(@PathVariable("id")int id) throws Exception{
		
		String data = damnificadoService.eliminar(id);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//DESASTRES
	
	//STORE PROCEDURE LISTAR DESASTRES
	@RequestMapping(value ="/desastre/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarDesastre() throws Exception{
		
		String data = desastreService.listar("");
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE GUARDAR DESASTRES
	@RequestMapping(value ="/desastre/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> registrarDesastre(@RequestBody Desastre desastre) throws Exception{
		
		String data = desastreService.registrar(desastre);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE EDITAR DESASTRES
	@RequestMapping(value ="/desastre/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> editarDesastre(@RequestBody Desastre desastre) throws Exception{
		
		String data = desastreService.editar(desastre);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE ELIMINAR DESASTRES
	@RequestMapping(value ="/desastre/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarDesastre(@PathVariable("id")int id) throws Exception{
		
		String data = desastreService.eliminar(id);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//CASOS
	
	//STORE PROCEDURE LISTAR CASOS
	@RequestMapping(value ="/caso/listar", method = RequestMethod.GET)
	public ResponseEntity<?> listarCasos() throws Exception{
		
		String data = casoService.listar("");
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE GUARDAR CASOS
	@RequestMapping(value ="/caso/guardar", method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> registrarCaso(@RequestParam("file") MultipartFile file,@RequestParam("json") String jsonData) throws Exception{
		String rutaFinal = "";
		ObjectMapper objectMapper = new ObjectMapper();
		CasoBean caso = objectMapper.readValue(jsonData, CasoBean.class);
		Path directorioImagenes = Paths.get("src//main//resources//static/imagenes");
		String rutaAbsoluta = directorioImagenes.toFile().getAbsolutePath();
		
		try {
			byte[] bytesImg = file.getBytes();
			Path rutaCompleta = Paths.get(rutaAbsoluta + "//"+ caso.getCaso().getNombre().replaceAll("\\s+", "")+file.getOriginalFilename().replaceAll("\\s+", ""));
			Files.write(rutaCompleta, bytesImg);
			
			rutaFinal = "http://localhost:8080/imagenes/"+caso.getCaso().getNombre().replaceAll("\\s+", "")+file.getOriginalFilename().replaceAll("\\s+", "");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		 caso.getEvidencia().setImagen(rutaFinal);
		 String data = casoService.registrar(caso);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	
	//STORE PROCEDURE EDITAR CASOS
	@RequestMapping(value ="/caso/editar", method = RequestMethod.PUT)
	public ResponseEntity<?> editarCaso(@RequestBody CasoBean caso) throws Exception{
		
		String data = casoService.editar(caso);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//STORE PROCEDURE ELIMINAR CASOS
	@RequestMapping(value ="/caso/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarCaso(@PathVariable("id")int id) throws Exception{
		
		String data = casoService.eliminar(id);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
	
	//DONACION
	
	//STORE PROCEDURE REGISTRAR DONACION
	@RequestMapping(value ="/donacion/registrar", method = RequestMethod.POST)
	public ResponseEntity<?> guardarDonacion(@RequestBody DonacionBean donar) throws Exception{
		
		String data = casoService.donacion(donar);
		return new ResponseEntity<>(data,HttpStatus.OK);
	}
}
