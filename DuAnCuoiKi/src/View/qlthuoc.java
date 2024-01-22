package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import Controller.qlthuocController;
import Model.danhmucspModel;
import Model.hoadonthuocModel;
import Model.quanlikhothuoc;
import Model.thongtinnguoidungModel;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class qlthuoc {
		public hoadonthuocModel model;
		public quanlikhothuoc model2;
		public danhmucspModel model4;
		public thongtinnguoidungModel model3;
		public qlthuoc() {
		 JFrame frame = new JFrame("Thông tin");
		    frame.setSize(900, 700);
		    frame.setLocationRelativeTo(null);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    JPanel container = new JPanel(new CardLayout());

		    JPanel panel1 = createPanel1();
		    JPanel panel2 = createPanel2();
		    JPanel panel3 = createPanel3();
		    JPanel panel4 = createPanel4();

		    container.add(panel1, "panel1");
		    container.add(panel2, "panel2");
		    container.add(panel3, "panel3");
		    container.add(panel4, "panel4");

		    JMenuBar menuBar = new JMenuBar();
		    JMenu menu = new JMenu("Menu");

		    JMenuItem menuItem1 = new JMenuItem("Quản lí kho thuốc");
		    menuItem1.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel1");
		        }
		    });
		    menu.add(menuItem1);

		    JMenuItem menuItem2 = new JMenuItem("Danh mục nhóm thuốc");
		    menuItem2.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel2");
		        }
		    });
		    menu.add(menuItem2);
		    
		    JMenuItem menuItem3 = new JMenuItem("Đơn thuốc");
		    menuItem3.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel3");
		        }
		    });
		    menu.add(menuItem3);
		    
		    JMenuItem menuItem4 = new JMenuItem("Người dùng ");
		    menuItem4.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            CardLayout cardLayout = (CardLayout) container.getLayout();
		            cardLayout.show(container, "panel4");
		        }
		    });
		    menu.add(menuItem4);

		    menuBar.add(menu);
		    frame.setJMenuBar(menuBar);
		    frame.add(container);
		    frame.setVisible(true);
		    }
//		 ActionListener ac = new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//			};
		ActionListener ac = new qlthuocController(this);
