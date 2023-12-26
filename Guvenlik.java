package Kalitim;

public class Guvenlik extends Memur{

	String belge;

	public Guvenlik(String adSoyad, String eposta, String tel, String departman, int mesai, String belge) {
		super(adSoyad, eposta, tel, departman, mesai);
		this.belge = belge;
	}
	
	
}
