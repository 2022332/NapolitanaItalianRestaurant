/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package napolitanaItalianrestaurant;

/**
 *
 * @author Ari Murillo 2022332
 */
public abstract class Menu {
    
    String dname;
    int price;
    
    public Menu(String dname, int price) {
        this.dname = dname;
        this.price = price;
    }
    
    public String getDname() {
        return dname;
    }

    public int getPrice() {
        return price;
    }
    
     public void setDname(String dname) {
        this.dname = dname;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return this.dname + " Price: $" + this.price;
    }
}
