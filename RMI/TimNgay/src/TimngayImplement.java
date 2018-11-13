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
import java.rmi.server.*;
import java.util.Arrays;

public class TimngayImplement extends UnicastRemoteObject
        implements Itimngay {

    public TimngayImplement() throws RemoteException {
        //There is no action need in this moment.
    }
    

    public int[] TimNgay(int a[]) throws RemoteException {
        
        Arrays.sort(a);
        return a;
    }
}

