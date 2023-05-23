package ArraySample;

import java.util.Arrays;
import java.util.Scanner;

public class Method1_coffee {

	public static void main(String args[]) {

		int myMoneyA = 800; // 800원은 커피 몇잔일까?
		int cupsA = Method1_coffee.coffee(myMoneyA);
		Method1_coffee.printCoffee(cupsA);

		int myMoneyB = 150; // 150원은 커피 몇잔일까?
		int cupsB = coffee(myMoneyB);
		printCoffee(cupsB);
	}

	public static int coffee(int money) {
		int cups = 0; // 몇잔 나올까 준비
		if (money > 0) {
			cups = money / 200;
		} else if (money == 0) {
			cups = 0;
		} else {
			cups = -1;
		}
		return cups;
	}  // coffee
	
	public static void printCoffee(int cups) {
		if(cups > 0) {
			System.out.println("커피 " + cups + "잔 입니다.");
		} else {
			System.out.println("액수가 모자랍니다.");
		}
	}  // printCoffee
}
