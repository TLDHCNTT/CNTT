import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NguyenToClientComponent {
  
    public static void main(String[] args){
        new NguyenToClientComponent().run();
    }
    private void run(){
     
        int n;
        int a[];
        try {
            INguyenTo nguyento=(INguyenTo) Naming.lookup("rmi://localhost:"+2012+"/NguyenToImplementation");
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
             b=nguyento.ketQua(a);
       System.out.println("======Nhung so nguyen to thoa man la ====");
       
       for(int j=0;j<b.length;j++)
       {
           System.out.println(b[j]+"");
       }
       
        } catch (NotBoundException ex) {
            Logger.getLogger(NguyenToClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(NguyenToClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(NguyenToClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}