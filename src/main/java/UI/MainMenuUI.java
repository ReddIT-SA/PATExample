/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Cliftonb
 */
public class MainMenuUI extends javax.swing.JFrame {

	/**
	 * This is the constructor, it is the FIRST method called when this
	 * frame is created. Put any code in here that should be run to setup
	 * the frame
	 */
	public MainMenuUI() {
		initComponents();

		/**
		 * This code sets the location of the frame to the center of the
		 * screen
		 */
		setLocationRelativeTo(null);
	}

	/**
	 * This method is auto-generated
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                iconLabel = new javax.swing.JLabel();
                headerLabel = new javax.swing.JLabel();
                manageStudentsButton = new javax.swing.JButton();
                manageAssessmentsButton = new javax.swing.JButton();
                addRecordButton = new javax.swing.JButton();
                viewRecordsButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Classroom Manager");
                setMaximumSize(new java.awt.Dimension(410, 300));
                setPreferredSize(new java.awt.Dimension(410, 300));
                setResizable(false);

                jPanel1.setBackground(new java.awt.Color(204, 204, 204));
                jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

                iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/classroom.png"))); // NOI18N

                headerLabel.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
                headerLabel.setForeground(new java.awt.Color(0, 0, 0));
                headerLabel.setText("Classroom Manager");

                manageStudentsButton.setText("Manage Students");
                manageStudentsButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                manageStudentsButtonActionPerformed(evt);
                        }
                });

                manageAssessmentsButton.setText("Manage Assessments");
                manageAssessmentsButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                manageAssessmentsButtonActionPerformed(evt);
                        }
                });

                addRecordButton.setText("Add Record");
                addRecordButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addRecordButtonActionPerformed(evt);
                        }
                });

                viewRecordsButton.setText("View Records");
                viewRecordsButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                viewRecordsButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(manageAssessmentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(manageStudentsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(headerLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(viewRecordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(17, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(manageStudentsButton)
                                .addGap(18, 18, 18)
                                .addComponent(manageAssessmentsButton)
                                .addGap(18, 18, 18)
                                .addComponent(addRecordButton)
                                .addGap(18, 18, 18)
                                .addComponent(viewRecordsButton)
                                .addContainerGap(31, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void manageStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStudentsButtonActionPerformed
		//This is how you "open" a new screen based on a button press
		new ManageStudentsUI().setVisible(true);
		//and close this screen.
		dispose();
        }//GEN-LAST:event_manageStudentsButtonActionPerformed

        private void manageAssessmentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAssessmentsButtonActionPerformed
		new ManageAssessmentsUI().setVisible(true);
		dispose();
        }//GEN-LAST:event_manageAssessmentsButtonActionPerformed

        private void addRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordButtonActionPerformed
		new AddRecordUI().setVisible(true);
		dispose();
        }//GEN-LAST:event_addRecordButtonActionPerformed

        private void viewRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordsButtonActionPerformed
		new ViewRecordsUI().setVisible(true);
		dispose();
        }//GEN-LAST:event_viewRecordsButtonActionPerformed

	/**
	 * ********************************************************
	 * THE MAIN MENU WILL BE THE ONLY CLASS WITH A MAIN METHOD!!!
	 * ******************************************************** The whole
	 * main method is auto-generated
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
			java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainMenuUI().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addRecordButton;
        private javax.swing.JLabel headerLabel;
        private javax.swing.JLabel iconLabel;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JButton manageAssessmentsButton;
        private javax.swing.JButton manageStudentsButton;
        private javax.swing.JButton viewRecordsButton;
        // End of variables declaration//GEN-END:variables
}
