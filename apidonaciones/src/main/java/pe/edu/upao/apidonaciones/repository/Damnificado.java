package pe.edu.upao.apidonaciones.repository;

import javax.persistence.*;

@Entity
@Table(name="damnificado")

@NamedStoredProcedureQueries(value = {

		@NamedStoredProcedureQuery(name = "listar_damnificados", procedureName = "f_listar_damnificados", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_consulta", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),
		
		@NamedStoredProcedureQuery(name = "registrar_damnificado", procedureName = "f_registrar_damnificado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_genero", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_telefono", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_direccion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciudad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),

		@NamedStoredProcedureQuery(name = "editar_damnificado", procedureName = "f_editar_damnificado", parameters = {
				
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_nombre", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_dni", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_genero", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_correo", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_telefono", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_direccion", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_ciudad", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),


		@NamedStoredProcedureQuery(name = "eliminar_damnificado", procedureName = "f_eliminar_damnificado", parameters = {
		
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "in_id", type = Integer.class),
				@StoredProcedureParameter(mode = ParameterMode.OUT, name = "resultado", type = String.class) }),

		
		})

public class Damnificado {
	
	@Id
	@Column(name="id_damnificado")
	private int id_damnificado;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="estado")
	private int estado;
	
	public Damnificado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Damnificado(int id_damnificado, String nombre, String dni, String genero, String correo, String telefono,
			String direccion, String ciudad, int estado) {
		super();
		this.id_damnificado = id_damnificado;
		this.nombre = nombre;
		this.dni = dni;
		this.genero = genero;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.estado = estado;
	}

	public int getId_damnificado() {
		return id_damnificado;
	}

	public void setId_damnificado(int id_damnificado) {
		this.id_damnificado = id_damnificado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

}
