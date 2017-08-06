package music_shop_management;
import behaviours.*;

public class Trumpet extends Instrument implements Playable, Sellable {

  int valves;

  public Trumpet(String make, String material, String colour, InstrumentType type, double buyPrice, double sellPrice, int valves) {
    super(make, material, colour, type, buyPrice, sellPrice);
    this.valves = valves;
  }

  public int getValves() {
    return this.valves;
  }

  public String play() {
    return "Toot toot!";
  }




}