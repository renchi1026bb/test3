package com.demon;



import java.util.Scanner;

public class GCDLCM {
    // 最大公约数
    public static int get_gcd(int n1, int n2) {
        int gcd = 0;
        if (n1 < n2) {// 交换n1、n2的值
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }

        if (n1 % n2 == 0) {
            gcd = n2;
        }

        while (n1 % n2 > 0) {
            n1 = n1 % n2;

            if (n1 < n2) {
                n1 = n1 + n2;
                n2 = n1 - n2;
                n1 = n1 - n2;
            }

            if (n1 % n2 == 0) {
                gcd = n2;
            }
        }
        return gcd;

    }

    // 最小公倍数
    public static int get_lcm(int n1, int n2) {
        return n1 * n2 / get_gcd(n1, n2);
    }

    public static void main(String[] args) {
    	System.out.print("主分支代码");
    	System.out.print("本地分值测试1");
    	System.out.print("测试本地修改1");
    	System.out.print("测试本地修改2");
    	System.out.print("测试本地修改3");
        System.out.print("客户端修改");
  System.out.print("客户端修改2");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int n1 = input.nextInt();
        System.out.print("请输入第二个整数：");
        int n2 = input.nextInt();
        System.out.println("(" + n1 + "," + n2 + ")" + "=" + get_gcd(n1, n2));
        System.out.println("[" + n1 + "," + n2 + "]" + "=" + get_lcm(n1, n2));
    }
}
