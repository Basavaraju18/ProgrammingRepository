package com.globus;

import java.util.List;
import java.util.Scanner;


import java.util.Scanner;
public class BingoGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int N = scanner.nextInt();
			int B = scanner.nextInt();
			
			if (N == 0 && B == 0) {
				break; // End of input
			}
			
			int[] balls = new int[B];

			for (int i = 0; i<B ; i++) {
				balls[i] = scanner.nextInt();
			}
			
			boolean[] canCall = new boolean[N + 1];
			canCall[0] = true; // 0 can always be called
			
			for (int i = 0; i< B; i++) {
				
				for (int j = i; j < B; j++) {
					
					int diff = Math.abs(balls[i] - balls[j]);
					
					if (diff <= N) {
						canCall[diff] = true;
					}
				}
			}
			boolean canCallAll = true;
			
			for (int i = 0; i <= N; i++) {
				
				if (!canCall[i]) {
					canCallAll = false;
					break;
				}
			}
			if (canCallAll) {
				System.out.println("Y");
			} else {

				System.out.println("N");
			}
		}
		scanner.close();
	}
}