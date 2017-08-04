import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Steinway and Sons", "Mahogany", "Black", "Keyboard", 90000, 150000, 88);
  }

  @Test
  public void hasKeys() {
    assertEquals(88, piano.getKeys());
  }

  @Test 
  public void canPlay() {
    assertEquals("Plink plonk!", piano.play());
  }

}