package SO.ThreadsSOQUEMELHOR;

public class SingletonClock {

	private static SingletonClock uniqueInstance = new SingletonClock();
	public static int hh;
	public static int mm;
	public static int ss;

	private SingletonClock() {
		hh = 0;
		mm = 0;
		ss = 0;
	}


	public static SingletonClock getInstance() {
		return uniqueInstance;
	}

}
