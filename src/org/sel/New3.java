package org.sel;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class New3 {

public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(1000);
		l.add(2000);
		l.add(3000);
		l.add(4000);
		l.add(5000);
		l.add(6000);

		ListIterator<Integer> listIterator = l.listIterator();
		
		System.out.println("Traverse in Forward Direction");
		
		while (listIterator.hasNext()) {
			Integer next = listIterator.next();
			System.out.println(next);
			
			if (next == 4000) {
				listIterator.remove();
			}
		}System.out.println(l);
		
		System.out.println("Traverse in Backward Direction");
		
		while (listIterator.hasPrevious()) {
			Integer previous = listIterator.previous();
			System.out.println(previous);
			
			if (previous == 5000) {
				listIterator.remove();
			}
		}System.out.println(l);	
			}
		}
	

