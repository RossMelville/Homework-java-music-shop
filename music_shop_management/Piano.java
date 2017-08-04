package music_shop_management;
import behaviours.*;

public class Piano implements Playable {

  int keys;

  public Piano(int keys) {
    this.keys = keys;
  }

  public int getKeys() {
    return this.keys;
  }

  public String play() {
    return "Plink plonk!";
  }


}