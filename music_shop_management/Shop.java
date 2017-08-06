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

  public void addStock( Sellable stock ) {
    this.stock.add( stock );
  }

  public void removeStock( Sellable stock ) {
    this.stock.remove( stock );
  }

  public double totalPotentialProfit() {
    double total = 0;
    for (int s = 0; s < this.stock.size(); s++) {
      total += this.stock.get(s).calculateMarkup();
    }
    return total;
  }

  public double totalSpentOnStock() {
    double total = 0;
    for (int s = 0; s < this.stock.size(); s++) {
      total += this.stock.get(s).getBuyPrice();
    }
    return total;
  }

  public double totalStockValue() {
    double total = 0;
    for (int s = 0; s < this.stock.size(); s++) {
      total += this.stock.get(s).getSellPrice();
    }
    return total;
  }



}