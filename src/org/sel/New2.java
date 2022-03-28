package org.sel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class New2 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(1000);
		l.add(2000);
		l.add(3000);
		l.add(4000);
		l.add(5000);
		l.add(6000);
		
		Iterator<Integer> iterator = l.iterator();
		
		while (iterator.hasNext()) {
			Integer next = (Integer) iterator.next();
			System.out.println(next);
			if (next == 3000) {
				iterator.remove();
			}
		}System.out.println(l);
	}
	}
	

	

