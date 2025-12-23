package com.jsp.vintyaa;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        
        System.out.println("Perfect numbers between " + start + " and " + end + " are:");
        
        for (int i = start; i <= end; i++) {
            if (perfectNum(i)) {
                System.out.println(i);
            }
        }
    }

 
    public static boolean perfectNum(int num) {
        if (num <= 1) 
        	return false; 
        
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
