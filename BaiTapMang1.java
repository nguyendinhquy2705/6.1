package baitap;

import java.util.Scanner;

public class BaiTapMang1 {

	public static void main(String[] args) {
		bai1();
		bai2();
		bai3();
		bai4();
		bai5();
		bai6();
		bai7();
		bai8();
		bai9();
		bai10();
		bai11();
		bai12();
		bai13();
		bai14();
		bai15();
		bai16();
		bai17();
		bai18();
		bai19();
		bai20();
	}
//bai1:
	public static void bai1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("So lon hon la: " + a);
        } else if (b > a) {
            System.out.println("So lon hon la: " + b);
        } else {
            System.out.println("Hai so bang nhau");
        }
	}
	
//bai2:
	public static void bai2() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0, count = 0;

        for (int i=0; i<n; i++){
            System.out.print("a" + (i + 1) +"= ");
            a[i] = sc.nextInt();

            if (a[i] % 2 != 0){
                sum += a[i];
                count++;
            }
        }

        if (count == 0) System.out.println("Khong co so le");
        else System.out.println("Trung binh cong so le = " + (double) sum / count);
    }

//bai3:
	public static void bai3() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("a" + (i + 1) +"= ");
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for (int i=1; i<n; i++) {
            if (a[i] > max) max = a[i];
        }

        System.out.println("So lon nhat = " + max);
    }
	
//bai4:
	public static void bai4() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("a" + (i + 1) +"= ");
            a[i] = sc.nextInt();
        }

        int min = a[0];
        for (int i=1; i<n; i++) {
            if (a[i] < min) min = a[i];
        }

        System.out.println("So nho nhat = " + min);
    }
//bai5:
	  public static void bai5() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int[] a = new int[n];
	        int sum = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.print("a" + (i + 1) +"= ");
	            a[i] = sc.nextInt();
	            sum += a[i];
	        }

	        System.out.println("Trung binh cong = " + (double) sum / n);
	  }
	  
//bai6:
	  public static void bai6() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int[] a = new int[n];
	        int dem = 0;

	        for (int i=0; i<n; i++) {
	            System.out.print("a" + (i + 1) +"= ");
	            a[i] = sc.nextInt();

	            if (a[i] % 2 == 0) 
	            	dem++;
	        }

	        System.out.println("So chan = " + dem);
	    }
//bai7:
	  public static void bai7() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Nhap n: ");
	        int n = sc.nextInt();

	        int[]a = new int[n];
	        int am = 0, duong = 0, zero = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.print("a" + (i + 1) +"= ");
	            a[i] = sc.nextInt();

	            if (a[i] > 0)
	            	duong++;
	            else if (a[i] < 0) 
	            	am++;
	            else zero++;
	        }

	        System.out.println("So duong = " + duong);
	        System.out.println("So am = " + am);
	        System.out.println("So 0 = " + zero);
	    }
//bai8:
	  public static void bai8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap n: ");
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
	    System.out.print("a" + (i + 1) +"= ");
	           a[i] = sc.nextInt();
	  }
	   System.out.print("Cac phan tu o vi tri chan: ");
	        for (int i = 0; i < n; i += 2) {
	            System.out.print(a[i] + " ");
	        }
	    }
//bai9:
	  public static void bai9() {
		  Scanner sc = new Scanner(System.in);

		  System.out.print("Nhap n: ");
		   int n = sc.nextInt();
		   int[] a = new int[n];
		   for (int i = 0; i < n; i++) {
		  System.out.print("a" + (i + 1) +"= ");
		       a[i] = sc.nextInt();
	}
		  System.out.print("Cac phan tu o vi tri le: ");
		          for (int i = 1; i < n; i += 2) {
		              System.out.print(a[i] + " ");
	 }
		}
//bai10:
	  public static void bai10() {
		  Scanner sc = new Scanner(System.in);

		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			            System.out.print("a[" + i + "] = ");
			            a[i] = sc.nextInt();
			        }
		boolean timThay = false;
		for (int i = 0; i < n; i++) {
		if (a[i] > 10) {
		System.out.println("Phan tu dau tien > 10 la: " + a[i]);
			   timThay = true;
			     break;
	}
		}
		if (!timThay) {
		System.out.println("Khong co phan tu nao lon hon 10");
			        }
}
//bai11:
	  public static void bai11() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n: ");
		    int n = sc.nextInt();
		    int[] a = new int[n];

		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		    }

		    System.out.print("Nhap x: ");
		    int x = sc.nextInt();

		    int dem = 0;
		    for (int i = 0; i < n; i++) {
		        if (a[i] == x) dem++;
		    }

		    System.out.println("So lan xuat hien = " + dem);
		}
