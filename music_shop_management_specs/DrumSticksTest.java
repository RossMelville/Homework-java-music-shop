import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class DrumSticksTest {

  DrumSticks drumSticks;

  @Before
  public void before() {
    drumSticks = new DrumSticks("Johnny Brooks", "Mapel", 3, 7.50);
  }

  @Test
  public void canGetMake() {
    assertEquals("Johnny Brooks", drumSticks.getMake());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("Mapel", drumSticks.getMaterial());
  }

  @Test 
  public void canGetBuyPrice() {
    assertEquals(3.00, drumSticks.getBuyPrice(), 0.01);
  }

  @Test
  public void canGetSellPrice() {
    assertEquals(7.50, drumSticks.getSellPrice(), 0.01);
  }

  @Test
  public void canGetMarkup() {
    assertEquals(4.50, drumSticks.calculateMarkup(), 0.01);
  }

  @Test
  public void canSetSellPrice() {
    drumSticks.setSellPrice(7.0);
    assertEquals(7.00, drumSticks.getSellPrice(), 0.01);
  }


}