

package edu.eci.cvds.servlet;
import javax.inject.Named;
@Named("guessBean")
@javax.enterprise.context.SessionScoped

public class Backing_bean {
    private int numero;
	private int intentos;
	private int premio;
	private String estado;

    public Backing_bean() {
	}


    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroIntentos() {
		return intentos;
	}

	public void setNumeroIntentos(int numeroIntentos) {
		this.intentos = numeroIntentos;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
}