//bai12:
	  public static void bai12() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n: ");
		    int n = sc.nextInt();
		    int[] a = new int[n];

		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		    }

		    System.out.print("Nhap x: ");
		    int x = sc.nextInt();

		    boolean tonTai = false;

		    for (int i = 0; i < n; i++) {
		        if (a[i] == x) {
		            tonTai = true;
		            break;
		        }
		    }

		    if (tonTai) System.out.println("Co ton tai");
		    else System.out.println("Khong ton tai");
		}
//bai13:
	  public static void bai13() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n: ");
		    int n = sc.nextInt();
		    int[] a = new int[n];

		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		    }

		    System.out.print("Mang dao nguoc: ");
		    for (int i = n - 1; i >= 0; i--) {
		        System.out.print(a[i] + " ");
		    }
		}
 //bai14:
	  public static void bai14() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n: ");
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int[] b = new int[n];

		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		        b[i] = a[i];
		    }

		    System.out.print("Mang sao chep: ");
		    for (int i = 0; i < n; i++) {
		        System.out.print(b[i] + " ");
		    }
		}
//bai15:
	  public static void bai15() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n: ");
		    int n = sc.nextInt();
		    int[] a = new int[n];

		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		    }

		    for (int i = 0; i < n - 1; i++) {
		        for (int j = 0; j < n - 1 - i; j++) {
		            if (a[j] > a[j + 1]) {
		                int temp = a[j];
		                a[j] = a[j + 1];
		                a[j + 1] = temp;
		            }
		        }
		    }

		    System.out.print("Tang dan: ");
		    for (int i = 0; i < n; i++) {
		        System.out.print(a[i] + " ");
		    }
		}
//bai16:
	  public static void bai16() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n: ");
		    int n = sc.nextInt();
		    int[] a = new int[n];

		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		    }

		    for (int i = 0; i < n - 1; i++) {
		        for (int j = 0; j < n - 1 - i; j++) {
		            if (a[j] < a[j + 1]) {
		                int temp = a[j];
		                a[j] = a[j + 1];
		                a[j + 1] = temp;
		            }
		        }
		    }

		    System.out.print("Giam dan: ");
		    for (int i = 0; i < n; i++) {
		        System.out.print(a[i] + " ");
		    }
		}
//bai17:
	  public static void bai17() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n: ");
		    int n = sc.nextInt();
		    int[] a = new int[n];

		    int sum = 0;

		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		        if (a[i] % 3 == 0) sum += a[i];
		    }

		    System.out.println("Tong chia het cho 3 = " + sum);
		}
//bai18:
	  public static void bai18() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n: ");
		    int n = sc.nextInt();
		    int[] a = new int[n];

		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		    }

		    System.out.print("Nhap vi tri k: ");
		    int k = sc.nextInt();

		    for (int i = k; i < n - 1; i++) {
		        a[i] = a[i + 1];
		    }

		    n--;

		    System.out.print("Mang sau khi xoa: ");
		    for (int i = 0; i < n; i++) {
		        System.out.print(a[i] + " ");
		    }
		}
//bai19:
	  public static void bai19() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n1: ");
		    int n1 = sc.nextInt();
		    int[] a = new int[n1];

		    for (int i = 0; i < n1; i++) {
		        a[i] = sc.nextInt();
		    }

		    System.out.print("Nhap n2: ");
		    int n2 = sc.nextInt();
		    int[] b = new int[n2];

		    for (int i = 0; i < n2; i++) {
		        b[i] = sc.nextInt();
		    }

		    int[] c = new int[n1 + n2];

		    for (int i = 0; i < n1; i++) {
		        c[i] = a[i];
		    }

		    for (int i = 0; i < n2; i++) {
		        c[n1 + i] = b[i];
		    }

		    System.out.print("Mang sau khi gop: ");
		    for (int i = 0; i < c.length; i++) {
		        System.out.print(c[i] + " ");
		    }
		}
//bai20:
	  public static void bai20() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Nhap n: ");
		    int n = sc.nextInt();
		    int[] a = new int[n];

		    for (int i = 0; i < n; i++) {
		        a[i] = sc.nextInt();
		    }

		    int max1 = a[0];
		    int max2 = a[1];

		    if (max2 > max1) {
		        int temp = max1;
		        max1 = max2;
		        max2 = temp;
		    }

		    for (int i = 2; i < n; i++) {
		        if (a[i] > max1) {
		            max2 = max1;
		            max1 = a[i];
		        } else if (a[i] > max2) {
		            max2 = a[i];
		        }
		    }

		    System.out.println("Hai so lon nhat: " + max1 + " va " + max2);
		}
}