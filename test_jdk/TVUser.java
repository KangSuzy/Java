

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		tv.pushPower();
		tv.setChannel(1);
		tv.setVolume(5);
		
		while(true) {
			 
			int channel = tv.getchannelUp();
			System.out.println("현재 채널은 "+ channel);
			int volume = tv.getVolumeUp();
			System.out.println("현재 음량은 "+ volume);
			
				
			if (tv.getChannel() < tv.channel_max && tv.getVolume() < tv.volume_max) {
				channel = tv.getchannelDown();
				System.out.println("현재 채널은 "+ channel);
				volume = tv.getVolumeDown();
				System.out.println("현재 음량은 "+ volume);
			}break;
		
		}
	}
	
}
