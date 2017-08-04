package music_shop_management;

public abstract class Instrument {

  String make;
  String material;
  String colour;
  String type;
  int buyPrice;
  int sellPrice;

  public Instrument(String make, String material, String colour, String type, int buyPrice, int sellPrice) {
    this.make = make;
    this.material = material;
    this.colour = colour;
    this.type = type;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public String getMake() {
    return this.make;
  }

  public String getMaterial() {
    return this.material;
  }

  public String getColour() {
    return this.colour;
  }

  public String getType() {
    return this.type;
  }

  public double getBuyPrice() {
    return this.buyPrice/100;
  }

  public double getSellPrice() {
    return this.sellPrice/100;
  }

  public double calculateMarkup() {
    return (this.sellPrice - this.buyPrice) / 100;
  }

}