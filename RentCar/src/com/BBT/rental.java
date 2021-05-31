package com.BBT;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTable;

public class rental extends javax.swing.JFrame {

	public rental() {
		initComponents();

		LoadCategory();
		txtdate.setDateFormatString("yyyy/MM/dd");
		txtdue.setDateFormatString("yyyy/MM/dd");

	}

	Connection con;
	PreparedStatement pst = null;
	PreparedStatement pst1 = null;
	PreparedStatement pst2 = null;
	ResultSet rs;
	ResultSet rs1;

	public void LoadCategory() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
			pst = con.prepareStatement("SELECT * FROM car_reg");
			rs = pst.executeQuery();
			jComboBox1.removeAllItems();

			while (rs.next()) {
				jComboBox1.addItem(rs.getString(2));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	// GEN-BEGIN:initComponents
	private void initComponents() {

		dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
		dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
		dateChooserDialog3 = new datechooser.beans.DateChooserDialog();
		dateChooserDialog4 = new datechooser.beans.DateChooserDialog();
		jPanel1 = new javax.swing.JPanel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setFont(new Font("Elephant", Font.PLAIN, 16));
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setFont(new Font("Elephant", Font.PLAIN, 16));
		txt_custid = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel3.setFont(new Font("Elephant", Font.PLAIN, 16));
		txtname = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel4.setFont(new Font("Elephant", Font.PLAIN, 16));
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setFont(new Font("Elephant", Font.PLAIN, 16));
		jButton1 = new javax.swing.JButton();
		jButton1.setBackground(Color.RED);
		jButton1.setFont(new Font("Elephant", Font.PLAIN, 18));
		txtavl = new javax.swing.JTextField();
		txtavl.setBackground(Color.LIGHT_GRAY);
		jButton2 = new javax.swing.JButton();
		jButton2.setBackground(Color.RED);
		jButton2.setFont(new Font("Elephant", Font.PLAIN, 18));
		jLabel6 = new javax.swing.JLabel();
		jLabel6.setFont(new Font("Elephant", Font.PLAIN, 16));
		txtfee = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		txtdate = new com.toedter.calendar.JDateChooser();
		txtdue = new com.toedter.calendar.JDateChooser();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null)); // NOI18N

		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jLabel1.setText("Car ID");

		jLabel2.setText("Customer ID");

