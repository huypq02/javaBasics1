package buoi3;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bai 5");
        System.out.println("Nhap do C: ");
        float c = sc.nextFloat();
        System.out.println("F = "+ convertToFahrenheit(c));
    }

    private static float convertToFahrenheit(float c){
        return c*1.8f+32;
    }
}
