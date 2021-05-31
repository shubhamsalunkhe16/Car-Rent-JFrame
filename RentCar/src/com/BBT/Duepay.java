package com.BBT;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Duepay extends javax.swing.JFrame {

	Connection con;
	PreparedStatement pst = null;
	PreparedStatement pst2 = null;
	PreparedStatement pst3 = null;
	ResultSet rs;

	public Duepay() {
		initComponents();
		table_update1();

	}

	
	@SuppressWarnings("unchecked")
	
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setFont(new Font("Elephant", Font.PLAIN, 14));
		car_id = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel2.setFont(new Font("Elephant", Font.PLAIN, 14));
		txt_custid = new javax.swing.JTextField();
		txtdue = new javax.swing.JTextField();
		txtelp = new javax.swing.JTextField();
		txtfine = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel3.setFont(new Font("Elephant", Font.PLAIN, 14));
		jLabel4 = new javax.swing.JLabel();
		jLabel4.setFont(new Font("Elephant", Font.PLAIN, 14));
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setFont(new Font("Elephant", Font.PLAIN, 14));
		jButton1 = new javax.swing.JButton();
		jButton1.setBackground(Color.RED);
		jButton1.setFont(new Font("Elephant", Font.PLAIN, 15));
		jButton2 = new javax.swing.JButton();
		jButton2.setBackground(Color.RED);
		jButton2.setFont(new Font("Elephant", Font.PLAIN, 15));
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jLabel1.setText("Car ID");

		car_id.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				car_idMouseClicked(evt);
			}
		});
		car_id.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				car_idActionPerformed(evt);
			}
		});
		car_id.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				car_idKeyPressed(evt);
			}
		});

		jLabel2.setText("Customer ID");

		jLabel3.setText("Date");

		jLabel4.setText("Days Elapsed");

		jLabel5.setText("Fine");

		jButton1.setText("Paid");
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

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addGroup(jPanel1Layout
						.createSequentialGroup()
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel3))
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel2))
								.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel4))
								.addGroup(
										jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)))
						.addGap(30)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(car_id, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
										.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txt_custid, GroupLayout.DEFAULT_SIZE, 193,
														Short.MAX_VALUE)
												.addComponent(txtdue))
										.addComponent(txtelp, GroupLayout.PREFERRED_SIZE, 193,
												GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel5)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 91,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jButton2,
														GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
										.addComponent(txtfine, GroupLayout.PREFERRED_SIZE, 193,
												GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(33, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(31)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(car_id, GroupLayout.PREFERRED_SIZE, 28,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1))
								.addGap(18)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txt_custid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 14,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtdue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel3))
								.addGap(18)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtelp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4))
								.addGap(18)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtfine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel5))
								.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
								.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
										.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGap(26)));
		jPanel1.setLayout(jPanel1Layout);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Car ID", "Customer ID", "Fee", "Issue Date", "Due Date" }) {
			Class[] types = new Class[] { java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class,
					java.lang.Integer.class, java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		lblCarReturn = new JLabel("Car Return");
		lblCarReturn.setIcon(new ImageIcon("C:\\Users\\Shubham\\Downloads\\bbt-logo.png"));
		lblCarReturn.setFont(new Font("Elephant", Font.PLAIN, 30));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(20)
										.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(jScrollPane1,
												GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(253).addComponent(lblCarReturn,
										GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(41, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addGap(20).addComponent(lblCarReturn, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
				.addGap(38)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addContainerGap(39, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void car_idActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_car_idActionPerformed
		// TODO add your handling code here:

	}// GEN-LAST:event_car_idActionPerformed

	private void car_idMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_car_idMouseClicked
		// TODO add your handling code here:
	}// GEN-LAST:event_car_idMouseClicked

	private void table_update() {
		int CC;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
			pst = con.prepareStatement("SELECT * FROM returncar");
			ResultSet Rs = pst.executeQuery();

			ResultSetMetaData RSMD = Rs.getMetaData();
			CC = RSMD.getColumnCount();
			DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
			DFT.setRowCount(0);

			while (Rs.next()) {
				Vector v2 = new Vector();

				for (int ii = 1; ii <= CC; ii++) {
					v2.add(Rs.getString("car_id"));
					v2.add(Rs.getString("cust_id"));
					v2.add(Rs.getString("return_date"));
					v2.add(Rs.getString("elp"));
					v2.add(Rs.getString("fine"));
				}

				DFT.addRow(v2);
			}
		} catch (Exception e) {
		}
	}

	private void table_update1() {
		int CC;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
			PreparedStatement pst1 = con.prepareStatement("SELECT * FROM rental");
			ResultSet Rs1 = pst1.executeQuery();

			ResultSetMetaData RSMD = Rs1.getMetaData();
			CC = RSMD.getColumnCount();
			DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
			DFT.setRowCount(0);

			while (Rs1.next()) {
				Vector v2 = new Vector();

				for (int ii = 1; ii <= CC; ii++) {
					v2.add(Rs1.getString("car_id"));
					v2.add(Rs1.getString("cust_id"));
					v2.add(Rs1.getString("fee"));
					v2.add(Rs1.getString("date"));
					v2.add(Rs1.getString("due"));
				}

				DFT.addRow(v2);
			}
		} catch (Exception e) {
		}
	}

	private void car_idKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_car_idKeyPressed
		// TODO add your handling code here:
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

			try {

				System.out.println("hi");
				String car_id1 = car_id.getText();

				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");
				pst = con.prepareStatement(
						"select car_id,cust_id,due,DATEDIFF(NOW(),due) as elap from rental where car_id = ? ");
				pst.setString(1, car_id1);
				rs = pst.executeQuery();

				if (rs.next() == false) {

					JOptionPane.showMessageDialog(null, "Car No not Found");
				} else {
					String productname = rs.getString("cust_id");
					txt_custid.setText(productname.trim());

					String datedue = rs.getString("due");
					txtdue.setText(datedue.trim());

					String elp = rs.getString("elap");
					// JOptionPane.showMessageDialog(this, elp);

					int elaped = Integer.parseInt(elp);

					if (elaped > 0) {
						txtelp.setText(elp);

						int fine = elaped * 100;

						txtfine.setText(String.valueOf(fine));

					} else {
						txtelp.setText("0");
						txtfine.setText("0");

					}

				}

			} catch (ClassNotFoundException ex) {
				Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
			} catch (SQLException ex) {
				Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}// GEN-LAST:event_car_idKeyPressed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:

		try {

			String car_id1 = car_id.getText();
			String custid = txt_custid.getText();
			String returndate = txtdue.getText();
			String elped = txtelp.getText();
			String fine = txtfine.getText();

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/carrent", "root", "");

			pst3 = con.prepareStatement("insert into returncar (car_id,cust_id,return_date,elp,fine)values(?,?,?,?,?)");
			pst3.setString(1, car_id1);
			pst3.setString(2, custid);
			pst3.setString(3, returndate);
			pst3.setString(4, elped);
			pst3.setString(5, fine);
			pst3.executeUpdate();

			pst = con.prepareStatement("update car_reg set available = 'Yes' where car_reg = ?  ");
			pst.setString(1, car_id1);
			pst.executeUpdate();

			pst2 = con.prepareStatement("Delete from rental where car_id = ?  ");
			pst2.setString(1, car_id1);
			pst2.executeUpdate();

			JOptionPane.showMessageDialog(this, "Updated Saved");

			car_id.setText("");
			txt_custid.setText("");
			txtdue.setText("");
			txtelp.setText("");
			txtfine.setText("");
			table_update1();

		} catch (ClassNotFoundException ex) {
			Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);

		} catch (SQLException ex) {
			Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);

		}

	}// GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(Duepay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Duepay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Duepay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Duepay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				Duepay dp = new Duepay();
				new Duepay().setVisible(true);
				dp.table_update1();
			}
		});
	}

	
	private javax.swing.JTextField car_id;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField txt_custid;
	private javax.swing.JTextField txtdue;
	private javax.swing.JTextField txtelp;
	private javax.swing.JTextField txtfine;
	private JLabel lblCarReturn;
}
