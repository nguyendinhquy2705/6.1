package baitap;

import java.util.Scanner;

public class BaiTapHamVaMang {
	   public static void main(String[] args) {
	        bai1();
	        bai2();
	        bai3();
	        bai5();
	        bai6();
	        bai7();
	    }

	    // Bài 1: Tính tổng hai số
	    public static void bai1() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap so thu nhat: ");
	        int a = sc.nextInt();

	        System.out.print("Nhap so thu hai: ");
	        int b = sc.nextInt();

	        System.out.println("Tong = " + (a + b));
	    }
	    // Bài 2: Diện tích hình chữ nhật
	    public static void bai2() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap chieu dai: ");
	        double dai = sc.nextDouble();

	        System.out.print("Nhap chieu rong: ");
	        double rong = sc.nextDouble();

	        double S = dai * rong;

	        System.out.println("Dien tich = " + S);
	    }

	    // Bài 3: Thể tích khối lập phương
	    public static void bai3() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap canh a: ");
	        double a = sc.nextDouble();

	        double V = a * a * a;

	        System.out.println("The tich = " + V);
	    }

	    // Bài 5: Tổng từ 1 đến n
	    public static void bai5() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int sum = 0;

	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }

	        System.out.println("Tong tu 1 den n = " + sum);
	    }

	    // Bài 6: Kiểm tra chẵn lẻ
	    public static void bai6() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap so: ");
	        int n = sc.nextInt();

	        if (n % 2 == 0)
	            System.out.println("So chan");
	        else
	            System.out.println("So le");
	    }

	    // Bài 7: Đếm số chẵn và lẻ trong mảng
	    public static void bai7() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int[] a = new int[n];
	        int chan = 0, le = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.print("a" + (i + 1) + " = ");
	            a[i] = sc.nextInt();

	            if (a[i] % 2 == 0)
	                chan++;
	            else
	                le++;
	        }

	        System.out.println("So chan = " + chan);
	        System.out.println("So le = " + le);
	    }
	}
