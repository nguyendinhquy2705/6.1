package baitap;

import java.util.Scanner;

public class BaiTap8 {
	    public static void main(String[] args) {
	        bai1();
	        bai11();
	        bai12();
	        bai2();
	        bai3();
	        bai4();
	        bai5();
	        bai6();
	        bai7();
	        bai8();
	    }
//bai1:
	    public static void bai1() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap so nguyen: ");
	        int n = sc.nextInt();

	        if (n >= 0)
	            System.out.println("Day la so nguyen duong");
	        else
	            System.out.println("Day la so nguyen am");
	    }

// Bài 1.1 - Chẵn lẻ
	    public static void bai11() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap so: ");
	        int n = sc.nextInt();

	        if (n % 2 == 0)
	            System.out.println("So chan");
	        else
	            System.out.println("So le");
	    }

// Bài 1.2 - Số nguyên tố
	    public static void bai12() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap so: ");
	        int n = sc.nextInt();

	        if (isPrime(n))
	            System.out.println("So nguyen to");
	        else
	            System.out.println("Khong phai so nguyen to");
	    }

	    public static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0)
	                return false;
	        }
	        return true;
	    }

//bai2:
	    public static void bai2() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap so tu 1 den 10: ");
	        int n = sc.nextInt();

	        switch (n) {
	            case 1: System.out.println("Mot"); break;
	            case 2: System.out.println("Hai"); break;
	            case 3: System.out.println("Ba"); break;
	            case 4: System.out.println("Bon"); break;
	            case 5: System.out.println("Nam"); break;
	            case 6: System.out.println("Sau"); break;
	            case 7: System.out.println("Bay"); break;
	            case 8: System.out.println("Tam"); break;
	            case 9: System.out.println("Chin"); break;
	            case 10: System.out.println("Muoi"); break;
	            default: System.out.println("Khong hop le");
	        }
	    }

//bai3:
	    public static void bai3() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int sum = 0;
	        for (int i = 0; i <= n; i++) {
	            if (i % 2 == 0)
	                sum += i;
	        }

	        System.out.println("Tong so chan tu 0 den n: " + sum);
	    }

//bai4:
	    public static void bai4() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        int sum = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.print("Phan tu " + i + ": ");
	            arr[i] = sc.nextInt();
	            sum += arr[i];
	        }

	        double avg = (double) sum / n;
	        System.out.println("Trung binh mang: " + avg);
	    }

//bai5:
	    public static void bai5() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Phan tu " + i + ": ");
	            arr[i] = sc.nextInt();
	        }

	        int max = arr[0];
	        int min = arr[0];

	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	            if (arr[i] < min)
	                min = arr[i];
	        }

	        System.out.println("Max: " + max);
	        System.out.println("Min: " + min);
	    }

//bai6:
	    public static void bai6() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap canh hinh vuong: ");
	        double a = sc.nextDouble();

	        System.out.println("Dien tich: " + dienTichHV(a));
	        System.out.println("Chu vi: " + chuViHV(a));
	    }

	    public static double dienTichHV(double a) {
	        return a * a;
	    }

	    public static double chuViHV(double a) {
	        return 4 * a;
	    }

//bai7:
	    public static void bai7() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Phan tu " + i + ": ");
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Mang vua nhap: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

//bai8:
	    public static void bai8() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Phan tu " + i + ": ");
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Cac so chan: ");
	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 2 == 0)
	                System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}
