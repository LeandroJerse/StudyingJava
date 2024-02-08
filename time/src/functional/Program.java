package functional;

import java.util.Locale;
import java.util.Scanner;

import entities.Time;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Time time;
		int hour, minute, second,condictional=0;

		System.out.println("Type the Time(hh : mm : ss):\t");
		hour=sc.nextInt();
		sc.next();
		minute = sc.nextInt();
		sc.next();
		second=sc.nextInt();
		time = new Time(hour,minute,second);
		while(condictional != 4) {
			System.out.println("[1]Increase Minute\t[2]Decrease Minute\t[3]Show Time\t[4]Exit");
			condictional=sc.nextInt();
			if(condictional==1) {
				time.increaseMinute();
			}
			if(condictional==2) {
				time.decreaseMinute();
			}
			if(condictional==3) {
				time.printTime();
			}
		}
		
		
	}

}
