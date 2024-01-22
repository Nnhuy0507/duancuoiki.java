package Controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.*;
import java.sql.Date;

import View.qlthuoc;
import javax.swing.Action;
import javax.swing.JOptionPane;

import Model.danhmucspModel;
import Model.hoadonthuocModel;
import Model.quanlikhothuoc;
import Model.thongtinnguoidungModel;

public class qlthuocController implements Action{
	private qlthuoc qlthuoc;
	public qlthuoc View;
	public quanlikhothuoc kho;
	public danhmucspModel danhmuc;
	public hoadonthuocModel donthuoc;
	public thongtinnguoidungModel nguoidung;  

	public qlthuocController(View.qlthuoc qlthuoc) {
		this.qlthuoc = qlthuoc;
		this.View = qlthuoc;
		}
	

	public qlthuocController() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showInputDialog( View, "Bạn vừa nhấn vào: " + cm);
        if(cm.equals("Thêm")) {
        	this.View.xoaForm();
            //this.View.model.setLuachon1("Thêm ");
        	
        } else if(cm.equals("Lưu")) {
        	try {
        		int solohang = Integer.valueOf(this.View.jt_solohang.getText());
        		Date ngaynhapkho = Date.valueOf(this.View.jt_ngaynhapkho.getText());
        		Date ngayhethan = Date.valueOf(this.View.jt_ngayhethan.getText());
        		int soluong = Integer.valueOf(this.View.jt_soluong.getText());
        		String nhacungcap = String.valueOf(this.View.jt_nhacungcap.getText());
        		
        		String manhom = String.valueOf(this.View.jt_manhom.getText());
        		String tennhom = String.valueOf(this.View.jt_tennhom.getText());
        		String ghichu = String.valueOf(this.View.jt_ghichu.getText());
        		
        		String madonthuoc = String.valueOf(this.View.jt_madonthuoc.getText());
        		String tensp = String.valueOf(this.View.jt_tensp.getText());
        		String soluong1 = String.valueOf(this.View.jt_soluong.getText());
        		Date hansudung = Date.valueOf(this.View.jt_hansudung.getText());
        		String hdsudung = String.valueOf(this.View.jt_cachsudung.getText());
        		String manguoidung1 = String.valueOf(this.View.jt_manguoidung1.getText());

        		String manguoidung = String.valueOf(this.View.jt_manguoidung.getText());
        		String hovaten = String.valueOf(this.View.jt_hovaten.getText());
        		Date ngaysinh = Date.valueOf(this.View.jt_ngaysing.getText());
        		String sdt = String.valueOf(this.View.jt_sdt.getText());
        		String diachi = String.valueOf(this.View.jt_diachi.getText());
        		
        		kho = new quanlikhothuoc(solohang ,ngaynhapkho, ngayhethan, soluong, nhacungcap);
        		
        		danhmuc = new danhmucspModel(manhom, tennhom, ghichu);
        		
        		donthuoc = new hoadonthuocModel(madonthuoc, tensp,soluong1,hansudung,hdsudung,manguoidung1);
        		
        		nguoidung = new thongtinnguoidungModel(manguoidung, hovaten, ngaysinh, sdt, diachi);
       		if(this.View.model.getLuachon().equals("") ||this.View.model.getLuachon().equals("Thêm ")) 
        		{
//        			this.View.them(kho);
//        			this.View.them(danhmuc);
        			this.View.them(donthuoc);
//       			this.View.them(nguoidung);
        		}else if(this.View.model.getLuachon().equals("Sủa")) {
        			this.View.sua(kho);
         			this.View.sua(danhmuc);
        			this.View.sua(donthuoc);
        			this.View.sua(nguoidung);
        		}
//        		this.View.them(kho);
//        		this.View.them(danhmuc);
        		this.View.them(donthuoc);
//       		this.View.them(nguoidung);
        		
			} catch (Exception e2) {
				e2.printStackTrace();
			}
        }else if(cm.equals("Sửa")) {
        	this.View.hienthithongtinDaChon(kho);
        	this.View.hienthithongtinDaChon(danhmuc);
        	this.View.hienthithongtinDaChon(donthuoc);
        	this.View.hienthithongtinDaChon(nguoidung);
        }else if(cm.equals("Xóa")) {
        	this.View.thuchienxoa();
        }
	
   
	
//	else if(cm.equals("Lưu")) {
//    	try {
//    		
//    		String manhom = String.valueOf(this.View.jt_manhom.getText());
//    		String tennhom = String.valueOf(this.View.jt_tennhom.getText());
//    		String ghichu = String.valueOf(this.View.jt_ghichu.getText());
//    		
//    		
//    		danhmuc = new danhmucspModel(manhom, tennhom, ghichu);
//   		if(this.View.model.getLuachon().equals("") ||this.View.model.getLuachon().equals("Thêm ")) 
//    		{
//    			this.View.them(danhmuc);
//    		}else if(this.View.model.getLuachon().equals("Sủa")) {
//     			this.View.sua(danhmuc);
//    		}
//    		this.View.them(danhmuc);
//		} catch (Exception e2) {
//			e2.printStackTrace();
//		}
//    }else if(cm.equals("Sửa")) {
//    	this.View.hienthithongtinDaChon(danhmuc);
//    }else if(cm.equals("Xóa")) {
//    	this.View.thuchienxoa();
//    }
//    else if(cm.equals("Lưu")) {
//    	try {
//   		
//    		String madonthuoc = String.valueOf(this.View.jt_madonthuoc.getText());
//    		String tensp = String.valueOf(this.View.jt_tensp.getText());
//    		String soluong1 = String.valueOf(this.View.jt_soluong.getText());
//    		Date hansudung = Date.valueOf(this.View.jt_hansudung.getText());
//    		String hdsudung = String.valueOf(this.View.jt_cachsudung.getText());
//    		String manguoidung1 = String.valueOf(this.View.jt_manguoidung1.getText());
//
//    		String manguoidung = String.valueOf(this.View.jt_manguoidung.getText());
//    		String hovaten = String.valueOf(this.View.jt_hovaten.getText());
//    		Date ngaysinh = Date.valueOf(this.View.jt_ngaysing.getText());
//    		String sdt = String.valueOf(this.View.jt_sdt.getText());
//    		String diachi = String.valueOf(this.View.jt_diachi.getText());
//    		
//    		donthuoc = new hoadonthuocModel(madonthuoc, tensp,soluong1,hansudung,hdsudung,manguoidung1);
//   		if(this.View.model.getLuachon().equals("") ||this.View.model.getLuachon().equals("Thêm ")) 
//    		{
//   			this.View.them(donthuoc);
//    		}else if(this.View.model.getLuachon().equals("Sủa")) {
//    			this.View.them(donthuoc);
//    		}
//   		this.View.them(donthuoc);
//		} catch (Exception e2) {
//			e2.printStackTrace();
//		}
//    }else if(cm.equals("Sửa")) {
//    	this.View.hienthithongtinDaChon(danhmuc);
//    }else if(cm.equals("Xóa")) {
//    	this.View.thuchienxoa();
//    }
//    else if(cm.equals("Lưu")) {
//    	try {
//   		
//    		String manguoidung = String.valueOf(this.View.jt_manguoidung.getText());
//    		String hovaten = String.valueOf(this.View.jt_hovaten.getText());
//    		Date ngaysinh = Date.valueOf(this.View.jt_ngaysing.getText());
//    		String sdt = String.valueOf(this.View.jt_sdt.getText());
//    		String diachi = String.valueOf(this.View.jt_diachi.getText());
//    		
//    		nguoidung = new thongtinnguoidungModel(manguoidung, hovaten, ngaysinh, sdt, diachi);
//   		if(this.View.model.getLuachon().equals("") ||this.View.model.getLuachon().equals("Thêm ")) 
//    		{
//   			this.View.them(nguoidung);
//    		}else if(this.View.model.getLuachon().equals("Sủa")) {
//    			this.View.them(nguoidung);
//    		}
//   		this.View.them(nguoidung);
//		} catch (Exception e2) {
//			e2.printStackTrace();
//		}
//    }else if(cm.equals("Sửa")) {
//    	this.View.hienthithongtinDaChon(danhmuc);
//    }else if(cm.equals("Xóa")) {
//    	this.View.thuchienxoa();
//    }
}
	
	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}
	}
