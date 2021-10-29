package TE4.HW3.Stores;

import TE4.HW3.Knifes.Knife;

public abstract class KnifeStore {

	public Knife orderKnife(String type) {
		Knife knife = null;
		knife = createKnife(type);
		knife.sharpen();
		knife.polish();
		knife.wrapp();
		knife.localFinish();
		return knife;
	}

	abstract Knife createKnife(String type);

}