/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serversql;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author falundafa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public void Server(){
        try {
            Control.ServerImpl Server= new Control.ServerImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/Server", Server);  
            System.out.println("Server da san sang ....");
	} catch (Exception e) {	/*System.err.println("Server exception: " +e.getMessage()); e.printStackTrace(); */}
    }
    public static void main(String[] args) {
       
            new Main().Server();

    }
}
