import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Steinway and Sons", "Mahogany", "Black", InstrumentType.KEYBOARD, 900, 1500, 88);
  }

  @Test
  public void hasKeys() {
    assertEquals(88, piano.getKeys());
  }

  @Test 
  public void canPlay() {
    assertEquals("Plink plonk!", piano.play());
  }

  @Test
  public void canGetMake() {
    assertEquals("Steinway and Sons", piano.getMake());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Mahogany", piano.getMaterial());
  }

  @Test
  public void canGetColour() {
    assertEquals("Black", piano.getColour());
  }

  @Test
  public void canGetType() {
    assertEquals(InstrumentType.KEYBOARD, piano.getType());
  }

  @Test
  public void canGetBuyPrice() {
    assertEquals(900.00, piano.getBuyPrice(), 0.01);
  }

  @Test
  public void canGetSellPrice() {
    assertEquals(1500.00, piano.getSellPrice(), 0.01);
  }

  @Test 
  public void canCalculateMarkup() {
    assertEquals(600.00, piano.calculateMarkup(), 0.01);
  }

  @Test
  public void canSetSellPrice() {
    piano.setSellPrice(1400);
    assertEquals(1400.00, piano.getSellPrice(), 0.01);
  }



}