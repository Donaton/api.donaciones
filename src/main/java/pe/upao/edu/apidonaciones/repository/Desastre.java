package pe.upao.edu.apidonaciones.repository;

import jakarta.persistence.*;

@Entity
@Table(name="desastre")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "listar_desastres", procedureName = "f_listar_desastres", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_consulta", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "registrar_desastre", procedureName = "f_registrar_desastre", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_titulo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_monto", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_direccion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ubicacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "editar_desastre", procedureName = "f_editar_desastre", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_titulo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_monto", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_direccion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ubicacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),


		@NamedStoredProcedureQuery(name = "eliminar_desastre", procedureName = "f_eliminar_desastre", parameters = {
		
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),

		
		})

public class Desastre {
	
	@Id
	@Column(name="id_desastre")
	private int id_desastre;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="monto_limite")
	private double monto_limite;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="activo")
	private int activo;
	
	@Column(name="id_ubicacion")
	private int id_ubicacion;
	
	public Desastre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Desastre(int id_desastre, String titulo, String descripcion, double monto_limite, String direccion,
			int activo, int id_ubicacion) {
		super();
		this.id_desastre = id_desastre;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.monto_limite = monto_limite;
		this.direccion = direccion;
		this.activo = activo;
		this.id_ubicacion = id_ubicacion;
	}
	public int getId_desastre() {
		return id_desastre;
	}
	public void setId_desastre(int id_desastre) {
		this.id_desastre = id_desastre;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getMonto_limite() {
		return monto_limite;
	}
	public void setMonto_limite(double monto_limite) {
		this.monto_limite = monto_limite;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	public int getId_ubicacion() {
		return id_ubicacion;
	}
	public void setId_ubicacion(int id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}
	
	
}
