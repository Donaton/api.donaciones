package pe.upao.edu.apidonaciones.repositoryI;

import pe.upao.edu.apidonaciones.repository.Caso;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface CasoRepositoryI extends CrudRepository<Caso, Integer>{

	@Procedure(name="listar_casos")
	public String listar(
			@Param("in_consulta") String consulta
			);
	
	@Procedure(name="registrar_caso")
	public String registrar(
			@Param("in_nombre") String nombre,
			@Param("in_descripcion") String descripcion,
			@Param("in_fecha") Date fecha,
			@Param("in_monto") double monto,
			@Param("in_direccion") String direccion,
			@Param("in_ubicacion") int ubicacion,
			@Param("in_damnificado") int damnificado,
			@Param("in_desastre") int desastre,
			@Param("in_descripcion_evidencia") String descripcion_evidencia,
			@Param("in_imagen") String imagen
			);
	
	@Procedure(name="editar_caso")
	public String editar(
			@Param("in_id") int id,
			@Param("in_id_evidencia") int id_evidencia,
			@Param("in_nombre") String nombre,
			@Param("in_descripcion") String descripcion,
			@Param("in_fecha") Date fecha,
			@Param("in_monto") double monto,
			@Param("in_direccion") String direccion,
			@Param("in_ubicacion") int ubicacion,
			@Param("in_damnificado") int damnificado,
			@Param("in_desastre") int desastre,
			@Param("in_descripcion_evidencia") String descripcion_evidencia,
			@Param("in_imagen") String imagen
			);
	
	@Procedure(name="eliminar_caso")
	public String eliminar(
			@Param("in_id") int id,
			@Param("in_id_evidencia") int id_evidencia
			);
	
	@Procedure(name="registrar_donacion")
	public String donar(
			@Param("in_nombre") String nombre,
			@Param("in_dni") String dni,
			@Param("in_telefono") String telefono,
			@Param("in_correo") String correo,
			@Param("in_numero") String numero,
			@Param("in_persona") String persona,
			@Param("in_monto") double monto,
			@Param("in_desastre") int desastre
			
			);
}
