
package formla;
import java.util.Scanner;


public class Giris {
        Scanner input=new Scanner(System.in);
        int secim;
        boolean kontrol;
        String kullaniciAd;
        
    public void girisEkrani(){
        
        try{
          
            System.out.println("Forma hoşgeldiniz");
        System.out.println("Kayit için 1");
        System.out.println("Giriş için 2");
        System.out.println("Admin Girişi için 3");
        System.out.println("Anonim Giriş için 4");
        secim = input.nextInt();
        Kullanici kullanici = new Kullanici();
        
        
        switch(secim){
        
            case 1:
                kullanici.kayit();
                kullanici.kullaniciKayit();
            case 2:
                System.out.println("\nGiriş yapın");
                 kontrol = kullanici.kullanıcıGiris();
                 
                 kullaniciAd = kullanici.kullaniciAdi;
                 
                if(kontrol){
                secimEkrani();

                }else{
                girisEkrani();
                }
            break;
            case 3:
                boolean adminKontrol;
                AdminIslemleri admin = new AdminIslemleri();
                adminKontrol = admin.girisKontrol;
                if(adminKontrol){
                    admin.islemler();
                    admin.islemler();
                    
                }else{
                    girisEkrani();
                }
                
                break;
            case 4:
                Anonim anonim = new Anonim();
                anonim.anonimEkranı();
                girisEkrani();
                break;
            default:
                System.out.println("Lutfen Geçerli Bir Sayi Giriniz");
                girisEkrani();
        
        }
        
        }
        catch(Exception e){
            System.out.println("Hata : \n"+e);
        }
        
  
        
         
    }
    
    
   
    
    public void secimEkrani(){           
           try {
            System.out.println("Post Eklemek için 1");
            System.out.println("Post Görmek için 2");
            System.out.println("Yorum ekranına geçmek için 3");
            System.out.println("Formun Bilgilerini Görmek Için 4");
            System.out.println("Programdan çıkmak için 5");
            secim = input.nextInt();
            Post post = new Post();
            
            switch (secim) {
                case 1:
                    post.postAdd(kullaniciAd);
                    secimEkrani();
                    break;
                case 2:
                    
                    post.postGor();
                    secimEkrani();
                    break;
                case 3:
                    yorumEkrani();
                    secimEkrani();
                    break;
                case 4:
                    FormBilgisiEkrani formBilgi = new FormBilgisiEkrani();
                    formBilgi.bilgiGoster();
                    secimEkrani();
                    break;
                case 5:
                    System.out.println("Program kapatıldı");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lutfen gecerli bir sayi giriniz");
                    secimEkrani();
            }
        } catch (Exception e) {
               System.out.println("Hata \n"+e);
        }
         
    }
    
    
     public void yorumEkrani(){

            
            try {
             System.out.println("Yorum Eklemek için 1");
             System.out.println("Yorumlari Görmek için 2");
             System.out.println("Geri dönüş için 3");
             secim = input.nextInt();
             Yorum yorum = new Yorum();
             
             switch (secim) {
                 case 1:
                     int postunSayisi;
                     int ıdSayisi;
                     DosyaSistem post = new DosyaSistem("postlar.txt");
                     ıdSayisi = post.dosyaVeSatirOku(true);
                     System.out.println("Yorum Eklemek İstediğiniz Postun ID'sini Seçin");                     
                     postunSayisi = input.nextInt();
                     if (postunSayisi < ıdSayisi && postunSayisi >= 0) {
                         yorum.yorumAdd(postunSayisi, kullaniciAd);
                         yorumEkrani();
                     } else {
                         System.out.println("\nLütfen Geçerli Id Girin\n");
                         yorumEkrani();
                     }
                     break;
                 
                 case 2:
                     
                     yorum.yorumGor();
                     yorumEkrani();
                     break;
                 
                 case 3:
                     secimEkrani();
                     break;
                 default:
                     System.out.println("Lutfen gecerli bir sayi giriniz");
                     yorumEkrani();
             }
         } catch (Exception e) {
                System.out.println("Hata \n"+e);
         }
    
    }
    
    
    
    
}
