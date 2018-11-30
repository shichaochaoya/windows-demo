public class 循环 {
    public static void main(String[] args) {
      //  int a=21;
      //  while (a<=20){ //不满足条件不会进入循环（先判断在执行）
      //     System.out.println("a="+a);
      //     a++;
      //     System.out.println("\n");//\n表回车
     //   }
      //  do {   //do while先执行再判断
      //      System.out.println("a="+a);
      //      a++;
     //       System.out.println("\n");
    //    }
     //   while (a<=20);
      //  for (int a=10;a<=20;a++){
      //      System.out.println("a="+a);
      //      System.out.println("条件满足继续循环");
      //  }
     //   System.out.println("条件不满足结束循环");
        //break直接跳出循环
        //continue 跳过此次进入下一次循环



         //菱形的制作
     int i,j,q;
        //打印菱形的上半部分，左边打印倒直角三角形的空格，右边打印等腰三角形
        for( i = 1;i < 6; i ++) //外循环控制行数，共打印五行
        {
            //左边打印倒直角三角形空格
            for( j = 5; j > i; j--) //与外循环关联，初始值不变，表达式变化，控制打印的列数
            {
                System.out.print(" ");

            }
            //右边等腰三角形
            for( q = 1;q < i*2; q++) //与外循环关联，初始值不变，表达式变化，打印奇数列1，3，5，7，9
            {
                System.out.print("*");
            }
            System.out.println();    //println自动换行，光标停留在下一行
        }
        for (i=1;i<5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for( q = i*2; q < 9 ; q++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
       }



