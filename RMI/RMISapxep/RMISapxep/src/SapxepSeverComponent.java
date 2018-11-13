import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SapxepSeverComponent {
    
   public static void main(String[] args){
       try {
           new SapxepSeverComponent().run();
       } catch (MalformedURLException ex) {
           Logger.getLogger(SapxepSeverComponent.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
   private void run() throws MalformedURLException{
    
       try{
           SapxepImplement SortImplementation =new SapxepImplement();
           Registry registry = LocateRegistry.createRegistry(2012);
           Naming.rebind("rmi://localhost:2012/SortImplementation",SortImplementation );
       System.out.println("Server is running...");
       }catch(RemoteException ex){
           Logger.getLogger(SapxepSeverComponent.class.getName()).log(Level.SEVERE,null, ex);
       }catch(MalformedURLException ex){
           Logger.getLogger(SapxepSeverComponent.class.getName()).log(Level.SEVERE,null, ex);
   }
}
}