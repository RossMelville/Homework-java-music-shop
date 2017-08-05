import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class GuitarStringsTest {

  GuitarStrings guitarStrings;

  @Before
  public void before() {
    guitarStrings = new GuitarStrings("Ernie Ball", 6, "Electric", 4, 7);
  }

  @Test 
  public void canGetMake() {
    assertEquals("Ernie Ball", guitarStrings.getMake());
  }

  @Test
  public void canGetNumberOfStrings() {
    assertEquals(6, guitarStrings.getNumberOfStrings());
  }

  @Test
  public void canGetType() {
    assertEquals("Electric", guitarStrings.getType());
  }

  @Test
  public void canGetBuyPrice() {
    assertEquals(4.00, guitarStrings.getBuyPrice(), 0.01);
  }

  @Test
  public void canGetSellPrice() {
    assertEquals(7.00, guitarStrings.getSellPrice(), 0.01);
  }

  @Test 
  public void canGetMarkup() {
    assertEquals(3.00, guitarStrings.calculateMarkup(), 0.01);
  }



}