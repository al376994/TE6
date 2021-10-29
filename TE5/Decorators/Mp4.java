package TE5.Decorators;

import TE5.Song;

public class Mp4 extends BaseSongDecorator {

	public Mp4(Song song) {
		super(song);
	}

	@Override
	public void play() {
		super.play();
		System.out.println("ON MP4");
	}
}
