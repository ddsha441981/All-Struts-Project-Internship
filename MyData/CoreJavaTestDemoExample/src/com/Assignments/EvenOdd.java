package com.Assignments;

import java.util.Scanner;

public class EvenOdd {
 
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int i, smallEven=0, bigOdd=0, countOdd=0, countEven=0;
        for(i=0; i<n; i++){
            System.out.print("Enter element "+(i+1));
            a[i]=sc.nextInt();
            if(a[i]%2 == 1){
                if(countOdd>0 && a[i]>bigOdd) bigOdd=a[i];
                else if(countOdd==0) bigOdd=a[i];
                countOdd++;
            }
            else{
                if(countEven>0 && a[i]<smallEven) smallEven=a[i];
                else if(countEven==0)smallEven=a[i];
                countEven++;
            }
        }
        System.out.println("The smallest even number is " + smallEven);
        System.out.println("The largest odd number is " + bigOdd);
    }
}