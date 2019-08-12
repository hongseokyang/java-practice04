package tv;
 
public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if(up && channel<255)
			this.channel++;
		if(!up && channel>1)
			this.channel--;
	}
	
	public void volume(int volume) {
		this.volume = volume;
	} 
	
	public void volume(boolean up) {
		if(up && volume<100)
			this.volume++;
		if(!up && volume>0)
			this.volume--;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;
	}
	
	
}
