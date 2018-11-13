import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MaxMinClientComponent {
  
    public static void main(String[] args){
        new MaxMinClientComponent().run();
    }
    private void run(){
     
        int n;
        int a[];
        try {
           IMaxMin maxmin=(IMaxMin) Naming.lookup("rmi://localhost:"+2012+"/MaxMinImplementation");
            System.out.println("==== Nhap so phan tu cua mang  ====");
            System.out.println("-Moi nhap: ");
            Scanner scan =new Scanner(System.in);
            n=scan.nextInt();
          a = new int[n];
             for (int i=0; i<a.length;i++)
                {
                    System.out.print("Nhap phan tu thu"+(i+1)+": ");
                    a[i] = scan.nextInt();
                }
             int b[]=new int[a.length];
             b=maxmin.SapXep(a);
       System.out.println("Max=");
       System.out.println(b[b.length-1]+"");
        System.out.println("Min=");
        System.out.println(b[0]+"");
       
        } catch (NotBoundException ex) {
            Logger.getLogger(MaxMinClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(MaxMinClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(MaxMinClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}