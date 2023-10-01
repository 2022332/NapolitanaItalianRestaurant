package napolitanaItalianrestaurant;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ari
 */
public class MainCourse extends Menu{
    
    private String type;
    
    public MainCourse (String dname, int price, String type){
       super(dname, price);
       this.type = type;
    }
}
