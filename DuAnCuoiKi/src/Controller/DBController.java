package Controller;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
import View.qlthuoc;
import javax.swing.table.DefaultTableModel;

//import controller.DBController;

	public class DBController {
	     Connection con;
	     Statement stmt;
	     public DBController() {
	  	   try {
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		try {
	  			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlithuoc","root","050705");
	  			this.stmt = con.createStatement();
	  			System.out.println("Kết nối thành công");
	  		} catch (Exception e) {
	  			// TODO: handle exception
	  		}
	  	} catch (Exception e) {
	  		// TODO: handle exception
	  		System.out.println("er");
	  	}
	     }
	       public ResultSet Print() {
	      	 String query = "SELECT * FROM quanlithuoc.quanlikhothuoc";
	      	ResultSet rs = null;
	      	 try {
	      		 System.out.println(query);
	      		 rs = stmt.executeQuery(query);
	      		 
	      		 if(rs.next()) { 
	      			 String solohang =rs.getString("Solohang") ;
	      			 String ngaynhapkho = rs.getString("Ngaynhapkho");
	      			 String ngayhethang = rs.getString("Ngayhethan");
	      			 String soluong = rs.getString("Soluong");
	      			 String nhacungcap = rs.getString("Nhacungcap");
	      		 }
	      		
	  		} catch (Exception e) {
	  			// TODO: handle exception
	  		}
	      	 return rs;
	       }
	       public ResultSet Print1() {
		      	 String query = "SELECT * FROM quanlithuoc.danhmucsp";
		      	ResultSet rs = null;
		      	 try {
		      		 System.out.println(query);
		      		 rs = stmt.executeQuery(query);
		      		 
		      		 if(rs.next()) { 
		      			 String manhom =rs.getString("manhom") ;
		      			 String tennhom = rs.getString("tennhom");
		      			 String ghichu = rs.getString("ghichu");
		      			
		      		 }
		      		
		  		} catch (Exception e) {
		  			// TODO: handle exception
		  		}
		      	 return rs;
		       }
	       public ResultSet Print2() {
		      	 String query = "SELECT * FROM quanlithuoc.hoadonthuoc";
		      	ResultSet rs = null;
		      	 try {
		      		 System.out.println(query);
		      		 rs = stmt.executeQuery(query);
		      		 
		      		 if(rs.next()) { 
		      			 String madon =rs.getString("madon") ;
		      			 String tensp = rs.getString("tensp");
		      			 String soluong = rs.getString("soluong");
		      			 String hansudung = rs.getString("hansudung");
		      			 String hdsudung = rs.getString("hdsudung");
		      			 String manguoidung = rs.getString("manguoidung");
		      		 }
		      		
		  		} catch (Exception e) {
		  			// TODO: handle exception
		  		}
		      	 return rs;
		       }
	       public ResultSet Print3() {
		      	 String query = "SELECT * FROM quanlithuoc.thongtinnguoidung";
		      	ResultSet rs = null;
		      	 try {
		      		 System.out.println(query);
		      		 rs = stmt.executeQuery(query);
		      		 
		      		 if(rs.next()) { 
		      			 String madon =rs.getString("hovaten") ;
		      			 String tensp = rs.getString("ngaysing");
		      			 String soluong = rs.getString("sdt");
		      			 String hansudung = rs.getString("diachi");
		      			 String manguoidung = rs.getString("manguoidung");
		      		 }
		      		
		  		} catch (Exception e) {
		  			// TODO: handle exception
		  		}
		      	 return rs;
		       }
	     
//	   		public static void main(String[] args) {
//	   	    		DBController db = new DBController();
//	   	    		ResultSet rs = db.Print();
//	   	    		try {
//	   	    			while(rs.next()) {
//	   	    				System.out.println(rs.getString("Solohang" ));
//	   	    				System.out.println(rs.getString("Ngaynhapkho"));
//	   	    				System.out.println(rs.getString("Ngayhethan"));
//	   	    				System.out.println(rs.getString("Soluong"));
//	   	    				System.out.println(rs.getString("Nhacungcap"));
//	   	    			}
//	   	    		} catch (SQLException e) {
//	   	    			// TODO Auto-generated catch block
//	   	    			e.printStackTrace();
//	   	    		}
//	   	    	}
	   		
	  }
