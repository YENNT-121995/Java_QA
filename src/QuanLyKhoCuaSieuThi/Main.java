package QuanLyKhoCuaSieuThi;

import QuanLiHocSinh.hocsinh;
import QuanLiHocSinh.lop;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		hocsinh hs1 = new hocsinh("nguyen thi C", 28, "Quang Nam");

		lop l = new lop();
		l.add_hs(hs1);
		l.add_hs(new hocsinh("nguyen thi A ", 18, "Da Nang"));

//		hs1.displays_infor_hocsinh();
//		System.out.println("====\t\n");
//		for (hocsinh sv : l.getListHocSinh()) {
//			sv.displays_infor_hocsinh();
//		}

		for (hocsinh sv : l.getListHocSinh()) {
			if (sv.getQuequan() == "Da Nang") {
				sv.displays_infor_hocsinh();
			}
		}

	}

}
