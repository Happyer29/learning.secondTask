package ru.vsu.cs.yagodintsevNikitaAndreevich;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        if(isHoliday(day, month)){
            System.out.println("Выходной");
        }
        else{
            System.out.println("Я каменщик работаю три дня АААААААААААААААА");
        }


    }

    private static boolean isHoliday(int day, int month){
        if(day <= 31 && day >= 1 && month <= 12 && month >= 1){
            final int[][] holyday = {
                    //Январь (1)
                    {
                        1, 2, 3, 4, 5, 6, 7, 8, 11, 12, 18, 19, 25, 26
                    },
                    {
                        1, 2, 8, 9, 15, 16, 22, 23, 24, 29
                    },
                    {
                        1, 7, 8, 9, 14, 15, 21, 22, 28, 29
                    },
                    {
                        4, 5, 11, 12, 18, 19, 25, 26
                    },
                    //Май (4)
                    {
                        1, 2, 3, 4, 5, 9, 10, 11, 16, 17, 23, 24, 30, 31
                    },
                    {
                        6, 7, 12, 13, 14, 20, 21, 27, 28
                    },
                    {
                        4, 5, 11, 12, 18, 19, 25, 26
                    },
                    {
                        1, 2, 8, 9, 15, 16, 22, 23, 29, 30
                    },
                    //Сентябрь
                    {
                        5, 6, 12, 13, 19, 20, 26, 27
                    },
                    {
                        3, 4, 10, 11, 17, 18, 24, 25, 31
                    },
                    {
                        1, 4, 7, 8, 14, 15, 21, 22, 28, 29
                    },
                    //Декабрь
                    {
                        5, 6, 12, 13, 19, 20, 26, 27
                    }
            };

            month -= 1;

            return isArrIncludeInt(holyday[month], day);

        }
        return false;
    }

    private static boolean isArrIncludeInt(int[] arr, int toCheck){
        for(int val: arr){
            if(val == toCheck){
                return true;
            }
        }
        return false;
    }
}
