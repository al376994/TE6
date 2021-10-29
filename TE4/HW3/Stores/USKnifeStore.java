package TE4.HW3.Stores;

import TE4.HW3.Knifes.Knife;
import TE4.HW3.Knifes.US.USChefKnife;
import TE4.HW3.Knifes.US.USSteakKnife;

public class USKnifeStore extends KnifeStore {

	@Override
	public Knife createKnife(String type) {
		if (type.equals("chef")) {
			return new USChefKnife();
		} else if (type.equals("steak")) {
			return new USSteakKnife();
		} else return null;
	}
}
