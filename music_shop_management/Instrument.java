package music_shop_management;

public abstract class Instrument {

  String make;
  String material;
  String colour;
  InstrumentType type;
  double buyPrice;
  double sellPrice;

  public Instrument(String make, String material, String colour, InstrumentType type, double buyPrice, double sellPrice) {
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

  public InstrumentType getType() {
    return this.type;
  }

  public double getBuyPrice() {
    return this.buyPrice;
  }

  public double getSellPrice() {
    return this.sellPrice;
  }

  public double calculateMarkup() {
    return this.sellPrice - this.buyPrice;
  }

  public void setSellPrice(double newSellPrice) {
    this.sellPrice = newSellPrice;
  }

}