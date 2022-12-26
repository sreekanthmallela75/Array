package com.Recursion;

public class ReverseRecursion {
    public static void display(int a) {

        if (a < 20) {
            display(a + 1);
            System.out.println(a + " ");
        }
    }
    public static void main(String[] args) {
     display(9);
    }
}
