package pe.edu.upao.apidonaciones.service;

import pe.edu.upao.apidonaciones.repository.Damnificado;
import pe.edu.upao.apidonaciones.repositoryI.DamnificadoRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DamnificadoService {

	@Autowired
	private DamnificadoRepositoryI damnificadoRepositoryI;
	
	public String listar(String consulta) {
		return damnificadoRepositoryI.listar(consulta);
	}
	
	public String registrar(Damnificado d) {
		return damnificadoRepositoryI.registrar(
				d.getNombre(),
				d.getDni(),
				d.getGenero(),
				d.getCorreo(),
				d.getTelefono(),
				d.getDireccion(),
				d.getCiudad());
	}
	
	public String editar(Damnificado d) {
		return damnificadoRepositoryI.editar(
				d.getId_damnificado(),
				d.getNombre(),
				d.getDni(),
				d.getGenero(),
				d.getCorreo(),
				d.getTelefono(),
				d.getDireccion(),
				d.getCiudad());
	}
	
	public String eliminar(int id) {
		return damnificadoRepositoryI.eliminar(id);
	}
}
