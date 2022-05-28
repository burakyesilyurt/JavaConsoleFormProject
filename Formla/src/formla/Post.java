package formla;

import java.util.Scanner;

public class Post {
    
String baslik;

String metin;

/**
 * Kullanıcının girmek istediği postu oluşturur
 * @param kullaniciAdi 
 */


public void postAdd(String kullaniciAdi){
    try {
        String satirSayisi;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Posttun basligini girin");
        this.baslik = input.nextLine();
        
        System.out.println("Posttun metnini girin");
        this.metin = input.nextLine();
        DosyaSistem dosya = new DosyaSistem("postlar.txt");
        satirSayisi = Integer.toString(dosya.dosyaVeSatirOku(false));
        dosya.dosyaYaz(satirSayisi + " ID'li Postun Yazarı = " + kullaniciAdi);
        dosya.dosyaYaz(baslik);
        dosya.dosyaYaz(metin);
        
    } catch (Exception e) {
                    System.out.println("Hata \n"+e);

    }

}

public void postGor(){
    try {
        DosyaSistem dosya = new DosyaSistem("postlar.txt");
        dosya.dosyaVeSatirOku(true);
    } catch (Exception e) {
                    System.out.println("Hata \n"+e);

    }

}

    
       

}
