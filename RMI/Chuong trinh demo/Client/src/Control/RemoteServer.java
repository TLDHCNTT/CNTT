/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author falundafa
 */
public interface RemoteServer  extends Remote {
    public String[] data(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10) throws RemoteException;
}
