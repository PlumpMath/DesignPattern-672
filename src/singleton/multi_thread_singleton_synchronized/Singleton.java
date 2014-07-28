package singleton.multi_thread_singleton_synchronized;

public class Singleton {
	
	private static Singleton uniqueInstance;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

}
