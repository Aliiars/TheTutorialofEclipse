
public class Calisan extends Object {

	public String isim;
	public String soyisim;
	public int maas;
	private int calisan_no;
	private float calisan_seviye;
	
	Calisan(){
		System.out.println("default constructor");
	}

	public Calisan(String isim, String soyisim) {

		this.isim = isim;
		this.soyisim = soyisim;
	}
	
	public String isimSoyisimGetir() {
		System.out.println("method isimSoyisimGetir");
		return this.isim + " " + this.soyisim;
	}
	
	public void maasDegis(int maas) {
		this.maas = maas;
		
	}
	
	
}
