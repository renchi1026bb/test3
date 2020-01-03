package com.demon;



import java.util.Scanner;

public class GCDLCM {
    // ���Լ��
    public static int get_gcd(int n1, int n2) {
        int gcd = 0;
        if (n1 < n2) {// ����n1��n2��ֵ
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

    // ��С������
    public static int get_lcm(int n1, int n2) {
        return n1 * n2 / get_gcd(n1, n2);
    }

    public static void main(String[] args) {
    	System.out.print("���Ա����޸� ");
        Scanner input = new Scanner(System.in);
        System.out.print("�������һ��������");
        int n1 = input.nextInt();
        System.out.print("������ڶ���������");
        int n2 = input.nextInt();
        System.out.println("(" + n1 + "," + n2 + ")" + "=" + get_gcd(n1, n2));
        System.out.println("[" + n1 + "," + n2 + "]" + "=" + get_lcm(n1, n2));
    }
}