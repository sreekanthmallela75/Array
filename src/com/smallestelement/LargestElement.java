package com.smallestelement;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("The Largest Element is:");
        int largest=0;
        for (int i=0;i<arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println(+arr[4]+" ");
    }
}
