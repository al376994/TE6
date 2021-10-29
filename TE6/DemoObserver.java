package TE6;

public class DemoObserver {

	public static void main(String[] args) {
		YouTubeChannel channel = new YouTubeChannel("GEOTEC", "down");
		YouTubeFollower paco = new YouTubeFollower(channel, "Paco");
		YouTubeFollower luis = new YouTubeFollower(channel, "Luis");
		YouTubeFollower ana = new YouTubeFollower(channel, "Ana");
		System.out.println("---- " + channel.getChannelName() + " channel ----");
		channel.setStatus("on");
		channel.setStatus("down");
		channel.removeObserver(luis);
		channel.setStatus("on");
	}

}
