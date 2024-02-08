package application;

import java.util.Locale;
import java.util.Scanner;

import entities.calender;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 long day=0;
		 long hour=0;
		 long minute=0;
		 long second=0;
		 long day1=0;
		 long day2=0;
		 
		
		calender[] dia = new calender[3];
		
		System.out.print("Dia ");
		day=sc.nextLong();
		hour=sc.nextLong();
		sc.next();
		minute=sc.nextLong();
		sc.next();
		second=sc.nextLong();
		dia[0]= new calender(day,hour,minute,second);
		System.out.print("Dia :");
		day=sc.nextLong();
		hour=sc.nextLong();
		sc.next();
		minute=sc.nextLong();
		sc.next();
		second=sc.nextLong();
		dia[1]= new calender(day,hour,minute,second);
		
		dia[0].totalsecond = dia[0].calculatorTimeInSecond();
		dia[1].totalsecond = dia[1].calculatorTimeInSecond();
		day1 = dia[0].totalsecond;
		day2 = dia[1].totalsecond;
		dia[1].subtractDays(day1,day2);
		
		System.out.println(dia[1]);
		
		sc.close();
		

		

	}

}
