package org.sourceit;

import java.util.Scanner;

public class GuessNumber {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int generateNumber = (int) (Math.random() * 100 + 1);
        boolean win = false;
        int number;

        while(!win){
            System.out.print("Введите число от 1 до 100 : ");
            number = in.nextInt();
            if(number < 1 || number > 100){
            System.out.println("Вы ввели число не из заданного диапазона");
            }
            else{
                if(number == generateNumber){
                    win = true;
                }else if(number < generateNumber){
                    System.out.println("Слишком низко");
                }else if(number > generateNumber){
                    System.out.println("Слишком высоко");
                }
            }
        }
        System.out.println("Вы выграли");
        System.out.println("Я загадал число " + generateNumber );
    }
}
