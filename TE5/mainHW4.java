package TE5;

import TE5.Decorators.Mp4;
import TE5.Decorators.Vinilo;

public class mainHW4 {

	public static void main (String [ ] args){

		PlayList playList1 = new PlayList("Sabina's hits");
		Song song1 = new Song("Princesa", "Joaquín Sabina");
		PlayableInterface decoratedSong1 = new Vinilo(song1);
		Song song2 = new Song("Calle melancolía", "Joaquín Sabina");
		playList1.add(decoratedSong1);
		playList1.add(song2);

		PlayList playList2 = new PlayList("Manolo Garcia's hits");
		Song song3 = new Song("Pájaros de barro", "Manolo García");
		PlayableInterface decoratedSong3 = new Mp4(song3);
		playList2.add(decoratedSong3);

		PlayList myPlayList = new PlayList("My Songs");
		myPlayList.add(playList1);
		myPlayList.add(playList2);

		myPlayList.play();


	}

}
