package enum_demo;

public class ConstantsClass implements Constatants{
    public static void doit(int c){
        switch (c){
            case Constatants.Constatants_A:
                System.out.println("doit()Constant_A");
                break;
        }
    }
    public static void doit2(Constants c){
        switch (c){
            case Constants_A:
                System.out.println("doit2()Constant_A");
        }
    }
    enum Constant{
        CONSTANT_A,
        CONSTANT_B,
    }

    public static void main(String[] args) {
        for (int i = 0; i <Constant.values().length; i++) {
            System.out.println(Constant.values()[i]);
        }
    }
}
