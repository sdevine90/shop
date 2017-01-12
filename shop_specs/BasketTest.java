import shop.*;
import static org.junit.Assert.*;
import org.junit.*;

public class BasketTest {

  Basket basket;
  Grocery food;
  Grocery food2;
  Grocery food3;

  @Before 
  public void before() {
    basket = new Basket("Steph Basket");
    food = new Grocery("orange", 3.00);
    food2 = new Grocery("apple", 4.00);
    food3 = new Grocery("wine", 30.00);
  }

  @Test
  public void hasName(){
    assertEquals("Steph Basket", basket.getName());
  }

  @Test
  public void basketEmpty(){
    assertEquals(0, basket.foodCount());
  }

  @Test
  public void addFood(){
    basket.addFood(food);
    assertEquals(1, basket.foodCount());
  }

  @Test
  public void removeFood(){
    basket.removeFood(food);
    assertEquals(0, basket.foodCount());
  }

  @Test
  public void emptyBasketAfterCheckout(){
    basket.addFood(food);
    basket.checkout();
    assertEquals(basket.foodCount(), 0);
  }

  @Test
  public void testGetTotalCost(){
    basket.addFood(food2);
    basket.addFood(food);
    assertEquals(7.00, basket.getTotalCost(), 0.01);
  }


  @Test
  public void testGetTwentyPercentOff(){
    basket.addFood(food3);
    assertEquals(27.00, basket.getTwentyPercentOff(), 0.01);
  }

  @Test
  public void testGetTwoPercentLoyaltyCard(){
    basket.addFood(food3);
    assertEquals(29.40, basket.getTwoPercentLoyaltyCard(), 0.01);
  }
}