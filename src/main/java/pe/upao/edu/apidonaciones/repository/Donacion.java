package pe.upao.edu.apidonaciones.repository;
import jakarta.persistence.*;


@Entity
@Table(name="transaccion")
public class Donacion {

	@Id
	@Column(name="id_donacion")
	private int id_donacion;
	
	@Column(name="id_desastre")
	private int id_desastre;
	
	@Column(name="id_transaccion")
	private int id_transaccion;
	
	@Column(name="estado")
	private int estado;
	
	public Donacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donacion(int id_donacion, int id_desastre, int id_transaccion, int estado) {
		super();
		this.id_donacion = id_donacion;
		this.id_desastre = id_desastre;
		this.id_transaccion = id_transaccion;
		this.estado = estado;
	}
	public int getId_donacion() {
		return id_donacion;
	}
	public void setId_donacion(int id_donacion) {
		this.id_donacion = id_donacion;
	}
	public int getId_desastre() {
		return id_desastre;
	}
	public void setId_desastre(int id_desastre) {
		this.id_desastre = id_desastre;
	}
	public int getId_transaccion() {
		return id_transaccion;
	}
	public void setId_transaccion(int id_transaccion) {
		this.id_transaccion = id_transaccion;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
