package Ø1819;

import java.util.ArrayList;
import java.util.Collections;

public class Dream implements Comparable<Dream> {
  private int date;
  private int duration;
  private String type;
  private ArrayList <Dream> dreamList = new ArrayList<>();



  public static void main(String[] args) {
    Dream main = new Dream(0,0,"");

    main.go();
  }

  Dream(int date, int duration, String type){
    this.date = date;
    this.duration = duration;
    this.type = type;

  }

  public void go(){
    creatDream();
    printDream();
    System.out.println(isPleasant());

  }

  public void creatDream(){

    dreamList.add(new Dream(17,11,"Tør"));

    dreamList.add(new Dream(15,11,"Våd"));

    dreamList.add(new Dream(18,23,"Mareridt"));
  }

  public boolean isPleasant() {

    Dream d1 = new Dream(12,11,"Tør");

    if (d1.type.equalsIgnoreCase("Mareridt")) {
        return false;
      } else if (d1.type.equalsIgnoreCase("Våd") && d1.duration >= 10) {
        return false;
      } else if (d1.type.equalsIgnoreCase("Tør") && d1.duration <= 10) {
      return false;
    }
      else return true;

  }

  public int compareTo(Dream dr){
    if(date == dr.date){
      return 0;
    }
    else if (date > dr.date){
      return 1;
    }
    else return -1;
  }

  public void printDream(){
    Collections.sort(dreamList);
    for(Dream dr : dreamList){
      System.out.println(dr.date +" " + dr.duration+" "+ dr.type);
    }
  }
}
