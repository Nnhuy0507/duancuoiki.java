package Model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

public class quanlikhothuoc<dslohang> {
	private int solohang;
	private Date ngaynhapkho;
	private Date ngayhethan;
	private int soluong;
	private String nhacungcap;
	public ArrayList dslohang;
	public String luachon2;
	
	
	public quanlikhothuoc(int solohang, Date ngaynhapkho, Date ngayhethan, int soluong, String nhacungcap,
			ArrayList dslohang, String luachon2) {
		super();
		this.solohang = solohang;
		this.ngaynhapkho = ngaynhapkho;
		this.ngayhethan = ngayhethan;
		this.soluong = soluong;
		this.nhacungcap = nhacungcap;
		this.dslohang = dslohang;
		this.luachon2 = luachon2;
	}

	public quanlikhothuoc(int solohang2, Date ngaynhapkho2, Date ngayhethan2, int soluong2, String nhacungcap2) {
		// TODO Auto-generated constructor stub
	}

	public ArrayList getDslohang() {
		return dslohang;
	}

	public void setDslohang(ArrayList dslohang) {
		this.dslohang = dslohang;
	}

	public String getLuachon2() {
		return luachon2;
	}

	public void setLuachon2(String luachon2) {
		this.luachon2 = luachon2;
	}

	public void insert2(dslohang dslohang) {
    	this.dslohang.add(dslohang);
    }
	  public void delete2(dslohang dslohang) {
	    	this.dslohang.remove(dslohang);
	    }
	  public void update2(dslohang dslohang) {
	    	this.dslohang.remove(dslohang);
	    	this.dslohang.add(dslohang);
	    }
	  
	
	public int getSolohang() {
		return solohang;
	}

	public void setSolohang(int solohang) {
		this.solohang = solohang;
	}

	public Date getNgaynhapkho() {
		return ngaynhapkho;
	}

	public void setNgaynhapkho(Date ngaynhapkho) {
		this.ngaynhapkho = ngaynhapkho;
	}

	public Date getNgayhethan() {
		return ngayhethan;
	}

	public void setNgayhethan(Date ngayhethan) {
		this.ngayhethan = ngayhethan;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getNhacungcap() {
		return nhacungcap;
	}

	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
	}

	@Override
	public String toString() {
		return "quanlikhothuoc [solohang=" + solohang + ", ngaynhapkho=" + ngaynhapkho + ", ngayhethan=" + ngayhethan
				+ ", soluong=" + soluong + ", nhacungcap=" + nhacungcap + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ngayhethan, ngaynhapkho, nhacungcap, solohang, soluong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		quanlikhothuoc other = (quanlikhothuoc) obj;
		return Objects.equals(ngayhethan, other.ngayhethan) && Objects.equals(ngaynhapkho, other.ngaynhapkho)
				&& Objects.equals(nhacungcap, other.nhacungcap) && solohang == other.solohang
				&& soluong == other.soluong;
	}

}
