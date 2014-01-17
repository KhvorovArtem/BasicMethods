package ua.khvorov.methods;

import java.util.Arrays;

/**
 * Created by umb on 28.12.13.
 */
public class MethodsTesting {
    public static void main(String[] args) {
//        print(new char[]{'a', 'b', 'c'});
//        System.out.println();
//        print(new String[][]{
//                {"Chelsea FC", "Man Utd"}, {"Arsenal"}, {"Man City"}, {"Liverpool"}
//        });

    }

    //принимает массив чаров, выводит его на екран
    static void print(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    //принимает 2м массив строк, выводит его на екран
    static void print(String array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //принимает 2м массив интов, возвращает 2мерный массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
    static char[][] toChar(int array[][]) {
        char result[][] = new char[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = (char) array[i][j];
            }
        }
        return result;
    }

    //принимает 2м массив интов,  ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
    static void invert(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] * (-1);
            }
        }
    }

    //приминает 2 инта, а и б, возвращает большее их этих 2х чисел
    static int max(int x, int y) {
        return x > y ? x : y;
    }

    //принимает 3 интра, возвращает большее из них
    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    //приминает 5 интов, возвращает большее из них
    static int max(int a, int b, int c, int d, int e) {
        return max(max(a, b, c), max(d, e));
    }

    //принимает массив чаров, возвращает строку состощую из сивмволов массива
    static String toString(char[] array) {
        String s = new String(array);
        return s;
    }

    //принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
    static int indexOf(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    //принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
    static int lastIndexOf(int value, int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    //метод принимает инт, и возвращает факториал от заданого инта
    static int factorial(int value) {
        return (value == 0) ? 1 : value * factorial(value - 1);
    }

    //принимает инт год, и возвращает тру если год высокосный
    static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    //Принимает массив строк и просто строку, возвращает массив строк которые содержат данную подстроку. т.е. отфильтрованый из первого
    static String[] comparing(String[] array, String str) {
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(str)) {
                count++;
            }
        }

        String[] result = new String[count];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(str)) {
                result[j] = array[i];
                j++;
            }
        }
        return result;
    }

    //приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    static void multiplicity(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % value == 0) {
                System.out.println(array[i]);
            }
        }
    }

    //метод приминает дабл, выводит на екран этот дабл с точностью не больше чем 3 знака после точки
    static void rounding(double number) {
        System.out.printf("%.3f", number);
    }


    static void sortIncrease(int[] array) {
        Arrays.sort(array);
    }

    //метод приминимает массив интов сортирует его по убыванию (нельзя использовать методы сторонних классов)
    static void sortDecrease(int[] array) {
        int max, temp;

        for (int i = 0; i < array.length - 1; i++) {
            max = i;
            for (int scan = i + 1; scan < array.length; scan++) {
                if (array[max] < array[scan]) {
                    max = scan;
                }
            }

            temp = array[max];
            array[max] = array[i];
            array[i] = temp;
        }
    }

    //метод принимает массив интов и булен, если булен тру то сортирует по убываниию, иначе по возрастанию
    static void arraySorting(int[] array, boolean ascending) {
        if (ascending) {
            sortIncrease(array);
        } else {
            sortDecrease(array);
        }
    }


}
