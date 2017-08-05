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

  @Test
  public void canAddGuitar() {
    shop.addStock( guitar );
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canAddPiano() {
    shop.addStock( piano );
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canAddTrumpet() {
    shop.addStock( trumpet );
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canAddGuitarStrings() {
    shop.addStock( guitarStrings );
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canAddDrumSticks() {
    shop.addStock( drumSticks );
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canAddSheetMusic() {
    shop.addStock( sheetMusic );
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canRemoveGuitar() {
    shop.addStock( guitar );
    shop.removeStock( guitar );
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canRemovePiano() {
    shop.addStock( piano );
    shop.removeStock( piano );
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canRemoveTrumpet() {
    shop.addStock( trumpet );
    shop.removeStock( trumpet );
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canRemoveGuitarStrings() {
    shop.addStock( guitarStrings );
    shop.removeStock( guitarStrings );
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canRemoveDrumSticks() {
    shop.addStock( drumSticks );
    shop.removeStock( drumSticks );
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canRemoveSheetMusic() {
    shop.addStock( sheetMusic );
    shop.removeStock( sheetMusic );
    assertEquals(0, shop.stockCount());
  }

}