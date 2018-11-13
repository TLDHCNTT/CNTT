/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package banhang;

import java.io.*;
import java.rmi.Naming;
//*********************************************************************
public class hamgoi {
    private Control.RemoteServer Serverconnection;
    public String[] goituxa(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10){
        String ip=new hamgoi().docip();
        String[] a=new String[11];
        try{
            Serverconnection = (Control.RemoteServer)Naming.lookup("rmi://"+ip+":1099/Server");
            a=Serverconnection.data(s,s1,"","","","","","","","","");
        }
        catch(Exception e){}
        return a;
    }
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
    //*********************************************************************
    public String[] docfile(String tenfile){
        String[] s1=new String[100];
	try{
            FileReader fr1=new FileReader(tenfile);
            BufferedReader input=new BufferedReader(fr1);
            for(int i=0;i<docsl(tenfile);i++){
		s1[i]=input.readLine();
            }
	}
	catch(Exception e){
	}
	return s1;
    }
    //*********************************************************************
    public void ghiip(String ip){
		try{
			FileOutputStream fi=new FileOutputStream("ip.txt");
			PrintStream f=new PrintStream(fi);
			f.println(ip);
				fi.close();
				f.close();
		}
		catch(Exception e){
			System.out.print("");
		}
    }
    //*********************************************************************
    public String docip(){
        String s1="";
	try{
            FileReader fr1=new FileReader("ip.txt");
            BufferedReader input=new BufferedReader(fr1);            
		s1=input.readLine();
	}
	catch(Exception e){
	}
	return s1;
    }
    //*********************************************************************
    public static boolean ktString(String s){
        boolean check=true;
         String s1="";
	try{
		s1=s;
	}
        catch(Exception e){
        }
        if(s.equals("")){
		check=false;
	}
         return check;
    }
    public static boolean ktLong(String s){
        boolean check=true;
        long s1=0;
        try{
            s1=Long.parseLong(s);
        }
        catch(Exception e){
            check=false;
        }
        return check;
    }
    //*********************************************************************
    public void ghiusername(String username){		
		try{
			FileOutputStream fi=new FileOutputStream("dangnhap.txt");
			PrintStream f=new PrintStream(fi);			
			f.println(username);	
				fi.close();									
				f.close();									
		}
		catch(Exception e){										
			System.out.print("");			
		}
    }
    //*********************************************************************
    public String docusername(){
        String s1="";
	try{
            FileReader fr1=new FileReader("dangnhap.txt");
            BufferedReader input=new BufferedReader(fr1);
		s1=input.readLine();
	}
	catch(Exception e){
	}
	return s1;
    }
}