package com.BBT;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Main extends javax.swing.JFrame {

	public Main() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// GEN-BEGIN:initComponents
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jButton1.setBackground(Color.RED);
		jButton1.setFont(new Font("Elephant", jButton1.getFont().getStyle(), 17));
		jButton2 = new javax.swing.JButton();
		jButton2.setBackground(Color.RED);
		jButton2.setFont(new Font("Elephant", Font.PLAIN, 17));
		jButton3 = new javax.swing.JButton();
		jButton3.setBackground(Color.RED);
		jButton3.setFont(new Font("Elephant", Font.PLAIN, 17));
		jButton4 = new javax.swing.JButton();
		jButton4.setBackground(Color.RED);
		jButton4.setFont(new Font("Elephant", Font.PLAIN, 17));
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setIcon(new ImageIcon("C:\\Users\\Shubham\\Downloads\\bbt-logo.png"));
		jButton5 = new javax.swing.JButton();
		jButton5.setBackground(Color.RED);
		jButton5.setFont(new Font("Elephant", Font.PLAIN, 17));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("Car Registation");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Customer");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("Rental");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("Return");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		jLabel1.setForeground(Color.BLACK);
		jLabel1.setText("Menu");

		jButton5.setText("Logout");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()
				.addGap(173)
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jButton5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
						.addComponent(jButton4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
						.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
						.addComponent(jButton2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
						.addComponent(jButton1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
				.addGap(154))
				.addGroup(layout.createSequentialGroup().addContainerGap(128, Short.MAX_VALUE).addComponent(jLabel1)
						.addGap(125)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(7)
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(66, Short.MAX_VALUE)));
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:

		caradd add = new caradd();

		add.setVisible(true);

	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		customer add = new customer();

		add.setVisible(true);
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// TODO add your handling code here:
		rental add = new rental();

		add.setVisible(true);
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		// TODO add your handling code here:

		Duepay add = new Duepay();

		add.setVisible(true);

	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		// TODO add your handling code here:
		Login lo = new Login();
		this.hide();
		lo.setVisible(true);
	}// GEN-LAST:event_jButton5ActionPerformed

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	// End of variables declaration//GEN-END:variables
}
