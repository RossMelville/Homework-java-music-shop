import static org.junit.Assert.*;
import org.junit.*;
import music_shop_management.*;

public class TrumpetTest {

  Trumpet trumpet;

  @Before
  public void before() {
    trumpet = new Trumpet("Brass", "Gold", "Brass", 3);
  }

  @Test 
  public void hasValves() {
    assertEquals(3, trumpet.getValves());
  }

  @Test
  public void canPlay() {
    assertEquals("Toot toot!", trumpet.play());
  }



}