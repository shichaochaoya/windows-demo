package demo;

public class DiGuiMethor {
    public static Long jiecheng(int i){
        if (i == 1) {
            return 1L;
        }else {
            return i*jiecheng(i-1);
        }
    }

    public static int fid(int i){
        if (i==0){
            return 0;
        }else   if (i == 1) {
            return 1;
        }else {
            return fid(i-1)+fid(i-2);
        }
    }

    public static void main(String[] args) {
        int i=4;
        System.out.println(jiecheng(i));
        System.out.println(fid(i));
    }
}
