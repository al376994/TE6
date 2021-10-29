package TE3;

class Singleton {

	private static Singleton instance;

	private Singleton() throws InterruptedException {
		Thread.sleep(100);
	}

	static synchronized Singleton getInstance() throws InterruptedException {

		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
