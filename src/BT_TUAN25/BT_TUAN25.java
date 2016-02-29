package BT_TUAN25;

import java.util.ArrayList;
import java.util.Scanner;

public class BT_TUAN25 {
	public void menu() {
		System.out.println("Chọn chức năng:");
		System.out.println("1. IN TAM GIAC SAO");
		System.out.println("2. GIẢI PHƯƠNG TRÌNH BẬC 2");
		System.out.println("3. KIỂM TRA SỐ NGÀY TRONG THÁNG");
		System.out.println("4. IN RA MÀN HÌNH TẤT CẢ HỢP SỐ < n");
		System.out.println("5. IN RA TẤT CẢ CÁC SỐ NGUYÊN TỐ <N");
		System.out.println("6. IN RA MÀN HÌNH CÁC SỐ TỪ N,M (N<M) ĐỒNG THỜI CHIA HẾT CHO 3,5,7");
		System.out.println("7. IN RA MÀN HÌNH TỔNG S=1/1! + 1/2! + 1/3! +...+ 1/n!");
		System.out.println("8. IN RA SỐ HỌC SINH CÓ TÊN LÀ \"Tên\"");
		System.out.println("9. THOÁT");
	}

	public void inTamGiacSao() {
		System.out.println("Nhập chiều cao của tam giác");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n > 24 || n < 2) {
			System.out.println("Nhập lại chiều cao của tam giác ( 2<= h <=24)");
			n = sc.nextInt();
		}
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (((j <= n - i) || (j >= n + i)) || ((n - i + 1) < j && j < (n + i - 1)))
					System.out.print(" ");
				else
					System.out.print("*");

			}
			System.out.println();
		}
		for (int i = 0; i <= n * 2 - 1; i++) {
			if (i % 2 == 0) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();

	}

	public void giaiPhuongTrinhBac2() {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hệ số a của phương trình ax2+bx+c=0");
		a = sc.nextInt();
		System.out.println("Nhập hệ số b của phương trình ax2+bx+c=0");
		b = sc.nextInt();
		System.out.println("Nhập hệ số c của phương trình ax2+bx+c=0");
		c = sc.nextInt();
		int delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (delta == 0) {
			int x = (-b) / (2 * a);
			System.out.println("Phương trình có nghiêm duy nhất : " + x);
		} else {
			int x1, x2;
			x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có nghiêm x1= " + x1 + ",x2= " + x2);
		}

	}

	public void tinhNgayTrongThang() {
		int thang, nam;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tháng:");
		thang = sc.nextInt();
		System.out.println("Nhập năm");
		nam = sc.nextInt();
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng có 31 ngày");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng có 30 ngày");
			break;
		case 2:
			if (nam % 400 == 0 || nam % 4 == 0 && nam % 100 != 0)
				System.out.println("Tháng có 29 ngày");
			else
				System.out.println("Tháng có 28 ngày");
			break;
		default:
			System.out.println("Tháng không hợp lệ");
		}

	}

	public void timHopSo() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n: ");
		n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println(" " + i);
					break;
				}
			}
		}

	}

	public void timSoNguyenTo() {
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n: ");
		n = sc.nextInt();
		System.out.println(" 1");
		for (i = 2; i < n; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j)
				System.out.println(" " + i);
		}
	}

	public void timSoChiaHet3Va5va7() {
		int m = 0, n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n:");
		n = sc.nextInt();
		System.out.println("Nhập sô m: (m>n)");
		m = sc.nextInt();
		while (m <= n) {
			System.out.println("Nhập lại số m: (m>n)");
			m = sc.nextInt();

		}
		for (int i = n; i < m; i++) {
			if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
				System.out.println(" " + i);
			}
		}

	}

	public int giaiThua(int n) {
		int ket_qua = 1;
		for (int i = 1; i <= n; i++) {
			ket_qua = ket_qua * i;
		}
		return ket_qua;
	}

	public void tinhTong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n:");
		int n = sc.nextInt();
		float s = 1;
		for (int i = 1; i <= n; i++) {
			s = s + 1f / giaiThua(i);
		}
		System.out.println("1 + 1/1! + 1/2! + 1/3! +...+1/n!= " + s);
	}

	public void demHocSinh() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên");
		n = sc.nextInt();
		System.out.println("Nhập tên sinh viên:");
		ArrayList<String> ds_sv = new ArrayList<String>();
		String ten;
		for (int i = 1; i <= n; i++) {
			ten = sc.nextLine();
			ds_sv.add(ten);
		}
		int s = 0;
		String[] c;
		for (int i = 0; i < n; i++) {
			ten = ds_sv.get(i);
			c = ten.split(" ");
			if (c[c.length - 1].equals("Ten")) {
				s++;
			}
		}
		System.out.println("Số sinh viên có tên là \"Tên\": " + s);

	}

	public static void main(String[] args) {
		BT_TUAN25 program = new BT_TUAN25();
		program.menu();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 9) {
			switch (n) {
			case 1:
				program.inTamGiacSao();
				break;
			case 2:
				program.giaiPhuongTrinhBac2();
				break;
			case 3:
				program.tinhNgayTrongThang();
				break;
			case 4:
				program.timHopSo();
				break;
			case 5:
				program.timSoNguyenTo();
				break;
			case 6:
				program.timSoChiaHet3Va5va7();
				break;
			case 7:
				program.tinhTong();
				break;
			case 8:
				program.demHocSinh();
				break;
			case 9:
				return;
			default:
				System.out.println("Không có chức năng bạn vưa chọn");
				break;
			}
			program.menu();
			n = sc.nextInt();
		}
	}

}
