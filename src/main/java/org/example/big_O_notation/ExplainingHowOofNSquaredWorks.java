package org.example.big_O_notation;

public class ExplainingHowOofNSquaredWorks {
    //Explaining O(n2)
//    public static void printItems(int n){
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                System.out.println(i + " " + j);
//            }
//        }
//    }
//
//    static void main(String[] args) {
//        printItems(10);
//    }

    //Drop Non-Dominants
    public static void printItems(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(i + " " + j);
            }
        }

//        for (int k = 0; k < n; k++){
//            System.out.println(k);
//        }
    }

    static void main(String[] args) {
        printItems(10);
    }

}
