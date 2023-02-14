/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author alejandro
 */
public class Customer {

    private String name;
    private String size;

    private Clothing[] items;

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public double getTotalClothingCost() {
        double total = 0.0;
        for(Clothing totalItems : items){
            //if(c1.getSize().equals(totalItems.getSize())){
                total += (totalItems.getPrice());
                //System.out.println("Item :" + totalItems.getDescription()+ ","+ totalItems.getPrice() + "," + totalItems.getSize());
                //if(total > 15){break;}
            //total += totalItems.price * (1 + tax);
            //System.out.println("Item :" + totalItems.description+ ","+ totalItems.price + "," + totalItems.size);
            //}
        }
        return total;
    }

    public Clothing[] getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {

        switch (measurement) {
            case 1:
            case 2:
            case 3: //can also use case 1, 2, 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6: //can also use case 4, 5, 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9: //can also use case 7, 8, 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }

}
