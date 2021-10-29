package TE5;

public class Song implements PlayableInterface {

	private String name;
	private String artist;

	public Song(String name, String artist) {
		this.name = name;
		this.artist = artist;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public void play() {
		System.out.println("Escuchando..." + getName() + " BY " + getArtist());
	}
}
