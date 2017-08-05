package music_shop_management;
import behaviours.*;

public class DrumSticks implements Sellable {

  String make;
  String material;
  int buyPrice;
  int sellPrice;

  public DrumSticks(String make, String material, int buyPrice, int sellPrice) {
    this.make = make;
    this.material = material;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public double calculateMarkup() {
    return (this.sellPrice - this.buyPrice) / 100;
  }



}