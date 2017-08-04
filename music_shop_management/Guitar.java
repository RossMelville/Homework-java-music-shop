package music_shop_management;
import behaviours.*;

public class Guitar implements Playable {

  int strings;

  public Guitar(int strings){
    this.strings = strings;
  }

  public int getStrings() {
    return this.strings;
  }

  public String play(){
    return "Strum strum!";
  }



}