import java.util.ArrayList;
import java.rmi.*;
import java.rmi.server.*;

public class NguyenToImplementation extends UnicastRemoteObject implements INguyenTo{
    public NguyenToImplementation() throws RemoteException{    
    }
     @Override
    public boolean kiemTraNT(int n) throws RemoteException{
       
        int dem=0;
        if(n<2)
            return false;
        else{
            if(n==2)
                return true;
            else{
                for(int i=2; i<= Math.sqrt(n);i++){
                    if(n%i==0){
                        dem++;
                        break;
                    }
                }
            if(dem==0) return true;
            else return false;
            }
        }
    }

    @Override
    public int[] ketQua(int a[]) throws RemoteException{
       int j=0;
                 int b[]=new int[a.length];
        
        for(int i=0;i<a.length;i++)
            if(kiemTraNT(a[i])==true)
            {     
                b[j]=a[i];
                j++;
            }
        return b;
        }
}