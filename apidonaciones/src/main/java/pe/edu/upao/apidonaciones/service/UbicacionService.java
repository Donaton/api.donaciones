package pe.edu.upao.apidonaciones.service;


import pe.edu.upao.apidonaciones.repository.Ubicacion;

import pe.edu.upao.apidonaciones.repositoryI.UbicacionRepositoryI
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UbicacionService {

	@Autowired
	private UbicacionRepositoryI ubicacionRepositoryI;
	
	public String listar(String consulta) {
		return ubicacionRepositoryI.listar(consulta);
	}
	
	public String registrar(Ubicacion u) {
		return ubicacionRepositoryI.registrar(u.getRegion(), u.getProvincia(), u.getDistrito());
	}
	
	public String editar(Ubicacion u) {
		return ubicacionRepositoryI.editar(u.getId_ubicacion(),
				u.getRegion(),
				u.getProvincia(),
				u.getDistrito());
	}
	
	public String eliminar(int id) {
		return ubicacionRepositoryI.eliminar(id);
	}
}
