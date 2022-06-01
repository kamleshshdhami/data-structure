package com.ksd.algo.demo;

import java.util.Scanner;

public class TestSolution {

	public static String run(String startPosition, int R, int C) {

		char[] ch = new char[startPosition.length()];
		
		char[] startPositionArray = startPosition.toCharArray();

		int y = Character.getNumericValue(startPositionArray[0]);

		int x = convertCharToNumber(startPositionArray[1]);

		y = y + R;
		x = x + C;

		if (y > 8) {
			y = y % 8;
		}

		if (x > 8) {
			x = x % 8;
		}
		
		String newposition = y + "" + convertNumberToChar(x);
		return newposition;
	}

	private static int convertCharToNumber(char chr) {
		int returnValue = 0;
		switch (chr) {
		case 'a':
			returnValue = 1;
			break;
		case 'b':
			returnValue = 2;
			break;
		case 'c':
			returnValue = 3;
			break;
		case 'd':
			returnValue = 4;
			break;
		case 'e':
			returnValue = 5;
			break;
		case 'f':
			returnValue = 6;
			break;
		case 'g':
			returnValue = 7;
			break;
		case 'h':
			returnValue = 8;
		}
		return returnValue;
	}

	private static char convertNumberToChar(int chr) {
		char returnValue = 'h';
		switch (chr) {
		case 1:
			returnValue = 'a';
			break;
		case 2:
			returnValue = 'b';
			break;
		case 3:
			returnValue = 'c';
			break;
		case 4:
			returnValue = 'd';
			break;
		case 5:
			returnValue = 'e';
			break;
		case 6:
			returnValue = 'f';
			break;
		case 7:
			returnValue = 'g';
			break;
		case 8:
			returnValue = 'h';
		}
		return returnValue;
	}
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		String startPosition = scanner.next();
		
		int R= scanner.nextInt();
		int C = scanner.nextInt();
		
		System.out.println(" startPosition : " + startPosition + " R : " + R  + " C : " + C);
		String newPosition = run(startPosition, R, C);
		
		System.out.println(" newPosition : " + newPosition );
		
		
	}
}
