package music_shop_management;
import behaviours.*;
import java.util.*;

public class Shop {

  private ArrayList<Sellable> stock;

  public Shop() {
    this.stock = new ArrayList<Sellable>();
  }

  public int stockCount() {
    return this.stock.size();
  }



}