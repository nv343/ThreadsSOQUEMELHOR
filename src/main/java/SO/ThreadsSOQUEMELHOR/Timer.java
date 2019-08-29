package SO.ThreadsSOQUEMELHOR;

import SO.ThreadsSOQUEMELHOR.SingletonTimer;

public class Timer extends Thread {
	SingletonTimer time = SingletonTimer.getInstance();

	public void run() {

		System.out.println("Timer. OK");

		while (true) {
			try {
				Thread.sleep(999);
			} catch (InterruptedException e) {
				return;
			}
			time.second++;
			if (time.second == 59) {
				try {
					Thread.sleep(999);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				time.minute++;
				time.second = 0;
			}
			if (time.minute == 59) {
				try {
					Thread.sleep(999);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				time.hour++;
				time.minute = 0;
			}
			if (time.hour == 24) {
				try {
					Thread.sleep(999);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				time.hour = 0;
				time.minute = 0;
				time.second = 0;
			}
		}
	}

}
