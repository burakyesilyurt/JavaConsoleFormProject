package formla;
import java.util.Scanner;


public class Yorum{
    String yorum;
   
    
/**
 * Dosyaya yorum yazar
 * @param postunId yorum yapmak istediğiniz postun ID'sini alır
 * @param kullaniciAdi 
 */
    public void yorumAdd(int postunId,String kullaniciAdi){
        try {
            Scanner input = new Scanner(System.in);
            DosyaSistem dosya = new DosyaSistem("yorumlar.txt");
            System.out.println("Eklemek İstediğiniz Yorumu Giriniz");
            dosya.dosyaYaz(Integer.toString(postunId) + ". ID'li Posta " + kullaniciAdi + " Adlı Kullanıcı Yorum Yaptı");
            this.yorum = input.nextLine();
            dosya.dosyaYaz(yorum);
            
        } catch (Exception e) {
                        System.out.println("Hata \n"+e);

        }
        
        
    }

    
    
    public void yorumGor(){
        try {
            DosyaSistem dosya = new DosyaSistem("yorumlar.txt");
            dosya.dosyaVeSatirOku(true);
            
        } catch (Exception e) {
                        System.out.println("Hata \n"+e);
        }
        
    }
}
