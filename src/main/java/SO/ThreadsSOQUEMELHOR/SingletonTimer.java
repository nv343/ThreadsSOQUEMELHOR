package SO.ThreadsSOQUEMELHOR;

public class SingletonTimer {

	private static SingletonTimer uniqueInstance = new SingletonTimer();
	public static int hour;
	public static int minute;
	public static int second;

	private SingletonTimer() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public static SingletonTimer getInstance() {
		return uniqueInstance;
	}

}
