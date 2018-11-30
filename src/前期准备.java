package demo;

public class 前期准备 {

    public static void main(String[] args) {

       // final double PIE;//通常大写
       // PIE = 3.14;
       // Scanner input =new Scanner(System.in);
      //  double radius=input.nextDouble();
       // System.out.println("您输入的半径是"+radius);
       // double area = PIE * radius * radius;
      //  System.out.println(area);
// float p=5.6F;
       // System.out.println(p);
      //  int t=10;
        //int  r=2;
       // int v=r*3+t;
      //  System.out.println(v);
     //   long time=System.currentTimeMillis() 表示时间
        //a++ 表示先赋值再自加，++a表示先自加在赋值
       // double a=3.14;
         //       int b=(int) a;//强制转化数值类型小数变整数，小数点后丢失
        //System.out.println(b);
                       //布尔类型，只有两种 true false 真/是，假/否
      //  boolean b=true;
      //   b=false;
        //比较操作符 < > <= >= ==(等于)  ！=不等于
      //  b=3>2;
      //  System.out.println(b);  (比较)
        //final double PIE;//通常大写
        //  PIE = 3.14;
        //   Scanner input =new Scanner(System.in);
        //   double radius=input.nextDouble();
        //    if (radius<0){//小括号里写判断条件
        //        System.out.println("您输入的半径是"+radius+"您输入的半径非法 ");
        //    }
        //    else  if(radius==0){//花括号写判断后的执行
        //        System.out.println("您输入的半径是"+radius+"您输入的半径为0 是一个点");
        //    }
        //    //   else {//保底
        //     System.out.println("您输入的半径是"+radius);
        //  double area = PIE * radius * radius;
        //   System.out.println(area);}
                          //      逻辑操作符
        // ==等于 ！=不等于 && 与  ^异或　｜｜或　
           //短路运算 &&前面是0时,&&符号后面的不计算
        // ||前面不是0时,||号后面的不计算.
        // int a=0;
       // switch (a){                                        //switch 适合条件较多
    //           break;                                     //break:跳出循环，以防继续执行
        //    case 6:
       //         System.out.println("您输入的是"+6);
       //         break;
       //   default:                                         //default：所有条件都不满足情况下执行
      //        System.out.println("条件都不满足");}

                           //数值类型
       // System.out.println(Math.min(3,4));   //最小值
       // System.out.println(Math.pow(2,3));   //2的3次方
       // System.out.println(Math.abs(-25.3));   //绝对值
        //System.out.println(Math.sin(Math.PI/2)); //sin值
       // System.out.println(Math.ceil(5.3));向上取整
        //System.out.println(Math.floor(5.3));向下取整
       // System.out.println(Math.round(6.5));//四舍五入
       // System.out.println(Math.rint(5.6));//近似取整，优先取偶数
       // System.out.println((int) (Math.random()*50));//单独的0-1，取值范围在后面乘 ,加int强转整数
                           //字符类型
        //char b='A';
       // System.out.println((int)b);//ascii码表，字母，unicold包含ascii
       // utf-8是unicold的实现，\u0000-\uFFFF,F=15
       // String str="ni hao";
       // System.out.println(str.toUpperCase());//小写转大写
        //System.out.println(str.length());//字符串长度
       // System.out.println(str.charAt(4));//输出该位置的字符串
       // System.out.println(str.trim());//去掉字符串两边多余空格
       // System.out.println(str.substring(4));//从指定位置开始
      //  System.out.println(str.substring(1,4));//指定位置开始到指定位置前一个（包头不包尾）
       //String a="ab";
       //String b="ab";
      //  System.out.println(a==b);//比较俩字符串内存地址不是内容
      //  System.out.println(a.equals(b));//equals是针对引用的，比较的是引用类型的内容一样不一样，比如两个类的比较
      //  System.out.println(a.compareTo(b));//字典比较 一样大大返回0,前面的大返回值大于0，反之小于0
    }
}


