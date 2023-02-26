package com.deneme;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		ArrayList<String> calisanlar=new ArrayList<String>();
        calisanlar.add("Ali");
        calisanlar.add("Memmet  ");
        calisanlar.add("Hande");
        calisanlar.add("H�seyin");
       
        ListIterator<String> iterator=calisanlar.listIterator();
        System.out.println("Ba�tan sona do�ru yazd�ral�m...");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
       System.out.println("\nSondan ba�a do�ru yazd�ral�m...");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
	}

}
