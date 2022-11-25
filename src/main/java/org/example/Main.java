package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


///////////////////////////////////////////// Калькулятор
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите 1 число: ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Введите 2 число: ");
//        int num2 = scan.nextInt();
//
//        System.out.print("Введите действие: ");
//        String num3 = scan.nextLine();
//        num3 = scan.nextLine();
//
//        int res;
//
//        switch (num3) {
//            case "+":
//                res = num1 + num2;
//                System.out.println("Результат:" + res);
//                break;
//            case "-":
//                res = num1 - num2;
//                System.out.println("Результат:" + res);
//                break;
//            case "/":
//                res = num1 / num2;
//                System.out.println("Результат:" + res);
//                break;
//            case "*":
//                res = num1 * num2;
//                System.out.println("Результат:" + res);
//                break;
//            default:
//                System.out.println("Ошибка!!!");
//
//        }
//    }
//}



///////////////////////////////////// Оператор if / else

//public class Main {
//    public static void main(String[] args) {
//        int a = 15, b = 20;
//        char sym1 = 'A', sym2 = 'a';
//        boolean isHasCAr = false;
//        if (!isHasCAr && a == b) {
//            System.out.println("Да, верно");
//        } else if (a >= b) {
//            System.out.println("second test ");
//        } else if (a > b) {
//            System.out.println("3 test ");
//        } else if (a <= b) {
//            System.out.println("4 test ");
//        } else if (a == b) {
//            System.out.println("5 test ");
//        } else {
//            System.out.println("Нет, не верно");
//        }
//    }
//}

//    }
//    public class Main{
//        public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите роль: ");
//        String role = scanner.nextLine();
//        System.out.println("Введите пароль: ");
//        String pass = scanner.nextLine();
//        if (role.equals("Admin") && pass.equals("12345") ){
//            System.out.println("Все пользователи");
//        } else {
//            System.out.println("Привет, как вас зоут?");
//            String name = scanner.nextLine();
//        }
//        }
//}




//////////////////////////////////////// оператор / switch case

//    public class Main{
//        public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        switch (num) {
//            case 1:
//                System.out.println("Number is 1");
//                break;
//            case 2:
//                System.out.println("NUmber is 2");
//                break;
//            case 5:
//                System.out.println("NUmber is 5");
//                break;
//            case 10:
//                System.out.println("Number is 10");
//                break;
//            default:
//                System.out.println("Error!");
//
//        }
//    }
//}




/////////////////////////// /операторы For / While / Do while / break  / continue

// public  class Main {
//     public static void main(String[] args){
//         for (float i = 20; i > 10; i--) {
//             System.out.println("Element " + i);
//
//         int i = 0;
//         while (i <= 10){
//             System.out.println("Element " + i);
//             i++;



//         int i = 0;
//         do {
//             System.out.println("Element " + i);
//             i += 1;
//         } while(i<=10);


//         for (int i = 5; i < 25; i+= 2) {
//             if(i % 3 == 0)
//                 continue;
//
//             if (i >= 17)
//                 break;
//             System.out.println("Element " + i);
//         }
//
//     }
//}



/////////////////////////////////////////////// Массивы данных

//public class Main {
//    public static void main(String[] args){
//        int[] array = new int[5];
//        array[0] = 45;
//        array[1] = 45;
//        array[2] = 45;
//        array[3] = 45;
//        array[4] = 45;
//        int res = array[2] + array[3];
//        System.out.println(res);
//
//        float[] array2 = new float[] {5.0f, 6.45f, 89.984f};
//        System.out.println(array2[1]);
//
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println("Element: " + array2[i]);
//        }

/////////////////////////////////////////  Нахождение минимального числа

//        int[] arr = new int[4];
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Write number: ");
//            int value = scanner.nextInt();
//            arr[i] = value;
//
//        }
//
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Minimal: " + min);

//////////////////////////////////////////////////// Двумерный массив

//        char[][] syms = new char[2][2];
//        syms[0][0] = 't';
//        System.out.println(syms[0][0]);
//
//        byte[][] nums = new byte[][]{
//                {5,7},
//                {7,3},
//                {2,0}
//        };
//
//        nums[1][1] = 67;
//        System.out.println(nums[1][1]);
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length ; j++) {
//
//            }
//        }
//     }
//}




/////////////////////////////////////////////////////Коллекция

//public class Main {
//    public static void main(String[] args){
/////////////////////////////////////////////////////   ArrayList
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(50);
//        numbers.add(1, 30);
//
//        System.out.println(numbers.size());
//        System.out.println(numbers.get(1));
//        numbers.remove(1);
//        numbers.clear();
//
//        for (Integer el : numbers) {
//            System.out.println(el);
//        }
///////////////////////////////////////////////////   LinkedList
//        LinkedList<Float> numbers2 = new LinkedList<>();
//        numbers2.add(5.6f);
//        numbers2.add(15.6f);
//        numbers2.add(534.6f);
//        numbers2.add(5.623f);
//
//        for (Float el : numbers2)
//            System.out.println(el);
//    }
//}