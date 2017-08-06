import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before 
  public void before() {
    guitar = new Guitar("Gibson", "Maple", "Black", InstrumentType.STRING, 350, 650, 6);
  }

  @Test
  public void hasStrings() {
    assertEquals(6, guitar.getStrings());
  }

  @Test
  public void canPlay() {
    assertEquals("Strum strum!", guitar.play());
  }

  @Test
  public void canGetMake() {
    assertEquals("Gibson", guitar.getMake());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Maple", guitar.getMaterial());
  }

  @Test
  public void canGetColour() {
    assertEquals("Black", guitar.getColour());
  }

  @Test
  public void canGetType() {
    assertEquals(InstrumentType.STRING, guitar.getType());
  }

  @Test
  public void canGetBuyPrice() {
    assertEquals(350.00, guitar.getBuyPrice(), 0.01);
  }

  @Test
  public void canGetSellPrice() {
    assertEquals(650.00, guitar.getSellPrice(), 0.01);
  }

  @Test 
  public void canCalculateMarkup() {
    assertEquals(300.00, guitar.calculateMarkup(), 0.01);
  }

  @Test
  public void canSetSellPrice() {
    guitar.setSellPrice(700);
    assertEquals(700.00, guitar.getSellPrice(), 0.01);
  }



}