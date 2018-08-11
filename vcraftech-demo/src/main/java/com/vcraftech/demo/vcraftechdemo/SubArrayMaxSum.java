package com.vcraftech.demo.vcraftechdemo;

public class SubArrayMaxSum
{

    public static void main(String [] array){
      int [] input = {-5, 6, 7, 1, 4, -8, 16};

      int sum = 0;
      int highestSum = 0;
      

      for(int i = 0; i<input.length; i++)
      {
        sum = sum+input[i];

        if(sum<0){
          sum = 0;
        }

        if(highestSum<sum)
        {
          highestSum = sum;
        }


      }

      System.out.println("highest sum = "+highestSum);



    }
}