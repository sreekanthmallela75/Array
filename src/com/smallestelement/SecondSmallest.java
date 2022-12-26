package com.smallestelement;

public class SecondSmallest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("The Second Smallest Element in the array");
        int temp=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(+arr[1]+" ");
    }
}
