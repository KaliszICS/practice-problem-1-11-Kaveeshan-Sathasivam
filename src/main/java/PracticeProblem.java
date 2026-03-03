import java.util.Scanner;

/**
	* File: Lesson 1.11 - Math
	* Author: Kaveeshan Sathasivam
	* Date Created: Mar 2, 2026
	* Date Last Modified: Mar 2, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = scanner.nextDouble();

        double absoluteValue = Math.abs(number);

        System.out.println(absoluteValue);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Input another number: ");
		double num2 = scanner.nextDouble();
		double answer = num1/num2;
		System.out.println(Math.floor(answer));
		System.out.println(Math.ceil(answer));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = scanner.nextDouble();
		double ans = Math.sqrt(num);
		System.out.println(Math.round(ans));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Input another number: ");
		double num2 = scanner.nextDouble();
		System.out.println(Math.pow(num1,num2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Input another number: ");
		double num2 = scanner.nextDouble();
		System.out.print("Input one more number: ");
		double num3 = scanner.nextDouble();
		
		double max = Math.max(num1, Math.max(num2, num3));
        double min = Math.min(num1, Math.min(num2, num3));

        System.out.println(max);
        System.out.println(min);

	}

}
