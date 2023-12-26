package Kalitim;

public class bilgiIslem extends Memur{
	
	String gorev;

	public bilgiIslem(String adSoyad, String eposta, String tel, String departman, int mesai, String gorev) {
		super(adSoyad, eposta, tel, departman, mesai);
		this.gorev = gorev;
	}

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

   
	

}
