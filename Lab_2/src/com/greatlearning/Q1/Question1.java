package com.greatlearning.Q1;

import java.util.Scanner;

public class Question1 {

public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the size of transaction array");
	int arr[];
	int size=in.nextInt();
	arr=new int[size];
	System.out.println("Enter the values of array");
    for(int i=0;i<size;i++) {
    	System.out.println("Enter element value at index " + i);
    	arr[i]=in.nextInt();
    	 }
     System.out.println("your array is");
     System.out.println("");
    for(int i=0;i<size;i++) {
    	System.out.print(arr[i] + " ");
    	System.out.println("");
    }
    System.out.println("total number of targets to be achieved");
    int Num_target=in.nextInt();
    
     Question1 qs = new Question1();
      
    for(int i=1;i<Num_target+1;i++) {
    	  System.out.println("Enter your target");
          int target=in.nextInt();
    	  qs.evaluation(arr,size,target);
      }
}

private void evaluation(int[] Arr,int size,int tar) {
	int sum =0;     
	for(int i=0;i<size;i++) {
	      sum=sum+Arr[i];
	      int num = i+1;
	      if(sum>=tar) {
	    	  System.out.println("your targer achieved in "+ num + " transactions");
	    	break;
	    }
	   
	      }
	      if(sum<tar) {
	    	  System.out.println("Your target not acheived");
	      }
	      

}
}