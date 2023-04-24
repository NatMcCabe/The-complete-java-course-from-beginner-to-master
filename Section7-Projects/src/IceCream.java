import java.util.ArrayList;

public class IceCream {
    public String name;
    public int cost;
    public int numScoops;
    public ArrayList<String> toppings;

    IceCream(String name, int cost, int numScoops){
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
    }

    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }

    public int getNumScoops(){
        return numScoops;
    }

    public void printToppings(){
        System.out.println("Toppings for " + name + " are: " + toppings);
    }

    public void iceCreamDeets(){
        System.out.println("Name: " + this.getName());
        System.out.println("Cost: £" + this.getCost());
        System.out.println("Number of Scoops : " + this.getNumScoops());
        this.printToppings();
    }
}
