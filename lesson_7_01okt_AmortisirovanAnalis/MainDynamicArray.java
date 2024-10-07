package de.telran.lesson_7_01okt_AmortisirovanAnalis;

import java.util.Arrays;

public class MainDynamicArray {

        public static void main(String[] args) {
            DynamicArray da = new DynamicArray();
            da.add(1);
            da.add(2);
            da.add(3);
            da.add(4);
            da.add(5);
            da.add(6);
            da.add(7);
            da.add(8);
            da.add(9);
            System.out.println(Arrays.toString(da.array));
            da.addAt(5,11);
            System.out.println(Arrays.toString(da.array));

            da.remove();
            System.out.println(Arrays.toString(da.array));

            da.removeAt(5);
            System.out.println(Arrays.toString(da.array));
            System.out.println();


            System.out.println("*****hw_7_01okt***********");
            da.set(10,16);
            System.out.println("da.set(10,16)  "+ Arrays.toString(da.array));

            System.out.println();
            System.out.println("da.contains(4) =  " +  da.contains(4));
            System.out.println();

            System.out.println("da.isEmpty()  "+  da.isEmpty());
            System.out.println();

            da.clean();
            System.out.println("da.clean()   " + Arrays.toString(da.array));

        }
    }