public JTextField jt_solohang;
public JTextField jt_ngaynhapkho;
public JTextField jt_ngayhethan;
public JTextField jt_soluong;
public JTextField jt_nhacungcap;
public JTextField jt_manhom;
public JTextField jt_ghichu;
public JTextField jt_madonthuoc;
public JTextField jt_tensp;
public JTextField jt_hansudung;
public JTextField jt_cachsudung;
public JTextField jt_hovaten;
public JTextField jt_ngaysing;
public JTextField jt_sdt;
public JTextField jt_diachi;
public JTextField jt_tennhom;
public JTable jt_quanlikho;
public JTable jt_quanlinhom;
public JTable jt_donthuoc;
public JTable jt_thongtinnguoidung;
public JTextField jt_soluong1;
public JTextField jt_manguoidung;
public JTextField jt_manguoidung1;
private JTextField jt_sl;
private JTextField jt_timkiem;
protected String manguoiDungtt;
protected String ngaySinhtt;
protected String hoTentt;
protected String sdttt;
protected String diaChitt;
static String madonThuoc;
static String soLuong;
static String tenSp;
static String hanSd;
static String manguoiDung;
static String hdsudung;
static String tenNhomm;
static String ghiChuu;
static String maNhomm;
static String soloHang;
static String ngaynhapKho;
static String ngayhetHan;
static String soluong;
static String nhacungCap;

		    private JPanel createPanel1() {
		    	JPanel panel1 = new JPanel();
		    	panel1.setLayout(new BorderLayout());
		    	panel1.setBackground(new Color(204, 229, 255));
		    	
		            JPanel Jp_tren = new JPanel();
		    		Jp_tren.setLayout(new GridLayout(5,2,10,10));
		    		Border border = BorderFactory.createLineBorder(Color.gray, 2);
		    		Jp_tren.setBorder(border);

		    		
		    		JLabel jl_solohang = new JLabel("Số lô hàng ");
		    	    jt_solohang = new JTextField(15);

		    	    JLabel jl_ngaynhapkho = new JLabel("Ngày nhập kho ");
		    	    jt_ngaynhapkho = new JTextField(15);

		    	    JLabel jl_ngayhethan = new JLabel("Ngày hết hạn");
		    	    jt_ngayhethan = new JTextField(15);

		    	    JLabel jl_soluong = new JLabel("Số lượng");
		    	    jt_soluong = new JTextField(15);
		    	     jt_sl = new JTextField(15);

		    	    JLabel jl_nhacungcap = new JLabel("Nhà cung cấp");
		    	    jt_nhacungcap = new JTextField();
		    	
		    	    Jp_tren.add(jl_solohang);
		    	    Jp_tren.add(jt_solohang);

		    	    Jp_tren.add(jl_ngaynhapkho);
		    	    Jp_tren.add(jt_ngaynhapkho);

		    	    Jp_tren.add(jl_ngayhethan);
		    	    Jp_tren.add(jt_ngayhethan);
		    	    		    	    
		    	    Jp_tren.add(jl_soluong);
		    	    Jp_tren.add(jt_sl);
		    	    
		    	    Jp_tren.add(jl_nhacungcap);
		    	    Jp_tren.add(jt_nhacungcap);
		    	   // Jp_tren.add(jt_nhacungcap);

		    	    JPanel Jp_giua = new JPanel();
		    	    //Jp_giua.setForeground(new Color(71, 117, 49));
		    	    //Jp_giua.setBackground(new Color(204, 229, 255));
		    	    Jp_giua.setBackground(new Color(204, 204, 255));
		    		
		    		JButton jb_them = new JButton("Thêm");
		    		jb_them.addActionListener(ac);
		    		JButton jb_sua = new JButton("Sửa");
		    		jb_sua.addActionListener(ac);
		    		JButton jb_xoa = new JButton("Xóa");
		    		jb_xoa.addActionListener(ac);
		    		JButton jb_lammoi = new JButton("Làm Mới");
		    		
		    		
		    		//JTextField jt_tim = new JTextField();
		    		JButton jb_tim = new JButton("Tìm ");
		    		jb_tim.addActionListener(ac);
		    		
		    		jt_timkiem = new JTextField(15);
		    		
		    		
		    		Jp_giua.add(jb_them);
		    		Jp_giua.add(jb_sua);
		    		Jp_giua.add(jb_xoa);
		    		Jp_giua.add(jb_lammoi);

		    		
		    		//Jp_giua.add(jt_tim,BorderLayout.SOUTH);
		    		Jp_giua.add(jb_tim);
		    		Jp_giua.add(jt_timkiem);
		    		
		    		JPanel Jp_duoi = new JPanel();
		    		Jp_duoi.setLayout(new BorderLayout());
		    	
//		    		Object[][] data = {
//		                    {"", "", "","",""},      
//		            };
//		    		 String[] columnNames = {"Số lô hàng", "Ngày nhập kho", "Ngày hết hạn", "Số lượng", "Nhà cung cấp"};
//		    		 JTable jt_quanlikho = new JTable(data, columnNames);
//		    		String[] columnNames = {"Số lô hàng", "Ngày nhập kho", "Ngày hết hạn", "Số lượng", "Nhà cung cấp"};
//		    		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//		    		jt_quanlikho = new JTable(model);
//		    		Object[] data = {"", "", "","", "", ""};
//		    		model.addRow(data);
		    		
		    		DefaultTableModel dtm = new DefaultTableModel();
		    		dtm.addColumn("Số Lô Hàng");
		    		dtm.addColumn("Ngày Nhập Kho");
		    		dtm.addColumn("Ngày Hết Hạn");
		    		dtm.addColumn("Số Lượng");
		    		dtm.addColumn("Nhà Cung Cấp");

		    		JTable jtb = new JTable(dtm);
		    		JScrollPane jscoll = new JScrollPane(jtb);
		    		//jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		    		Jp_duoi.setBorder(border);
		    		
		    		try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
						PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.quanlikhothuoc");
						ResultSet rs = prs.executeQuery();
						while(rs.next()) {
							String solohang = rs.getString("Solohang");
							String ngaynhapkho = rs.getString("Ngaynhapkho");
							String ngayhethan = rs.getString("Ngayhethan");
							String soluong = rs.getString("Soluong");
							String nhacungcap = rs.getString("Nhacungcap");
							dtm.addRow(new String[] {solohang, ngaynhapkho, ngayhethan, soluong, nhacungcap});
						}
						prs.close();
						conn.close();
						
		    		} catch (Exception e) {
		    			e.printStackTrace();
		    		}
		    		
		    		//Sự kiện Button Thêm
		    		jb_them.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String soLoHang = jt_solohang.getText();
							String ngayNhapKho = jt_ngaynhapkho.getText();
							String ngayHetHan = jt_ngayhethan.getText();
							String soLuong = jt_sl.getText();
							String nhaCungCap = jt_nhacungcap.getText();
							if(!soLoHang.isEmpty() && !ngayNhapKho.isEmpty() && !ngayHetHan.isEmpty() && !soLuong.isEmpty() && !nhaCungCap.isEmpty()) {
								try {
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
									Statement stm = conn.createStatement();
									stm.executeUpdate("insert into quanlithuoc.quanlikhothuoc(solohang, ngaynhapkho, ngayhethan, soluong, nhacungcap) values('"+jt_solohang.getText()+"', '"+jt_ngaynhapkho.getText()+"', '"+jt_ngayhethan.getText()+"', '"+jt_sl.getText()+"', '"+jt_nhacungcap.getText()+"')");
								    JOptionPane.showMessageDialog(null, "Thêm Thành Công");
								    stm.close();
								    conn.close();
								} catch (Exception e2) {
									e2.printStackTrace();
								}
							}else {
								JOptionPane.showMessageDialog(null, "Thêm Thất Bại");
							}
						}
					});
		    		
		    		jb_lammoi.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								dtm.setRowCount(0);
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
								PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.quanlikhothuoc");
								ResultSet rs = prs.executeQuery();
								while(rs.next()) {
									String solohang = rs.getString("Solohang");
									String ngaynhapkho = rs.getString("Ngaynhapkho");
									String ngayhethan = rs.getString("Ngayhethan");
									String soluong = rs.getString("Soluong");
									String nhacungcap = rs.getString("Nhacungcap");
									dtm.addRow(new String[] {solohang, ngaynhapkho, ngayhethan, soluong, nhacungcap});
								}
								prs.close();
								conn.close();
							} catch (Exception e3) {
								// TODO: handle exception
								e3.printStackTrace();
							}
						}
					});
		    		
		    		jb_tim.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								dtm.setRowCount(0);
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
								PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.quanlikhothuoc where solohang = '"+jt_timkiem.getText()+"'");
								ResultSet rs = prs.executeQuery();
								while(rs.next()) {
									String solohang = rs.getString("Solohang");
									String ngaynhapkho = rs.getString("Ngaynhapkho");
									String ngayhethan = rs.getString("Ngayhethan");
									String soluong = rs.getString("Soluong");
									String nhacungcap = rs.getString("Nhacungcap");
									dtm.addRow(new String[] {solohang, ngaynhapkho, ngayhethan, soluong, nhacungcap});
								}
								prs.close();
								conn.close();
							} catch (Exception e4) {
								// TODO: handle exception
								e4.printStackTrace();
							}
						}
					});
		    		
		    		jtb.addMouseListener(new MouseListener() {
						@Override
						public void mouseReleased(MouseEvent e) {
							// TODO Auto-generated method stub
						}
						@Override
						public void mousePressed(MouseEvent e) {
							// TODO Auto-generated method stub
						}
						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
						}
						@Override
						public void mouseEntered(MouseEvent e) {
							// TODO Auto-generated method stub
						}
						@Override
						public void mouseClicked(MouseEvent e) {
							int selectRow = jtb.getSelectedRow();
							soloHang = jtb.getValueAt(selectRow, 0).toString();
							ngaynhapKho = jtb.getValueAt(selectRow, 1).toString();
							ngayhetHan = jtb.getValueAt(selectRow, 2).toString();
							soluong = jtb.getValueAt(selectRow, 3).toString();
							nhacungCap = jtb.getValueAt(selectRow, 4).toString();
							jt_solohang.setText(soloHang);
							jt_ngaynhapkho.setText(ngaynhapKho);
							jt_ngayhethan.setText(ngayhetHan);
							jt_sl.setText(soluong);
							jt_nhacungcap.setText(nhacungCap);
						}
					});
		    		jb_sua.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String soLoHang = jt_solohang.getText();
							String ngayNhapKho = jt_ngaynhapkho.getText();
							String ngayHetHan = jt_ngayhethan.getText();
							String soLuong = jt_sl.getText();
							String nhaCungCap = jt_nhacungcap.getText();
							if(!soLoHang.isEmpty() && !ngayNhapKho.isEmpty() && !ngayHetHan.isEmpty() && !soLuong.isEmpty() && !nhaCungCap.isEmpty()) {
								try {
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
									Statement stm = conn.createStatement();
									stm.executeUpdate("update quanlithuoc.quanlikhothuoc set solohang ='"+jt_solohang.getText()+"', ngaynhapkho ='"+jt_ngaynhapkho.getText()+"', ngayhethan ='"+jt_ngayhethan.getText()+"', soluong ='"+jt_sl.getText()+"', nhacungcap ='"+jt_nhacungcap.getText()+"' where solohang ="+jt_solohang.getText());
								    JOptionPane.showMessageDialog(null, "Sửa Thành Công");
								    stm.close();
								    conn.close();
								} catch (Exception e5) {
									e5.printStackTrace();
								}
							}else {
								JOptionPane.showMessageDialog(null, "Sửa Thất Bại");
							}
						}
					});
		    		
		    		jb_xoa.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
								Statement stm = conn.createStatement();
								int ret = JOptionPane.showConfirmDialog(null, "Xác Nhận Xóa?","Xóa", JOptionPane.YES_NO_CANCEL_OPTION);
								if(ret == JOptionPane.YES_OPTION) {
									stm.executeUpdate("delete from quanlithuoc.quanlikhothuoc where solohang ='"+soloHang+"'");
									JOptionPane.showMessageDialog(null, "Xóa Thành Công");
								}
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}
					});
