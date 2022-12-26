package com.lambdaexpression;

public class LambdaExpression {
    public static void main(String[] args) {
        Print p=(s) -> {
            System.out.println(s);

        };
        p.Print("Sreekanth");
    }
}
