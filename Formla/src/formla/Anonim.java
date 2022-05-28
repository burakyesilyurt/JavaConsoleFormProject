
package formla;

import java.util.Scanner;


public class Anonim {
    
    
    void anonimEkranı(){
        int scm;
        Scanner input=new Scanner(System.in);
         
        System.out.println("Anonimler sadece postları ve yorumları görebilir");
        System.out.println("Post Görmek Için 1");
        System.out.println("Yorum Görmek Için 2");
        System.out.println("Form Bilgilerini Görmek Için 3");
        System.out.println("Kayıt ve Giriş Ekranına Dönmek Için 4");
        
        scm = input.nextInt();
        switch(scm){
            case 1:
                DosyaSistem dosya = new DosyaSistem("postlar.txt");
                dosya.dosyaVeSatirOku(true);
                anonimEkranı();
                break;
            case 2:
                DosyaSistem dosya2 = new DosyaSistem("yorumlar.txt");
                dosya2.dosyaVeSatirOku(true);
                anonimEkranı();
                break;
            case 3:
                    FormBilgisiEkrani formBilgi = new FormBilgisiEkrani();
                    formBilgi.bilgiGoster();
                    
                    anonimEkranı();
                break;
            case 4:
                
                break;
            default:
                System.out.println("Lutfen geçerli sayi giriniz");
                anonimEkranı();
        
        
        }
        
        
    
    
    }
}