//		    		
		    		Jp_duoi.add(jscoll, BorderLayout.CENTER);
		    		
		    		panel1.add(Jp_tren,BorderLayout.NORTH);
		    		panel1.add(Jp_giua,BorderLayout.CENTER);
		    		panel1.add(Jp_duoi,BorderLayout.SOUTH);
		    		
		    		panel1.setVisible(true);
					return panel1;
		    		}
		    
//panel2
		    private JPanel createPanel2() {
		    	JPanel panel2 = new JPanel();
		    	panel2.setLayout(new BorderLayout());
		        	
		        JLabel jl_donthuoc = new JLabel();
		        Font fontDT = new Font("Arial", Font.BOLD, 25);
		        jl_donthuoc.setFont(fontDT);
		        panel2.add(jl_donthuoc, BorderLayout.NORTH);

		        JPanel Jp_tren = new JPanel();
		        Jp_tren.setLayout(new GridLayout(7, 2, 50, 20));
		        Border border = BorderFactory.createLineBorder(Color.gray, 2);
		        Jp_tren.setBorder(border);
		        

		        Jp_tren.setLayout(new GridLayout(3,2,50,10));
	    		Border border1 = BorderFactory.createLineBorder(Color.gray, 2);
	    		Jp_tren.setBorder(border1);

	    		
	    		JLabel jl_manhom = new JLabel("Mã nhóm ");
	    		jt_manhom = new JTextField();
	    		
	    		JLabel jl_tennhom = new JLabel("Tên nhóm");
	    		jt_tennhom = new JTextField();
	    		
	    		JLabel jl_ghichu = new JLabel("Ghi chú");
	    		jt_ghichu = new JTextField();
	    		
	    		Jp_tren.add(jl_manhom);
	    		Jp_tren.add(jt_manhom);
	    		
	    		Jp_tren.add(jl_tennhom);
	    		Jp_tren.add(jt_tennhom);
	    		
	    		Jp_tren.add(jl_ghichu);
	    		Jp_tren.add(jt_ghichu);
	    		
	    		
	    		JPanel Jp_giua = new JPanel();
	    		//Jp_giua.setForeground(new Color(71, 117, 49));
	    		Jp_giua.setBackground(new Color(204, 204, 255));
	    		
	    		JButton jb_them = new JButton("Thêm");
	    		jb_them.addActionListener(ac);
	    		JButton jb_sua = new JButton("Sửa");
	    		jb_sua.addActionListener(ac);
	    		JButton jb_xoa = new JButton("Xóa");
	    		jb_xoa.addActionListener(ac);
	    		JButton jb_lammoi = new JButton("Làm Mới ");
	    		jb_lammoi.addActionListener(ac);
	    		JButton jb_tim = new JButton("Tìm ");
	    		jb_tim.addActionListener(ac);
	    		JTextField jt_tk = new JTextField(15);
	    		
	    		Jp_giua.add(jb_them);
	    		Jp_giua.add(jb_sua);
	    		Jp_giua.add(jb_xoa);
	    		Jp_giua.add(jb_lammoi);
	    		Jp_giua.add(jb_tim);
	    		Jp_giua.add(jt_tk);
	    		
	    		JPanel Jp_duoi = new JPanel(new BorderLayout());
	    		
//	    		String[] columnNames = {"Mã nhóm", "Tên nhóm","Ghi chú"};
//	    		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//	    		jt_quanlinhom = new JTable(model);
//	    		Object[] data = {"b", "b", "b","b", "b", "b"};
//	    		model.addRow(data);
	    		
	    		DefaultTableModel dtm_quanlinhom = new DefaultTableModel();
	    		dtm_quanlinhom.addColumn("Mã Nhóm");
	    		dtm_quanlinhom.addColumn("Tên Nhóm");
	    		dtm_quanlinhom.addColumn("Ghi Chú");
	    		
	    		JTable jt_quanlinhom = new JTable(dtm_quanlinhom);
	    		JScrollPane jscoll_quanlinhom = new JScrollPane(jt_quanlinhom);
	    		//jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    		Jp_duoi.setBorder(border);
	    		
	    		try {
	    			Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
					PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.danhmucsp");
					ResultSet rs = prs.executeQuery();
					while(rs.next()) {
						String maNhom = rs.getString("manhom");
						String tenNhom = rs.getString("tennhom");
						String ghiChu = rs.getString("ghichu");
						dtm_quanlinhom.addRow(new String[] {maNhom, tenNhom, ghiChu});
					}
					prs.close();
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
	    		
	    		jb_them.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String maNhom = jt_manhom.getText();
						String tenNhom = jt_tennhom.getText();
						String ghiChu = jt_ghichu.getText();
						if(!maNhom.isEmpty() && !tenNhom.isEmpty() && !ghiChu.isEmpty()) {
							try {
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
								Statement stm = conn.createStatement();
								stm.executeUpdate("insert into quanlithuoc.danhmucsp(manhom, tennhom, ghichu) values('"+jt_manhom.getText()+"', '"+jt_tennhom.getText()+"', '"+jt_ghichu.getText()+"')");
							    JOptionPane.showMessageDialog(null, "Thêm Thành Công");
							    stm.close();
							    conn.close();
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}else {
							JOptionPane.showMessageDialog(null, "Thêm Thất Bại");
						}
					}
				});
	    		jb_lammoi.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							dtm_quanlinhom.setRowCount(0);
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
							PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.danhmucsp");
							ResultSet rs = prs.executeQuery();
							while(rs.next()) {
								String maNhom = rs.getString("manhom");
								String tenNhom = rs.getString("tennhom");
								String ghiChu = rs.getString("ghichu");
								dtm_quanlinhom.addRow(new String[] {maNhom, tenNhom, ghiChu});
							}
							prs.close();
							conn.close();
						} catch (Exception e3) {
							// TODO: handle exception
							e3.printStackTrace();
						}
					}
				});
	    		jt_quanlinhom.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						int selectRow_quanlinhom = jt_quanlinhom.getSelectedRow();
						maNhomm = jt_quanlinhom.getValueAt(selectRow_quanlinhom, 0).toString();
						tenNhomm = jt_quanlinhom.getValueAt(selectRow_quanlinhom, 1).toString();
						ghiChuu = jt_quanlinhom.getValueAt(selectRow_quanlinhom, 2).toString();
						jt_manhom.setText(maNhomm);
						jt_tennhom.setText(tenNhomm);
						jt_ghichu.setText(ghiChuu);
					}
				});
	    		jb_sua.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String maNhom = jt_manhom.getText();
						String tenNhom = jt_tennhom.getText();
						String ghiChu = jt_ghichu.getText();
						if(!maNhom.isEmpty() && !tenNhom.isEmpty() && !ghiChu.isEmpty()) {
							try {
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
								Statement stm = conn.createStatement();
								stm.executeUpdate("update quanlithuoc.danhmucsp set manhom ='"+jt_manhom.getText()+"', tennhom ='"+jt_tennhom.getText()+"', ghichu ='"+jt_ghichu.getText()+"' where manhom ="+jt_manhom.getText());
							    JOptionPane.showMessageDialog(null, "Sửa Thành Công");
							    stm.close();
							    conn.close();
							} catch (Exception e5) {
								e5.printStackTrace();
							}
						}else {
							JOptionPane.showMessageDialog(null, "Sửa Thất Bại");
						}
					}
				});
	    		
	    		jb_xoa.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
							Statement stm = conn.createStatement();
							int ret = JOptionPane.showConfirmDialog(null, "Xác Nhận Xóa?","Xóa", JOptionPane.YES_NO_CANCEL_OPTION);
							if(ret == JOptionPane.YES_OPTION) {
								stm.executeUpdate("delete from quanlithuoc.danhmucsp where manhom ='"+maNhomm+"'");
								JOptionPane.showMessageDialog(null, "Xóa Thành Công");
							}
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					}
				});
	    		
	    		jb_tim.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							dtm_quanlinhom.setRowCount(0);
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
							PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.danhmucsp where manhom = '"+jt_tk.getText()+"'");
							ResultSet rs = prs.executeQuery();
							while(rs.next()) {
								String manhom = rs.getString("manhom");
								String tennhom = rs.getString("tennhom");
								String ghichu = rs.getString("ghichu");
								dtm_quanlinhom.addRow(new String[] {manhom, tennhom, ghichu});
							}
							prs.close();
							conn.close();
						} catch (Exception e4) {
							// TODO: handle exception
							e4.printStackTrace();
						}
					}
				});
	    		
