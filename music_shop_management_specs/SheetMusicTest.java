import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class SheetMusicTest {

  SheetMusic sheetMusic;

  @Before
  public void before() {
    sheetMusic = new SheetMusic("Supergrass", "Alright", "Vocal & Guitar", "Rock", 1.50, 3);
  }

  @Test
  public void canGetArtist() {
    assertEquals("Supergrass", sheetMusic.getArtist());
  }

  @Test
  public void canGetSong() {
    assertEquals("Alright", sheetMusic.getSong());
  }

  @Test
  public void canGetArrangement() {
    assertEquals("Vocal & Guitar", sheetMusic.getArrangement());
  }

  @Test
  public void canGetGenre() {
    assertEquals("Rock", sheetMusic.getGenre());
  }

  @Test
  public void canGetBuyPrice() {
    assertEquals(1.50, sheetMusic.getBuyPrice(), 0.01);
  }

  @Test
  public void canGetSellPrice() {
    assertEquals(3.00, sheetMusic.getSellPrice(), 0.01);
  }

  @Test
  public void canGetMarkup() {
    assertEquals(1.50, sheetMusic.calculateMarkup(), 0.01);
  }

  @Test
  public void canSetSellPrice() {
    sheetMusic.setSellPrice(2.50);
    assertEquals(2.50, sheetMusic.getSellPrice(), 0.01);
  }




}