package buoi3;

import java.util.Scanner;

public class bai4 {
    final static int MAXNUM = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 4");
        int i = 0;
        double sum = 0;
        for (; i < MAXNUM; i ++){
            System.out.println("Nhap number " + (i+1));
            sum += sc.nextDouble();
        }
        System.out.println("Result: " + avg(sum, i));
    }

    private static double avg(double sum, int i){
        return sum/(double)i;
    }
}
