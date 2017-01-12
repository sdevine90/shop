import shop.*;
import static org.junit.Assert.*;
import org.junit.*;

public class GroceryTest {
  Grocery grocery;

  @Before
  public void before(){
    grocery = new Grocery("Orange", 3.00);
  }

  @Test
  public void testGetName(){
    assertEquals("Orange", grocery.getName());
  }

  @Test
  public void testGetPrice(){
    assertEquals(3.00, grocery.getPrice(), 0.1);
  }

}