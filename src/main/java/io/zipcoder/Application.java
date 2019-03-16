package io.zipcoder;


import io.zipcoder.io.zipcoder.pets.Pet_Swathi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    String name;
    public static void Main(String[] args) {
        Pet_Swathi pet =new Pet_Swathi();

        System.out.println("Hello how many pets do uou have?" );
        Scanner scan = new Scanner(System.in);
        //String s = scan.next();
        int i = scan.nextInt();

        System.out.println("What are they?");
        for (int j = 0; j < i; j++) {
            String s = scan.nextLine();

//            switch ( s = "Cat"){
//                case :
//                    System.out.println("enter your cat name" );
//                    String s1 =scan.nextLine();
//             switch (s ="Dog") {
//
//             }

 //           }


        }
    }

}
