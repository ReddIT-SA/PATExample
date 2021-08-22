/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import backend.StudentManager;

/**
 *
 * @author Cliftonb
 */
public class ManageStudentsUI extends javax.swing.JFrame {

	/**
	 * This is the constructor, it is the FIRST method called when this
	 * frame is created. Put any code in here that should be run to setup
	 * the frame.
	 */
	public ManageStudentsUI() {
		initComponents();

		//set the frame in the centre of the screen
		setLocationRelativeTo(null);

		//Use the back end to populate the front end populate the text
		String students = StudentManager.getStudents();
		studentTextArea.setText(students);
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
                studentTextArea = new javax.swing.JTextArea();
                currentStudentsLabel = new javax.swing.JLabel();
                nameField = new javax.swing.JTextField();
                nameLabel = new javax.swing.JLabel();
                surnameLabel = new javax.swing.JLabel();
                surnameField = new javax.swing.JTextField();
                homeButton = new javax.swing.JButton();
                deleteButton = new javax.swing.JButton();
                addButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Classroom Manager");
                setPreferredSize(new java.awt.Dimension(460, 340));
                setResizable(false);

                mainPanel.setBackground(new java.awt.Color(204, 204, 204));
                mainPanel.setPreferredSize(new java.awt.Dimension(410, 300));

                iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/students.png"))); // NOI18N

                headerLabel.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
                headerLabel.setForeground(new java.awt.Color(0, 0, 0));
                headerLabel.setText("Students");

                studentTextArea.setEditable(false);
                studentTextArea.setColumns(20);
                studentTextArea.setRows(5);
                jScrollPane1.setViewportView(studentTextArea);

                currentStudentsLabel.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
                currentStudentsLabel.setForeground(new java.awt.Color(0, 0, 0));
                currentStudentsLabel.setText("Current Students");

                nameLabel.setForeground(new java.awt.Color(0, 0, 0));
                nameLabel.setText("Name");

                surnameLabel.setForeground(new java.awt.Color(0, 0, 0));
                surnameLabel.setText("Surname");

                homeButton.setText("Home");
                homeButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                homeButtonActionPerformed(evt);
                        }
                });

                deleteButton.setText("Delete");
                deleteButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteButtonActionPerformed(evt);
                        }
                });

                addButton.setText("Add");
                addButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addButtonActionPerformed(evt);
                        }
                });

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
                                                        .addComponent(nameField)
                                                        .addComponent(surnameField)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nameLabel)
                                                                        .addComponent(surnameLabel))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(currentStudentsLabel))))
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
                                .addComponent(currentStudentsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(nameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(surnameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addButton)
                                                        .addComponent(deleteButton))))
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

        private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
		//Use the frontend to get the data from the user
		String name = nameField.getText();
		String surname = surnameField.getText();

		//Use the backend to manipulate the textfile data
		StudentManager.addStudent(name, surname);

		//Use the backend to update the frontend
		String students = StudentManager.getStudents();
		studentTextArea.setText(students);
        }//GEN-LAST:event_addButtonActionPerformed

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
		//Use the frontend to get the data from the user
		String name = nameField.getText();
		String surname = surnameField.getText();

		//Use the backend to manipulate the textfile data
		StudentManager.deleteStudent(name, surname);

		//Use the backend to update the frontend
		String students = StudentManager.getStudents();
		studentTextArea.setText(students);
        }//GEN-LAST:event_deleteButtonActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addButton;
        private javax.swing.JLabel currentStudentsLabel;
        private javax.swing.JButton deleteButton;
        private javax.swing.JLabel headerLabel;
        private javax.swing.JButton homeButton;
        private javax.swing.JLabel iconLabel;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JPanel mainPanel;
        private javax.swing.JTextField nameField;
        private javax.swing.JLabel nameLabel;
        private javax.swing.JTextArea studentTextArea;
        private javax.swing.JTextField surnameField;
        private javax.swing.JLabel surnameLabel;
        // End of variables declaration//GEN-END:variables
}
