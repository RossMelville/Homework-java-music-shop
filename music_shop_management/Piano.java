package music_shop_management;
import behaviours.*;

public class Piano extends Instrument implements Playable {

  int keys;

  public Piano(String material, String colour, String type, int keys) {
    super(material, colour, type);
    this.keys = keys;
  }

  public int getKeys() {
    return this.keys;
  }

  public String play() {
    return "Plink plonk!";
  }


}