//	    		JScrollPane jscoll = new JScrollPane(jt_quanlinhom);
//	    		jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    		Jp_duoi.setBorder(border);
	    		
	    		Jp_duoi.add(jscoll_quanlinhom,BorderLayout.CENTER);
	    		
	    		panel2.add(Jp_tren,BorderLayout.NORTH);
	    		panel2.add(Jp_giua,BorderLayout.CENTER);
	    		panel2.add(Jp_duoi,BorderLayout.SOUTH);
	    		
	    		panel2.setVisible(true);
		        
		        return panel2;
		    
		}
//panel 3
		    private JPanel createPanel3() {
		    	JPanel panel3 = new JPanel();
		    	panel3.setLayout(new BorderLayout());
	
				JPanel Jp_tren = new JPanel();
	    		Jp_tren.setLayout(new GridLayout(6,2,50,10));
	    		Border border = BorderFactory.createLineBorder(Color.gray, 2);
	    		Jp_tren.setBorder(border);

	    		
	    		JLabel jl_madonthuoc = new JLabel("Mã đơn thuốc ");
	    		jt_madonthuoc = new JTextField();
	    		
	    		JLabel jl_tensp = new JLabel("Tên sp ");
	    		jt_tensp = new JTextField();
	    		
	    		JLabel jl_soluong = new JLabel("Số lượng ");
	    		jt_soluong1 = new JTextField();
	    		
	    		JLabel jl_hansudung = new JLabel("Hạn sử dụng");
	    		jt_hansudung = new JTextField();
	    		
	    		JLabel jl_cachsudung = new JLabel("Cách sử dụng");
	    		jt_cachsudung  = new JTextField();
	    		
	    		JLabel jl_manguoidung11 = new JLabel("Mã người dùng");
	    		jt_manguoidung1  = new JTextField();
	    	
	    		Jp_tren.add(jl_madonthuoc);
	    		Jp_tren.add(jt_madonthuoc);
	    		
	    		Jp_tren.add(jl_tensp);
	    		Jp_tren.add(jt_tensp);
	    		
	    		Jp_tren.add(jl_soluong);
	    		Jp_tren.add(jt_soluong1);
	    		
	    		Jp_tren.add(jl_hansudung);
	    		Jp_tren.add(jt_hansudung);
	    		
	    		Jp_tren.add(jl_cachsudung);
	    		Jp_tren.add(jt_cachsudung);
	    		
	    		Jp_tren.add(jl_manguoidung11);
	    		Jp_tren.add(jt_manguoidung1);
	    		
	    		JPanel Jp_giua = new JPanel();
	    		//Jp_giua.setForeground(new Color(71, 117, 49));
	    		Jp_giua.setBackground(new Color(204, 204, 255));
	    		
	    		JButton jb_them = new JButton("Thêm");
	    		jb_them.addActionListener(ac);
	    		JButton jb_sua = new JButton("Sửa");
	    		jb_sua.addActionListener(ac);
	    		JButton jb_xoa = new JButton("Xóa");
	    		jb_xoa.addActionListener(ac);
	    		JButton jb_lammoi = new JButton("Làm Mới ");
	    		jb_lammoi.addActionListener(ac);
	    		JButton jb_tim = new JButton("Tìm ");
	    		jb_tim.addActionListener(ac);
	    		JTextField jt_tk = new JTextField(15);
	    		
	    		Jp_giua.add(jb_them);
	    		Jp_giua.add(jb_sua);
	    		Jp_giua.add(jb_xoa);
	    		Jp_giua.add(jb_lammoi);
	    		Jp_giua.add(jb_tim);
	    		Jp_giua.add(jt_tk);
	    		
	    		
	    		
	    		JPanel Jp_duoi = new JPanel(new BorderLayout());
	    		
//	    		String[] columnNames = {"Mã đơn thuốc", "Tên sp", "Số lượng", "Hạn sử dụng", "Cách sử dụng","Mã người dùng"};
//	    		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//	    		jt_donthuoc = new JTable(model);
//	    		Object[] data = {"", "", "","", "", ""};
//	    		model.addRow(data);
//	    		
//	    		
//	    		JScrollPane jscoll = new JScrollPane(jt_donthuoc);
//	    		jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    		
	    		DefaultTableModel dtm_hoadon = new DefaultTableModel();
	    		dtm_hoadon.addColumn("Mã đơn thuốc");
	    		dtm_hoadon.addColumn("Tên sp");
	    		dtm_hoadon.addColumn("Số lượng");
	    		dtm_hoadon.addColumn("Hạn sử dụng");
	    		dtm_hoadon.addColumn("Cách sử dụng");
	    		dtm_hoadon.addColumn("Mã người dùng");
	    		
	    		JTable jt_hoadon = new JTable(dtm_hoadon);
	    		JScrollPane jscoll_hoadon = new JScrollPane(jt_hoadon);
	    		
	    		Jp_duoi.setBorder(border);
	    		
	    		try {
	    			Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
					PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.hoadonthuoc");
					ResultSet rs = prs.executeQuery();
					while(rs.next()) {
						String maDonThuoc = rs.getString("madonthuoc");
						String tenSp = rs.getString("tensp");
						String soLuong = rs.getString("soluong");
						String hanSd = rs.getString("hansudung");
						String hdsudung = rs.getString("hdsudung");
						String maNguoiDung = rs.getString("manguoidung");
					    dtm_hoadon.addRow(new String[] {maDonThuoc, tenSp, soLuong,hanSd,hdsudung,maNguoiDung});
					}
					prs.close();
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
	    		jb_them.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String maDonThuoc = jt_madonthuoc.getText();
						String tenSp = jt_tensp.getText();
						String soLuong = jt_soluong1.getText();
						String hanSd = jt_hansudung.getText();
						String hdsudung = jt_cachsudung.getText();
						String maNguoiDung = jt_manguoidung1.getText();
						if(!maDonThuoc.isEmpty() && !tenSp.isEmpty() && !soLuong.isEmpty() && !hanSd.isEmpty() && !hdsudung.isEmpty() && !maNguoiDung.isEmpty()) {
							try {
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
								Statement stm = conn.createStatement();
								stm.executeUpdate("insert into quanlithuoc.hoadonthuoc(madonthuoc,tensp,soluong,hansudung,hdsudung,manguoidung) values('"+jt_madonthuoc.getText()+"', '"+jt_tensp.getText()+"', '"+jt_soluong1.getText()+"', '"+jt_hansudung.getText()+"', '"+jt_cachsudung.getText()+"', '"+jt_manguoidung1.getText()+"')");
							    JOptionPane.showMessageDialog(null, "Thêm Thành Công");
							    stm.close();
							    conn.close();
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}else {
							JOptionPane.showMessageDialog(null, "Thêm Thất Bại");
						}
					}
				});
	    		
	    		jb_lammoi.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							dtm_hoadon.setRowCount(0);
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
							PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.hoadonthuoc");
							ResultSet rs = prs.executeQuery();
							while(rs.next()) {
								String maDonThuoc = rs.getString("madonthuoc");
								String tenSp = rs.getString("tensp");
								String soLuong = rs.getString("soluong");
								String hanSd = rs.getString("hansudung");
								String hdsudung = rs.getString("hdsudung");
								String maNguoiDung = rs.getString("manguoidung");
								dtm_hoadon.addRow(new String[] {maDonThuoc, tenSp, soLuong, hanSd, hdsudung, maNguoiDung});
							}
							prs.close();
							conn.close();
						} catch (Exception e3) {
							// TODO: handle exception
							e3.printStackTrace();
						}
					}
				});
	    		jb_tim.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							dtm_hoadon.setRowCount(0);
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
							PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.hoadonthuoc where madonthuoc = '"+jt_tk.getText()+"'");
							ResultSet rs = prs.executeQuery();
							while(rs.next()) {
								String maDonThuoc = rs.getString("madonthuoc");
								String tenSp = rs.getString("tensp");
								String soLuong = rs.getString("soluong");
								String hanSd = rs.getString("hansudung");
								String hdsudung = rs.getString("hdsudung");
								String maNguoiDung = rs.getString("manguoidung");
								dtm_hoadon.addRow(new String[] {maDonThuoc, tenSp, soLuong, hanSd, hdsudung, maNguoiDung});
							}
							prs.close();
							conn.close();
						} catch (Exception e4) {
							// TODO: handle exception
							e4.printStackTrace();
						}
					}
				});
	    		jt_hoadon.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						int selectRow_hoadon = jt_hoadon.getSelectedRow();
						madonThuoc = jt_hoadon.getValueAt(selectRow_hoadon, 0).toString();
						tenSp = jt_hoadon.getValueAt(selectRow_hoadon, 1).toString();
						soLuong = jt_hoadon.getValueAt(selectRow_hoadon, 2).toString();
						hanSd = jt_hoadon.getValueAt(selectRow_hoadon, 3).toString();
						hdsudung = jt_hoadon.getValueAt(selectRow_hoadon, 4).toString();
						manguoiDung = jt_hoadon.getValueAt(selectRow_hoadon, 5).toString();
						jt_madonthuoc.setText(madonThuoc);
						jt_tensp.setText(tenSp);
						jt_soluong1.setText(soLuong);
						jt_hansudung.setText(hanSd);
						jt_cachsudung.setText(hdsudung);
						jt_manguoidung1.setText(manguoiDung);
					}
				});

				jb_sua.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String maDonThuoc = jt_madonthuoc.getText();
						String tenSp = jt_tensp.getText();
						String soLuong = jt_soluong1.getText();
						String hanSd = jt_hansudung.getText();
						String hdsudung = jt_cachsudung.getText();
						String maNguoiDung = jt_manguoidung1.getText();
						if(!maDonThuoc.isEmpty() && !tenSp.isEmpty() && !soLuong.isEmpty() && !hanSd.isEmpty() && !hdsudung.isEmpty() && !maNguoiDung.isEmpty()) {
							try {
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
								Statement stm = conn.createStatement();
								stm.executeUpdate("update quanlithuoc.hoadonthuoc set madonthuoc ='"+jt_madonthuoc.getText()+"', tensp ='"+jt_tensp.getText()+"', soluong ='"+jt_soluong1.getText()+"', hansudung ='"+jt_hansudung.getText()+"', hdsudung ='"+jt_cachsudung.getText()+"', manguoidung ='"+jt_manguoidung1.getText()+"' where madonthuoc ='"+madonThuoc+"'");
							    JOptionPane.showMessageDialog(null, "Sửa Thành Công");
							    stm.close();
							    conn.close();
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}else {
							JOptionPane.showMessageDialog(null, "Sửa Thất Bại");
						}
					}
				});
				jb_xoa.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
							Statement stm = conn.createStatement();
							int ret = JOptionPane.showConfirmDialog(null, "Xác Nhận Xóa?","Xóa", JOptionPane.YES_NO_CANCEL_OPTION);
							if(ret == JOptionPane.YES_OPTION) {
								stm.executeUpdate("delete from quanlithuoc.hoadonthuoc where madonthuoc ='"+madonThuoc+"'");
								JOptionPane.showMessageDialog(null, "Xóa Thành Công");
							}
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					}
				});
	    		
	    		Jp_duoi.add(jscoll_hoadon,BorderLayout.CENTER);
	    		
	    		panel3.add(Jp_tren,BorderLayout.NORTH);
	    		panel3.add(Jp_giua,BorderLayout.CENTER);
	    		panel3.add(Jp_duoi,BorderLayout.SOUTH);
	    		
	    		panel3.setVisible(true);
				return panel3;
		    	
		    }
