package TE5.Decorators;

import TE5.Song;

public class Vinilo extends BaseSongDecorator {

	public Vinilo(Song song) {
		super(song);
	}

	@Override
	public void play() {
		super.play();
		System.out.println("ON vinyl");
	}
}
