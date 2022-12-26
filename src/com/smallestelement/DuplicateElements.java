package com.smallestelement;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[]={1,22,33,33,44,44,5};
        System.out.println("The Duplicate Elements of an Array are:");
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(+arr[j]+" ");
                }
            }
        }
    }
}
