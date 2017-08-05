package music_shop_management;
import behaviours.*;

public class SheetMusic implements Sellable {

  String artist;
  String song;
  String arrangement;
  String genre;
  int buyPrice;
  int sellPrice;

  public SheetMusic(String artist, String song, String arrangement, String genre, int buyPrice, int sellPrice) {
    this.artist = artist;
    this.song = song;
    this.arrangement = arrangement;
    this.genre = genre;
    this.buyPrice = sellPrice;
    this.sellPrice = sellPrice;
  }

  public double calculateMarkup() {
    return (this.sellPrice - this.buyPrice) / 100;
  }

  public String getArtist() {
    return this.artist;
  }






}