import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SapxepClientComponent {
  
    public static void main(String[] args){
        new SapxepClientComponent().run();
    }
    private void run(){
     
        int n;
        int a[];
        try {
            Isapxep sort=(Isapxep) Naming.lookup("rmi://localhost:"+2012+"/SortImplementation");
            System.out.println("==== Nhap so phan tu cua mang  ====");
            System.out.println("Nhap vao: ");
            Scanner scan =new Scanner(System.in);
            n=scan.nextInt();
            a = new int[n];
             for (int i=0; i<a.length;i++)
                {
                    System.out.print("Nhap phan tu thu"+(i+1)+": ");
                    a[i] = scan.nextInt();
                }
             int b[]=new int[a.length];
             b=sort.SapXep(a);
       System.out.println("===Mang da sap xep la ===");
       
       for(int j=0;j<b.length;j++)
       {
           System.out.println(b[j]+"");
       }
       
        } catch (NotBoundException ex) {
            Logger.getLogger(SapxepClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SapxepClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SapxepClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}