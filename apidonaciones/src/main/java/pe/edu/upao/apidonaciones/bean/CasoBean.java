package pe.edu.upao.apidonaciones.bean;

import com.upao.donaciones.repository.Caso;
import com.upao.donaciones.repository.Evidencia;

public class CasoBean {

	private Caso caso;
	private Evidencia evidencia;
	
	public CasoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CasoBean(Caso caso, Evidencia evidencia) {
		super();
		this.caso = caso;
		this.evidencia = evidencia;
	}
	public Caso getCaso() {
		return caso;
	}
	public void setCaso(Caso caso) {
		this.caso = caso;
	}
	public Evidencia getEvidencia() {
		return evidencia;
	}
	public void setEvidencia(Evidencia evidencia) {
		this.evidencia = evidencia;
	}
	
	
}
