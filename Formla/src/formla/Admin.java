package formla;

import java.util.Scanner;




public class Admin{
    private final String ADMIN_ADI="Admin";
    private final String ADMIN_SIFRE="1234";
    
    
    public boolean adminGiris(){
        boolean kontrol;
        Scanner input=new Scanner(System.in);
        String adminAd;
        String adminSifre;
       System.out.println("Admin Kullanici Adini Giriniz");
       adminAd=input.nextLine();
       System.out.println("Admin Şifresini Giriniz");
       adminSifre=input.nextLine();
       
       if(this.ADMIN_SIFRE.equals(adminSifre) && this.ADMIN_ADI.equals(adminAd)){
           System.out.println("Admin Olarak Giriş Yapıldı");
           kontrol = true;
           
       
       }else{
           System.out.println("Giriş Yapılamadı");
           kontrol = false;
           
       }
       
    return kontrol;
    }
    
    
}





