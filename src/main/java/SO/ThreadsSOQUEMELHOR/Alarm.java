package SO.ThreadsSOQUEMELHOR;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Alarm extends Thread {
	SingletonClock time = SingletonClock.getInstance();
	int hour, minute, second;

	public void run() {
		System.out.println("ALARM.OK");
		while (true) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}

			if (time.hour == hour && time.minute == minute && time.second == second) {
				System.out.println("ALARME.EUJUROQUETENTEI");
			}

		}
	}

	public void scheduleAlarm(int hh, int mm, int ss) {
		hour = hh;
		minute = mm;
		second = ss;
	}

}
