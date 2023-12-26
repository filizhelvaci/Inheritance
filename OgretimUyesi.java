package Kalitim;

public class OgretimUyesi extends Akademisyen {
    String unvan;

    public OgretimUyesi(String adSoyad, String eposta, String tel, String bolum, String gorevler, String ders,String unvan) {
       super(adSoyad, eposta, tel, bolum, gorevler, ders);
	   this.unvan = unvan;
       }

    public String getUnvan() {
	   return unvan;
       }

    public void setUnvan(String unvan) {
	   this.unvan = unvan;
       }
 }