//panel 4	
		    
		    private JPanel createPanel4() {
		    	JPanel panel4 = new JPanel();
		    	panel4.setLayout(new BorderLayout());

				JPanel Jp_tren = new JPanel();
	    		Jp_tren.setLayout(new GridLayout(5,2,50,10));
	    		Border border = BorderFactory.createLineBorder(Color.gray , 2);
	    		Jp_tren.setBorder(border);

	    		
	    		JLabel jl_hovaten = new JLabel("Tên");
	    		jt_hovaten = new JTextField();
	    		
	    		JLabel jl_ngaysing = new JLabel("Ngày sinh ");
	    		jt_ngaysing = new JTextField();
	    		
	    		JLabel jl_sdt = new JLabel("Số điện thoại");
	    		jt_sdt = new JTextField();
	    		
	    		JLabel jl_diachi = new JLabel("Địa chỉ");
	    		jt_diachi = new JTextField();
	    		
	    		JLabel jl_manguoidung = new JLabel("Mã người dùng ");
	    		jt_manguoidung = new JTextField();
	   
	    		Jp_tren.add(jl_manguoidung);
	    		Jp_tren.add(jt_manguoidung);
	    		
	    		Jp_tren.add(jl_hovaten);
	    		Jp_tren.add(jt_hovaten);
	    		
	    		Jp_tren.add(jl_ngaysing);
	    		Jp_tren.add(jt_ngaysing);
	    		
	    		Jp_tren.add(jl_sdt);
	    		Jp_tren.add(jt_sdt);
	    		
	    		Jp_tren.add(jl_diachi);
	    		Jp_tren.add(jt_diachi);
	    		
	    		
	    		JPanel Jp_giua = new JPanel();
	    		//Jp_giua.setForeground(new Color(71, 117, 49));
	    		Jp_giua.setBackground(new Color(204, 204, 255));
	    		
	    		JButton jb_them = new JButton("Thêm");
	    		jb_them.addActionListener(ac);
	    		JButton jb_sua = new JButton("Sửa");
	    		jb_sua.addActionListener(ac);
	    		JButton jb_xoa = new JButton("Xóa");
	    		jb_xoa.addActionListener(ac);
	    		JButton jb_lammoi = new JButton("Làm Mới ");
	    		jb_lammoi.addActionListener(ac);
	    		JButton jb_tim = new JButton("Tìm ");
	    		jb_tim.addActionListener(ac);
	    		JTextField jt_tk = new JTextField(15);
	    		
	    		Jp_giua.add(jb_them);
	    		Jp_giua.add(jb_sua);
	    		Jp_giua.add(jb_xoa);
	    		Jp_giua.add(jb_lammoi);
	    		Jp_giua.add(jb_tim);
	    		Jp_giua.add(jt_tk);
	    		
	    		JPanel Jp_duoi = new JPanel(new BorderLayout());
	    		
//	    		String[] columnNames = {"Mã người dùng","Họ và tên", "Ngày sinh", "Số điện thoại", "Địa chỉ"};
//	    		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//	    		jt_thongtinnguoidung = new JTable(model);
//	    		Object[] data = {"a", "a", "a","a", "a", "a","a"};
//	    		model.addRow(data);
//	    		
//	    		
//	    		JScrollPane jscoll = new JScrollPane(jt_thongtinnguoidung);
//	    		jscoll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    		DefaultTableModel dtm_tt = new DefaultTableModel();
	    		dtm_tt.addColumn("Mã người dùng");
	    		dtm_tt.addColumn("Họ và tên");
	    		dtm_tt.addColumn("Ngày sinh");
	    		dtm_tt.addColumn("Số điện thoại");
	    		dtm_tt.addColumn("Địa chỉ");
	    		
	    		JTable jt_tt = new JTable(dtm_tt);
	    		JScrollPane jscoll_tt = new JScrollPane(jt_tt);
	    		
	    		Jp_duoi.setBorder(border);
	    		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
					PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.thongtinnguoidung");
					ResultSet rs = prs.executeQuery();
					while(rs.next()) {
						String maNguoiDung = rs.getString("manguoidung");
						String hoVaten = rs.getString("hovaten");
						String ngaySinh = rs.getString("ngaysing");
						String sdt = rs.getString("sdt");
						String diaChi = rs.getString("diachi");
						dtm_tt.addRow(new String[] {maNguoiDung, hoVaten, ngaySinh, sdt, diaChi});
					}
					prs.close();
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
	    		
	    		jb_them.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String maNguoiDung = jt_manguoidung.getText();
						String hoTen = jt_hovaten.getText();
						String ngaySinh = jt_ngaysing.getText();
						String sdt = jt_sdt.getText();
						String diaChi = jt_diachi.getText();
						if(!maNguoiDung.isEmpty() && !hoTen.isEmpty() && !ngaySinh.isEmpty() && !sdt.isEmpty() && !diaChi.isEmpty()) {
							try {
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
								Statement stm = conn.createStatement();
								stm.executeUpdate("insert into quanlithuoc.thongtinnguoidung(manguoidung,hovaten,ngaysing,sdt,diachi) values('"+jt_manguoidung.getText()+"', '"+jt_hovaten.getText()+"', '"+jt_ngaysing.getText()+"', '"+jt_sdt.getText()+"', '"+jt_diachi.getText()+"')");
							    JOptionPane.showMessageDialog(null, "Thêm Thành Công");
							    stm.close();
							    conn.close();
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}else {
							JOptionPane.showMessageDialog(null, "Thêm Thất Bại");
						}
					}
					
				});
	    		
	    		jb_lammoi.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							dtm_tt.setRowCount(0);
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
							PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.thongtinnguoidung");
							ResultSet rs = prs.executeQuery();
							while(rs.next()) {
								String maNguoiDung = rs.getString("manguoidung");
								String hoVaten = rs.getString("hovaten");
								String ngaySinh = rs.getString("ngaysing");
								String sdt = rs.getString("sdt");
								String diaChi = rs.getString("diachi");
								dtm_tt.addRow(new String[] {maNguoiDung, hoVaten, ngaySinh, sdt, diaChi});
							}
							prs.close();
							conn.close();
						} catch (Exception e2) {
							// TODO: handle exception
							e2.printStackTrace();
						}
					}
				});
	    		jb_tim.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							dtm_tt.setRowCount(0);
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
							PreparedStatement prs = conn.prepareStatement("SELECT * FROM quanlithuoc.thongtinnguoidung where manguoidung = '"+jt_tk.getText()+"'");
							ResultSet rs = prs.executeQuery();
							while(rs.next()) {
								String maNguoiDung = rs.getString("manguoidung");
								String hoVaten = rs.getString("hovaten");
								String ngaySinh = rs.getString("ngaysing");
								String sdt = rs.getString("sdt");
								String diaChi = rs.getString("diachi");
								dtm_tt.addRow(new String[] {maNguoiDung, hoVaten, ngaySinh, sdt, diaChi});
							}
							prs.close();
							conn.close();
						} catch (Exception e2) {
							// TODO: handle exception
						}
					}
				});
	    		jt_tt.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						int selectRow_tt = jt_tt.getSelectedRow();
						manguoiDungtt = jt_tt.getValueAt(selectRow_tt, 0).toString();
						hoTentt = jt_tt.getValueAt(selectRow_tt, 1).toString();
						ngaySinhtt = jt_tt.getValueAt(selectRow_tt, 2).toString();
						sdttt = jt_tt.getValueAt(selectRow_tt, 3).toString();
						diaChitt = jt_tt.getValueAt(selectRow_tt, 4).toString();
						jt_manguoidung.setText(manguoiDungtt);
						jt_hovaten.setText(hoTentt);
						jt_ngaysing.setText(ngaySinhtt);
						jt_sdt.setText(sdttt);
						jt_diachi.setText(diaChitt);
					}
				});
	    		
	    		jb_xoa.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
							Statement stm = conn.createStatement();
							int ret = JOptionPane.showConfirmDialog(null, "Xác Nhận Xóa?","Xóa", JOptionPane.YES_NO_CANCEL_OPTION);
							if(ret == JOptionPane.YES_OPTION) {
								stm.executeUpdate("delete from quanlithuoc.thongtinnguoidung where manguoidung ='"+manguoiDungtt+"'");
								JOptionPane.showMessageDialog(null, "Xóa Thành Công");
							}
						} catch (Exception e2) {
							// TODO: handle exception
						}
					}
				});
	    		
	    		jb_sua.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String maNguoiDung = jt_manguoidung.getText();
						String hoTen = jt_hovaten.getText();
						String ngaySinh = jt_ngaysing.getText();
						String sdt = jt_sdt.getText();
						String diaChi = jt_diachi.getText();
						if(!maNguoiDung.isEmpty() && !hoTen.isEmpty() && !ngaySinh.isEmpty() && !sdt.isEmpty() && !diaChi.isEmpty()) {
							try {
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","050705");
								Statement stm = conn.createStatement();
								stm.executeUpdate("update quanlithuoc.thongtinnguoidung set manguoidung ='"+jt_manguoidung.getText()+"', hovaten ='"+jt_hovaten.getText()+"', ngaysing ='"+jt_ngaysing.getText()+"', sdt ='"+jt_sdt.getText()+"', diachi ='"+jt_diachi.getText()+"' where manguoidung ='"+jt_manguoidung.getText()+"'");
							    JOptionPane.showMessageDialog(null, "Sửa Thành Công");
							    stm.close();
							    conn.close();
							} catch (Exception e2) {
								e2.printStackTrace();
							}
						}else {
							JOptionPane.showMessageDialog(null, "Sửa Thất Bại");
						}
					}
				});
	    		
	    		Jp_duoi.add(jscoll_tt,BorderLayout.CENTER);
	    		
	    		panel4.add(Jp_tren,BorderLayout.NORTH);
	    		panel4.add(Jp_giua,BorderLayout.CENTER);
	    		panel4.add(Jp_duoi,BorderLayout.SOUTH);
	    		
	    		panel4.setVisible(true);
				return panel4;
		    	
		    }
		   
