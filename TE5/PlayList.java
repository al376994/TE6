package TE5;

import java.util.ArrayList;

public class PlayList implements PlayableInterface {
	private String name;
	private ArrayList<PlayableInterface> playList = new ArrayList<PlayableInterface>();

	public PlayList(String name) {
		this.name = name;
	}

	public void add(PlayableInterface playableObject) {
		playList.add(playableObject);
	}

	public void remove(String name) {
		int index = -1;
		for (int i = 0; i < playList.size(); i++) {
			if(playList.get(i).getName().equals(name)) {
				index = i;
			}
		}
		if (index >= 0 && index < playList.size()) {
			playList.remove(index);
		}
	}

	public ArrayList<PlayableInterface> getChildren() {
		return playList;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void play() {
		String prefixSufixPrint = "-----";
		for (PlayableInterface playObject: playList) {
			System.out.println(prefixSufixPrint + getName() + prefixSufixPrint);
			playObject.play();
		}
	}
}
