/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author falundafa
 */
public class ServerImpl extends UnicastRemoteObject implements RemoteServer {

    public ServerImpl() throws RemoteException {}

   public String[] data(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10) throws RemoteException {
        String[] data=new String[11];
        account[] a=new account[100];
        hanghoa[] listhang=new hanghoa[100];
        giaohangoff[] listgho=new giaohangoff[100];
        hoadon[] listhd=new hoadon[100];
        if(s.equals("ktaccount")==true){
            int kt=0;
            String[] a1=new String[100];
            String[] b=new String[2];
            a1=new hamgoi().docaccount();
            for(int i=0;i<new hamgoi().docsl("acc.txt");i++){
		b=new hamgoi().catten(a1[i]);
		if(s1.equals(b[0])){
                    data[0]=b[1];
                    kt=1;
                }
            }
            if(kt==0)
                data[0]="khongtontai";
        }
        else if(s.equals("taoaccount")==true){
            account t=new account();
            String[] b=new String[2];
            int count=0;
            boolean check=true;
            a=new hamgoi().docthongtinaccount();
            for(int i=0;i<new hamgoi().docsl("thongtinaccount.txt")/6;i++){
                b=new hamgoi().catten(a[i].ID);
                count=Integer.parseInt(b[1])+1;
                if(s1.equals(a[i].username)==true){
                    data[0]="trungusername";
                    check=false;
                }
            }
            if(check==true){
                t.username=s1;
                t.password=s2;
                t.nhanvien=s3;
                t.manhanvien=s4;
                t.quyenhan=s5;
                t.ID="ac "+count;
                new hamgoi().ghithongtinaccount(t);
                new hamgoi().ghiaccount(t);
                count++;
                data[0]="thanhcong";
            }
        }
        else if(s.equals("timaccount")==true){
            a=new hamgoi().docthongtinaccount();
            for(int i=0;i<new hamgoi().docsl("thongtinaccount.txt")/6;i++){
                if(s1.equals(a[i].username)==true||s1.equals(a[i].manhanvien)==true){
                    data[0]="timthay";
                    data[1]=a[i].username;
                    data[2]=a[i].password;
                    data[3]=a[i].nhanvien;
                    data[4]=a[i].manhanvien;
                    data[5]=a[i].quyenhan;
                    data[6]=a[i].ID;
                }
            }
        }
        else if(s.equals("nhaphang")==true){
            hanghoa t=new hanghoa();
            boolean check=true;
            listhang=new hamgoi().dochanghoa();
            for(int i=0;i<new hamgoi().docsl("hanghoa.txt")/10;i++){
                if(s1.equals(listhang[i].ten)==true){
                    data[0]="trungten";
                    check=false;
                }
                if(s2.equals(listhang[i].ma)==true){
                    data[0]="trungma";
                    check=false;
                }
            }
            if(check==true){
                t.ten=s1;
                t.ma=s2;
                t.hang=s3;
                t.model=s4;
                t.mau=s5;
                t.sl=Long.parseLong(s6);
                t.gianhap=Long.parseLong(s7);
                t.giaban=Long.parseLong(s8);
                t.chitiet=s9;
                t.ngaynhap=new hamgoi().date();
                new hamgoi().ghihanghoa(t);
                data[0]="thanhcong";
            }
        }
        else if(s.equals("timhang")==true){
            listhang=new hamgoi().dochanghoa();
            for(int i=0;i<new hamgoi().docsl("hanghoa.txt")/10;i++){
                if(s1.equals(listhang[i].ten)==true||s1.equals(listhang[i].ma)==true){
                    data[0]="timthay";
                    data[1]=listhang[i].ten;
                    data[2]=listhang[i].ma;
                    data[3]=listhang[i].hang;
                    data[4]=listhang[i].model;
                    data[5]=listhang[i].mau;
                    data[6]=String.valueOf(listhang[i].sl);
                    data[7]=String.valueOf(listhang[i].gianhap);
                    data[8]=String.valueOf(listhang[i].giaban);
                    data[9]=listhang[i].chitiet;
                    data[10]=listhang[i].ngaynhap;
                }
            }
        }
        else if(s.equals("ktma")==true){
            boolean check=false;;
            listhang=new hamgoi().dochanghoa();
            for(int i=0;i<new hamgoi().docsl("hanghoa.txt")/10;i++){
                if(s1.equals(listhang[i].ma)==true){
                    data[0]="tontai";
                    data[1]=listhang[i].ten;
                    data[2]=String.valueOf(listhang[i].giaban);
                    check=true;
                }
            }
            if(check==false){
                data[0]="khongtontai";
            }
        }
        else if(s.equals("giaohangoff")==true){
            giaohangoff t=new giaohangoff();
            int count=0;
            String[] b=new String[2];
            listgho=new hamgoi().docgiaohangoff();
            for(int i=0;i<new hamgoi().docsl("giaohangoff.txt")/7;i++){
                b=new hamgoi().catten(listgho[i].ID);
                count=Integer.parseInt(b[1])+1;
            }
            t.ten=s1;
            t.diachi=s2;
            t.sdt=s3;
            t.ngban=s4;
            t.hangmua=s5;
            t.tien=Long.parseLong(s6);
            t.ID="gho "+count;
            new hamgoi().ghigiaohangoff(t);
            data[0]="thanhcong";
        }
        else if(s.equals("capnhatoff")==true){
            listgho=new hamgoi().docgiaohangoff();
            listhd=new hamgoi().dochoadon();
            String[] c1=new String[2];
            int j=0;
            for(int i=0;i<new hamgoi().docsl("hoadon.txt")/8;i++){
                c1=new hamgoi().catten(listhd[i].ID);
                j=Integer.parseInt(c1[1])+1;
            }
            data[1]=listgho[j].ten;
            data[2]=listgho[j].diachi;
            data[3]=listgho[j].sdt;
            data[4]=listgho[j].ngban;
            data[5]=listgho[j].hangmua;
            data[6]=String.valueOf(listgho[j].tien);
            data[7]=listgho[j].ID;
        }
        else if(s.equals("luuhoadon")==true){
            hoadon t=new hoadon();
            int count=0;
            String[] b=new String[2];
            listhd=new hamgoi().dochoadon();
            for(int i=0;i<new hamgoi().docsl("hoadon.txt")/8;i++){
                b=new hamgoi().catten(listhd[i].ID);
                count=Integer.parseInt(b[1])+1;
            }
            t.ten=s1;
            t.diachi=s2;
            t.sdt=s3;
            t.nguoigiao=s4;
            t.hangmua=s5;
            t.tien=Long.parseLong(s6);
            t.ngay=new hamgoi().date();
            t.ID="hd "+count;
            new hamgoi().ghihoadon(t);
            data[0]="thanhcong";
        }
        return data;
    }
}
