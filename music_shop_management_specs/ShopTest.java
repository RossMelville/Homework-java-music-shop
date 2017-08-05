import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import music_shop_management.*;
public class ShopTest {

  Shop shop;
  Guitar guitar;
  Piano piano;
  Trumpet trumpet;
  GuitarStrings guitarStrings;
  DrumSticks drumSticks;
  SheetMusic sheetMusic;

  @Before
  public void before() {
    shop = new Shop();
    guitar = new Guitar("Gibson", "Maple", "Black", "String", 350, 650, 6);
    piano = new Piano("Steinway and Sons", "Mahogany", "Black", "Keyboard", 900, 1500, 88);
    trumpet = new Trumpet("Allora", "Brass", "Gold", "Brass", 230, 440, 3);
    guitarStrings = new GuitarStrings("Ernie Ball", 6, "Electric", 4, 7);
    drumSticks = new DrumSticks("Johnny Brooks", "Mapel", 3, 7.50);
    sheetMusic = new SheetMusic("Supergrass", "Alright", "Vocal & Guitar", "Rock", 1.50, 3);
  }

  @Test
  public void stockStartsAtZero() {
    assertEquals(0, shop.stockCount());
  }


}