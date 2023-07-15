package pe.edu.upao.apidonaciones.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaccion")
public class Transaccion {

	@Id
	@Column(name="id_transaccion")
	private int id_transaccion;
	
	@Column(name="monto")
	private double monto;
	
	@Column(name="id_donante")
	private int id_donante;
	
	@Column(name="id_tarjeta")
	private int id_tarjeta;
	
	@Column(name="estado")
	private int estado;
	
	public Transaccion() {
		super();
	}
	public Transaccion(int id_transaccion, double monto, int id_donante, int id_tarjeta, int estado) {
		super();
		this.id_transaccion = id_transaccion;
		this.monto = monto;
		this.id_donante = id_donante;
		this.id_tarjeta = id_tarjeta;
		this.estado = estado;
	}
	public int getId_transaccion() {
		return id_transaccion;
	}
	public void setId_transaccion(int id_transaccion) {
		this.id_transaccion = id_transaccion;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getId_donante() {
		return id_donante;
	}
	public void setId_donante(int id_donante) {
		this.id_donante = id_donante;
	}
	public int getId_tarjeta() {
		return id_tarjeta;
	}
	public void setId_tarjeta(int id_tarjeta) {
		this.id_tarjeta = id_tarjeta;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
