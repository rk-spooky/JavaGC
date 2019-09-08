package com.GC;

import java.util.Random;

public class AllocationOverwrite {
	
	public static void main(String[] args) throws InterruptedException {
		
		int arraySize = 1000000;
		GCMe2[] gcmes = new GCMe2[arraySize];
		
		int count = 0;
		Random rnd = new Random();
		while (true) {
			gcmes[rnd.nextInt(arraySize)] = new GCMe2();
			if (count % 10000 == 0) {
				System.out.print(".");
			}
			count++;
		}
		
	}

}

class GCMe2 {
	long a;
	long aa;
	long aaa;
	long aaaa;
	long aaaaa;
	long aaaaaa;
	long aaaaaaa;
	long aaaaaaaa;
	long aaaaaaaaa;
	long aaaaaaaaaa;
	long aaaaaaaaaaa;
	long aaaaaaaaaaaa;
	long aaaaaaaaaaaaa;
	long aaaaaaaaaaaaaa;
	long aaaaaaaaaaaaaaa;
}
