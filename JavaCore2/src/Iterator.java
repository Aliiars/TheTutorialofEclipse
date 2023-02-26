package com.deneme;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		ArrayList<String> calisanlar=new ArrayList<String>();
        calisanlar.add("Ali");
        calisanlar.add("Memmet  ");
        calisanlar.add("Hande");
        calisanlar.add("Hüseyin");
       
        ListIterator<String> iterator=calisanlar.listIterator();
        System.out.println("Baþtan sona doðru yazdýralým...");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
       System.out.println("\nSondan baþa doðru yazdýralým...");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
	}

}
