package pl.javapoz25;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Exercise 2
        /*System.out.println("Exercise 2:");

        List<Integer> numbersList = new ArrayList<>();

        numbersList.add(4);
        numbersList.add(6);
        numbersList.add(9);
        numbersList.add(7);

        int size = numbersList.size();
        System.out.println("a) " + size);
        System.out.println();

        System.out.println("b) " + numbersList.get(0));
        System.out.println();

        System.out.println("c) " + numbersList.get(numbersList.size() - 1));*/

        //Exercise 4
        /*System.out.println("Exercise 4:");

        ArrayList<String> listOfNames = new ArrayList<>();

        //a)
        listOfNames.add("Kasia");
        listOfNames.add("Tomek");
        listOfNames.add("Julia");
        listOfNames.add("Mati");
        listOfNames.add("Mietek");

        //b)
        for (String names : listOfNames) {
            System.out.println(names);
        }
        System.out.println();

        //c)
        Collections.reverse(listOfNames);
        for (String names : listOfNames) {
            System.out.println(names);
        }*/

        //Exercise 5
        System.out.println("Exercise 5:");

        Scanner in = new Scanner(System.in);

        //a)
        ArrayList<String> listOfNames2 = new ArrayList<>();

        System.out.println("Wprowadź imiona:");

        for (int i = 0; i < 5; i++) {
            String names = in.nextLine();
            listOfNames2.add(names);
            System.out.println("Imiona na liście: " + listOfNames2);
        }
    }
}

