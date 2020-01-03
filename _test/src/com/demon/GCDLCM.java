package com.demon;



import java.util.Scanner;

public class GCDLCM {
    // 鏈�澶у叕绾︽暟
    public static int get_gcd(int n1, int n2) {
        int gcd = 0;
        if (n1 < n2) {// 浜ゆ崲n1銆乶2鐨勫��
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

    // 鏈�灏忓叕鍊嶆暟
    public static int get_lcm(int n1, int n2) {
        return n1 * n2 / get_gcd(n1, n2);
    }

    public static void main(String[] args) {
    	System.out.print("测试本地修改 ");
        System.out.print("娴嬭瘯");
        Scanner input = new Scanner(System.in);
        System.out.print("璇疯緭鍏ョ涓�涓暣鏁帮細");
        int n1 = input.nextInt();
        System.out.print("璇疯緭鍏ョ浜屼釜鏁存暟锛�");
        int n2 = input.nextInt();
        System.out.println("(" + n1 + "," + n2 + ")" + "=" + get_gcd(n1, n2));
        System.out.println("[" + n1 + "," + n2 + "]" + "=" + get_lcm(n1, n2));
    }
}
