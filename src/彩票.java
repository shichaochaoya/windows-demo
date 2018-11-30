package demo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 彩票 {
    public static void main(String[] args) {  //简写 psvm
        //准备两个数字，让用户猜
String lottery=""+(int)(Math.random()*10)+(int)(Math.random()*10);
        //等待用户输入两个两位数
        Scanner input =new Scanner(System.in);
        System.out.println("请输入一个两位数");
        String guess =input.nextLine();//用户输入的两个数赋值给guess
        //切分系统的两个随机数 准备比较
        char lotteryDight1=lottery.charAt(0);
        char lotteryDight2=lottery.charAt(1);
        char guess1=guess.charAt(0);
        char guess2=guess.charAt(1);
        System.out.println("彩票的号码是："+lottery);
        //开始比较
       /* String num = "123456";
        String rex = "/^[1-9]+\\d*$";--必须是1-9开头的。
        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(num);
        if (m.find()){
            sysout("match!");
        }*///正则表达式判断格式

        /*String rex="^([1-9]\\d|\\d)$\n";
        Pattern p=Pattern.compile(rex);
        Matcher m=p.matcher(guess);
*/
        String pattern = "^\\d{2}$";//判断是否为n位整数

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(guess);
        System.out.println(m.matches());

        if (!m.matches()){
            System.out.println("您输入的不是两位数");
        }
        else if (guess.equals(lottery)){
            System.out.println("恭喜你全部猜对");
        }
        else if (guess1==lotteryDight2&&guess2==lotteryDight1){
            System.out.println("恭喜你猜中了 顺序不一样");
        }
        else  if (guess1==lotteryDight1||guess1==lotteryDight2||guess2==lotteryDight1||guess2==lotteryDight2){
            System.out.println("恭喜你猜中一个数字");
        }
        else {
            System.out.println("抱歉什么都没猜到");
        }
        }





    }

