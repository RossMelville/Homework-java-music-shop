import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before 
  public void before() {
    guitar = new Guitar("Maple", "Black", "String", 6);
  }

  @Test
  public void hasStrings() {
    assertEquals(6, guitar.getStrings());
  }

  @Test
  public void canPlay() {
    assertEquals("Strum strum!", guitar.play());
  }


}