package TE4.HW3.Stores;

import TE4.HW3.Knifes.Europe.EuropeChefKnife;
import TE4.HW3.Knifes.Europe.EuropeSteakKnife;
import TE4.HW3.Knifes.Knife;

public class EuropeKnifeStore extends KnifeStore {

	@Override
	public Knife createKnife(String type) {
		if (type.equals("chef")) {
			return new EuropeChefKnife();
		} else if (type.equals("steak")) {
			return new EuropeSteakKnife();
		} else return null;
	}
}
