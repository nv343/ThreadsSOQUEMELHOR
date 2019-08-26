package SO.ThreadsSOQUEMELHOR;

public class SingletonTimer {
	
	public static int hh;
	public static int mm;
	public static int ss;
	
	private SingletonTimer() {
		hh=0;
		mm=0;
		ss=0;
	}
	
	private static class LazyHolder{
		private static final SingletonTimer INSTANCE = new SingletonTimer();
	}
	
	public static SingletonTimer getInstance() {
		return LazyHolder.INSTANCE;
	}

}
