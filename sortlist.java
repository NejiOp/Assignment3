package sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<product> ls=new ArrayList<>();
		ls.add(new product("dove", 100));
		ls.add(new product("lux", 346));
		ls.add(new product("alovera", 489));
		ls.add(new product("vatika", 123));
		ls.add(new product("headersolder", 255));
		ls.add(new product("lux", 111));
		Collections.sort(ls);
		for(product s:ls)
		{
			System.out.println("Product name is "+s.getPname()+" Price of product is "+s.getPprice());
		}

	}

}
class product implements Comparable<product>
{
	String pname;
	int pprice;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public product(String pname, int pprice) {
		this.pname = pname;
		this.pprice = pprice;
	}
	@Override
	public int compareTo(product o) {
		// TODO Auto-generated method stub
		if(this.pprice>o.pprice)
			return 1;
		else if(this.pprice<o.pprice)
			return -1;
		return 0;
	}
	
}
