package music_shop_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable {

  int strings;

  public Guitar(String make, String material, String colour, String type, int buyPrice, int sellPrice, int strings) {
    super(make, material, colour, type, buyPrice, sellPrice);
    this.strings = strings;
  }

  public int getStrings() {
    return this.strings;
  }

  public String play(){
    return "Strum strum!";
  }



}