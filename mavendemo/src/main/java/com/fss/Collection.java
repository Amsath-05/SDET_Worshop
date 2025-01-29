package com.fss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Collection {

    public void arrayList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("ArrayList elements: " + numbers);
    }

    public void sortArrayList() {
        List<Integer> l = new ArrayList<>(Arrays.asList(30, 40, 50, 25, 10, 5));
        Collections.sort(l);
        System.out.println(l);

    }

    public void hashUniqueName() {
        HashSet<String> names = new HashSet<>();

        names.add("Velu");
        names.add("Jeni");
        names.add("Anup");
        names.add("Amsath");
        names.add("Kishore");
        names.add("Anbu");
        System.out.println("Unique Names in the HashSet: " + names);
    }


    public void studentScores() {
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Amsath", 90);
        studentScores.put("Velu", 85);
        studentScores.put("Jeni", 88);
        studentScores.put("Anup", 92);
        studentScores.put("Anbu", 95);

        System.out.println("Student Scores:");
        for (String student : studentScores.keySet()) {
            System.out.println(student + ": " + studentScores.get(student));
        }
    }

    public static void main(String[] args) {
        Collection cl = new Collection();
        cl.arrayList();
        cl.sortArrayList();
        cl.hashUniqueName();
        cl.studentScores();
    }
}
