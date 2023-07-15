package pe.edu.upao.apidonaciones.repositoryI;

import com.upao.donaciones.repository.Desastre;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DesastreRepositoryI extends CrudRepository<Desastre, Integer>{

	@Procedure(name="listar_desastres")
	public String listar(
			@Param("in_consulta") String consulta
			);
	
	@Procedure(name="registrar_desastre")
	public String registrar(
			@Param("in_titulo") String titulo,
			@Param("in_descripcion") String descripcion,
			@Param("in_monto") double monto,
			@Param("in_direccion") String direccion,
			@Param("in_ubicacion") int ubicacion
			);
	
	@Procedure(name="editar_desastre")
	public String editar(
			@Param("in_id") int id,
			@Param("in_titulo") String titulo,
			@Param("in_descripcion") String descripcion,
			@Param("in_monto") double monto,
			@Param("in_direccion") String direccion,
			@Param("in_ubicacion") int ubicacion
			);
	
	@Procedure(name="eliminar_desastre")
	public String eliminar(
			@Param("in_id") int id
			);
}
