package SO.ThreadsSOQUEMELHOR;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Controller {

	static int h = 0;
	private int m = 0;
	private int s = 0;
	public static SingletonClock time = SingletonClock.getInstance();

	@FXML
	private Button startClock;
	@FXML
	private Text hourC;
	@FXML
	private Text minuteC;
	@FXML
	private Text secondC;
	@FXML
	private TextField getHour;
	@FXML
	private TextField getMinute;
	@FXML
	private TextField getSecond;
	@FXML
	private Button botao;
	@FXML
	private Button check;

	@FXML
	private void startClock() throws InterruptedException {
		Clock c = new Clock();
		c.start();
		showTime();
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
	private void adjustTime() throws InterruptedException {

		if (getHour.getText().equals("")|| getMinute.getText().equals("")|| getSecond.getText().equals("")) {
			System.out.println("ERRO.NULL");
			return;
		} else {

			int a = Integer.parseInt(getHour.getText());
			int b = Integer.parseInt(getMinute.getText());
			int c = Integer.parseInt(getSecond.getText());
			if (a < 0 || a >= 24) {
				System.out.println("ERRO.HOUR");
			} else if (b < 0 || b >= 60) {
				System.out.println("ERRO.MINUTE");
			} else if (c < 0 || c >= 60) {
				System.out.println("ERRO.SECOND");
			} else {
				time.hh = a;
				time.mm = b;
				time.ss = c;
				showTime();
			}
		}
	}

	@FXML
	private void showTime() {
		hourC.setText(Integer.toString(time.hh));
		minuteC.setText(Integer.toString(time.mm));
		secondC.setText(Integer.toString(time.ss));

	}
}
