package buoi3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bai 3");
        System.out.println("Nhap so nguyen duong voi 2 chu so");
        int num = sc.nextInt();
        while (num < 10 || num > 99) {
            System.out.println("try again");
            num = sc.nextInt();
        }
        System.out.println(split(num));
    }

    private static int split(int n){
        int digit1 = n%10;
        int digit2 = (n/10)%10;
        return digit2+ digit1;
    }
}
