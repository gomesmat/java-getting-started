package com.example;


public class Fatorial{
    public Fatorial(){

    }
    public static long fatorial(long n) {
        if (n <= 1) return n;
        else return n * fatorial(n-1);
    }
}