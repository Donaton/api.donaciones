package pe.upao.edu.apidonaciones.repositoryI;
import pe.upao.edu.apidonaciones.repository.Damnificado;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DamnificadoRepositoryI extends CrudRepository<Damnificado, Integer>{

	@Procedure(name="listar_damnificados")
	public String listar(
			@Param("in_consulta") String consulta
			);
	
	@Procedure(name="registrar_damnificado")
	public String registrar(
			@Param("in_nombre") String nombre,
			@Param("in_dni") String dni,
			@Param("in_genero") String genero,
			@Param("in_correo") String correo,
			@Param("in_telefono") String telefono,
			@Param("in_direccion") String direccion,
			@Param("in_ciudad") String ciudad
			);
	
	@Procedure(name="editar_damnificado")
	public String editar(
			@Param("in_id") int id,
			@Param("in_nombre") String nombre,
			@Param("in_dni") String dni,
			@Param("in_genero") String genero,
			@Param("in_correo") String correo,
			@Param("in_telefono") String telefono,
			@Param("in_direccion") String direccion,
			@Param("in_ciudad") String ciudad
			);
	
	@Procedure(name="eliminar_damnificado")
	public String eliminar(
			@Param("in_id") int id
			);
}
