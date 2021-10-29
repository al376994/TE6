package TE3;

public class DemoSingleton {

	public static void main (String [ ] args) throws InterruptedException {
		double start1 = System.currentTimeMillis();
		Singleton instance1 = Singleton.getInstance();
		double total1 = System.currentTimeMillis() - start1;
		double start2 = System.currentTimeMillis();
		Singleton instance2 = Singleton.getInstance();
		double total2 = System.currentTimeMillis() - start2;
		System.out.println(instance1 + " tardo en crearse: " + total1);
		System.out.println(instance2 + " tardo en crearse: " + total2);

	}




}
