package TE5;

public class mainTE5 {

	public static void main (String [ ] args){


		PlayList playList_1 = new PlayList("Sabina's hits");
		Song song_1 = new Song("Princesa", "Joaquín Sabina");
		Song song_2 = new Song("Calle melancolía", "Joaquín Sabina");
		playList_1.add(song_1);
		playList_1.add(song_2);

		PlayList playList_2 = new PlayList("Manolo Garcia's hits");
		Song song_3 = new Song("Pájaros de barro", "Manolo García");
		playList_2.add(song_3);

		PlayList myPlayList = new PlayList("My Songs");
		myPlayList.add(playList_1);
		myPlayList.add(playList_2);

		myPlayList.play();


	}

}
