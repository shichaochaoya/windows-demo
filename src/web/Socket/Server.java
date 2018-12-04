package web.Socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**服务端 (单线程)*/
public class Server {
    public static void main(String[] args) throws  Exception{
        ServerSocket serverSocket=new ServerSocket(10086);
        Socket socket = serverSocket.accept();//接受客户端的请求，阻塞方法，如果没有请求就一直等待
        DataInputStream dis=new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(socket.getOutputStream())); //接受请求后返回
         do {//表示客户端返回0，不继续计算
            double length = dis.readDouble();
            System.out.println("从客户端接收到的边长数据为"+length);
            double result = length * length;
            dos.writeDouble(result);//写回
            dos.flush();//刷出去
        }while (dis.readInt() != 0);//先输出一次在判断
        socket.close();
        serverSocket.close();
    }
}
