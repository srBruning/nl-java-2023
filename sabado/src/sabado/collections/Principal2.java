package sabado.collections;

import java.util.ArrayList;
import java.util.Iterator;

import sabado.e1.Guitara;

public class Principal2 {
	public static void main(String args[]) {
				
		ArrayList<Guitara> arrayList = new ArrayList<Guitara>();

		System.out.println(arrayList.get(0));

		Iterator<Guitara> iter1 = arrayList.iterator();
		
		while (iter1.hasNext()) {
			System.out.println(iter1.next());

		}
		
		for(Guitara l : arrayList) {
			System.out.println(l);
		}
		
		for(int i = 0 ; i< arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
