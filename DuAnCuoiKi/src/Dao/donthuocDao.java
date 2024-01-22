package Dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import Model.hoadonthuocModel;
import Database.JDBCtil;

public class donthuocDao implements daoInterface<hoadonthuocModel>{

	public static donthuocDao getInstance() {
		return new donthuocDao();
	}

	 String sql;
	
	
	@Override
	public int insert(hoadonthuocModel t) {
		//Tạo kết nối cơ sở dữ liệu
		try{
			Connection con = JDBCtil.getConnection();
	        String sql = "INSERT INTO hoadonthuoc (madonthuoc, tensp, soluong, hansudung, hdsudung, manguoidung) " +
	                     "VALUES (?, ?, ?, ?, ?, ?)";

	        PreparedStatement statement = con.prepareStatement(sql);
	        statement.setString(1, t.getMadonthuoc());
	        statement.setString(2, t.getTensp());
	        statement.setString(3, t.getSoluong1());
	        
	        if (t.getHansudung() != null) {
	            statement.setDate(4, t.getHansudung());
	        } else {
	            statement.setNull(4, java.sql.Types.DATE);
	        }
	        
	        statement.setString(5, t.getHdsudung());
	        statement.setString(6, t.getManguoidung1());

	        int ketqua = statement.executeUpdate();

	        System.out.println("Bạn đã thực thi " + sql);
	        System.out.println("Có " + ketqua + " dòng bị thay đổi");

	        JDBCtil.closeConnection(con);
        
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
       return 0;
	}

	@Override
	public int update(hoadonthuocModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(hoadonthuocModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int timkiem(hoadonthuocModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public hoadonthuocModel selectByid(hoadonthuocModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<hoadonthuocModel> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<hoadonthuocModel> selectBycondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