//		    public void updateData(ResultSet result) {
//	    	    String[] colsName = {"Mã người dùng", "Họ và tên", "Ngày sinh", "Số điện thoại", "Địa chỉ"};
//	    	    DefaultTableModel model = new DefaultTableModel(colsName, 0);
//
//	    	    try {
//	    	        while (result.next()) {
//	    	            String[] row = new String[5];
//	    	            row[0] = result.getString("manguoidung");
//	    	            row[1] = result.getString("hovaten");
//	    	            row[2] = result.getString("ngaysinh");
//	    	            row[3] = result.getString("sodienthoai");
//	    	            row[4] = result.getString("diachi");
//	    	            model.addRow(row);
//	    	        }
//	    	    } catch (SQLException e) {
//	    	        e.printStackTrace();
//	    	    }
//
//	    	    jt_thongtinnguoidung.setModel(model);
//	    	} 

			private void updateData(Object view) {
				// TODO Auto-generated method stub
				
			}

			private Object view() {
				// TODO Auto-generated method stub
				return null;
			}

			private void connectSQL() {
				// TODO Auto-generated method stub
				
			}

			private void initComponent() {
				// TODO Auto-generated method stub
				
			}

			public void xoaForm() {
				jt_solohang.setText("");
				jt_ngaynhapkho.setText("");
				jt_ngayhethan.setText("");
				jt_soluong.setText("");
				jt_nhacungcap.setText("");
				
				
				jt_manhom.setText("");
				jt_tennhom.setText("");
				jt_ghichu.setText("");
				
				jt_madonthuoc.setText("");
				jt_tensp.setText("");
				jt_soluong1.setText("");
				jt_hansudung.setText("");
				jt_cachsudung.setText("");
				
				jt_manguoidung.setText("");
				jt_hovaten.setText("");
				jt_ngaysing.setText("");
				jt_sdt.setText("");
				jt_diachi.setText("");
			}


			
			public void them(thongtinnguoidungModel nguoidung) {
				this.model3.insert3(nguoidung);
	    		DefaultTableModel model_table =(DefaultTableModel) jt_thongtinnguoidung.getModel();

	    		String hovaten = nguoidung.getHovaten()+"";	
                        model_table.addRow(new Object[] {
                        nguoidung.getManguoidung()+"",
	    				nguoidung.getHovaten()+"",
	    				nguoidung.getDiachi()+"",
	    				nguoidung.getSdt()+"",
	    				(nguoidung.getNgaysinh().getYear()+1900)+"-"+(nguoidung.getNgaysinh().getMonth()+1)+"-"+(nguoidung.getNgaysinh().getDay())});
}
			
			public void them(hoadonthuocModel donthuoc) {
				this.model.insert1(donthuoc);
	    		DefaultTableModel model_table =(DefaultTableModel) jt_donthuoc.getModel();	
                        model_table.addRow(new Object[] {
                        donthuoc.getMadonthuoc()+"",
                        donthuoc.getTensp()+"",
                        donthuoc.getSoluong()+"",
                        donthuoc.getHdsudung()+"",
                        donthuoc.getManguoidung1()
	    				});
			}
			
			public void them(quanlikhothuoc kho) {
				this.model2.insert2(kho);
	    		DefaultTableModel model_table =(DefaultTableModel) jt_quanlikho.getModel();	
                        model_table.addRow(new Object[] {
                        kho.getSolohang()+"",
                        kho.getNgaynhapkho()+"",
                        kho.getNgayhethan()+"",
                        kho.getSoluong()+"",
                        kho.getNhacungcap()
	    				});
			}
			
			public void them(danhmucspModel danhmuc) {
				this.model4.insert4(danhmuc);
	    		DefaultTableModel model_table =(DefaultTableModel) jt_quanlinhom.getModel();	
                        model_table.addRow(new Object[] {
                        danhmuc.getManhom()+"",
                        danhmuc.getTennhom()+"",
                        danhmuc.getGhichu()
	    				});
			}
			
			
			public void sua(danhmucspModel danhmuc) {
				// TODO Auto-generated method stub
				
			}
			
			public void sua(quanlikhothuoc kho) {
				// TODO Auto-generated method stub
				
			}
			
			public void sua(thongtinnguoidungModel nguoidung) {
				// TODO Auto-generated method stub
				
			}
			
			public void sua(hoadonthuocModel donthuoc) {
				// TODO Auto-generated method stub
				
			}

			public void hienthithongtinDaChon(thongtinnguoidungModel nguoidung) {
				DefaultTableModel table_model =(DefaultTableModel) jt_thongtinnguoidung.getModel();
				int i_row = jt_thongtinnguoidung.getSelectedRow();
				
				String hovaten = String.valueOf(table_model.getValueAt(i_row, 0)+"");
    		    Date ngaysinh = Date.valueOf(table_model.getValueAt(i_row, 2)+"");
        		String sdt = String.valueOf(table_model.getValueAt(i_row, 3)+"");
        		String diachi = String.valueOf(table_model.getValueAt(i_row, 4)+"");
        		
        		this.jt_hovaten.setText(hovaten+"");
        		this.jt_ngaysing.setText(ngaysinh+"");
        		this.jt_sdt.setText(sdt+"");
        		this.jt_diachi.setText(diachi+"");
			}
			
			public void hienthithongtinDaChon(quanlikhothuoc kho) {
				DefaultTableModel table_model =(DefaultTableModel) jt_quanlikho.getModel();
				int i_row = jt_thongtinnguoidung.getSelectedRow();
				int solohang = Integer.valueOf(table_model.getValueAt(i_row, 0)+"");
        		Date ngaynhapkho = Date.valueOf(table_model.getValueAt(i_row, 1)+"");
        		Date ngayhethan = Date.valueOf(table_model.getValueAt(i_row, 2)+"");
        		int soluong = Integer.valueOf(table_model.getValueAt(i_row, 3)+"");
        		String nhacungcap = String.valueOf(table_model.getValueAt(i_row, 4)+"");
        		
        		this.jt_solohang.setText(solohang+"");
        		this.jt_ngaynhapkho.setText(ngaynhapkho+"");
        		this.jt_ngayhethan.setText(ngaynhapkho+"");
        		this.jt_soluong.setText(soluong +"");
        		this.jt_nhacungcap.setText(nhacungcap+"");
			}
			
			public void hienthithongtinDaChon(danhmucspModel danhmuc) {
				DefaultTableModel table_model =(DefaultTableModel) jt_quanlinhom.getModel();
				int i_row = jt_thongtinnguoidung.getSelectedRow();
        		String manhom = String.valueOf(table_model.getValueAt(i_row, 0)+"");
        		String tennhom = String.valueOf(table_model.getValueAt(i_row, 1)+"");
        		String ghichu = String.valueOf(table_model.getValueAt(i_row, 2)+"");
        		
        		this.jt_manhom.setText(tennhom+"");
        		this.jt_tennhom.setText(tennhom+"");
        		this.jt_ghichu.setText(ghichu+"");
     
			}
