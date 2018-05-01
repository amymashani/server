import java.net.*;
import java.io.*;
import java .util.Date;

public class timeserverii
{

 public static void main(String[] args)throws IOException

{

ServerSocket ss=new ServerSocket(7778);

System.out.println("server has reserved port no:"+ss.getLocalPort()+"for this service");


Socket cs=ss.accept();

System.out.println("Client with IP Adrress"+cs.getInetAddress()+"has communicated via port No.:"+cs.getPort());

Date d=new Date();
String s="Current Date & Time on Server is :" +d;

PrintWriter toclient=new PrintWriter(cs.getOutputStream(),true);

toclient.print(s);

toclient.close();
cs.close();
ss.close();
}
}
