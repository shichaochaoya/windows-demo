package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.Buffer;

public class NetWork {
    //IP 域名 每个网站都有一个IP，是网站在网络上的地址，多个域名可以指向同一个IP，但一个IP一般只对应一个域名
    //dns服务器 通过域名查询IP，访问网站
    //TCP 是一种通信协议 TCP/IP协议  TCP:基于流的传输协议 面向连接的，是可靠地 通过三次握手保证可靠性
    //UDP 面向无连接 不可靠 基于包的
    //Socket 编程 服务端：监听端口相应 ； 客户端

    public static void main(String[] args) throws Exception {
    //URL类（java.net）
    URL url=new URL("http://www.baidu.com");
       /* System.out.println(url.getHost());//主机
        System.out.println(url.getPort());//端口
        System.out.println(url.getProtocol());//协议*/
       URLConnection connection=url.openConnection();
       connection.getInputStream();
        BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
        System.out.println(reader.readLine());
    }
}
