package demo;

import java.util.Arrays;

public class 一维数组 {
    public static void main(String[] args) {
        //一维数组


        //int[] myArray;
        // myArray=new  int[5];//创建一个长度为伍的int型数组
        //或者
        int[] myArry = new int[10];
        //数值类型 初始值都是0
        //赋值
        myArry[0] = 5;
        myArry[1] = 7;
        myArry[2] = 9;
        myArry[3] = 2;
        myArry[4] = 6;
        myArry[5] = 65;
        myArry[6] = 87;
        myArry[7] = 21;
        myArry[8] = 4;
        myArry[9] = 3;
      // int index= linearSearch(myArry,3);//调用线性查找
       // System.out.println(index);//调用线性查找
       //int ideax=binanySearch(myArry,4);
        // System.out.println(ideax);
       //Arrays.sort(myArry); //直接调用方法排序 归并排序
       Arrays.parallelSort(myArry);//直接调用方法排序 多线程
       // selectSort(myArry);
       // System.out.println(result);
        System.out.println(myArry);
       for(int temp:myArry)
        {
            System.out.print(temp+"  ");
        }

        }

    //数组的查找
    // 1.线性查找
     //  public  static  int linearSearch(int[] param,int key) {//方法
  //  for (int i=0;i<param.length;i++){//挨个寻找
   //     if (key==param[i]){
   //         return i;//找到后返回1
   //     }
  //  }

  //  return  -1;
  //  }

    //数组的查找
    // 二分查找  先把数组排序 比如从小到大 然后在通过找中间元素比较大小 重复中间轴进行查找
/*public static int binanySearch(int[] param,int key){
    //1.排序
        selectSort(param);
     //2.查找
    int low=0;
    int high=param.length-1;
    while (high>=low);{
        int mid = (low + high) / 2;
        if (key < param[mid]) {
            high = mid - 1;
        } else if (key == param[mid]) {
            return mid;
        } else {
            low = mid + 1;
        }
    }
    return -1;
}*/


        //排序方法  选择排序，冒泡排序。。。。。快速排序  希尔排序（高端）

    //选择排序
   /* public static int selectSort(int[] param){
        for (int i=0;i<param.length;i++){//外层循环挨个查找
          //  int currentMIN=param[i];//记录当前param值
          //  int currentMinIdeax=i;//当前位置
            for (int j=i+1;j<param.length;j++){//内层循环查找比当前值小的值
                if (param[i]>param[j]){//找到比当前小的值
                    int temp=param[j];//和当前值交换
                    param[j]=param[i];//和当前值交换
                    param[i]=temp;//和当前值交换
                }
            }
        }
        return 0;
    }*/


         //冒泡排序
        //同选择排序，一个睁着来一个反着来


    // myArry[5]=6;//长度只有五，所以只能赋值五个，超出会异常
        //赋值
      //  System.out.println(myArry.length);//输出数组长度
      // int sum=0;
      //  for (int i=0;i<myArry.length;i++){
       //     sum=sum+myArry[i];
      //  }
       // double result=(double) sum/myArry.length;
        //System.out.println(result);

       // for (int tem:myArry){//吧myArry每个元素依次赋值给tem
          //       System.out.println(tem);
         //     }

      //  arrayChange(myArry);
      //  for (int tem:myArry){//吧myArry每个元素依次赋值给tem
      //      System.out.println(tem);
     //   }

        //增强for循环 foraech循环
      //  for (int tem:myArry){//吧myArry每个元素依次赋值给tem
       //     System.out.println(tem);
      //  }
        //数组的复制
     //   int [] myArry2=new  int[5];
      //  myArry2=myArry;//将后者赋值给前者实现数组的复制
  //  }
  //  public static void arrayChange(int[] param){
    //    param[3]=88;
   //     for (int tem:param){//吧myArry每个元素依次赋值给tem
   //         System.out.println(tem);}

}