		txt_custid.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txt_custidActionPerformed(evt);
			}
		});
		txt_custid.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txt_custidKeyPressed(evt);
			}
		});

		jLabel3.setText("Customer Name");

		jLabel4.setText("Date");

		jLabel5.setText("Due Date");

		jButton1.setText("ok");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				jButton1ActionPerformed(evt);

			}
		});

		jButton2.setText("Cancel");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel6.setText("Retail fee");

		jLabel7.setFont(new Font("Elephant", Font.PLAIN, 18)); // NOI18N
		jLabel7.setText("car Availablility");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout
				.setHorizontalGroup(
						jPanel1Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel1Layout
								.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(126)
												.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 112,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
												.addComponent(
														jButton2, GroupLayout.PREFERRED_SIZE, 105,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
														.addGroup(jPanel1Layout.createSequentialGroup()
																.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 132,
																		Short.MAX_VALUE)
																.addGap(80))
														.addComponent(jLabel2).addComponent(jLabel6)
														.addComponent(jLabel4).addComponent(jLabel5)
														.addComponent(jLabel1))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
														.addComponent(txtdue, GroupLayout.DEFAULT_SIZE, 197,
																Short.MAX_VALUE)
														.addComponent(txtdate, GroupLayout.DEFAULT_SIZE, 197,
																Short.MAX_VALUE)
														.addComponent(txtfee, GroupLayout.DEFAULT_SIZE, 197,
																Short.MAX_VALUE)
														.addComponent(txtname, 197, 197, Short.MAX_VALUE)
														.addComponent(txt_custid, GroupLayout.DEFAULT_SIZE, 197,
																Short.MAX_VALUE)
														.addComponent(jComboBox1, 0, 197, Short.MAX_VALUE))))
								.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup()
														.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 150,
																GroupLayout.PREFERRED_SIZE)
														.addGap(10))
										.addGroup(Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup().addComponent(txtavl,
														GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
														.addGap(38)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addGap(20)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel1))
				.addGap(6)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(11).addComponent(jLabel2).addGap(18)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(txtname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(12).addComponent(txt_custid,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtfee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(txtdate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(txtdue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel5)))
				.addGap(31)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addGap(148))
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel7)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtavl, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addGap(269)));
		jPanel1.setLayout(jPanel1Layout);

		lblCarRental = new JLabel("Car Rental");
		lblCarRental.setIcon(new ImageIcon("C:\\Users\\Shubham\\Downloads\\bbt-logo.png"));
		lblCarRental.setFont(new Font("Elephant", Font.PLAIN, 30));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(145).addComponent(lblCarRental,
								GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(19, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(lblCarRental, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 343, Short.MAX_VALUE)
						.addContainerGap()));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:

		try {

			String name = jComboBox1.getSelectedItem().toString();
			String custid = txt_custid.getText();
			String fee = txtfee.getText();
			SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
			String date = Date_Format.format(txtdate.getDate());
			SimpleDateFormat Date_Format1 = new SimpleDateFormat("yyyy-MM-dd");
			String date2 = Date_Format1.format(txtdue.getDate());

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
			pst = con.prepareStatement("insert into rental  (car_id,cust_id,fee,date,due)values(?,?,?,?,?)");

			pst.setString(1, name);
			pst.setString(2, custid);
			pst.setString(3, fee);
			pst.setString(4, date);
			pst.setString(5, date2);
			pst.executeUpdate();

			pst1 = con.prepareStatement("update car_reg set available = 'No' where car_reg = ?  ");
			pst1.setString(1, name);
			pst1.executeUpdate();

			JOptionPane.showMessageDialog(this, "Sucsessfully Saved");
			jComboBox1.setSelectedIndex(0);
			txt_custid.setText("");
			txtname.setText("");
			txtfee.setText("");
			txtdate.setDate(null);
			txtdue.setDate(null);

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jButton1ActionPerformed

	private void txt_custidActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_custidActionPerformed
		// TODO add your handling code here:

	}// GEN-LAST:event_txt_custidActionPerformed

	private void txt_custidKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txt_custidKeyPressed
		// TODO add your handling code here:
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

			try {

				System.out.println("hi");
				String custid = txt_custid.getText();

				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
				pst = con.prepareStatement("select * from customer where cust_id = ? ");
				pst.setString(1, custid);
				rs = pst.executeQuery();

				if (rs.next() == false) {

					JOptionPane.showMessageDialog(null, "Customer No not Found");
				} else {
					String productname = rs.getString("name");

					txtname.setText(productname.trim());

				}

			} catch (ClassNotFoundException ex) {
				Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
			} catch (SQLException ex) {
				Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}// GEN-LAST:event_txt_custidKeyPressed

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
		// TODO add your handling code here:

		try {

			String car_id = jComboBox1.getSelectedItem().toString();

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
			pst2 = con.prepareStatement("select * from car_reg where car_reg = ? ");
			pst2.setString(1, car_id);
			rs1 = pst2.executeQuery();

			if (rs1.next() == false) {
				JOptionPane.showMessageDialog(null, "Car No not Found");
			} else {
				String available = rs1.getString("available");
				txtavl.setText(available.trim());

				if (available.equals("Yes")) {
					txt_custid.setEnabled(true);
					txtname.setEnabled(true);
					txtfee.setEnabled(true);
					txtdate.setEnabled(true);
					txtdue.setEnabled(true);
				} else {
					txt_custid.setEnabled(false);
					txtname.setEnabled(false);
					txtdate.setEnabled(false);
					txtdue.setEnabled(false);
					txtfee.setEnabled(false);
				}

			}

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
		}

	}// GEN-LAST:event_jComboBox1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		setVisible(false);
		dispose();
	}// GEN-LAST:event_jButton2ActionPerformed

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
			java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new rental().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private datechooser.beans.DateChooserDialog dateChooserDialog1;
	private datechooser.beans.DateChooserDialog dateChooserDialog2;
	private datechooser.beans.DateChooserDialog dateChooserDialog3;
	private datechooser.beans.DateChooserDialog dateChooserDialog4;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField txt_custid;
	private javax.swing.JTextField txtavl;
	private com.toedter.calendar.JDateChooser txtdate;
	private com.toedter.calendar.JDateChooser txtdue;
	private javax.swing.JTextField txtfee;
	private javax.swing.JTextField txtname;
	private JLabel lblCarRental;
	// End of variables declaration//GEN-END:variables
}
