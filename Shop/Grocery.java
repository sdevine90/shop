package shop;
import java.util.*;


public class Grocery{

private String name;
private double price;

public Grocery(String name, double price){
this.name = name;
this.price = price;

}

public String getName(){
  return name;
}

public double getPrice(){
  return price; 
}

}