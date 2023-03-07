package QuanLiHocSinh;

public class hocsinh{
	private String hoTen;
	private int tuoi;
	private String quequan;
	private lop a;
	
	

	public hocsinh(String hoTen, int tuoi, String quequan) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.quequan = quequan;

	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getQuequan() {
		return quequan;
	}

	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	
	public void displays_infor_hocsinh() {
		System.out.println(" Thông tin học sinh"+ hoTen + tuoi+ quequan);
	}


}
