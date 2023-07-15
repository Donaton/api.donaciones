package pe.edu.upao.apidonaciones.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tarjeta")
public class Tarjeta {

	@Id
	@Column(name="id_tarjeta")
	private int id_tarjeta;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="persona")
	private String persona;
	
	@Column(name="estado")
	private int estado;
	
	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tarjeta(int id_tarjeta, String numero, String persona, int estado) {
		super();
		this.id_tarjeta = id_tarjeta;
		this.numero = numero;
		this.persona = persona;
		this.estado = estado;
	}
	public int getId_tarjeta() {
		return id_tarjeta;
	}
	public void setId_tarjeta(int id_tarjeta) {
		this.id_tarjeta = id_tarjeta;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
