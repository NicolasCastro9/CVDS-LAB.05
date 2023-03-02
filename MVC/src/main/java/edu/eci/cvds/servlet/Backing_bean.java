

package edu.eci.cvds.servlet;
import java.util.Random;

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
	public void guess(int guessNumber) {
        if(numero == guessNumber) {
            estado = "Ganaste con numero de intentos : " + intentos + "Y con un premio de : " + premio;
        } else if (premio == 0){
            estado = "Perdiste D:";
        }else {
            premio -= 10000;
            intentos ++;
        }
    }

    public void restart() {
        Random numberRandom = new Random();
        numero = numberRandom.nextInt(100);
        premio = 100000;
        intentos = 0;
        estado = "Jugando";
    }
    
}
