package JAVA8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaListen extends JFrame {
    JPanel p;
    JTextArea ta;
    JButton btn1 ,btn2;
    public LambdaListen(){
        super("Lambda测试");
        p = new JPanel();
        ta = new JTextArea();
        btn1 = new JButton("传统方式");
        btn2 = new JButton("lambda表达式方式");
        //添加监听器
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("您单击了按钮 1\n");
            }
        });

        //lambda表达式方法
        btn2.addActionListener((a) -> ta.append("您单击了按钮 2\n"));
        this.add(ta);
        p.add(btn1);
        p.add(btn2);
        this.add(p , BorderLayout.SOUTH);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LambdaListen().setVisible(true);
    }
}
