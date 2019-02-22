package sTest;

import java.util.ArrayList;

public class shop1Test {
	public static int price =0;
	public static int count=0;
	
	public static ArrayList<Integer>book=new ArrayList<Integer>();
	
	public void addbook(int p) {
		book.add(p);
		count=book.size();
		price = price+p;
		
		
	}
}
