package demo;

/**
 * 异常处理 运行时异常 编译没有问题
 * //数组下标越界 空指针 算数异常 类型转化异常.....除了运行时异常  及其子类 其他都是受检查的异常
 */
public class yichangchuli {
    public static void main(String[] args){
       // try {
            int[] a=new  int[5];
            a[5]=10;

       // } catch (Exception e) {
            throw new ArithmeticException("除数为零");
        //}
    }
    public static class InvalidRadiusException extends Exception{
        public InvalidRadiusException() {
            super();
        }

        public InvalidRadiusException(String message) {
            super(message);
        }

        public InvalidRadiusException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
