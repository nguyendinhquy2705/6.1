package baitap;

import java.util.Scanner;

public class BaiTapBuoi8 {

	public static void main(String[] args) {
			bai1();
			bai2();
			bai3();
			bai4();
	}

	public static void bai1(){
	Scanner sc = new Scanner(System.in);

	System.out.print("Nhap loai xe (1-Car, 2-SUV, 3-Black): ");
	int loai = sc.nextInt();

	 System.out.print("Nhap so km: ");
	double km = sc.nextDouble();

	System.out.print("Nhap thoi gian cho (phut): ");
	int cho = sc.nextInt();

	double kmDau = 0, km1_19 = 0, kmTren19 = 0, giaCho = 0;

	 // Chọn giá theo loại xe
	if (loai == 1) {
		kmDau = 8000;
		km1_19 = 7500;
		kmTren19 = 7000;
		giaCho = 2000;
	} else if (loai == 2) {
		kmDau = 9000;
		km1_19 = 8500;
		kmTren19 = 8000;
		giaCho = 3000;
	} else if (loai == 3) {
		 kmDau = 10000;
		 km1_19 = 9500;
		 kmTren19 = 9000;
		 giaCho = 3500;
		 } else {
	System.out.println("Loai xe khong hop le!");
		return;
		 }

 // Tính tiền km
	double tienKm;
	if (km <= 1) {
	tienKm = kmDau;
	} else if (km <= 19) {
	 tienKm = kmDau + (km - 1) * km1_19;
	} else {
		tienKm = kmDau + 18 * km1_19 + (km - 19) * kmTren19;
		   }
 // Tính tiền chờ
	double tienCho = 0;
	if (cho > 3) {
	int soLan = (int) Math.ceil((cho - 3) / 3.0);
	tienCho = soLan * giaCho;
	}
 // Tổng tiền
	double tong = tienKm + tienCho;

	System.out.println("Tien KM: " + tienKm);
	System.out.println("Tien cho: " + tienCho);
	System.out.println("Tong tien: " + tong);
}
	
//bai2:
	public static void bai2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CHON LOAI GRAB =====");
        System.out.println("1. GrabCar");
        System.out.println("2. GrabSUV");
        System.out.println("3. GrabBlack");
        System.out.print("Nhap loai xe: ");
        int loai = sc.nextInt();

        System.out.print("Nhap so km di duoc: ");
        double km = sc.nextDouble();

        System.out.print("Nhap thoi gian cho (phut): ");
        int cho = sc.nextInt();

        double giaKmDau = 0;
        double giaKm1_19 = 0;
        double giaKmTren19 = 0;
        double giaCho = 0;

        String tenXe = "";

        // Xác định giá theo loại xe
        if (loai == 1) {
            tenXe = "GrabCar";
            giaKmDau = 8000;
            giaKm1_19 = 7500;
            giaKmTren19 = 7000;
            giaCho = 2000;
        } else if (loai == 2) {
            tenXe = "GrabSUV";
            giaKmDau = 9000;
            giaKm1_19 = 8500;
            giaKmTren19 = 8000;
            giaCho = 3000;
        } else if (loai == 3) {
            tenXe = "GrabBlack";
            giaKmDau = 10000;
            giaKm1_19 = 9500;
            giaKmTren19 = 9000;
            giaCho = 3500;
        } else {
            System.out.println("Loai xe khong hop le!");
            return;
        }
        // ====== TÍNH TIỀN KM CHI TIẾT ======
        double tienKmDau = 0;
        double tienKm1_19 = 0;
        double tienKmTren19 = 0;

        if (km <= 1) {
            tienKmDau = giaKmDau;
        } else if (km <= 19) {
            tienKmDau = giaKmDau;
            tienKm1_19 = (km - 1) * giaKm1_19;
        } else {
            tienKmDau = giaKmDau;
            tienKm1_19 = 18 * giaKm1_19;
            tienKmTren19 = (km - 19) * giaKmTren19;
        }

        double tongTienKm = tienKmDau + tienKm1_19 + tienKmTren19;

        // ====== TÍNH TIỀN CHỜ ======
        double tienCho = 0;
        int soLanCho = 0;
        if (cho > 3) {
            soLanCho = (int) Math.ceil((cho - 3) / 3.0);
            tienCho = soLanCho * giaCho;
        }

