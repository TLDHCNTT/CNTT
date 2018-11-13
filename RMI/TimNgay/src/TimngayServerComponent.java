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
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimngayServerComponent {
    
   public static void main(String[] args){
       try {
           new TimngayServerComponent().run();
       } catch (MalformedURLException ex) {
           Logger.getLogger(TimngayServerComponent.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
   private void run() throws MalformedURLException{
    
       try{
           TimngayImplement SortImplementation =new TimngayImplement();
           Registry registry = LocateRegistry.createRegistry(1308);
           Naming.rebind("rmi://localhost:1308/SortImplementation",SortImplementation );
       System.out.println("Server is running...");
       }catch(RemoteException ex){
           Logger.getLogger(TimngayServerComponent.class.getName()).log(Level.SEVERE,null, ex);
       }catch(MalformedURLException ex){
           Logger.getLogger(TimngayServerComponent.class.getName()).log(Level.SEVERE,null, ex);
   }
}
}
