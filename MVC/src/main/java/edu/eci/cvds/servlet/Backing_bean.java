

package edu.eci.cvds.servlet;
import java.util.ArrayList;
import java.util.Random;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "guessBean")
@SessionScoped

public class Backing_bean {
    private int number;
	private int intent;
	private int price;
	private String state;
    private ArrayList<Integer> pastIntents;

    public Backing_bean() {
        restart();
	}

    public void guess(int guessNumber) {
        if(number == guessNumber) {
            state = "Ganaste con numero de intentos : " + intent + "Y con un premio de : " + price;
        } else if (price == 0){
            state = "Perdiste D:";
        }else {
            price -= 10000;
            pastIntents.add(guessNumber);
            intent ++;
        }
    }

    public void restart() {
        Random numberRandom = new Random();
        number = numberRandom.nextInt(100);
        price = 100000;
        intent = 0;
        state = "Jugando";
        pastIntents = new ArrayList<>();
    }




    public int getNumber() {
		return number;
	}

	public void setNumber(int guessnumber) {
		this.number = guessnumber;
	}

	public int getIntent() {
		return intent;
	}

	public void setIntent(int intent) {
		this.intent = intent;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

    public ArrayList<Integer> getPastIntents() {
        return pastIntents;
    }
    
}
