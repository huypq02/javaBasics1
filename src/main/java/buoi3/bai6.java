package buoi3;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bai 6");
        System.out.println("Ti gia VND-USD (hien tai): 23.500 VND");
        System.out.print("Nhap USD: $");
        float usd = sc.nextFloat();
        System.out.println("Result: "+ convertToVnd(usd) + " VND");
    }

    private static int convertToVnd(float usd){
        return (int)(usd*23500);
    }
}
