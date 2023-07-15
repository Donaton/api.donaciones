package pe.upao.edu.apidonaciones.repository;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="caso")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "listar_casos", procedureName = "f_listar_casos", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_consulta", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "registrar_caso", procedureName = "f_registrar_caso", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_monto", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_direccion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ubicacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_damnificado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_desastre", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion_evidencia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_imagen", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "editar_caso", procedureName = "f_editar_caso", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_evidencia", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_fecha", type = Date.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_monto", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_direccion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ubicacion", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_damnificado", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_desastre", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_descripcion_evidencia", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_imagen", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),


		@NamedStoredProcedureQuery(name = "eliminar_caso", procedureName = "f_eliminar_caso", parameters = {
		
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id_evidencia", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "registrar_donacion", procedureName = "f_registrar_donacion", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_telefono", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_numero", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_persona", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_monto", type = Double.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_desastre", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),

		
		})
public class Caso {

	@Id
	@Column(name="id_caso")
	private int id_caso;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="monto")
	private double monto;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="id_ubicacion")
	private int id_ubicacion;
	
	@Column(name="id_damnificado")
	private int id_damnificado;
	
	@Column(name="id_desastre")
	private int id_desastre;
	
	@Column(name="estado")
	private int estado;
	
	@Column(name="fecha")
	private Date fecha;
	
	public Caso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Caso(int id_caso, String nombre, String descripcion, double monto, String direccion, int id_ubicacion,
			int id_damnificado, int id_desastre, int estado, Date fecha) {
		super();
		this.id_caso = id_caso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.monto = monto;
		this.direccion = direccion;
		this.id_ubicacion = id_ubicacion;
		this.id_damnificado = id_damnificado;
		this.id_desastre = id_desastre;
		this.estado = estado;
		this.fecha = fecha;
	}

	public int getId_caso() {
		return id_caso;
	}

	public void setId_caso(int id_caso) {
		this.id_caso = id_caso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId_ubicacion() {
		return id_ubicacion;
	}

	public void setId_ubicacion(int id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}

	public int getId_damnificado() {
		return id_damnificado;
	}

	public void setId_damnificado(int id_damnificado) {
		this.id_damnificado = id_damnificado;
	}

	public int getId_desastre() {
		return id_desastre;
	}

	public void setId_desastre(int id_desastre) {
		this.id_desastre = id_desastre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