//            public Benhnhan getdsdonthuoc(int i_row) {
//            	
//            }
			public void hienthithongtinDaChon(hoadonthuocModel donthuoc) {
				DefaultTableModel table_model =(DefaultTableModel) jt_donthuoc.getModel();
				int i_row = jt_donthuoc.getSelectedRow();
		   		String madonthuoc = String.valueOf(table_model.getValueAt(i_row, 0)+"");
        		String tensp = String.valueOf(table_model.getValueAt(i_row, 1)+"");
        		String soluong1 = String.valueOf(table_model.getValueAt(i_row, 3)+"");
        		Date hansudung = Date.valueOf(table_model.getValueAt(i_row, 4)+"");
        		String hdsudung = String.valueOf(table_model.getValueAt(i_row, 5)+"");
        		String manguoidung1 = String.valueOf(table_model.getValueAt(i_row, 6)+"");
        		
        		this.jt_madonthuoc.setText(madonthuoc+"");
        		this.jt_tensp.setText(tensp+"");
        		this.jt_soluong1.setText(soluong1+"");
        		this.jt_hansudung.setText(hansudung+"");
        		this.jt_cachsudung.setText(hdsudung+""); 
        		this.jt_manguoidung1.setText(manguoidung1+"");

			}	

			public void thuchienxoa() {
				DefaultTableModel model_table =(DefaultTableModel) jt_donthuoc.getModel();	
              // int i_row = jt_donthuoc.getSelectedRow();
              // int luachon = JOptionPane.showConfirmDialog(jt_donthuoc, "Bạn có chắc chắn muốn xóa");
				//if(luachon==JOptionPane.YES_NO_OPTION) {
//					this.model.delete1(dsdonthuoc);
				//}
			}
//			public static void main(String[] args) {
//				new qlthuoc();
//			}
//			 
}