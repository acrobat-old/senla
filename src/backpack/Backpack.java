package backpack;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            items.add(new Item());
        }
        for(Item item : items){
            System.out.println("Weight: " +item.getWeight() +"\tCost: " + item.getCost());
        }
        Solver solver = new Solver(items, 10);
        System.out.println("Max cost: " + solver.getMaxCost());
        System.out.println("Item in backpack:");
        for(Item item : solver.getItemsInBackpack()){
            System.out.println("Weight: " + item.getWeight() + " Cost: " + item.getCost());
        }
    }
}