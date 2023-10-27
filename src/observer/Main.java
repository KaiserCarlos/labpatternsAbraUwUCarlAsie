package observer;

import java.util.Observable;

import observer.covid19Patient;
import domain.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable pacient=new covid19Patient("aitor", 35);
		new PacientObserverGUI (pacient);
		new PacientSymptomGUI ((Covid19Pacient))pacient);
	}


}
