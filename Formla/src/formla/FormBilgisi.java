
package formla;


public class FormBilgisi {
     int kullaniciSayisi;
     int postSayisi;
     int yorumSayisi;
    
    
    public void kullaniciSayisiGor(){
    DosyaSistem dosya = new DosyaSistem("kullanicilar.txt");

     kullaniciSayisi = dosya.dosyaVeSatirOku(false);
    
    }
    public void postSayisiGor(){
    DosyaSistem dosya = new DosyaSistem("postlar.txt");

      postSayisi = dosya.dosyaVeSatirOku(false);
    
    }
    
    public void yorumSayisiGor(){
    DosyaSistem dosya = new DosyaSistem("yorumlar.txt");

    yorumSayisi = dosya.dosyaVeSatirOku(false);
    yorumSayisi = yorumSayisi / 2;
        
    
    
    }
    
    
}
