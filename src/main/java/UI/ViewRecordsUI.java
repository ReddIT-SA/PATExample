/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import backend.RecordManager;
import backend.StudentManager;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Cliftonb
 */
public class ViewRecordsUI extends javax.swing.JFrame {

	/**
	 * This is the constructor, it is the FIRST method called when this
	 * frame is created. Put any code in here that should be run to setup
	 * the frame.
	 */
	public ViewRecordsUI() {
		initComponents();

		//set the frame in the centre of the screen
		setLocationRelativeTo(null);

		/**
		 * A combo box (drop down selection) requires a comboModel to
		 * "hold" all the values in the drop down list. This is why we
		 * use an array to get the individual values to add to the
		 * comboModel.
		 */
		DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>();
		String[] students = StudentManager.getStudentsAsArray();
		for (int i = 0; i < students.length; i++) {
			comboModel.addElement(students[i]);
		}
		studentsComboBox.setModel(comboModel);
	}

	/**
	 * This method is auto-generated
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                mainPanel = new javax.swing.JPanel();
                iconLabel = new javax.swing.JLabel();
                headerLabel = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                recordsTextArea = new javax.swing.JTextArea();
                studentRecordsLabel = new javax.swing.JLabel();
                selectStudentLabel = new javax.swing.JLabel();
                homeButton = new javax.swing.JButton();
                getRecordsButton = new javax.swing.JButton();
                studentsComboBox = new javax.swing.JComboBox<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Classroom Manager");
                setResizable(false);

                mainPanel.setBackground(new java.awt.Color(204, 204, 204));
                mainPanel.setPreferredSize(new java.awt.Dimension(410, 300));

                iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/records.png"))); // NOI18N

                headerLabel.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
                headerLabel.setForeground(new java.awt.Color(0, 0, 0));
                headerLabel.setText("Records");

                recordsTextArea.setEditable(false);
                recordsTextArea.setColumns(20);
                recordsTextArea.setRows(5);
                jScrollPane1.setViewportView(recordsTextArea);

                studentRecordsLabel.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
                studentRecordsLabel.setForeground(new java.awt.Color(0, 0, 0));
                studentRecordsLabel.setText("Student Records");

                selectStudentLabel.setForeground(new java.awt.Color(0, 0, 0));
                selectStudentLabel.setText("Select Student");

                homeButton.setText("Home");
                homeButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                homeButtonActionPerformed(evt);
                        }
                });

                getRecordsButton.setText("Get Records");
                getRecordsButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                getRecordsButtonActionPerformed(evt);
                        }
                });

                studentsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
                mainPanel.setLayout(mainPanelLayout);
                mainPanelLayout.setHorizontalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(iconLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(getRecordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addComponent(selectStudentLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(studentsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(studentRecordsLabel))))
                                .addContainerGap())
                );
                mainPanelLayout.setVerticalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(homeButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(studentRecordsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(selectStudentLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(studentsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(getRecordsButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
		//The home button "destroys" this frame to go back to the main
		//menu
		dispose();

		//create a new main menu screen.
		new MainMenuUI().setVisible(true);
        }//GEN-LAST:event_homeButtonActionPerformed

        private void getRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRecordsButtonActionPerformed
		//Use the frontend to get the data from the user.
		//NOTE: comboBox's return "Objects" which we know are strings, so we can cast it to a String
		String student = (String) (studentsComboBox.getSelectedItem());

		//Use the backend to update the frontend
		String records = RecordManager.getStudentRecords(student);
		recordsTextArea.setText(records);
        }//GEN-LAST:event_getRecordsButtonActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton getRecordsButton;
        private javax.swing.JLabel headerLabel;
        private javax.swing.JButton homeButton;
        private javax.swing.JLabel iconLabel;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JPanel mainPanel;
        private javax.swing.JTextArea recordsTextArea;
        private javax.swing.JLabel selectStudentLabel;
        private javax.swing.JLabel studentRecordsLabel;
        private javax.swing.JComboBox<String> studentsComboBox;
        // End of variables declaration//GEN-END:variables
}
