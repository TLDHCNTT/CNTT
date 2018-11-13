/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Control;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class hamgoi{
	public int docsl(String tenfile){
			int tong=0;
			try{
				FileReader fr=new FileReader(tenfile);
				BufferedReader br=new BufferedReader(fr);
				while((br.readLine())!=null){
					tong++;
				}
				fr.close();
				br.close();
			}
			catch(Exception e){
			}
			return tong;
		}
		public String[] docaccount(){
	            String[] s1=new String[100];
			try{
				FileReader fr1=new FileReader("acc.txt");
				BufferedReader input=new BufferedReader(fr1);
				for(int i=0;i<docsl("acc.txt");i++){
					s1[i]=input.readLine();
				}
                                fr1.close();
                                input.close();
			}
			catch(Exception e){
	        }
	        return s1;
		}
		public String[] catten(String hoten){
			int i=0;
			String[] ten=new String[10];
			String s=hoten.toLowerCase();
			StringTokenizer token=new StringTokenizer(s);
			while(token.hasMoreTokens()){
				ten[i]=token.nextToken();
				i++;
			}
			return ten;
		}
		public int slc(String[] a){
			int i=0;
			while(a[i]!=null){
				i++;
			}
			return i;
		}
                public void ghithongtinaccount(account t){
                    try{
			PrintStream ghi=new PrintStream(new FileOutputStream("thongtinaccount.txt",true));
			ghi.println(t.username+"\n"+t.password+"\n"+t.nhanvien+"\n"+t.manhanvien+"\n"+t.quyenhan+"\n"+t.ID);
                        ghi.close();
                    }
                    catch(Exception e){
                    }
                }
                public void ghiaccount(account t){
                    try{
			PrintStream ghi=new PrintStream(new FileOutputStream("acc.txt",true));
			ghi.println(t.username+";"+t.password+" "+t.quyenhan);
                        ghi.close();
                    }
                    catch(Exception e){
                    }
                }
                public account[] docthongtinaccount(){
                    account[] a=new account[100];
                    try{
			FileReader fr1=new FileReader("thongtinaccount.txt");
			BufferedReader input=new BufferedReader(fr1);
			for(int i=0;i<docsl("thongtinaccount.txt")/6;i++){
                            a[i]=new account();
                            a[i].username=input.readLine();
                            a[i].password=input.readLine();
                            a[i].nhanvien=input.readLine();
                            a[i].manhanvien=input.readLine();
                            a[i].quyenhan=input.readLine();
                            a[i].ID=input.readLine();
                        }
                            fr1.close();
                            input.close();
                    }
                    catch(Exception e){
                    }
                    return a;
		}
                public void ghihanghoa(hanghoa a){
                    try{
                        PrintStream ghi=new PrintStream(new FileOutputStream("hanghoa.txt",true));
                        ghi.println(a.ten+"\n"+a.ma+"\n"+a.hang+"\n"+a.model+"\n"+a.mau+"\n"+a.sl+"\n"+a.gianhap+"\n"+a.giaban+"\n"+a.chitiet+"\n"+a.ngaynhap);
                        ghi.close();
                    }
                    catch(Exception e){

                    }
                }
                public hanghoa[] dochanghoa(){
                    hanghoa[] a=new hanghoa[100];
                    try{
                        BufferedReader doc=new BufferedReader(new FileReader("hanghoa.txt"));
                        for(int i=0;i<docsl("hanghoa.txt")/10;i++){
                            a[i]=new hanghoa();
                            a[i].ten=doc.readLine();
                            a[i].ma=doc.readLine();
                            a[i].hang=doc.readLine();
                            a[i].model=doc.readLine();
                            a[i].mau=doc.readLine();
                            a[i].sl=Long.parseLong(doc.readLine());
                            a[i].gianhap=Long.parseLong(doc.readLine());
                            a[i].giaban=Long.parseLong(doc.readLine());
                            a[i].chitiet=doc.readLine();
                            a[i].ngaynhap=doc.readLine();
                        }
                        doc.close();
                    }
                    catch(Exception e){

                    }

                    return a;
                }
                public void ghigiaohangoff(giaohangoff a){
                    try{
                        PrintStream ghi=new PrintStream(new FileOutputStream("giaohangoff.txt",true));
                        ghi.println(a.ten+"\n"+a.diachi+"\n"+a.sdt+"\n"+a.ngban+"\n"+a.hangmua+"\n"+a.tien+"\n"+a.ID);
                        ghi.close();
                    }
                    catch(Exception e){

                    }
                }
                public giaohangoff[] docgiaohangoff(){
                    giaohangoff[] a=new giaohangoff[100];
                    try{
                        BufferedReader doc=new BufferedReader(new FileReader("giaohangoff.txt"));
                        for(int i=0;i<docsl("giaohangoff.txt")/6;i++){
                            a[i]=new giaohangoff();
                            a[i].ten=doc.readLine();
                            a[i].diachi=doc.readLine();
                            a[i].sdt=doc.readLine();
                            a[i].ngban=doc.readLine();
                            a[i].hangmua=doc.readLine();
                            a[i].tien=Long.parseLong(doc.readLine());
                            a[i].ID=doc.readLine();
                        }
                        doc.close();
                    }
                    catch(Exception e){

                    }
                    return a;
                }
                public void ghihoadon(hoadon a){
                    try{
                        PrintStream ghi=new PrintStream(new FileOutputStream("hoadon.txt",true));
                        ghi.println(a.ten+"\n"+a.diachi+"\n"+a.sdt+"\n"+a.nguoigiao+"\n"+a.hangmua+"\n"+a.tien+"\n"+a.ngay+"\n"+a.ID);
                        ghi.close();
                    }
                    catch(Exception e){

                    }
                }
                public hoadon[] dochoadon(){
                    hoadon[] a=new hoadon[100];
                    try{
                        BufferedReader doc=new BufferedReader(new FileReader("hoadon.txt"));
                        for(int i=0;i<docsl("hoadon.txt")/8;i++){
                            a[i]=new hoadon();
                            a[i].ten=doc.readLine();
                            a[i].diachi=doc.readLine();
                            a[i].sdt=doc.readLine();
                            a[i].nguoigiao=doc.readLine();
                            a[i].hangmua=doc.readLine();
                            a[i].tien=Long.parseLong(doc.readLine());
                            a[i].ngay=doc.readLine();
                            a[i].ID=doc.readLine();
                        }
                        doc.close();
                    }
                    catch(Exception e){

                    }
                    return a;
                }
                public static String date() {
                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
                    return sdf.format(cal.getTime());
                }

}
