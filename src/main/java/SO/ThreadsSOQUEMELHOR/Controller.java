package SO.ThreadsSOQUEMELHOR;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller {

	private int h = 0;
	private int m = 0;
	private int s = 0;
	private boolean timerOnHold = false;
	SingletonClock timeClock = SingletonClock.getInstance();
	SingletonTimer timeTimer = SingletonTimer.getInstance();

	private Timer timer = new Timer();
	private Clock clock = new Clock();
	private Alarm alarm = new Alarm();

	@FXML
	private Button startClock;
	@FXML
	private Button adjustTime;
	@FXML
	private Button checkClock;
	@FXML
	private Button startTimer;
	@FXML
	private Button pauseTimer;
	@FXML
	private Button resumeTimer;
	@FXML
	private Button stopTimer;
	@FXML
	private Button setAlarm;
	@FXML
	private Text hourC;
	@FXML
	private Text minuteC;
	@FXML
	private Text secondC;
	@FXML
	private Text timerHH;
	@FXML
	private Text timerMM;
	@FXML
	private Text timerSS;
	@FXML
	private TextField getHour;
	@FXML
	private TextField getMinute;
	@FXML
	private TextField getSecond;
	@FXML
	private TextField alarmHour;
	@FXML
	private TextField alarmMinute;
	@FXML
	private TextField alarmSecond;

	@FXML
	private void startClock() throws InterruptedException {
		clock.start();
		showTime();
	}

	@FXML
	private void startTimer() {
		if (timer.isInterrupted()) {
			return;
		} else if (timer.isAlive()) {
			return;
		} else {
			timer.start();
			showTimer();
		}

	}

	@FXML
	private void pauseTimer() throws InterruptedException {
		h = timeTimer.hour;
		m = timeTimer.minute;
		s = timeTimer.second;
		timerOnHold = true;

	}

	@FXML
	private void resumeTimer() {
		timeTimer.hour = h;
		timeTimer.minute = m;
		timeTimer.second = s;
		timerOnHold = false;

	}

	@FXML
	private void stopTimer() {
		timeTimer.hour = 0;
		timeTimer.minute = 0;
		timeTimer.second = 0;
		showTimer();

	}

	@FXML
	private void showTimer() {
		if (timerOnHold) {
			timerHH.setText(Integer.toString(h));
			timerMM.setText(Integer.toString(m));
			timerSS.setText(Integer.toString(s));
		} else {
			timerHH.setText(Integer.toString(timeTimer.hour));
			timerMM.setText(Integer.toString(timeTimer.minute));
			timerSS.setText(Integer.toString(timeTimer.second));
		}
	}

	@FXML
	private void adjustTime() throws InterruptedException {

		if (getHour.getText().equals("") || getMinute.getText().equals("") || getSecond.getText().equals("")) {
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
				timeClock.hour = a;
				timeClock.minute = b;
				timeClock.second = c;
				clock.start();

				showTime();
			}
		}
	}

	@FXML
	private void showTime() {
		hourC.setText(Integer.toString(timeClock.hour));
		minuteC.setText(Integer.toString(timeClock.minute));
		secondC.setText(Integer.toString(timeClock.second));

	}

	@FXML
	private void setAlarm() {
		if (alarmHour.getText().equals("") || alarmMinute.getText().equals("") || alarmSecond.getText().equals("")) {
			System.out.println("ERRO.NULL.ALARM");
			return;
		} else {

			int aa = Integer.parseInt(alarmHour.getText());
			int bb = Integer.parseInt(alarmMinute.getText());
			int cc = Integer.parseInt(alarmSecond.getText());
			if (aa < 0 || aa >= 24) {
				System.out.println("ERRO.HOUR.ALARM");
			} else if (bb < 0 || bb >= 60) {
				System.out.println("ERRO.MINUTE.ALARM");
			} else if (cc < 0 || cc >= 60) {
				System.out.println("ERRO.SECOND.ALARM");
			} else {

				if (alarm.isAlive()) {
					alarm.scheduleAlarm(aa, bb, cc);
				} else {
					alarm.scheduleAlarm(aa, bb, cc);
					alarm.start();
				}

			}
		}

	}

	public static void showAlarm() throws IOException {
		Stage stage = new Stage();
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("alarm.fxml"));
		Parent root = (Parent) fxmlLoader.load();
		stage.setScene(new Scene(root));
		stage.show();
	}

}
