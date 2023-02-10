/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author alejandro
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = 0.2;
        double total;
        // TODO code application logic here
        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";
        
        int measurement = 10;
        switch (measurement) {
            case 1: case 2: case 3: //can also use case 1, 2, 3:
                c1.size = "S";
                break;
            case 4: case 5: case 6: //can also use case 4, 5, 6:
                c1.size = "M";
                break;
            case 7: case 8: case 9: //can also use case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
                break;
        }
        System.out.println("Customer is "+c1.name + "and is size: " + c1.size);
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        
        item2.description = "Orange T-SHirt";
        item2.price = 10.5;
        item2.size = "S";
        
        System.out.println(item1.description + "," + item1.price + "," + item1.size);
        System.out.println(item2.description + "," + item2.price + "," + item2.size);
        
        total = (item1.price + (item2.price * 2)) * (1 + tax);
        System.out.println("The total price is " + total);
    }
    
}
