public class OuterClass {
    /**外部类*/
    private String string;

    public void disPlay(){
        /**局部内部类，定义在方法中，if中，局部定义，用完释放*/
        class InnerClassjuubu{}//局部内部类


        System.out.println("这是一个外部类"+string);
    }

    public InnerClass getInnerClass(){//调用方法

        return new InnerClass();

    }

    /**内部类*/
    public class InnerClass{//成员内部类，不能用静态关键字 ，不受外部类约束
        private String stringInner;
        public void innerDisPlay(){
            string="外部类的变量,内部类赋值";
            disPlay();//调用外部类方法

        }
    }

    public static void main(String[] args) {
        /*InnerClass innerClass=new InnerClass();//错误*/
        OuterClass outerClass=new OuterClass();
        /*OuterClass.InnerClass inner = new InnerClass();//错误*/
        /**调用内部类必须调用内部类实例*/
        OuterClass.InnerClass inner=outerClass.getInnerClass();
        inner.innerDisPlay();
    }
}
