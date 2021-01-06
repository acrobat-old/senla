package backpack;

public class Item {
    private int weight;
    private int cost;


    public Item(){
        this.cost = 1 + (int)(Math.random() * 5);
        this.weight = 1 + (int)(Math.random() * 7);
    }

    public Item(int weight, int cost){
        this.weight = weight;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

}
