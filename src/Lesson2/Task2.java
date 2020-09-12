/*

Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа.

*/

package Lesson2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое трехзначное число: ");
        String s = in.nextLine();

        try {
            int number = Math.abs(Integer.parseInt(s));
            if ((number >= 100) && (number <= 999)) {
                int sumDigits = 0;
                do {
                    sumDigits += number % 10;
                    number /= 10;
                } while (number > 0);

                System.out.println("Сумма цифр этого трехзначного числа: " + sumDigits);
            } else {
                System.out.println("Введенное число не является трехзначным");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + s + " не является целым числом.");
        }
        in.close();
    }

}
