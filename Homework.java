package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива №1: ");
        int u = in.nextInt();
        System.out.print("Второй массив должет быть не длиннее первого. Введите размер массива №2: ");
        int y = in.nextInt();
        while (y > u){
            System.out.println("Первое число больше второго");
            System.out.print("Второй массив должет быть не длиннее первого. Введите размер массива №2: ");
            y = in.nextInt();
            if (y <= u);
            break;
        }

        String[] first, second;
        first = new String[u];
        second = new String[y];
        in.nextLine();

        for (int i=0; i<u; i++) {
            Scanner a = new Scanner(System.in);
            System.out.print("Введите  содержимое массива 1 [" + i + "] - ");
            first[i] = a.nextLine();
        }
        System.out.println(Arrays.toString(first)); // выводим содержимое массива1

        for (int i=0; i<y; i++) {
            Scanner z = new Scanner(System.in);
            System.out.print("Введите  содержимое массива 2 [" + i + "] - ");
            second[i] = z.nextLine();
        }
        System.out.println(Arrays.toString(second));  // выводим содержимое массива1

        for (int j=0; j < first.length; j++) {

            boolean t = true;
            for (int f = 0; f < second.length; f++) {
                if (first[j].equals(second[f])) {
                    s.append("1 ");
                    t = false;
                }
            }
            if (t)
                s.append("0 ");
            else
                continue;
        }
        in.close();
        System.out.print(s);
    }
}