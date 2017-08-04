package music_shop_management;

public abstract class Instrument {

  String material;
  String colour;
  String type;

  public Instrument(String material, String colour, String type) {
    this.material = material;
    this.colour = colour;
    this.type = type;
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


}