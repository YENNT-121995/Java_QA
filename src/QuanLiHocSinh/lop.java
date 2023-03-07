package QuanLiHocSinh;

import java.util.ArrayList;
import java.util.List;

public class lop {
	private String ten_lop;
	private List<hocsinh> listHocSinh = new ArrayList<>();
	
	public void add_hs(hocsinh hs) {
		listHocSinh.add(hs);
	}

	public String getTen_lop() {
		return ten_lop;
	}

	public void setTen_lop(String ten_lop) {
		this.ten_lop = ten_lop;
	}

	public List<hocsinh> getListHocSinh() {
		return listHocSinh;
	}

	public void setListHocSinh(List<hocsinh> listHocSinh) {
		this.listHocSinh = listHocSinh;
	}
	
//
//	public void add_hocsinh() {
//		List<hocsinh> listHocSinh = new ArrayList<hocsinh>();
//		listHocSinh.add(new hocsinh("nguyen thi C", 28, "Quang Nam"));
//		listHocSinh.add(new hocsinh("nguyen thi A ", 18, "Da Nang"));
//		listHocSinh.add(new hocsinh("nguyen thi B", 20, "Hue"));
//		
//		hocsinh hs_1 = new hocsinh();
//	}

}
