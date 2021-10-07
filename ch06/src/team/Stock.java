package team;

public class Stock {
	static final String itemNo="111";
	static int seq=0;
	private String item;
	    private String name;
	    private int qty;
	    {
	    	seq++;
	    	item = itemNo + "-" +seq;
	    }
	    /*자동으로 숫자 올라가게하기
	     * {
	     * 	seq++;
	     *  DecimalFornat df = new DecimalFormat("000");
	     *  df.format(seq);
	     *  item = itemNo + "-" + df.format(seq);
	     * }
	     * */
	 
	    public Stock( String name, int qty) {
	        
	        this.name = name;
	        this.qty = qty;
	    }
	 
	    public String getitem() { return item; }
	    public void setitem(String item) { this.item = item; }
	    public String getname() { return name; }
	    public void setname(String name) { this.name = name; }
	    public int getqty() { return qty; }
	    public void setqty(int qty) { this.qty = qty; }
}
