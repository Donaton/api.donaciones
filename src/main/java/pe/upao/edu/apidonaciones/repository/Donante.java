package pe.upao.edu.apidonaciones.repository;
import jakarta.persistence.*;

@Entity
@Table(name="donante")
public class Donante {
	
	@Id
	@Column(name="id_donante")
	private int id_donante;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="estado")
	private int estado;
	
	public Donante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donante(int id_donante, String nombre, String dni, String telefono, String correo, int estado) {
		super();
		this.id_donante = id_donante;
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.correo = correo;
		this.estado = estado;
	}
	public int getId_donante() {
		return id_donante;
	}
	public void setId_donante(int id_donante) {
		this.id_donante = id_donante;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

}
