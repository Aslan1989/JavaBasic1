package basic;

import org.jetbrains.annotations.NotNull;

import java.security.PublicKey;
import java.util.Arrays;

public class Lesson8Homework {
    public static void main(String[] args) {
        int [] test  = new int[]{10,5,-6,18,4,5435,654,45};
        fillArrayBackwards(test);
        System.out.println(
                Arrays.toString(test)
        );

        System.out.println(hasNegativeElements(test));
        int [] negative = new int[]{-2,3};
        System.out.println(hasNegativeElements(negative));
        makeArrayPositive(negative);
        System.out.println(
                Arrays.toString(negative)
        );

        System.out.println(
                Arrays.toString(getChars("Петя"))

        );
        int [] r1 = new int[]{10,2,3333,4,5};
        arrayReverse(r1);
        System.out.println(
                Arrays.toString(r1)
        );
    } // main

    // Напишите функцию, которая "переворачивает" передаваемый в нее
    // масссив, пример: [10,2,666,4,5]->[5,4,666,2,10]
    public static void arrayReverse(int [] a)
    {
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }



    // Напишите функцию, которая возвращает массив из символов
    // передаваемой в нее сторки, пример: "Петя" ->['П','е','т','я']
    public static char [] getChars(String text)
    {
//        char [] result = new char[text.length()];
//        for (int i = 0; i < text.length(); i++) {
//            result[i] = text.charAt(i);
//        }
//        return result;
        return text.toCharArray();
    }

    // Напишите функцию которая принимает на вход массив и заменяет
    // в нем все отрицательные значения на их абсолютные значения
    public static void makeArrayPositive(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0){
                a[i] = -a[i];
                a[i] = Math.abs(a[i]);
            }
        }
    }

    // Напишите функцию которая проверяет есть ли в передаваемом в нее
    // массиве отрицательые элементы - возварщает boolean[
    public static boolean hasNegativeElements(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0){
                return true;
            }
        }
        return false;
    }

    // написать функцию , которая принимает на вход массив целых чисел и заполняет
    // его числами в обратном порядке -
    // если передается массив длины 5, он заполняется значениями 5,4,3,2,1
    public static void fillArrayBackwards(int @NotNull [] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = a.length -i;
        }
    }

}
