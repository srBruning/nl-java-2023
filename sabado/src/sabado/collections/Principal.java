package sabado.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Principal {
	public static void main(String args[]) {
		
		Long var1 = 0l;
		
		
		HashSet<Long> arrayList = new HashSet<Long>();
		
		arrayList.add(100l);
		arrayList.add(2l);
		arrayList.add(1l);
		arrayList.add(4l);
		arrayList.add(0, 200l);// adiciona no inicio, index 0
		
		arrayList.remove(100l);
		
		System.out.println(arrayList.get(0));

		Iterator<Long> iter1 = arrayList.iterator();
		
		while (iter1.hasNext()) {
			System.out.println(iter1.next());

		}
		
		for(Long l : arrayList) {
			System.out.println(l);
		}
		
		for(int i = 0 ; i< arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
