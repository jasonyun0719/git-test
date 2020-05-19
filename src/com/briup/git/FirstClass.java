package com.briup.git;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("请输入名字。。。。");
        Scanner sc = new Scanner(System.in);
            String name =sc.nextLine();

        FirstClass f = new FirstClass();
        f.test(name);
    }
    public void test( String name){
        System.out.println(name+"帅哥！");
    }
}
