package Model;

import java.util.ArrayList;
import java.util.Objects;

public class danhmucspModel<danhmucsp> {
	private String manhom;
	private String tennhom;
	private String ghichu;
	public ArrayList danhmucsp;
	public String luachon4;
	public danhmucspModel(String manhom, String tennhom, String ghichu) {
		super();
		this.manhom = manhom;
		this.tennhom = tennhom;
		this.ghichu = ghichu;
	}
	
	public ArrayList getDanhmucsp() {
		return danhmucsp;
	}
	public void setDanhmucsp(ArrayList danhmucsp) {
		this.danhmucsp = danhmucsp;
	}
	public String getLuachon4() {
		return luachon4;
	}
	public void setLuachon4(String luachon4) {
		this.luachon4 = luachon4;
	}
	public danhmucspModel(String manhom, String tennhom, String ghichu, ArrayList danhmucsp, String luachon4) {
		super();
		this.manhom = manhom;
		this.tennhom = tennhom;
		this.ghichu = ghichu;
		this.danhmucsp = danhmucsp;
		this.luachon4 = luachon4;
	}
	public void insert4(danhmucsp danhmucsp) {
    	this.danhmucsp.add(danhmucsp);
    }
	public void delete4(danhmucsp danhmucsp) {
    	this.danhmucsp.remove(danhmucsp);
    }
	 public void update4(danhmucsp danhmucsp) {
	    	this.danhmucsp.remove(danhmucsp);
	    	this.danhmucsp.add(danhmucsp);
	    }
	public String getManhom() {
		return manhom;
	}
	public void setManhom(String manhom) {
		this.manhom = manhom;
	}
	public String getTennhom() {
		return tennhom;
	}
	public void setTennhom(String tennhom) {
		this.tennhom = tennhom;
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ghichu, manhom, tennhom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		danhmucspModel other = (danhmucspModel) obj;
		return Objects.equals(ghichu, other.ghichu) && Objects.equals(manhom, other.manhom)
				&& Objects.equals(tennhom, other.tennhom);
	}
	@Override
	public String toString() {
		return "danhmucspModel [manhom=" + manhom + ", tennhom=" + tennhom + ", ghichu=" + ghichu + "]";
	}

}
