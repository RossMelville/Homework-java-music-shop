package music_shop_management;
import behaviours.*;

public class Trumpet implements Playable {

  int valves;

  public Trumpet(String material, String colour, String type, int valves) {
    this.valves = valves;
  }

  public int getValves() {
    return this.valves;
  }

  public String play() {
    return "Toot toot!";
  }




}