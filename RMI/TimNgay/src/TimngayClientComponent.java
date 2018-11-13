/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimngayClientComponent {
  
    public static void main(String[] args){
        new TimngayClientComponent().run();
    }
    private void run(){
     
         int thang;
         int nam;
         try {
            Itimngay sort=(Itimngay) Naming.lookup("rmi://localhost:"+1308+"/SortImplementation");
    Scanner sc= new Scanner(System.in);
    System.out.println("Nhap vao thang : ");
    thang=sc.nextInt();
    System.out.println("Nhap vao nam : ");
    nam=sc.nextInt();
    switch(thang)
    {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println("Thang co 31 ngay"); break;
        case 4: case 6: case 9: case 11:
            System.out.println("Thang co 30 ngay"); break;
        case 2:
            if(nam%400==0 ||(nam%4==0 && nam%100!=0))
                System.out.println("Thang co 29 ngay");
            else
                System.out.println("Thang co 28 ngay");
            break;
        default:
            System.out.println("Thang khong hop le");
        break;
    
    }       
        } catch (NotBoundException ex) {
            Logger.getLogger(TimngayClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(TimngayClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(TimngayClientComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
