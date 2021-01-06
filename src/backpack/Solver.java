package backpack;

import java.util.ArrayList;
import java.util.List;

public class Solver {
    private int needed;
    private int numberOfItem;
    private List<Item> items;
    private int table[][];
    private ArrayList<Item> itemsInBackpack;
    private int maxCost;

    public Solver(List<Item> items, int limit){
        this.items = items;
        this.needed = limit;
        this.numberOfItem = items.size() * 2;
        this.table = new int[numberOfItem][this.needed +1];
        this.itemsInBackpack = new ArrayList<>();
        this.solve();
        this.recover();
    }

    private int max(int i, int j){
        int a, b;
        a = table[i - 2][j];
        if(j < items.get(i/2).getWeight()) b = items.get(i/2).getCost();
        else b = items.get(i/2).getCost() + table[i - 2][j - items.get(i/2).getWeight()];
        if(Math.max(a,b) > a){
            table[i+1][j] = 1;
        }
        return Math.max(a,b);
    }

    public void solve(){
        for (int i = 0; i <= needed; i++) {
            if(items.get(0).getWeight() > i){
                table[0][i] = 0;
                table[1][i] = 0;
            }else {
                table[0][i] = items.get(0).getCost();
                table[1][i] = 1;
            }
        }
        for (int i = 2; i < numberOfItem; i += 2) {
            for (int j = 0; j <= needed; j ++) {
                if(items.get(i/2).getWeight() > j){
                    table[i][j] = table[i - 2][j];
                }else {
                    table[i][j] = max(i, j);
                }
            }
        }
        maxCost = table[numberOfItem-2][needed];
    }

    public void recover(){
        int volume = this.needed;
        for(int i = numberOfItem-1; i >= 0; i -= 2) {

            int a = volume;
            if (table[i][volume] == 1){
                itemsInBackpack.add(items.get((i-1) / 2));
            }
            volume = volume - table[i][volume] * items.get(i/2).getWeight();
        }
    }

    public ArrayList<Item> getItemsInBackpack() {
        return itemsInBackpack;
    }

    public int getMaxCost() {
        return maxCost;
    }
}