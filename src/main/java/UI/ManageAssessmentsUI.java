/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import backend.AssessmentManager;

/**
 *
 * @author Cliftonb
 */
public class ManageAssessmentsUI extends javax.swing.JFrame {

	/**
	 * This is the constructor, it is the FIRST method called when this
	 * frame is created. Put any code in here that should be run to setup
	 * the frame.
	 */
	public ManageAssessmentsUI() {
		initComponents();

		//set the frame in the centre of the screen
		setLocationRelativeTo(null);

		//Use the back end to populate the front end populate the text
		String assessments = AssessmentManager.getAssessments();
		assessmentsTextArea.setText(assessments);

		/**
		 * This is how you set the "return" value of a radio button when
		 * you call practicalRadioButton.getActionCommand() it will
		 * return the value that you set here.
		 *
		 * Note: both these buttons were added to the
		 * assessmentTypeButtonGroup. The getSelected() method returns
		 * the button that is selected.
		 */
		practicalRadioButton.setActionCommand("Practical");
		theoryRadioButton.setActionCommand("Theory");
	}

	/**
	 * This method is auto-generated
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                assessmentTypeButtonGroup = new javax.swing.ButtonGroup();
                mainPanel = new javax.swing.JPanel();
                iconLabel = new javax.swing.JLabel();
                headerLabel = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                assessmentsTextArea = new javax.swing.JTextArea();
                currentAssessmentsLabel = new javax.swing.JLabel();
                assessmentNameField = new javax.swing.JTextField();
                nameLabel = new javax.swing.JLabel();
                typeLabel = new javax.swing.JLabel();
                homeButton = new javax.swing.JButton();
                deleteButton = new javax.swing.JButton();
                addButton = new javax.swing.JButton();
                practicalRadioButton = new javax.swing.JRadioButton();
                theoryRadioButton = new javax.swing.JRadioButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Classroom Manager");
                setResizable(false);

                mainPanel.setBackground(new java.awt.Color(204, 204, 204));
                mainPanel.setPreferredSize(new java.awt.Dimension(410, 300));

                iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/assessments.png"))); // NOI18N

                headerLabel.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
                headerLabel.setForeground(new java.awt.Color(0, 0, 0));
                headerLabel.setText("Assessments");

                assessmentsTextArea.setEditable(false);
                assessmentsTextArea.setColumns(20);
                assessmentsTextArea.setRows(5);
                jScrollPane1.setViewportView(assessmentsTextArea);

                currentAssessmentsLabel.setFont(new java.awt.Font("Imprint MT Shadow", 0, 18)); // NOI18N
                currentAssessmentsLabel.setForeground(new java.awt.Color(0, 0, 0));
                currentAssessmentsLabel.setText("Current Assessments");

                nameLabel.setForeground(new java.awt.Color(0, 0, 0));
                nameLabel.setText("Assessment Name");

                typeLabel.setForeground(new java.awt.Color(0, 0, 0));
                typeLabel.setText("Assessment Type");

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

                assessmentTypeButtonGroup.add(practicalRadioButton);
                practicalRadioButton.setText("Practical");
                practicalRadioButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                practicalRadioButtonActionPerformed(evt);
                        }
                });

                assessmentTypeButtonGroup.add(theoryRadioButton);
                theoryRadioButton.setText("Theory");

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
                                                .addComponent(headerLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(assessmentNameField)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(nameLabel)
                                                        .addComponent(typeLabel)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addComponent(practicalRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(theoryRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(currentAssessmentsLabel))))
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
                                .addComponent(currentAssessmentsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(nameLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(assessmentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(typeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(practicalRadioButton)
                                                        .addComponent(theoryRadioButton))
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
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
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
        }//GEN-LAST:event_homeButtonActionPerformed

        private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
		//Use the frontend to get the data from the user
		String assessmentName = assessmentNameField.getText();
		String assessmentTypeStr = assessmentTypeButtonGroup.getSelection().getActionCommand();

		//Use the backend to manipulate the textfile data
		AssessmentManager.addAssessment(assessmentName, assessmentTypeStr);

		//Use the backend to update the frontend
		String newAssessments = AssessmentManager.getAssessments();
		assessmentsTextArea.setText(newAssessments);
        }//GEN-LAST:event_addButtonActionPerformed

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
		//Use the front end to get the data from the user
		String assessmentName = assessmentNameField.getText();

		//Use the backend to update the textfile
		AssessmentManager.deleteAssessment(assessmentName);

		//Use the backend to update the frontend
		String newAssessments = AssessmentManager.getAssessments();
		assessmentsTextArea.setText(newAssessments);
        }//GEN-LAST:event_deleteButtonActionPerformed

        private void practicalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practicalRadioButtonActionPerformed
        }//GEN-LAST:event_practicalRadioButtonActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addButton;
        private javax.swing.JTextField assessmentNameField;
        private javax.swing.ButtonGroup assessmentTypeButtonGroup;
        private javax.swing.JTextArea assessmentsTextArea;
        private javax.swing.JLabel currentAssessmentsLabel;
        private javax.swing.JButton deleteButton;
        private javax.swing.JLabel headerLabel;
        private javax.swing.JButton homeButton;
        private javax.swing.JLabel iconLabel;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JPanel mainPanel;
        private javax.swing.JLabel nameLabel;
        private javax.swing.JRadioButton practicalRadioButton;
        private javax.swing.JRadioButton theoryRadioButton;
        private javax.swing.JLabel typeLabel;
        // End of variables declaration//GEN-END:variables
}
