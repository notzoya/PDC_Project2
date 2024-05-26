/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author zoyamahmood
 */
public class EnrollStudent extends javax.swing.JFrame {

    /**
     * Creates new form EnrollStudent
     */
    public EnrollStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListClass1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TfStudID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListClass2 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListClass3 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListClass4 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListDegree = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ListCampus = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ListSemester = new javax.swing.JList<>();
        javax.swing.JButton BtnSubmit1 = new javax.swing.JButton();
        javax.swing.JButton BtnClear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(451, 412));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        BtnHome.setBackground(new java.awt.Color(2, 154, 154));
        BtnHome.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 1, 11)); // NOI18N
        BtnHome.setForeground(new java.awt.Color(208, 244, 244));
        BtnHome.setText("Back Home");
        BtnHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enroll Student");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ListClass1.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 0, 13)); // NOI18N
        ListClass1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "COMP500", "COMP501", "COMP507", "COMP508", "MATH503", "DIGD507", "INFS502 ", "COMP504", "COMP503", "COMP517", "COMP503" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListClass1);

        jLabel2.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 244, 244));
        jLabel2.setText("*Class Code 1:");

        jLabel5.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(208, 244, 244));
        jLabel5.setText("* Student ID:");

        TfStudID.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(208, 244, 244));
        jLabel3.setText("Class Code 2:");

        ListClass2.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 0, 13)); // NOI18N
        ListClass2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "COMP500", "COMP501", "COMP507", "COMP508", "MATH503", "DIGD507", "INFS502 ", "COMP504", "COMP503", "COMP517", "COMP503" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListClass2);

        jLabel4.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(208, 244, 244));
        jLabel4.setText("Class Code 3:");

        ListClass3.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 0, 13)); // NOI18N
        ListClass3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "COMP500", "COMP501", "COMP507", "COMP508", "MATH503", "DIGD507", "INFS502 ", "COMP504", "COMP503", "COMP517", "COMP503" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListClass3);

        jLabel6.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(208, 244, 244));
        jLabel6.setText("Class Code 4:");

        ListClass4.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 0, 13)); // NOI18N
        ListClass4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "COMP500", "COMP501", "COMP507", "COMP508", "MATH503", "DIGD507", "INFS502 ", "COMP504", "COMP503", "COMP517", "COMP503" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(ListClass4);

        jLabel7.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(208, 244, 244));
        jLabel7.setText("*Degree:");

        ListDegree.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 0, 13)); // NOI18N
        ListDegree.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bachelor of Computing & Information Sciences", "Bachelor of Commerce", "Bachelor of Arts", "Bachelor of Science", "Bachelor of Engineering (Hons)", "Bachelor of Communication Studies", "Bachelor of Construction", "Bachelor of Education", "Bachelor of Health Science", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(ListDegree);

        jLabel8.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(208, 244, 244));
        jLabel8.setText("*Campus:");

        ListCampus.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 0, 13)); // NOI18N
        ListCampus.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "City", "North", "South" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(ListCampus);

        jLabel9.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(208, 244, 244));
        jLabel9.setText("*Semester:");

        ListSemester.setFont(new java.awt.Font("Toppan Bunkyu Gothic", 0, 13)); // NOI18N
        ListSemester.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", "Summer School" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane7.setViewportView(ListSemester);

        BtnSubmit1.setBackground(new java.awt.Color(2, 154, 154));
        BtnSubmit1.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 13)); // NOI18N
        BtnSubmit1.setForeground(new java.awt.Color(208, 244, 244));
        BtnSubmit1.setText("SUBMIT");
        BtnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmit1ActionPerformed(evt);
            }
        });

        BtnClear1.setBackground(new java.awt.Color(2, 154, 154));
        BtnClear1.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 13)); // NOI18N
        BtnClear1.setForeground(new java.awt.Color(208, 244, 244));
        BtnClear1.setText("CLEAR");
        BtnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7)
                                        .addComponent(jScrollPane5)
                                        .addComponent(jLabel8)
                                        .addComponent(jScrollPane6)
                                        .addComponent(jLabel9)
                                        .addComponent(jScrollPane7)
                                        .addComponent(TfStudID)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(BtnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(BtnHome))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TfStudID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void BtnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmit1ActionPerformed
        String studID = TfStudID.getText();
        String degree = ListDegree.getSelectedValue();
        String campus = ListCampus.getSelectedValue();
        String semester = ListSemester.getSelectedValue();
        String class1 = ListClass1.getSelectedValue();
        String class2 = ListClass2.getSelectedValue();
        String class3 = ListClass3.getSelectedValue();
        String class4 = ListClass4.getSelectedValue();
        

        if (studID.isEmpty() || degree == null || campus == null || semester == null || class1 == null) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        // Database connection parameters
        String url = "jdbc:derby://localhost:1527/SMS";
        String checkSql = "SELECT COUNT(*) FROM Student_Details WHERE student_id = ?";
        String insertSql = "INSERT INTO Enrollments (student_id, degree, campus, semester, class1_code, class2_code, class3_code, class4_code) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url);
         PreparedStatement checkPstmt = conn.prepareStatement(checkSql);
         PreparedStatement insertPstmt = conn.prepareStatement(insertSql)) {

        // Check if the Student ID exists in the Student_Details table
        checkPstmt.setString(1, studID);
        ResultSet rs = checkPstmt.executeQuery();
        rs.next();
        if (rs.getInt(1) == 0) {
            JOptionPane.showMessageDialog(this, "Student ID does not exist, please enter new student into the system first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

            insertPstmt.setString(1, studID);
        insertPstmt.setString(2, degree);
        insertPstmt.setString(3, campus);
        insertPstmt.setString(4, semester);
        insertPstmt.setString(5, class1);
        insertPstmt.setString(6, class2 == null ? "" : class2);
        insertPstmt.setString(7, class3 == null ? "" : class3);
        insertPstmt.setString(8, class4 == null ? "" : class4);
            

           int rowsInserted = insertPstmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

        

        
    }//GEN-LAST:event_BtnSubmit1ActionPerformed

    private void BtnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClear1ActionPerformed

        TfStudID.setText("");
        ListDegree.clearSelection();
        ListCampus.clearSelection();
        ListSemester.clearSelection();
        ListClass1.clearSelection();
        ListClass2.clearSelection();
        ListClass3.clearSelection();
        ListClass4.clearSelection();
        
    }//GEN-LAST:event_BtnClear1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnrollStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnrollStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnrollStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnrollStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnrollStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JList<String> ListCampus;
    private javax.swing.JList<String> ListClass1;
    private javax.swing.JList<String> ListClass2;
    private javax.swing.JList<String> ListClass3;
    private javax.swing.JList<String> ListClass4;
    private javax.swing.JList<String> ListDegree;
    private javax.swing.JList<String> ListSemester;
    private javax.swing.JTextField TfStudID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
