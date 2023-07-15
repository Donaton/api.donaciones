package pe.upao.edu.apidonaciones.repository;
import jakarta.persistence.*;
@Entity
@Table(name="evidencia")
public class Evidencia {

	@Id
	@Column(name="id_evidencia")
	private int id_evidencia;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="id_caso")
	private int id_caso;
	
	@Column(name="estado")
	private int estado;
	
	public Evidencia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evidencia(int id_evidencia, String imagen, String descripcion, int id_caso, int estado) {
		super();
		this.id_evidencia = id_evidencia;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.id_caso = id_caso;
		this.estado = estado;
	}
	public int getId_evidencia() {
		return id_evidencia;
	}
	public void setId_evidencia(int id_evidencia) {
		this.id_evidencia = id_evidencia;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId_caso() {
		return id_caso;
	}
	public void setId_caso(int id_caso) {
		this.id_caso = id_caso;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
