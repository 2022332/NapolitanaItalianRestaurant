/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package napolitanaItalianrestaurant;

/**
 *
 * @author Ari
 */
public class SideDish extends Menu{
    
    private int quantity;
    
    public SideDish (String dname, int price, int quantity){
        super(dname, price);
        this.quantity = quantity;
    }
}
