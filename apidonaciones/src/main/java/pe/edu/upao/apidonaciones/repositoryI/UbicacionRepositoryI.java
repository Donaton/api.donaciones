package pe.edu.upao.apidonaciones.repositoryI;

import com.upao.donaciones.repository.Ubicacion;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UbicacionRepositoryI extends CrudRepository<Ubicacion, Integer>{

	@Procedure(name="listar_ubicaciones")
	public String listar(
			@Param("in_consulta") String consulta
			);
	
	@Procedure(name="registrar_ubicaciones")
	public String registrar(
			@Param("in_region") String region,
			@Param("in_provincia") String provincia,
			@Param("in_distrito") String distrito
			);
	
	@Procedure(name="editar_ubicacion")
	public String editar(
			@Param("in_id") int id,
			@Param("in_region") String region,
			@Param("in_provincia") String provincia,
			@Param("in_distrito") String distrito
			);
	
	@Procedure(name="eliminar_ubicacion")
	public String eliminar(
			@Param("in_id") int id
			);
}
