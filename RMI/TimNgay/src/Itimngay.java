/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
import java.rmi.*;
import java.util.ArrayList;

public interface Itimngay extends Remote
{
    
    public int[]TimNgay(int a[]) throws RemoteException;
}
