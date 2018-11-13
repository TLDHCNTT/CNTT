import java.rmi.*;
import java.util.ArrayList;

public interface INguyenTo extends Remote
{
    public boolean kiemTraNT(int n) throws RemoteException;

    public int[] ketQua(int a[]) throws RemoteException;

   
}