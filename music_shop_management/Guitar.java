package music_shop_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable {

  int strings;

  public Guitar(String material, String colour, String type, int strings) {
    super(material, colour, type);
    this.strings = strings;
  }

  public int getStrings() {
    return this.strings;
  }

  public String play(){
    return "Strum strum!";
  }



}