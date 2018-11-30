package demo;

import java.io.File;

public class IODemo {
    public static void main(String[] args) {
        IO();
    }

    public static void  IO(){
        File file=new File("E:\\src");
        if (file.isDirectory()) {
            System.out.println("是个文件夹·");
            String[]files=file.list();
            System.out.println();
        }
        if (file.isFile()){}
        System.out.println("是个文件");
    }

}

