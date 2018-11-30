package demo;

import java.util.Scanner;

public class MyLove {
    public static void main(String[] args) {
        StringBuilder lover=new StringBuilder();
        lover.append("Chao's lovely  cat!!!!!");
        System.out.println("Please input your question");
        Scanner scanner = new Scanner(System.in);
        String love = scanner.nextLine();
        if (love.equals("who is Chao's deep love？")){
            System.out.println(lover);
        }
    }
}