        // ====== TỔNG TIỀN ======
        double tongTien = tongTienKm + tienCho;

        // ====== IN HÓA ĐƠN ======
        System.out.println("\n========== HOA DON GRAB ==========");
        System.out.println("Loai xe: " + tenXe);
        System.out.println("So km: " + km + " km");
        System.out.println("Thoi gian cho: " + cho + " phut");
        System.out.println("----------------------------------");

        System.out.println("1 km dau: " + tienKmDau + " VND");

        if (km > 1) {
            System.out.println("Km tu 1 den 19: " + tienKm1_19 + " VND");
        }

        if (km > 19) {
            System.out.println("Km tren 19: " + tienKmTren19 + " VND");
        }

        System.out.println("Tien cho: " + tienCho + " VND");
        System.out.println("----------------------------------");
        System.out.println("TONG tien: " + tongTien + " VND");
        System.out.println("==================================");
    }
	
//bai3:
	public static int timSoLonNhat(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void kiemTraChanLe(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
    }

    public static int tinhTong3So(int a, int b, int c) {
        return a + b + c;
    }

    public static int cong(int a, int b) {
        return a + b;
    }

    public static int tru(int a, int b) {
        return a - b;
    }

    public static int nhan(int a, int b) {
        return a * b;
    }

    public static int chia(int a, int b) {
        return a / b;
    }

    public static void bai3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== BAI 3 =====");

        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.print("Nhap c: ");
        int c = sc.nextInt();

        int max = timSoLonNhat(a, b, c);
        System.out.println("So lon nhat trong 3 so la: " + max);

        System.out.print("\nNhap 1 so de kiem tra chan le: ");
        int n = sc.nextInt();
        kiemTraChanLe(n);

        int tong = tinhTong3So(a, b, c);
        System.out.println("Tong 3 so a + b + c = " + tong);

        System.out.println("\n===== MAY TINH DON GIAN =====");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.print("Nhap lua chon: ");
        int chon = sc.nextInt();

        System.out.print("Nhap so thu nhat: ");
        int x = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int y = sc.nextInt();

        int ketQua = 0;

        if (chon == 1) {
            ketQua = cong(x, y);
        } else if (chon == 2) {
            ketQua = tru(x, y);
        } else if (chon == 3) {
            ketQua = nhan(x, y);
        } else if (chon == 4) {
            if (y == 0) {
                System.out.println("Khong the chia cho 0!");
                return;
            }
            ketQua = chia(x, y);
        } else {
            System.out.println("Lua chon khong hop le!");
            return;
        }

        System.out.println("Ket qua = " + ketQua);
    }
    
    public static void bai4() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap tong thu nhap nam (trieu): ");
        double tongThuNhap = sc.nextDouble();

        System.out.print("Nhap so nguoi phu thuoc: ");
        int soNguoiPhuThuoc = sc.nextInt();

        // Tính thu nhập chịu thuế
        double thuNhapChiuThue = tongThuNhap - 4 - soNguoiPhuThuoc * 1.6;

        if (thuNhapChiuThue < 0) {
            thuNhapChiuThue = 0;
        }

        // Xác định thuế suất
        double thueSuat;

        if (thuNhapChiuThue <= 60) {
            thueSuat = 5;
        } else if (thuNhapChiuThue <= 120) {
            thueSuat = 10;
        } else if (thuNhapChiuThue <= 210) {
            thueSuat = 15;
        } else if (thuNhapChiuThue <= 384) {
            thueSuat = 20;
        } else if (thuNhapChiuThue <= 624) {
            thueSuat = 25;
        } else if (thuNhapChiuThue <= 960) {
            thueSuat = 30;
        } else {
            thueSuat = 35;
        }

        // Tính thuế phải trả
        double thuePhaiTra = thuNhapChiuThue * thueSuat / 100;

        // In kết quả
        System.out.println("\n===== KET QUA TINH THUE =====");
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tong thu nhap nam: " + tongThuNhap + " trieu");
        System.out.println("So nguoi phu thuoc: " + soNguoiPhuThuoc);
        System.out.println("Thu nhap chiu thue: " + thuNhapChiuThue + " trieu");
        System.out.println("Thue suat: " + thueSuat + "%");
        System.out.println("Thue phai tra: " + thuePhaiTra + " trieu");
    }
}
