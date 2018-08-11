package com.vcraftech.demo.vcraftechdemo;

import java.util.Arrays;

public class SelectionSort
{
     public static void main(String[] args) {

        int[] input = {2,7,4,1,5,3};
        int min = 0;
        int swapIndex = 0;
        int temp = 0;

        System.out.println("Not Sorted List");
        Arrays.stream(input).forEach(System.out::print);
        System.out.println("");
        
        for(int i = 0;i<input.length;i++)
        {
            
            min = input[i];
            swapIndex = -1;
            
            for(int j=i;j<input.length;j++)
            {

                if(input[j]<min)
                {
                    min = input[j];
                    swapIndex = j;
                }
             
            }
           if(swapIndex!=-1){
            temp= input[i];
            input[i] = min;
            input[swapIndex]=temp;
           } 

        }

        System.out.println("Sorted List");
        Arrays.
        stream(input).
        forEach(System.out::print);

        
    }

}               