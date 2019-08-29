package SO.ThreadsSOQUEMELHOR;

public class SingletonClock {

	private static SingletonClock uniqueInstance = new SingletonClock();
	public static int hour;
	public static int minute;
	public static int second;

	private SingletonClock() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public static SingletonClock getInstance() {
		return uniqueInstance;
	}

}
