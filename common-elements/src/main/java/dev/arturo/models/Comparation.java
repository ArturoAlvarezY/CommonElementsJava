package dev.arturo.models;

import java.util.ArrayList;

public class Comparation {

    public ArrayList<Integer> findCommons(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
        
    ArrayList<Integer> commonElements = new ArrayList<>(firstArray);
    
    commonElements.retainAll(secondArray);

    return commonElements;


    }
}
