
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NamnhuanClientComponent {
  
    public static void main(String[] args){
        new NamnhuanClientComponent().run();
    }
    private void run(){
     
        int n;
        try {
            Inamnhuan sort=(Inamnhuan) Naming.lookup("rmi://localhost:"+2012+"/SortImplementation");
     Scanner nhap = new Scanner (System.in);
     System.out.println("Nhap nam: ");
     n = nhap.nextInt();
     while (n < 0) // n nhỏ hơn 0 nhập lại.
     {
          System.out.println("Nhap nam: ");
          n = nhap.nextInt();
     }
     if (n%400 == 0)
          System.out.println("Nam nhuan");
     else if (n%4 == 0 && n%100 != 0)
          System.out.println("Nam nhuan");
     else
          System.out.println("Khong phai nam nhuan"); 
       
        } catch (NotBoundException ex) {
            Logger.getLogger(NamnhuanClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(NamnhuanClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(NamnhuanClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

