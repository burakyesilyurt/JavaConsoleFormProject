package formla;
import java.util.Scanner;

public class Kullanici extends Kisi{
    String kullaniciAdi;
    String sifre;
    
    
    /**
     * Kullanıcının kullanıcıadı ve şifresini kaydeder
     */
    public void kullaniciKayit(){
       
        Scanner input=new Scanner(System.in);
        String sifre2;
        System.out.println("Kullanıcı Adını Giriniz");
        this.kullaniciAdi = input.nextLine();
        System.out.println("Şifrenizi girin");
        this.sifre = input.nextLine();
        System.out.println("Şifrenizi Doğrulayınız");
        sifre2=input.nextLine();
        
        
        if (this.sifre.equals(sifre2)) {
           String satirSayisi;
           DosyaSistem kayit = new DosyaSistem("kullanicilar.txt");
           satirSayisi = Integer.toString(kayit.dosyaVeSatirOku(false));
           kayit.dosyaYaz(satirSayisi);
           kayit.dosyaYaz(this.kullaniciAdi);
           kayit.dosyaYaz(this.sifre);
           System.out.println("Kayıt Başarılı");
            
            
           
        }
        else{
            System.out.println("Kayıt Başarısız Şifreler Eşleşmiyor");
            kullaniciKayit();
        }
    }
    
    
   public boolean kullanıcıGiris(){
       
        String k1,s1;
        boolean check;
       Scanner input=new Scanner(System.in);
      
       System.out.println("Kayıt Olduğunuz Kullanıcı Adınızı Giriniz");
       k1=input.nextLine();
       System.out.println("Şifrenizi Giriniz");
       s1=input.nextLine();
       check = Main.girisKontrol("kullanicilar.txt", k1, s1);
       this.kullaniciAdi = k1;
       return check;
       
       
       
   }
}
