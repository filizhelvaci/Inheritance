package Kalitim;

public class Akademisyen extends Calisan{
	String bolum,gorevler;
	String ders;
	
	
    public Akademisyen(String adSoyad, String eposta, String tel, String bolum, String gorevler, String ders) {
		super(adSoyad, eposta, tel);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.ders = ders;
	}

   public String getBolum() {
		return bolum;
	}
   
   public void setBolum(String bolum) {
		this.bolum = bolum;
	}

   public String getGorevler() {
		return gorevler;
	}

	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

   public void derseGir()
   {
	   System.out.println("Derse girildi");
   }

}
