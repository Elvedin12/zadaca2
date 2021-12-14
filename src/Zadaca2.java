//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;
import java.util.Scanner;

public class Zadaca2 {
    public Zadaca2() {
    }

    public static void main(String[] args) {
        int ukupno_brojeva = 4;
        int ukupno_brojeva2 = 4;
        int[] numbers = new int[ukupno_brojeva];
        int[][] twoDimeArray = new int[ukupno_brojeva][ukupno_brojeva2];

        for(int i = 0; i < ukupno_brojeva; ++i) {
            for(int b = 0; b < ukupno_brojeva2; ++b) {
                Random randomgen = new Random();
                int randomnum = randomgen.nextInt(9) + 1;
                numbers[b] = randomnum;
            }

            twoDimeArray[i] = numbers;
        }

        System.out.println("Unesi broj i okušaj sreću");
        int uneseniBroj = (new Scanner(System.in)).nextInt();
        boolean foundIt = false;

        label33:
        for(int c = 0; c < twoDimeArray.length; ++c) {
            int[] element = twoDimeArray[c];

            for(int j = 0; j < element.length; ++j) {
                int broj = twoDimeArray[c][j];
                if (uneseniBroj == broj) {
                    foundIt = true;
                    break label33;
                }
            }
        }

        String message = foundIt ? "Čestitamo" : "Okušajte sreću drugi put";
        System.out.println(message);
    }
}
