/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package napolitanaItalianrestaurant;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class NapolitanaItalianRestaurant {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainCourse item1 = new MainCourse("Pasta Carbonara",15,"Linguine"); 
        MainCourse item2 = new MainCourse("Pizza", 14, "Thin crust");
        MainCourse item3 = new MainCourse("Rissotto", 16, "Mushrooms"); 
        SideDish item4 = new SideDish("Italian Crackers", 2, 6);
        SideDish item5 = new SideDish("Garlic Bread", 3, 2);        
        SideDish item6 = new SideDish("Garlic Knotts", 6, 4);     
        
        ArrayList<Menu> menuDishes = new ArrayList<>();
        menuDishes.add(item1);
        menuDishes.add(item2);
        menuDishes.add(item3);        
        menuDishes.add(item4);
        menuDishes.add(item5);
        menuDishes.add(item6);
        
        System.out.println("Welcome to Napolitana Italian Restaurant \n What would you like to see our menu or order?");
        Scanner myKB = new Scanner(System.in);
        System.out.println("1. See Menu. \n2. Order.");
        int userInput = myKB.nextInt();
        myKB.nextLine();
        if (userInput == 1){
            System.out.println("This is our menu" + menuDishes.toString());
        }
        else if (userInput == 2){
            
            System.out.println("Great! What would you like to order?\n" + menuDishes.toString()); 
            String order = myKB.nextLine();
            System.out.println("Thanks for ordering " + order);
        }
    }
}
