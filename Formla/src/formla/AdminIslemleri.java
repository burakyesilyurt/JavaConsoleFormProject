
package formla;

import java.util.Scanner;


public class AdminIslemleri extends Admin {
    Scanner input=new Scanner(System.in);
    
    boolean girisKontrol;
    String silinecekDosyaAdi;
    
    public AdminIslemleri(){
        girisKontrol = adminGiris();
    
    }
    
 public void islemler(){   
        if(girisKontrol){
           int secenek;
           System.out.println("Dosya Silmek için 1");
           System.out.println("Kullanıcıların Bilgilerini Görmek için 2");
           System.out.println("Çıkmak için 3");
           secenek = input.nextInt();
           
           switch(secenek){
               case 1:
                   String dosyaAdi;
                   
                   dosyaAdi = dosyaSil();
                   DosyaSistem dosya = new DosyaSistem(dosyaAdi);
                   dosya.dosyaSil();
           switch (silinecekDosyaAdi) {
               case "kullanicilar.txt":
                   DosyaSistem dosya1 = new DosyaSistem("kisi.txt");
                   dosya1.dosyaSil();
                   break;
               case "kisi.txt":
                   DosyaSistem dosya2 = new DosyaSistem("kullanicilar.txt");
                   dosya2.dosyaSil();
                   break;
           }
                   break;
               case 2:
                   kullaniciBilgileri();
                   break;
               case 3:
                   System.out.println("Program Kapatıldı");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Lutfen gecerli bir sayi giriniz");
                   islemler();
           }

        }
        
   }
 
 private String dosyaSil(){
     
     int silmeSecimi;
     
     System.out.println("Hangi Dosyayı Silmek İstiyorsunuz");
     System.out.println("Kişiler Dosyasını silmek için 1");
     System.out.println("Kullanıcılar Dosyasını silmek için 2");
     System.out.println("Postlar Dosyasını silmek için 3");
     System.out.println("Yorumlar Dosyasını silmek için 4");
     silmeSecimi = input.nextInt();
     switch(silmeSecimi){
         case 1:
             silinecekDosyaAdi = "kisi.txt";
             return silinecekDosyaAdi;
             
         case 2:
             silinecekDosyaAdi = "kullanicilar.txt";
             return silinecekDosyaAdi;
            
         case 3:
             silinecekDosyaAdi = "postlar.txt";
             return silinecekDosyaAdi;
             
         case 4:
             silinecekDosyaAdi = "yorumlar.txt";
             return silinecekDosyaAdi;
             
         default:
             System.out.println("Lutfen gecerli bir sayi giriniz");
     
     }
        return null;
     
     
    
     
 }
 
 private void kullaniciBilgileri(){
     DosyaSistem dosya = new DosyaSistem("kisi.txt");
     
     dosya.dosyaVeSatirOku(true);
 
 
 }
 
}
