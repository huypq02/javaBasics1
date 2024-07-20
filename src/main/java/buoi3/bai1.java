package buoi3;

import java.util.Scanner;
import pkg.utils;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 1");
        System.out.println("Number 1: ");
        float n1 = sc.nextFloat();
        if (utils.isNegativeNumber(n1)){
            System.out.println("err: Number 1 should be positive");
            return;
        }
        System.out.println("Number 2: ");
        float n2 = sc.nextFloat();
        if (utils.isNegativeNumber(n2)){
            System.out.println("err: Number 2 should be positive");
            return;
        }
        System.out.println("Result: " + pythagoras(n1,n2));
    }

    private static double pythagoras(float canhgocVuong1, float canhgocVuong2){
        return Math.sqrt(canhgocVuong1*canhgocVuong1 + canhgocVuong2*canhgocVuong2);
    }
}
