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
        double total = 0.0;
        // TODO code application logic here
        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");
        
        
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        //Clothing item3 = new Clothing();
        //Clothing item4 = new Clothing();
        
        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
        
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");
        
        item2.setDescription("Orange T-SHirt");
        item2.setPrice(10.5);
        item2.setSize("S");
        
        items[2].setDescription("Green Scarf");
        items[2].setPrice(5);
        items[2].setSize("S");
        
        items[3].setDescription("Blue T-SHirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");
        
//        for(int i = 0; i < items.length; i++){
//            System.out.println( items[i].description + ","+ items[i].price + "," + items[i].size);
//        }
        int measurement = 3;
        
        c1.setSize(measurement);
        
        System.out.println("Customer is "+c1.getName() + "and is size: " + c1.getSize());
        
        for(Clothing totalItems : items){
            if(c1.getSize().equals(totalItems.getSize())){
                total += (totalItems.getPrice() * (1 + tax));
                System.out.println("Item :" + totalItems.getDescription()+ ","+ totalItems.getPrice() + "," + totalItems.getSize());
                if(total > 15){break;}
            //total += totalItems.price * (1 + tax);
            //System.out.println("Item :" + totalItems.description+ ","+ totalItems.price + "," + totalItems.size);
            }
        }
        
        
        //System.out.println(item1.description + "," + item1.price + "," + item1.size);
        //System.out.println(item2.description + "," + item2.price + "," + item2.size);
        
        //total = (item1.price + (item2.price * 2)) * (1 + tax);
        System.out.println("The total price is " + total);
    }
    
}
