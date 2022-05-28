
package formla;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
     //Gerekli Dosyaları Oluşturur
     DosyaSistem postTxtOlustur = new DosyaSistem("postlar.txt");
     DosyaSistem yorumlarTxtOlustur = new DosyaSistem("yorumlar.txt");
     DosyaSistem kullanicilarTxtOlustur = new DosyaSistem("kullanicilar.txt");
     DosyaSistem kisiTxtOlustur = new DosyaSistem("kisi.txt");
     
        

       Giris giris = new Giris();
        
        try {
            
            giris.girisEkrani();
            
        } catch (Exception e) {
            System.out.println("Hata olustu : \n"+e);
        }
       
    }
    
    
    /**
     * Giriş yapmak isteyen kullanıcının kullanıcıadı ve şifresini dosyadan kontrol eder
     * @param dosyaAdi kontrol edilmek istenilen dosyanın adi
     * @param kullaniciAdi giriş yapmak isteyen kullanıcının kullanıcıadı
     * @param sifre giriş yapmak isteyen kullanıcının şifresi
     * @return giriş yapmak isteyen kullanıcının giriş bilgilerinin eşleşip eşleşmediğinin değerini boolean olarak döndürür
     */
    
    public static boolean girisKontrol(String dosyaAdi, String kullaniciAdi, String sifre){
            boolean kontrol = false;
            String gkullaniciAdi = "";
            String gsifre = "";
            
            try{
            Scanner x = new Scanner(new File(dosyaAdi));
            x.useDelimiter("\n");
            
            while(x.hasNext() && !kontrol){
            // Kullanici dosyasında önce okumya IDlerden başladığından 2 defa next() kullanıldı
            gkullaniciAdi = x.next();
            gkullaniciAdi = x.next();
            gsifre = x.next();
            
            if(gkullaniciAdi.trim().equals(kullaniciAdi.trim()) && 
               gsifre.trim().equals(sifre.trim()) ){

                kontrol = true;
            }

            }
                x.close();
               if(kontrol){
                   
                   System.out.println("Giriş başarılı " + kontrol);
                   
               }else{
                   System.out.println("Hatalı giriş");
                   
               }
            }
            catch(Exception e){
                System.out.println("Hata \n"+e);
            }
                return kontrol;
        }
    
    }
    

