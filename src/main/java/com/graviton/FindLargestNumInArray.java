package com.graviton;

public class FindLargestNumInArray {
    public static void main(String[] args) {
        int[] myArray = {100,200,300,400,500};
        int largestNumber = myArray[0];
        for (int i = 1; i <myArray.length;i++){
            if(myArray[i]>largestNumber){
                largestNumber = myArray[i];

            }
        }
        System.out.println(largestNumber);
    }
}
