package music_shop_management;
import behaviours.*;

public class SheetMusic implements Sellable {

  String artist;
  String song;
  String arrangement;
  String genre;
  double buyPrice;
  double sellPrice;

  public SheetMusic(String artist, String song, String arrangement, String genre, double buyPrice, double sellPrice) {
    this.artist = artist;
    this.song = song;
    this.arrangement = arrangement;
    this.genre = genre;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public double calculateMarkup() {
    return (this.sellPrice - this.buyPrice);
  }

  public String getArtist() {
    return this.artist;
  }

  public String getSong() {
    return this.song;
  }

  public String getArrangement() {
    return this.arrangement;
  }

  public String getGenre() {
    return this.genre;
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