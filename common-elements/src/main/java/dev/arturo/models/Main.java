package dev.arturo.models;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        FirstArray firstArray = new FirstArray();
        SecondArray secondArray = new SecondArray();
        Comparation comparation = new Comparation();

        ArrayList<Integer> firstList = firstArray.getingFirstArray();
        ArrayList<Integer> secondList = secondArray.getingSecondArrayList();
        ArrayList<Integer> findingCommons = comparation.findCommons(firstList, secondList);

        System.out.println("The commons elements are: " + findingCommons);
    }
}
