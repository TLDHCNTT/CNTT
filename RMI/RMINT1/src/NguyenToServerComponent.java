import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NguyenToServerComponent {
    
   public static void main(String[] args){
       try {
           new NguyenToServerComponent().run();
       } catch (MalformedURLException ex) {
           Logger.getLogger(NguyenToServerComponent.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
   private void run() throws MalformedURLException{
    
       try{
           NguyenToImplementation NguyenToImplementation =new NguyenToImplementation();
           Registry registry = LocateRegistry.createRegistry(2012);
           Naming.rebind("rmi://localhost:2012/NguyenToImplementation",NguyenToImplementation );
       System.out.println("Server is running...");
       }catch(RemoteException ex){
           Logger.getLogger(NguyenToServerComponent.class.getName()).log(Level.SEVERE,null, ex);
       }catch(MalformedURLException ex){
           Logger.getLogger(NguyenToServerComponent.class.getName()).log(Level.SEVERE,null, ex);
   }
}
}
