/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Work Station
 */
public class JavaSelection {

    public static void main(String[] args) {

        // selection statements
        int grade = 78;

//        if (grade > 60) {
//            System.out.println("Passed the class!");
//        } else {
//            System.out.println("Failed!!!");
//        }

        // 60-69 = D
        // 70-79 = C
        // 80-89 = B
        // 90-100 = A
        //x5 - next grade is +
        //x - x4 is -
        // the operator AND in java ==>  &&
        // the operator OR in java ==>  ||
        
        
        /*
        find out if the grade is between 80 - 90 
        if so, see if its above 94, A-, if not A-
        
        
        
        */
        
        
        
        grade = 59;

        if (grade > 89) {
            if (grade > 94) {
                System.out.println("YOU GOT A+");
            } else {
                System.out.println("YOU GOT A-");
            }
        } else if (grade > 79) {
            if (grade > 84) {
                System.out.println("YOU GOT B+");
            } else {
                System.out.println("YOU GOT B-");
            }
        } else if (grade > 69) {
            if (grade > 74) {
                System.out.println("YOU GOT C+");
            } else {
                System.out.println("YOU GOT C-");
            }
        } else if (grade > 59) {
            if (grade > 64) {
                System.out.println("YOU GOT D+");
            } else {
                System.out.println("YOU GOT D-");
            }
        } else {
            System.out.println("YOU FAILED!");
        }

        /*
                if(conditions){
        true block
        } else {
        
        }
         */
    }

}
