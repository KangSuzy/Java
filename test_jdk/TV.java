

public class TV {
	boolean status = false;
	private int channel;
	private int volume;
	
	final int channel_max = 5;
	final static int volume_max = 10;
	
	void pushPower() {
		status = true;
		System.out.println("TV ON!");
	}
	
	int getChannel() {
		return channel;
	}
	void setChannel(int channel) {
		this.channel = channel;
	}
	
	int getVolume() {
		return volume;
	}
	void setVolume(int volume) {
		this.volume = volume;
	}
	
	int getchannelUp() {
		return ++channel;
	}
	int getchannelDown() {
		return --channel;
	}
	int getVolumeUp() {
		return ++volume;
	}
	int getVolumeDown() {
		return --volume;
	}
	
	
}
