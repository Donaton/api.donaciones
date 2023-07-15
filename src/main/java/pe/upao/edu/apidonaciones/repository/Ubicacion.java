package pe.upao.edu.apidonaciones.repository;

import jakarta.persistence.*;
@Entity
@Table(name="ubicacion")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "listar_ubicaciones", procedureName = "f_listar_ubicaciones", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_consulta", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "registrar_ubicaciones", procedureName = "f_registrar_ubicaciones", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_region", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_provincia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_distrito", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "editar_ubicacion", procedureName = "f_editar_ubicacion", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_region", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_provincia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_distrito", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),


		@NamedStoredProcedureQuery(name = "eliminar_ubicacion", procedureName = "f_eliminar_ubicacion", parameters = {
		
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),

		
		})
public class Ubicacion {

	@Id
	@Column(name="id_ubicacion")
	private int id_ubicacion;
	
	@Column(name="region")
	private String region;
	
	@Column(name="provincia")
	private String provincia;
	
	@Column(name="distrito")
	private String distrito;
	
	@Column(name="estado")
	private int estado;
	
	public Ubicacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ubicacion(int id_ubicacion, String region, String provincia, String distrito, int estado) {
		super();
		this.id_ubicacion = id_ubicacion;
		this.region = region;
		this.provincia = provincia;
		this.distrito = distrito;
		this.estado = estado;
	}
	public int getId_ubicacion() {
		return id_ubicacion;
	}
	public void setId_ubicacion(int id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
