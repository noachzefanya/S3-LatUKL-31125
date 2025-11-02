package LatUKL031125;

import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        int b = in.nextInt();
        int faktor = 1;
        for (int i = 1; i <= b; i++) {
            faktor *= i;
        }
        System.out.println(faktor);
        in.close();
    }
}
