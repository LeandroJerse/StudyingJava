package game;

import java.util.Locale;
import java.util.Scanner;

import entities.Controll;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
    
	int jump=0;
    int numberPipe=0;
    jump = sc.nextInt();
    numberPipe=sc.nextInt();
    Controll[] frog = new Controll[numberPipe];
    for (int i = 0;i<numberPipe;i++) {
    	int pipe=0;
    	pipe = sc.nextInt();
        frog[i]=new Controll(pipe);
		
	}
    for (int i = 0;i<numberPipe-1;i++) {

    	if(frog[i].pipe-frog[i+1].pipe>jump||frog[i].pipe-frog[i+1].pipe<-(jump)){
    		System.out.println("Game Over");
    		System.exit(0);
    	}
		
	}
    System.out.println("You Win");
    
    sc.close();

	}

}
