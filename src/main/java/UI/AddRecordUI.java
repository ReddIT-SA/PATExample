/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import backend.AssessmentManager;
import backend.RecordManager;
import backend.StudentManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliftonb
 */
public class AddRecordUI extends javax.swing.JFrame {

	/**
	 * This is the constructor, it is the FIRST method called when this
	 * frame is created. Put any code in here that should be run to setup
	 * the frame
	 */
	public AddRecordUI() {
		initComponents();

		//set the frame in the centre of the screen
		setLocationRelativeTo(null);

		/**
		 * A list requires a listModel to "hold" all the values in the
		 * selection list. This is why we use an array to get the
		 * individual values to add to the listModel.
		 *
		 * Note: remember to set the list to a single selection list
		 */
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		String[] students = StudentManager.getStudentsAsArray();
		for (int i = 0; i < students.length; i++) {
			listModel.addElement(students[i]);
		}
		studentList.setModel(listModel);

		/**
		 * A combo box (drop down selection) requires a comboModel to
		 * "hold" all the values in the drop down list. This is why we
		 * use an array to get the individual values to add to the
		 * comboModel.
		 */
		DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<String>();
		String[] assessments = AssessmentManager.getAssessmentsAsArray();
		for (int i = 0; i < assessments.length; i++) {
			comboModel.addElement(assessments[i]);
		}
		assessmentComboBox.setModel(comboModel);
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
                homeButton = new javax.swing.JButton();
                addButton = new javax.swing.JButton();
                studentsLabel = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                studentList = new javax.swing.JList<>();
                assessmentLabel = new javax.swing.JLabel();
                assessmentComboBox = new javax.swing.JComboBox<>();
                percentageLabel = new javax.swing.JLabel();
                percentageSpinner = new javax.swing.JSpinner();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Classroom Manager");
                setResizable(false);

                mainPanel.setBackground(new java.awt.Color(204, 204, 204));
                mainPanel.setPreferredSize(new java.awt.Dimension(410, 300));

                iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/record.png"))); // NOI18N

                headerLabel.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
                headerLabel.setForeground(new java.awt.Color(0, 0, 0));
                headerLabel.setText("records");

                homeButton.setText("Home");
                homeButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                homeButtonActionPerformed(evt);
                        }
                });

                addButton.setText("Add");
                addButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addButtonActionPerformed(evt);
                        }
                });

                studentsLabel.setForeground(new java.awt.Color(0, 0, 0));
                studentsLabel.setText("Students");

                studentList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                jScrollPane1.setViewportView(studentList);

                assessmentLabel.setForeground(new java.awt.Color(0, 0, 0));
                assessmentLabel.setText("Assessment");

                assessmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                percentageLabel.setForeground(new java.awt.Color(0, 0, 0));
                percentageLabel.setText("Percentage Recieved");

                percentageSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

                javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
                mainPanel.setLayout(mainPanelLayout);
                mainPanelLayout.setHorizontalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addComponent(iconLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(headerLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                                                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addComponent(studentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(assessmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(assessmentComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(percentageSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(percentageLabel)))))
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
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentsLabel)
                                        .addComponent(assessmentLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(assessmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(percentageLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(percentageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(addButton))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
		//The home button "destroys" this frame to go back to the main
		//menu
		dispose();
        }//GEN-LAST:event_homeButtonActionPerformed

        private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
		//Use the frontend to get the data from the user.
		//NOTE: comboBoxs return "Objects" which we know are strings, so we can cast it to a String
		//NOTE2: spinners return an "Object" which we know is an Integer, so we can cast it to an Integer
		String name = studentList.getSelectedValue();
		String assessment = (String) (assessmentComboBox.getSelectedItem());
		String percentage = Integer.toString((Integer) (percentageSpinner.getValue()));

		//Use the backend to manipulate the textfile data
		RecordManager.addRecord(name, assessment, percentage);

		//Notify the user that the record was added
		JOptionPane.showMessageDialog(null, "Successfully added record!", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
        }//GEN-LAST:event_addButtonActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addButton;
        private javax.swing.JComboBox<String> assessmentComboBox;
        private javax.swing.JLabel assessmentLabel;
        private javax.swing.JLabel headerLabel;
        private javax.swing.JButton homeButton;
        private javax.swing.JLabel iconLabel;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JPanel mainPanel;
        private javax.swing.JLabel percentageLabel;
        private javax.swing.JSpinner percentageSpinner;
        private javax.swing.JList<String> studentList;
        private javax.swing.JLabel studentsLabel;
        // End of variables declaration//GEN-END:variables
}
