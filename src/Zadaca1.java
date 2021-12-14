import java.util.Random;
import java.util.Scanner;

public class Zadaca1 {
    public static void main(String[] args) {
        //ZADAĆA:
        //Svaki član niza numbers generisati tako da bude u opsegu od 0 do 1000 slučajan broj
        //POMOĆ: Random randomGenerator = new Random(1000);
        int ukupno_brojeva = 7;

        int[] numbers = new int[ukupno_brojeva];
        int i;

        for (i = 0; i < ukupno_brojeva; i++){
            Random randomgen = new Random();
            int randomnum = randomgen.nextInt(1000 - 1) + 1;
            numbers[i] = randomnum;
        }

        System.out.println("Unesi broj i okušaj sreću:");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean foundIt = false;

        for (i = 0; i < ukupno_brojeva; i++) {
            int broj = numbers[i];
            if (uneseniBroj == broj) {
                foundIt = true;
                break;
            }
        }
        String message = foundIt ? "Uneseni broj '" + uneseniBroj + "' se nalazi na indeksu '" + i + "'" : "Više sreće drugi put";
        System.out.println(message);
    }
}