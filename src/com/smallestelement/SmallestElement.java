package com.smallestelement;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("The Smallest Element is");
        int smallest=0;
        for (int i=0; i<arr.length;i++){
            if (smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println(+arr[0]+" ");
    }
}
