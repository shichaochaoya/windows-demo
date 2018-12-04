package web.Socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class client {
    /**客户端 （单线程）*/
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("localhost",10086);//必须和服务端一样
        DataInputStream dis=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        Scanner scanner=new Scanner(System.in);
        boolean flag=false;
        while (!flag) {
            System.out.println("请输入正方形边长：");
            double length = scanner.nextDouble();
            dos.writeDouble(length);
            dos.flush();
            double area = dis.readDouble();
            System.out.println("服务器返回的面积是："+area);
            while (true) {
                System.out.println("继续计算？（Y/N）");
                String str=scanner.next();
                if (str.equalsIgnoreCase("N")){
                    dos.writeInt(0);
                    dos.flush();
                    flag=true;
                    break;
                }else if (str.equalsIgnoreCase("Y")){
                    dos.writeInt(1);
                    dos.flush();
                    break;
                }
            }
        }
        socket.close();
    }
}
