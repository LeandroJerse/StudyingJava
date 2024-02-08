package entities;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		
		if(hour>23 || hour<00) {
			this.hour=0;
		}
		
		else {
		this.hour = hour;
		}
		
		if(minute>59 || minute<00) {
			this.minute = 0;	
		}
		else {
		this.minute = minute;
		}
		if(second>59 || second <00) {
			this.second = 0;
		}
		else {
		this.second = second;
		}
	}
	
	public Time(int hour, int minute) {
		
		if(hour>23 || hour<00) {
			this.hour=0;
		}
		
		else {
		this.hour = hour;
		}
		
		if(minute>59 || minute<00) {
			this.minute = 0;	
		}
		else {
		this.minute = minute;
		}
		this.second = 0;
		}
	
	public Time(int hour) {
		
		if(hour>23 || hour<00) {
			this.hour=0;
		}
		
		else {
		this.hour = hour;
		}

		this.minute = 0;
	
		this.second = 0;
		}

	public Time(Time clock) {
		this.hour=clock.hour;
		this.minute=clock.minute;
		this.second = clock.second;
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	
	public void printTime() {
		if(this.hour<10) {
			System.out.print("0");
		}
		System.out.print(this.hour+":");
		if(this.minute<10) {
			System.out.print("0");
		}
		System.out.print(this.minute+":");
		if(this.second<10) {
			System.out.print("0");
		}
		System.out.print(this.second+"\n");
	}
	
	public void increaseMinute() {
		if (this.minute == 59) {
			this.hour++;
			this.minute=0;
		}
		else {
			this.minute++;
		}
	}
	public void decreaseMinute() {
		if (this.minute == 00) {
			this.hour--;
			this.minute=59;
		}
		else {
			this.minute--;
		}
	}
	
	
	
	}
	
	
	
	
	

