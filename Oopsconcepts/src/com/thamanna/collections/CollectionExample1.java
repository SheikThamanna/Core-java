package com.thamanna.collections;
import java.util.ArrayList;
public class CollectionExample1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(29);
		al.add("Flower");
		al.add(10.98);
		al.add(true);
		al.add('a');
		al.remove(2);
		System.out.println(al);
		al.add(3,78);
		System.out.println(al);
		ArrayList b=new ArrayList();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		System.out.println(b);
		al.removeAll(b);
		System.out.println(al);
	}  

}
