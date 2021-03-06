/*
Ввести целое число в консоли. 
Если оно является положительным, то прибавить к нему 1;
если отрицательным, то вычесть из него 2; 
если нулевым,то заменить его на 10.
Вывести полученное число.
*/

package Lesson2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String s = in.nextLine();

        try {
            int number = Integer.parseInt(s);
            if (number > 0) {
                number++;
            } else if (number < 0) {
                number -= 2;
            } else {
                number = 10;
            }

            System.out.println("Введенное число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + s + " не является целым числом.");
        }
        in.close();
    }

}
