package buoi3;

import java.util.Scanner;
import pkg.utils;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bai 2");
        System.out.println("P(x) = ax^n with x = 8");
        System.out.println("Nhap a (so thuc)");
        float a = sc.nextFloat();
        System.out.println("Nhap n (so nguyen khong am)");
        int n = sc.nextInt();
        if (utils.isNegativeNumber(n)){
            System.out.println("err: n should be positive");
            return;
        }
        double result = a*Math.pow(8, n);
        System.out.println("Result: " + result);
        return;
    }
}
