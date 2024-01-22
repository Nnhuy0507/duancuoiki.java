package View;
	import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class truycapxem {
		private JFrame mainjf;
				private JScrollPane scrollPane;
				private JPanel panel;

		public truycapxem() {
			mainjf = new JFrame("QUẢN LÍ CẤP PHÁT THUỐC");
			mainjf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainjf.setSize(700, 500);
		
		Border bo =  BorderFactory.createLineBorder(Color.black, 2);
		JButton jb = new JButton("TRUY CẬP >");
        jb.setFont(new Font("Arial", Font.BOLD, 25));
        jb.setBorder(bo);
        jb.setForeground(new Color(153, 0, 255));
        
        
        mainjf.setBackground(new Color(204, 204, 255));
		
		
		mainjf.add(jb);
		
		mainjf.setLocationRelativeTo(null);
		mainjf.setVisible(true);
		
		jb.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Xử lý sự kiện khi nút "TRUY CẬP >" được nhấn
		      new qlthuoc();
		    }
		});
}

	}
