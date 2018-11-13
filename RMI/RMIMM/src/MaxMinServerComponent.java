import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MaxMinServerComponent {
    
   public static void main(String[] args){
       try {
           new MaxMinServerComponent().run();
       } catch (MalformedURLException ex) {
           Logger.getLogger(MaxMinServerComponent.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
   private void run() throws MalformedURLException{
    
       try{
           MaxMinImplementation MaxMinImplementation =new MaxMinImplementation();
           Registry registry = LocateRegistry.createRegistry(2012);
           Naming.rebind("rmi://localhost:2012/MaxMinImplementation",MaxMinImplementation );
       System.out.println("Server is running...");
       }catch(RemoteException ex){
           Logger.getLogger(MaxMinServerComponent.class.getName()).log(Level.SEVERE,null, ex);
       }catch(MalformedURLException ex){
           Logger.getLogger(MaxMinServerComponent.class.getName()).log(Level.SEVERE,null, ex);
   }
}
}
