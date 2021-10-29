package TE4.HW3.Knifes;

public abstract class Knife {
	protected String name;
	public void sharpen() {
		System.out.println("sharpen");
	}
	public void polish() {
		System.out.println("polish");
	}
	public void wrapp() {
		System.out.println("wrapp");
	}
	abstract public void localFinish();

	public String getName() {
		return name;
	}
}
