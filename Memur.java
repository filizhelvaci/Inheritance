package Kalitim;

public class Memur extends Calisan{
     String departman;
     int mesai;
	
     
     public Memur(String adSoyad, String eposta, String tel, String departman, int mesai) {
		super(adSoyad, eposta, tel);
		this.departman = departman;
		this.mesai = mesai;
	}


	public String getDepartman() {
		return departman;
	}


	public void setDepartman(String departman) {
		this.departman = departman;
	}


	public int getMesai() {
		return mesai;
	}


	public void setMesai(int mesai) {
		this.mesai = mesai;
	}
     
     
}
