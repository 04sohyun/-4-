package workout;

public class Snack {
 private String item;
 private String name;
 private int qty;

 public Snack(String item, String name, int qty) {
	 this.item=item;
	 this.name=name;
	 this.qty=qty;
 }



public String getItem() {return item;}
public void setItem(String item) {this.item = item;}
public String getName() {return name;}
public void setName(String name) {this.name = name;}
public int getQty() {return qty;}
public void setQty(int qty) {this.qty = qty;}

 }
