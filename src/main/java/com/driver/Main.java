package com.driver;

class Product{

    public int product(int x, int y) {
        return x+y;
    }

    public int product(int x, int y, int z) {
        return x+y+z;
    }

    public double product(double x, double y) {
        return x+y;
    }
}

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(5,7));
        System.out.println(p.product(5 , 6 , 7));
        System.out.println(p.product(5.5, 2.3));
    }




}