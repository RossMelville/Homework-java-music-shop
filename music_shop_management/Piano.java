package music_shop_management;
import behaviours.*;

public class Piano extends Instrument implements Playable, Sellable {

  int keys;

  public Piano(String make, String material, String colour, InstrumentType type, double buyPrice, double sellPrice, int keys) {
    super(make, material, colour, type, buyPrice, sellPrice);
    this.keys = keys;
  }

  public int getKeys() {
    return this.keys;
  }

  public String play() {
    return "Plink plonk!";
  }


}