import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class TrumpetTest {

  Trumpet trumpet;

  @Before
  public void before() {
    trumpet = new Trumpet("Allora", "Brass", "Gold", InstrumentType.BRASS, 230, 440, 3);
  }

  @Test 
  public void hasValves() {
    assertEquals(3, trumpet.getValves());
  }

  @Test
  public void canPlay() {
    assertEquals("Toot toot!", trumpet.play());
  }

  @Test
  public void canGetMake() {
    assertEquals("Allora", trumpet.getMake());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Brass", trumpet.getMaterial());
  }

  @Test
  public void canGetColour() {
    assertEquals("Gold", trumpet.getColour());
  }

  @Test
  public void canGetType() {
    assertEquals(InstrumentType.BRASS, trumpet.getType());
  }

  @Test
  public void canGetBuyPrice() {
    assertEquals(230.00, trumpet.getBuyPrice(), 0.01);
  }

  @Test
  public void canGetSellPrice() {
    assertEquals(440.00, trumpet.getSellPrice(), 0.01);
  }

  @Test 
  public void canCalculateMarkup() {
    assertEquals(210.00, trumpet.calculateMarkup(), 0.01);
  }

  @Test
  public void canSetSellPrice() {
    trumpet.setSellPrice(390);
    assertEquals(390.00, trumpet.getSellPrice(), 0.01);
  }


}