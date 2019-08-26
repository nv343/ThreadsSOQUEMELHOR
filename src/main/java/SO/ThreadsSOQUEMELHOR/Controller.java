package SO.ThreadsSOQUEMELHOR;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

	static int h = 0;
	private int m = 0;
	private int s = 0;
	public static SingletonClock time = SingletonClock.getInstance();

	@FXML
	private Button startClock;
	@FXML
	private static Text hourC;
	@FXML
	private static Text minuteC;
	@FXML
	private static Text secondC;
	@FXML
	private TextField getHour;
	@FXML
	private TextField getMinute;
	@FXML
	private TextField getSecond;
	@FXML
	private Button botao;
	@FXML
	static Label teste;

	@FXML
	private void startClock() throws InterruptedException {
		Clock c = new Clock();
		c.start();
		Teste t = new Teste();
		t.start();

	}

	@FXML
	private void startTimer() {

	}

	@FXML
	private void pauseTimer() {

	}

	@FXML
	private void stopTimer() {

	}

	@FXML
	private void adjustTime() {

	}

	@FXML
	private void teste() {

	}

	public static void setTeste(String teste) {
		Controller.teste.setText(teste);;
	}
}
