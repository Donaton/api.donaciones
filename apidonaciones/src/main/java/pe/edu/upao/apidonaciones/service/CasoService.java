package pe.edu.upao.apidonaciones.service;


import pe.edu.upao.apidonaciones.bean.CasoBean;

import pe.edu.upao.apidonaciones.bean.DonacionBean;

import pe.edu.upao.apidonaciones.repositoryI.CasoRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CasoService {

	@Autowired
	private CasoRepositoryI casoRepositoryI;
	
	
	public String listar(String consulta) {
		return casoRepositoryI.listar(consulta);
	}
	
	public String registrar(CasoBean caso) {
		
		return casoRepositoryI.registrar(
				caso.getCaso().getNombre(),
				caso.getCaso().getDescripcion(),
				caso.getCaso().getFecha(),
				caso.getCaso().getMonto(),
				caso.getCaso().getDireccion(),
				caso.getCaso().getId_ubicacion(),
				caso.getCaso().getId_damnificado(),
				caso.getCaso().getId_desastre(),
				caso.getEvidencia().getDescripcion(),
				caso.getEvidencia().getImagen());
	}
	
	public String editar(CasoBean caso) {
		return casoRepositoryI.editar(
				caso.getCaso().getId_caso(),
				caso.getEvidencia().getId_evidencia(),
				caso.getCaso().getNombre(),
				caso.getCaso().getDescripcion(),
				caso.getCaso().getFecha(),
				caso.getCaso().getMonto(),
				caso.getCaso().getDireccion(),
				caso.getCaso().getId_ubicacion(),
				caso.getCaso().getId_damnificado(),
				caso.getCaso().getId_desastre(),
				caso.getEvidencia().getDescripcion(),
				caso.getEvidencia().getImagen());
	}
	
	public String eliminar(int id) {
		return casoRepositoryI.eliminar(id,0);
	}
	
	public String donacion(DonacionBean d) {
		return casoRepositoryI.donar(
				d.getDonante().getNombre(),
				d.getDonante().getDni(),
				d.getDonante().getTelefono(),
				d.getDonante().getCorreo(),
				d.getNumero(),
				d.getPersona(),
				d.getMonto(),
				d.getDesastre());
	}
}
