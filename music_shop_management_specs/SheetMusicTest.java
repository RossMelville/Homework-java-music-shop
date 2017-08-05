import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class SheetMusicTest {

  SheetMusic sheetMusic;

  @Before
  public void before() {
    sheetMusic = new SheetMusic("Supergrass", "Alright", "Vocal & Guitar", "Rock", 150, 300);
  }

  @Test
  public void canGetArtist() {
    assertEquals("Supergrass", sheetMusic.getArtist());
  }





}