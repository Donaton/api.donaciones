package pe.upao.edu.apidonaciones.service;


import pe.upao.edu.apidonaciones.repository.Desastre;
import pe.upao.edu.apidonaciones.repositoryI.DesastreRepositoryI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesastreService {

	@Autowired
	private DesastreRepositoryI desastreRepositoryI;
	
	public String listar(String consulta) {
		return desastreRepositoryI.listar(consulta);
	}
	
	public String registrar(Desastre d) {
		return desastreRepositoryI.registrar(
				d.getTitulo(),
				d.getDescripcion(),
				d.getMonto_limite(),
				d.getDireccion(),
				d.getId_ubicacion());
	}
	
	public String editar(Desastre d) {
		return desastreRepositoryI.editar(
				d.getId_desastre(),
				d.getTitulo(),
				d.getDescripcion(),
				d.getMonto_limite(),
				d.getDireccion(),
				d.getId_ubicacion());
	}
	
	public String eliminar(int id) {
		return desastreRepositoryI.eliminar(id);
	}
}
