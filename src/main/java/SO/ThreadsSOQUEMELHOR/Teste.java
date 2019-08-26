package SO.ThreadsSOQUEMELHOR;

import SO.ThreadsSOQUEMELHOR.Controller;

public class Teste extends Thread{
	public void run() {
		SingletonClock time = SingletonClock.getInstance();
		System.out.println("Teste. OK");
		int i = time.ss;
		
		while(true) {
			if (i != time.ss)
				Controller.setTeste(Integer.toString(time.ss));
			i = time.ss;
		}
	}
		
	

}
