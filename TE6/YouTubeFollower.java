package TE6;

public class YouTubeFollower implements Observer, Playable {

	private String followerName;

	public YouTubeFollower(YouTubeChannel channel,String followerName) {
		this.followerName = followerName;
		channel.registerObserver(this);
	}

	@Override
	public void update(String status) {
		System.out.print("Update! ");
		if(status.equals("on")) {
			play();
		} else if (status.equals("down")) {
			System.out.println("The channel is down again");
		}
	}

	@Override
	public void play() {
		System.out.println("The channel is on now and " + followerName + " is watching the channel");
	}
}
