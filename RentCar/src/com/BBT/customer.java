package com.BBT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customer extends javax.swing.JFrame {

	PreparedStatement ps;
	Connection con;

	public customer() {
		initComponents();
		table_update();
		autoID();
	}

	@SuppressWarnings("unchecked")
	// GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtcustid = new javax.swing.JTextField();
		txtcustid.setEditable(false);
		jLabel2 = new javax.swing.JLabel();
		txtname = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtaddress = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton1.setBackground(Color.RED);
		jLabel4 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jButton2.setBackground(Color.RED);
		jButton2.setFont(new Font("Elephant", Font.PLAIN, 16));
		jButton3 = new javax.swing.JButton();
		jButton3.setBackground(Color.RED);
		jButton3.setFont(new Font("Elephant", Font.PLAIN, 16));
		jButton4 = new javax.swing.JButton();
		jButton4.setBackground(Color.RED);
		jButton4.setFont(new Font("Elephant", Font.PLAIN, 16));
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null)); // NOI18N

		jLabel1.setFont(new Font("Elephant", Font.PLAIN, 18)); // NOI18N
		jLabel1.setText("Customer ID");

		jLabel2.setFont(new Font("Elephant", Font.PLAIN, 18)); // NOI18N
		jLabel2.setText("Name");

		jLabel3.setFont(new Font("Elephant", Font.PLAIN, 18)); // NOI18N
		jLabel3.setText("Mobile No.");

		jButton1.setFont(new Font("Elephant", Font.PLAIN, 16)); // NOI18N
		jButton1.setText("Add");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel4.setFont(new Font("Elephant", Font.PLAIN, 18)); // NOI18N
		jLabel4.setText("Address");

		jButton2.setText("Cancel");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("Edit");

		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("Delete");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		txtmobile = new JTextField();

		JButton btnClear = new JButton();
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtcustid.setText("");
				txtname.setText("");
				txtaddress.setText("");
				txtmobile.setText("");
				autoID();
				table_update();
				jButton1.setEnabled(true);
			}
		});
		btnClear.setText("Clear");
		btnClear.setFont(new Font("Elephant", Font.PLAIN, 16));
		btnClear.setBackground(Color.RED);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(25)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addComponent(jLabel1, Alignment.LEADING)
						.addComponent(jLabel2, Alignment.LEADING).addComponent(jLabel4, Alignment.LEADING)
						.addComponent(jLabel3, Alignment.LEADING)
						.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
										.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(txtmobile).addComponent(txtname).addComponent(txtaddress)
						.addComponent(txtcustid, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
						.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
				.addContainerGap(42, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(99)
						.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE).addGap(115)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(29)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel1).addComponent(
						txtcustid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2).addComponent(
						txtname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(24)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtaddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3).addComponent(
						txtmobile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(21)
				.addGroup(
						jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(btnClear))
				.addGap(18)
				.addGroup(
						jPanel1Layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jButton4))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE).addGap(18)));
		jPanel1.setLayout(jPanel1Layout);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Customer ID", "Name", "Address", "Mobile No." }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
					java.lang.String.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		JLabel lblNewLabel = new JLabel("Customer Registeration");
		lblNewLabel.setFont(new Font("Elephant", Font.PLAIN, 30));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Shubham\\Downloads\\bbt-logo.png"));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
								.addGap(32).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 423,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(128).addComponent(lblNewLabel)))
						.addContainerGap(17, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addGap(18).addComponent(lblNewLabel)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
								.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
						.addContainerGap()));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		try {
			String custid = txtcustid.getText();
			String name = txtname.getText();
			String address = txtaddress.getText();
			String mobile = txtmobile.getText();

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
			ps = con.prepareStatement("insert into customer (cust_id,name,address,mobile)values(?,?,?,?)");
			ps.setString(1, custid);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setString(4, mobile);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(this, "Sucsessfully Saved");

			txtcustid.setText("");
			txtname.setText("");
			txtaddress.setText("");
			txtmobile.setText("");
			autoID();
			table_update();
			jButton1.setEnabled(true);

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(caradd.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(caradd.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:

		setVisible(false);
		dispose();

	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:

		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		int selectedIndex = jTable1.getSelectedRow();
		try {

			String id = model.getValueAt(selectedIndex, 0).toString();
			String name = txtname.getText();
			String add = txtaddress.getText();
			String mob = txtmobile.getText();

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
			ps = con.prepareStatement("update customer set name= ?,address= ?,mobile =? where cust_id = ?");
			ps.setString(1, name);
			ps.setString(2, add);
			ps.setString(3, mob);
			ps.setString(4, id);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(this, "Record Updated");

			txtcustid.setText("");
			txtname.setText("");
			txtaddress.setText("");
			txtmobile.setText("");
			autoID();
			table_update();
			jButton1.setEnabled(true);

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable1MouseClicked
		// TODO add your handling code here:

		DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
		int selectIndex = jTable1.getSelectedRow();

		txtcustid.setText(d1.getValueAt(selectIndex, 0).toString());
		txtname.setText(d1.getValueAt(selectIndex, 1).toString());
		txtaddress.setText(d1.getValueAt(selectIndex, 2).toString());
		txtmobile.setText(d1.getValueAt(selectIndex, 3).toString());

		jButton1.setEnabled(false);

	}// GEN-LAST:event_jTable1MouseClicked

	public void autoID() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
			Statement s = con.createStatement();

			ResultSet rs = s.executeQuery("select  Max(cust_id) from customer");
			rs.next();
			rs.getString("Max(cust_id)");

			if (rs.getString("Max(cust_id)") == null) {
				txtcustid.setText("C0001");
			} else {
				long id = Long
						.parseLong(rs.getString("Max(cust_id)").substring(2, rs.getString("Max(cust_id)").length()));
				id++;
				txtcustid.setText("C0" + String.format("%03d", id));
			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(caradd.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(caradd.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:

		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		int selectedIndex = jTable1.getSelectedRow();
		try {

			String id = model.getValueAt(selectedIndex, 0).toString();

			int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the record", "Warning",
					JOptionPane.YES_NO_OPTION);
			if (dialogResult == JOptionPane.YES_OPTION) {
				// Saving code here

				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
				ps = con.prepareStatement("delete from customer where cust_id = ?");

				ps.setString(1, id);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(this, "Record Delete");

				txtcustid.setText("");
				txtname.setText("");
				txtaddress.setText("");
				txtmobile.setText("");
				autoID();
				table_update();
				jButton1.setEnabled(true);

			}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jButton4ActionPerformed

	private void table_update() {
		int CC;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
			ps = con.prepareStatement("SELECT * FROM customer");
			ResultSet Rs = ps.executeQuery();

			ResultSetMetaData RSMD = Rs.getMetaData();
			CC = RSMD.getColumnCount();
			DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
			DFT.setRowCount(0);

			while (Rs.next()) {
				Vector v2 = new Vector();

				for (int ii = 1; ii <= CC; ii++) {
					v2.add(Rs.getString("cust_id"));
					v2.add(Rs.getString("name"));
					v2.add(Rs.getString("address"));
					v2.add(Rs.getString("mobile"));
				}

				DFT.addRow(v2);
			}
		} catch (Exception e) {
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new customer().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField txtname;
	private javax.swing.JTextField txtaddress;
	private javax.swing.JTextField txtcustid;
	private JTextField txtmobile;
}
