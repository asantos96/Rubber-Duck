package com.company;

public class Main {

    public static void main(String[] args) {
	int questionLength = 200;
    if (questionLength<200) {
        System.out.println("Ask a better question!");
    } else if (questionLength >=200 && questionLength <=500) {
        System.out.println("Awesome question!");
    } else {
        System.out.println ("Simplify your question!") ;
    }


    }
}
