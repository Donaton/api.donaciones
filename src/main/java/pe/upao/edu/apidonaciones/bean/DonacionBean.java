package pe.upao.edu.apidonaciones.bean;

import pe.upao.edu.apidonaciones.repository.Donante;

public class DonacionBean {

	private Donante donante;
	private String persona;
	private String numero;
	private double monto;
	private int desastre;
	public DonacionBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DonacionBean(Donante donante, String persona, String numero, double monto, int desastre) {
		super();
		this.donante = donante;
		this.persona = persona;
		this.numero = numero;
		this.monto = monto;
		this.desastre = desastre;
	}
	public Donante getDonante() {
		return donante;
	}
	public void setDonante(Donante donante) {
		this.donante = donante;
	}
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getDesastre() {
		return desastre;
	}
	public void setDesastre(int desastre) {
		this.desastre = desastre;
	}
	
	
}
