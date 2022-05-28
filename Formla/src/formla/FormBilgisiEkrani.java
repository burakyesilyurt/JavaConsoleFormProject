
package formla;


public class FormBilgisiEkrani extends FormBilgisi{
    
    public FormBilgisiEkrani(){
        kullaniciSayisiGor();
        postSayisiGor();
        yorumSayisiGor();
        
    }
    
    
    public void bilgiGoster(){
        System.out.println("\nFormdaki Post Sayisi " + postSayisi);
        System.out.println("Formdaki Kullanici Sayisi " + kullaniciSayisi);
        System.out.println("Formdaki Yorum Sayisi " + yorumSayisi);
        System.out.println("\n");
    
    }
    
    
}
