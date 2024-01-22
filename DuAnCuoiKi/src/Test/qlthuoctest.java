package Test;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingUtilities;

import Controller.DBController;
//import Model.qlthuocModel;
import View.qlthuoc;
import View.truycapxem;
public class qlthuoctest {
	private String chon;
	public static void main (String args []) {
	     
		 try {
			SwingUtilities.invokeLater(truycapxem::new);
			new DBController();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
//		 DBController db = new DBController();
//    		ResultSet rs = db.Print();
//    		try {
//    			while(rs.next()) {
//    				System.out.println(rs.getString("Solohang" ));
//    				System.out.println(rs.getString("Ngaynhapkho"));
//    				System.out.println(rs.getString("Ngayhethan"));
//    				System.out.println(rs.getString("Soluong"));
//    				System.out.println(rs.getString("Nhacungcap"));
//    			}
//    		} catch (SQLException e) {
//    			// TODO Auto-generated catch block
//    			e.printStackTrace();
//    		}
		 }
    	}


