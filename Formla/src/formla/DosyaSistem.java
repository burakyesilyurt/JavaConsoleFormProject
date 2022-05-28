
package formla;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class DosyaSistem {
    String dosyaAdi;
    
    
    public DosyaSistem(String dosyaAdi){
    this.dosyaAdi = dosyaAdi;
    
       dosyaOlustur();
    }
    
    /**
     * Constructor çağrıldığında istenilen dosya yoksa oluşturur
     */
    private void dosyaOlustur(){
        
       try {
      File myObj = new File(dosyaAdi);
      if (myObj.createNewFile()) {
        System.out.println("Dosya oluşturuldu: " + myObj.getName());
      } 
//      else {
//        System.out.println("Dosya açıldı.");
//      }
    } catch (IOException e) {
      System.out.println("Hata olustu.");
      e.printStackTrace();
    }
        
  }
    /**
     * Dosyaya istenilen metni yazar
     * @param metin dosyaya yazdırılmak istenilen metni alır
     */
     
    public void dosyaYaz(String metin) {
        try{
    File file = new File(dosyaAdi);
    //2.Parametre Append için
    FileWriter fr = new FileWriter(file, true);
    BufferedWriter br = new BufferedWriter(fr);
    
    br.write(metin + "\n");
    
        br.close();
        fr.close();
        
        }catch (IOException e) {
      System.out.println("Hata olustu.");
      e.printStackTrace();
    }
    
    
    }
    
    
    /**
     * dosyadaki bilgileri ekrana yazdırır veya dosyadaki satır sayısını alır
     * @param satirVeyaDosyaOku dosya bilgilerini ekrana yazdırmak ve satır sayısı için true, sadece satirSayısını almak için false 
     * @return satir sayisini döndürür 
     */

  
    public int dosyaVeSatirOku(boolean satirVeyaDosyaOku){
       int satirSayisi = 0;
       
    try
    {
      
      File file = new File(dosyaAdi);    
      
      FileReader fr = new FileReader(file);  
            
      BufferedReader br = new BufferedReader(fr);  
      StringBuffer sb = new StringBuffer();    
      String line;
      while((line = br.readLine()) != null)
      {
        satirSayisi++;
        if(satirVeyaDosyaOku){
        
        sb.append(line);      
        sb.append("\n");
        }
        
            
      }
      fr.close();  
      
      if(satirVeyaDosyaOku){
      System.out.println(sb.toString());
      }
      
      
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    
    if(satirSayisi % 3 == 0){
        satirSayisi =  satirSayisi / 3;
        return satirSayisi;
    }
    return satirSayisi;
    
    }
    
    

    public void dosyaSil(){
        File myObj = new File(dosyaAdi); 
        if (myObj.delete()) { 
            System.out.println("Dosya Silindi");
          System.out.println("Silinen Dosya: " + myObj.getName());
        } else {
          System.out.println("Dosya Silme İşlemi Başarısız");
        } 
    
    
    }

    
  }
       
    

    

