package TE6;
import java.util.ArrayList;

public class YouTubeChannel implements Subject {

	private ArrayList<Observer> observers = new ArrayList<>();
	private String channelName;
	private String status;

	public YouTubeChannel(String channelName, String status) {
		this.channelName = channelName;
		this.status = status;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setStatus(String status) {
		this.status = status;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update(status);
		}
	}
}
