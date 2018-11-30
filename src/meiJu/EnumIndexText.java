package meiJu;

public class EnumIndexText {
    enum Constants2{
        Constants_A("我是枚举成员A"),
        Constants_B("我是枚举成员B"),
        Constants_C("我是枚举成员C"),
        Constants_D(3),
        ;
        private String descripytion;
        private int i=4;

        Constants2() {
        }

        Constants2(String descripytion) {
            this.descripytion=descripytion;
        }

        Constants2(int i) {
            this.i=this.i+1;
        }

        public String getDescripytion() {
            return descripytion;
        }

        public int getI() {
            return i;
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i <Constants2.values().length ; i++) {
            System.out.println(Constants2.values()[i]+"调用getDescripytion方法为"+Constants2.values()[i].getDescripytion());
        }
        System.out.println("调用getI方法"+Constants2.values()[3].getI());
    }
}
