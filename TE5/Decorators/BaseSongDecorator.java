package TE5.Decorators;

import TE5.PlayableInterface;

public abstract class BaseSongDecorator implements PlayableInterface {

	private PlayableInterface song;

	public BaseSongDecorator(PlayableInterface song) {
		this.song = song;
	}

	@Override
	public String getName() {
		return song.getName();
	}

	@Override
	public void play() {
		song.play();
	}
}
