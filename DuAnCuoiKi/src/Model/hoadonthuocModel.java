package Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

public class hoadonthuocModel<dsdonthuoc> {
	public ArrayList dsdonthuoc;
	private String madonthuoc;
	private String tensp;
	private String soluong1;
	private Date hansudung;
	private String hdsudung;
	private String manguoidung1;
	public String Luachon1;
	
	public hoadonthuocModel( String madonthuoc, String tensp, String soluong1, Date hansudung,
			String hdsudung, String manguoidung1) {
		super();
		this.dsdonthuoc = dsdonthuoc;
		this.madonthuoc = madonthuoc;
		this.tensp = tensp;
		this.soluong1 = soluong1;
		this.hansudung = hansudung;
		this.hdsudung = hdsudung;
		this.manguoidung1 = manguoidung1;
		
	}

	public hoadonthuocModel(String madonthuoc, String tensp, String soluong1,  String hdsudung,
			String manguoidung1,String luachon1) {
		this.dsdonthuoc = dsdonthuoc;
		this.madonthuoc = madonthuoc;
		this.tensp = tensp;
		this.soluong1 = soluong1;
		this.hansudung = hansudung;
		this.hdsudung = hdsudung;
		this.manguoidung1 = manguoidung1;
		Luachon1 = luachon1;
	}

	public hoadonthuocModel(String string, String string2, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public ArrayList getDsdonthuoc() {
		return dsdonthuoc;
	}

	public void setDsdonthuoc(ArrayList dsdonthuoc) {
		this.dsdonthuoc = dsdonthuoc;
	}
	 public void insert1(dsdonthuoc dsdonthuoc) {
	    	this.dsdonthuoc.add(dsdonthuoc);
	    }
	 public void delete1(dsdonthuoc dsdonthuoc) {
	    	this.dsdonthuoc.remove(dsdonthuoc);
	    }
	 public void update1(dsdonthuoc dsdonthuoc) {
	    	this.dsdonthuoc.remove(dsdonthuoc);
	    	this.dsdonthuoc.add(dsdonthuoc);
	    }
	 public String getLuachon() {
			return Luachon1;
		}

		public void setLuachon(String luachon1) {
			Luachon1 = luachon1;
		}


	
	public String getMadonthuoc() {
		return madonthuoc;
	}
	public void setMadonthuoc(String madonthuoc) {
		this.madonthuoc = madonthuoc;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public String getSoluong() {
		return soluong1;
	}
	public void setSoluong(String soluong) {
		this.soluong1 = soluong;
	}
	public Date getHansudung() {
		return hansudung;
	}
	public void setHansudung(Date hansudung) {
		this.hansudung = hansudung;
	}
	public String getHdsudung() {
		return hdsudung;
	}
	public void setHdsudung(String hdsudung) {
		this.hdsudung = hdsudung;
	}
	public String getSoluong1() {
		return soluong1;
	}
	public void setSoluong1(String soluong1) {
		this.soluong1 = soluong1;
	}
	public String getManguoidung1() {
		return manguoidung1;
	}
	public void setManguoidung1(String manguoidung1) {
		this.manguoidung1 = manguoidung1;
	}
	@Override
	public String toString() {
		return "hoadonthuocModel [madonthuoc=" + madonthuoc + ", tensp=" + tensp + ", soluong1=" + soluong1
				+ ", hansudung=" + hansudung + ", hdsudung=" + hdsudung + ", manguoidung1=" + manguoidung1 + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(hansudung, hdsudung, madonthuoc, manguoidung1, soluong1, tensp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		hoadonthuocModel other = (hoadonthuocModel) obj;
		return Objects.equals(hansudung, other.hansudung) && Objects.equals(hdsudung, other.hdsudung)
				&& Objects.equals(madonthuoc, other.madonthuoc) && Objects.equals(manguoidung1, other.manguoidung1)
				&& Objects.equals(soluong1, other.soluong1) && Objects.equals(tensp, other.tensp);
	}

	public void setLuachon1(String string) {
		// TODO Auto-generated method stub
		
	}

}
