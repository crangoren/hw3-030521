package Lessons;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        
        arrayList.add("new");
        arrayList.add("aa");
        arrayList.add("arr");
        arrayList.add("aff");
        arrayList.add("add");
        arrayList.add("nef");
        arrayList.add("aff");
        arrayList.add("afs");
        arrayList.add("ads");
        arrayList.add("few");
        arrayList.add("mew");
        arrayList.add("aff");
        arrayList.add("aa");
        arrayList.add("add");
        arrayList.add("new");

        Phonebook phonebook = new Phonebook();

        phonebook.add(123456, "Ivan");
        phonebook.add(434546, "Ivan");
        phonebook.add(554437, "Sergey");
        phonebook.add(545643, "Viktor");
        phonebook.add(654636, "Sergey");
        phonebook.add(683588, "Alexandr");
        phonebook.add(153452, "Denis");
        phonebook.add(548883, "Vasily");
        phonebook.add(111111, "Petr");
        phonebook.add(463788, "Michael");
        phonebook.add(879497, "Eugen");

        phonebook.get("Sergey");
        System.out.println("\b");

//        String[] arr = new String[arrayList.size()];
//        arrayList.toArray(arr);

        Map<String, Integer> countWords = new HashMap<>();

//        arrayList.forEach(System.out::println);

        for (String s : arrayList) {
            countWords.put(s, countWords.getOrDefault(s, 0) + 1);
        }

        System.out.println("repeats count:");
        System.out.println("\b");
        countWords.entrySet().forEach(System.out::println);

        System.out.println("\b");
        System.out.println("unique words:");
        System.out.println("\b");


        Set<String> unique = new HashSet<>(arrayList);
        unique.forEach(System.out::println);


    }

}
