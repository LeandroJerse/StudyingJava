package entities;

public class calender {

	public long day = 0;
	public long hour = 0;
	public long minute = 0;
	public long second = 0;
	public long totalsecond = 0;
	public long totalTime = 0;

	public calender(long day, long hour, long minute, long second) {
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long calculatorTimeInSecond() {

		return (this.day * 86400 + this.hour * 3600 + this.minute * 60 + this.second);

	}

	public void subtractDays(long day1, long day2) {

		totalTime = day2 - day1;

		this.day = (long) totalTime / 86400;
		totalTime -= (this.day * 86400);

		this.hour = (long) totalTime / 3600;
		totalTime -= (this.hour * 3600);

		this.minute = (long) totalTime / 60;
		totalTime -= (this.minute * 60);
		this.second = totalTime;
		totalTime = 0;

}

	public String toString() {

		return "" + day + " dia(s)\n" + hour + " hora(s)\n" + minute + " minuto(s)\n" + second + " segundo(s)";

	}
}
