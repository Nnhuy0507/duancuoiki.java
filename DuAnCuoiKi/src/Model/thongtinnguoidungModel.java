package Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

public class thongtinnguoidungModel<dsBenhnhan> {
	private String hovaten;
	private Date ngaysinh;
	private String sdt;
	private String diachi;
	private String manguoidung;
	public ArrayList dsBenhnhan;
	public String luachon3;
	public thongtinnguoidungModel(String hovaten, String sdt, Date ngaysinh, String diachi, String manguoidung) {
		super();
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		this.sdt = sdt;
		this.diachi = diachi;
		this.manguoidung = manguoidung;
	}
	
	public thongtinnguoidungModel(String hovaten, Date ngaysinh, String sdt, String diachi, String manguoidung,
			ArrayList dsBenhnhan, String luachon3) {
		super();
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		this.sdt = sdt;
		this.diachi = diachi;
		this.manguoidung = manguoidung;
		this.dsBenhnhan = dsBenhnhan;
		this.luachon3 = luachon3;
	}

	public void insert3(dsBenhnhan dsBenhnhan) {
    	this.dsBenhnhan.add(dsBenhnhan);
    }
	public void delete3(dsBenhnhan dsBenhnhan) {
    	this.dsBenhnhan.remove(dsBenhnhan);
    }
	 public void update3(dsBenhnhan dsBenhnhan) {
	    	this.dsBenhnhan.remove(dsBenhnhan);
	    	this.dsBenhnhan.add(dsBenhnhan);
	    }
	 
	public ArrayList getDsBenhnhan() {
		return dsBenhnhan;
	}

	public void setDsBenhnhan(ArrayList dsBenhnhan) {
		this.dsBenhnhan = dsBenhnhan;
	}

	public String getLuachon3() {
		return luachon3;
	}

	public void setLuachon3(String luachon3) {
		this.luachon3 = luachon3;
	}

	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getManguoidung() {
		return manguoidung;
	}
	public void setManguoidung(String manguoidung) {
		this.manguoidung = manguoidung;
	}
	@Override
	public String toString() {
		return "thongtinnguoidungModel [hovaten=" + hovaten + ", ngaysinh=" + ngaysinh + ", sdt=" + sdt + ", diachi="
				+ diachi + ", manguoidung=" + manguoidung + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(diachi, hovaten, manguoidung, ngaysinh, sdt);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		thongtinnguoidungModel other = (thongtinnguoidungModel) obj;
		return Objects.equals(diachi, other.diachi) && Objects.equals(hovaten, other.hovaten)
				&& Objects.equals(manguoidung, other.manguoidung) && Objects.equals(ngaysinh, other.ngaysinh)
				&& Objects.equals(sdt, other.sdt);
	}
	
	

}
