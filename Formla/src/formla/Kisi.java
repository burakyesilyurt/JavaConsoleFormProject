package formla;

import java.util.Scanner;

public class Kisi {
    String isim;
    String soyad;
    int yas;
    char cinsiyet;
/**
 * Kullanıcının kişisel bilgilerini alır
 */
    public void kayit(){
        try {
            DosyaSistem dosya = new DosyaSistem("kisi.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("İsminizi giriniz");
            this.isim = input.nextLine();
            System.out.println("Soyadinizi giriniz");
            this.soyad = input.nextLine();
            System.out.println("Yasinizi giriniz");
            
            this.yas = input.nextInt();
            
            System.out.println("Cinsiyetinizi giriniz E/K");
            this.cinsiyet = input.next().charAt(0);
            
            if (!(cinsiyet == 'E' || cinsiyet == 'e' || cinsiyet == 'k' || cinsiyet == 'K')) {
                System.out.println("Lutfen dogru cinsiyeti giriniz");
                System.out.println("Cinsiyetinizi giriniz E/K");
                this.cinsiyet = input.next().charAt(0);
            }
            
            dosya.dosyaYaz("İsim :" + isim);
            dosya.dosyaYaz("Soyisim :" + soyad);
            dosya.dosyaYaz("Yaş : " + Integer.toString(yas));
            dosya.dosyaYaz("Cinsiyet :" + Character.toString(cinsiyet));
            dosya.dosyaYaz("");
        } catch (Exception e) {
            System.out.println("Hata \n"+e);
        }
        
    }
}

