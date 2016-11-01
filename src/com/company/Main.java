package com.company;

public class Main {

    public static void main(String[] args) {

        //declaring arrays
        // Circle cir [] = new Circle [500];

        //initializing all of them at once
        int meh[] = new int[500];
        for(int i = 0; i <500; i++){
            meh[i] = i;
            System.out.println(meh[i]);
        }

        //nullPointerException
        double mxz [];
        //mxz [3] = asdjfjasdbf[obsf];
        //gives you null pointer execption bc you never initiailized

        //different references to the same array
        int jawn [] = {1, 2, 3, 4, 5};
        int sec [];
        sec = jawn;
        sec[2] = 99;
        System.out.println(jawn[2]);
        //this changes jawn to sec


        mxz = null;
        //this clears out the array. all indicies will be wiped out




        //enhanced for loops!!!!!!
        //only can view, its like a read-only
        int x [] = {4, 3, 2, 1};
        int sum = 0;
        for (int varName: x) {
            sum = sum + varName *
            varName;
            //the variable is born in the loop and dies in the loop
            //quick way to access all elements of an array
            System.out.println(sum);
        }
        String str [] = {"one", "two", "three"};
        for (String ss;str){
            ss="zero";
            //ss is a read only
            //essential ss does nothing at this point
        }
        //enhanced for loops will be all over the test
    }
}
