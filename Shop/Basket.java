package shop;
import java.util.*;

public class Basket {

  private String name;
  private ArrayList<Grocery> shoppingBasket;

  public Basket(String name){
    this.name = name;
    this.shoppingBasket = new ArrayList<Grocery>();
  }

  public String getName(){
    return name;
  }

  public int foodCount(){
    return shoppingBasket.size();
  }

  public void addFood(Grocery food){
    shoppingBasket.add(food);
  }

  public void removeFood(Grocery food){
    shoppingBasket.remove(food);
  }

  public void checkout(){
    shoppingBasket.clear();
  }


  public double getTotalCost(){
    double totalcost = 0;
    for (Grocery grocery : shoppingBasket) 
     totalcost += grocery.getPrice();
   return totalcost;

 }
 
  public double getTwentyPercentOff(){
  double totalcost = getTotalCost();
  if (totalcost > 20.00) {
    totalcost = totalcost * 0.9;
  }
  return totalcost;
}

  public double getTwoPercentLoyaltyCard(){
  double totalcost = getTotalCost();
    totalcost = totalcost * 0.98;
  return totalcost;
}
}