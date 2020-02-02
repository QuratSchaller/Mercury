package mercury0;
import java.util.Random;
import java.util.Scanner;
public class Emulator {
//	int[] normalbpm;
//	normalbpm = new int [5000];
	public static void main(String[] args) {
		System.out.println("normal histogram!");
		normalhistogram();
		System.out.println("concerning histogram");
		panichistogram();
		System.out.println("normal oxygen levels");
		normaloxygen();
		System.out.println("concerning oxygen levels");
		panicoxygen();
	}
	
public static int[] normalhistogram() {
	//if randint >= 200 bpm do something
//	int[] panicbpm;
	int[] normalbpm;
	normalbpm = new int [5000];
	int min = 140;
	int max = 155;
	for(int i = 0; i<normalbpm.length; i++) {
	int r = new Random().nextInt((max - min) + 1) + min;
    normalbpm[i] = r;
//	System.out.print(panicbpm[i]);	
//	System.out.print(" ");
	}
	display(normalbpm);
	return normalbpm;
}

public static int[] restingbpm() {
	int[] normalbpm;
	normalbpm = new int [5000];
	int min = 140;
	int max = 155;
	int x = 0;
	for(int i = 0; i<normalbpm.length; i++) {
	int r = new Random().nextInt((max - min) + 1) + min;
    normalbpm[i] = r;
    	x = x + normalbpm[i];
	}
	int restingbpm = x/5000;
	System.out.println(restingbpm);
	return normalbpm;
}
public static int[] panichistogram() {
	int[] panicbpm;
	panicbpm = new int [5000];

	int min = 225;
	int max = 240;
	for(int i = 0; i<panicbpm.length; i++) {
	int r = new Random().nextInt((max - min) + 1) + min;
    panicbpm[i] = r;
//	System.out.println(panicbpm[i]);	
	}
	display(panicbpm);
	return panicbpm;
	
}

public static int[] normaloxygen() {
	int[] normaloxygen;
	normaloxygen = new int [5000];
	int min = 92;
	int max = 100;
	for(int i = 0; i<normaloxygen.length; i++) {
	int r = new Random().nextInt((max - min) + 1) + min;
    normaloxygen[i] = r;
//	System.out.println(panicbpm[i]);	
	}
	display(normaloxygen);
	return normaloxygen;
}

public static int[] panicoxygen() {
	int[] panicoxygen;
	panicoxygen = new int [5000];
	int min = 80;
	int max = 87;
	for(int i = 0; i<panicoxygen.length; i++) {
	int r = new Random().nextInt((max - min) + 1) + min;
    panicoxygen[i] = r;
//	System.out.println(panicbpm[i]);	
	}
	display(panicoxygen);
	return panicoxygen;
}


public static void display(int array[]) {
	for(int i = 0; i< array.length; i++) {
		if(i%20==0) {
			System.out.println(" ");
		}
		System.out.print(" "+ array[i]);
	}
}
}
