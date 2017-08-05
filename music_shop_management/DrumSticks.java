package music_shop_management;
import behaviours.*;

public class DrumSticks implements Sellable {

  String make;
  String material;
  double buyPrice;
  double sellPrice;

  public DrumSticks(String make, String material, double buyPrice, double sellPrice) {
    this.make = make;
    this.material = material;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public double calculateMarkup() {
    return this.sellPrice - this.buyPrice;
  }

  public String getMake() {
    return this.make;
  }

  public String getMaterial() {
    return this.material;
  }

  public double getBuyPrice() {
    return this.buyPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }


}