package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int wynik = 0;
        int wagi = 0;
        Scanner scanner = new Scanner(System.in);
        int ilosc = 1;
        while(true)
        {
            try
            {
                System.out.print("Wpisz ilosc wartosci:");
                ilosc = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.print("Zly zakres!");
            }
        }
        for (int i = 0; i < ilosc; i++)
        {
            while(true) {
                try
                {
                    System.out.print("Wpisz liczbe:");
                    int liczba = Integer.parseInt(scanner.nextLine());
                    int waga = ThreadLocalRandom.current().nextInt(1, 10);
                    wynik += liczba * waga;
                    wagi += waga;
                    break;
                }
                catch (NumberFormatException e)
                {
                    System.out.print("Nie podałeś liczby!");
                }
            }
        }
        wynik = wynik/wagi;
        System.out.print(wynik);
    }
}
