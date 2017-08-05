package music_shop_management;
import behaviours.*;

public class GuitarStrings implements Sellable {

  String make;
  int numberOfStrings;
  String type;
  double buyPrice;
  double sellPrice;

  public GuitarStrings(String make, int numberOfStrings, String type, double buyPrice, double sellPrice) {
    this.make = make;
    this.numberOfStrings = numberOfStrings;
    this.type = type;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public double calculateMarkup() {
    return this.sellPrice - this.buyPrice;
  }

  public String getMake() {
    return this.make;
  }

  public int getNumberOfStrings() {
    return this.numberOfStrings;
  }

  public String getType() {
    return this.type;
  }

  public double getBuyPrice() {
    return this.buyPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }

  public void setSellPrice(double newSellPrice) {
    this.sellPrice = newSellPrice;
  }



}