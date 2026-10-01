package org.example.big_O_notation;

public class ExplainingHowOofNWorks {
    //This is O(n)
    public static void printItems(int n){
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }

    }

    static void main(String[] args) {
        printItems(10);
    }

    //Drop Constants

//    public static void printItems(int n){
//        for (int i = 0; i < n; i++){
//            System.out.println(i);
//        }
//
//        for (int j = 0; j < n; j++){
//            System.out.println(j);
//        }
//    }
}
