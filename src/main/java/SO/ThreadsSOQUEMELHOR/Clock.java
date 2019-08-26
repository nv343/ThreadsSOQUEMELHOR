package SO.ThreadsSOQUEMELHOR;

import SO.ThreadsSOQUEMELHOR.SingletonClock;

public class Clock extends Thread{
	public void run() {
		SingletonClock time = SingletonClock.getInstance();
		System.out.println("Clock. OK");
		
		while(true) {
			try {
				Thread.sleep(990);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			time.ss++;
			if(time.ss==59) {
				time.mm++;
				time.ss=0;
			}
			if(time.mm==59) {
				time.hh++;
				time.mm=0;
			}
		}
	}

}
