package music_shop_management;
import behaviours.*;

public class GuitarStrings implements Sellable {

  String make;
  int numberOfStrings;
  String type;
  int buyPrice;
  int sellPrice;

  public GuitarStrings(String make, int numberOfStrings, String type, int buyPrice, int sellPrice) {
    this.make = make;
    this.numberOfStrings = numberOfStrings;
    this.type = type;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public double calculateMarkup() {
    return (this.sellPrice - this.buyPrice) / 100;
  }



}