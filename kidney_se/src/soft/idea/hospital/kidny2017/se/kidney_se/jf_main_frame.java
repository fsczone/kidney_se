package soft.idea.hospital.kidny2017.se.kidney_se;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import soft.idea.hospital.kidny2017.se.donner.pl_show_best_donner;
import soft.idea.hospital.kidny2017.se.donner.pl_show_donner;
import soft.idea.hospital.kidny2017.se.patient.index;
import soft.idea.hospital.kidny2017.se.patient.pl_show_best_patients;
import soft.idea.hospital.kidny2017.se.patient.pl_show_patients;

/**
 *
 * @author deepalsuranga
 */
public class jf_main_frame extends javax.swing.JFrame {

    /**
     * Creates new form jf_main_frame
     */
    public jf_main_frame() {
        initComponents();
         try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
        }

        bt_add_donor.setVisible(false);
        bt_add_patient.setVisible(false);
        bt_best_donor.setVisible(false);
        bt_best_patient.setVisible(false);
        bt_match_view.setVisible(false);
        bt_old_patients_and_donors.setVisible(false);
        bt_view_donors.setVisible(false);
        bt_view_patient.setVisible(false);
        bt_logout.setVisible(false);

        new Thread(() -> {
            try {
                jp_mainPanel.removeAll();
                jp_mainPanel.setLayout(new FlowLayout());
                pl_user_login login = new pl_user_login();
                login.setVisible(true);
                jp_mainPanel.add(login);
                jp_mainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bt_add_donor = new javax.swing.JButton();
        bt_add_patient = new javax.swing.JButton();
        bt_view_patient = new javax.swing.JButton();
        bt_view_donors = new javax.swing.JButton();
        bt_match_view = new javax.swing.JButton();
        bt_best_donor = new javax.swing.JButton();
        bt_best_patient = new javax.swing.JButton();
        bt_old_patients_and_donors = new javax.swing.JButton();
        bt_logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lb_framenames = new javax.swing.JLabel();
        jp_mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(61, 61, 61));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jPanel3.setBackground(new java.awt.Color(65, 65, 65));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_add_donor.setBackground(new java.awt.Color(255, 255, 255));
        bt_add_donor.setText("Add Donor");
        bt_add_donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_donorActionPerformed(evt);
            }
        });
        jPanel3.add(bt_add_donor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 150, 40));

        bt_add_patient.setText("Add Patient");
        bt_add_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_patientActionPerformed(evt);
            }
        });
        jPanel3.add(bt_add_patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 11, 150, 40));

        bt_view_patient.setText("View Patient");
        bt_view_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_view_patientActionPerformed(evt);
            }
        });
        jPanel3.add(bt_view_patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 11, 150, 40));

        bt_view_donors.setText("View Donors");
        bt_view_donors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_view_donorsActionPerformed(evt);
            }
        });
        jPanel3.add(bt_view_donors, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 11, 150, 40));

        bt_match_view.setText("Match View");
        bt_match_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_match_viewActionPerformed(evt);
            }
        });
        jPanel3.add(bt_match_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 11, 150, 40));

        bt_best_donor.setText("Best Donor");
        bt_best_donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_best_donorActionPerformed(evt);
            }
        });
        jPanel3.add(bt_best_donor, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 11, 150, 40));

        bt_best_patient.setText("Best Patient");
        bt_best_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_best_patientActionPerformed(evt);
            }
        });
        jPanel3.add(bt_best_patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 11, 150, 40));

        bt_old_patients_and_donors.setText("Old Patients & Donors");
        bt_old_patients_and_donors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_old_patients_and_donorsActionPerformed(evt);
            }
        });
        jPanel3.add(bt_old_patients_and_donors, new org.netbeans.lib.awtextra.AbsoluteConstraints(1106, 11, 150, 40));

        bt_logout.setText("< HOME");
        bt_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logoutActionPerformed(evt);
            }
        });
        jPanel3.add(bt_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1283, 11, -1, 40));

        jPanel1.setBackground(new java.awt.Color(1, 87, 155));

        jPanel4.setBackground(new java.awt.Color(1, 87, 155));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/idea/hospital/kidny2017/se/assets/close.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );

        jPanel7.setBackground(new java.awt.Color(1, 87, 155));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/idea/hospital/kidny2017/se/assets/minimize.png"))); // NOI18N
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, 0))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, 0))
        );

        lb_framenames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_framenames.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_framenames, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1007, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_framenames, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jp_mainPanel.setBackground(new java.awt.Color(250, 250, 250));
        jp_mainPanel.setMaximumSize(new java.awt.Dimension(1366, 663));
        jp_mainPanel.setMinimumSize(new java.awt.Dimension(1366, 663));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved

        jPanel4.setBackground(new java.awt.Color(1, 87, 155));


    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        int conform = JOptionPane.showConfirmDialog(null, "Are you sure?", "Conform", JOptionPane.YES_NO_OPTION);
        if (conform == JOptionPane.YES_OPTION) {

            System.exit(0);

        } else {

            JOptionPane.showMessageDialog(this, "Keep going", "Good work", JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered

        jPanel4.setBackground(new java.awt.Color(1, 87, 155));

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        this.setExtendedState(JFrame.ICONIFIED);


    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void bt_view_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_view_patientActionPerformed

          lb_framenames.setText("View Patient");
        
        new Thread(() -> {

            try {
                jp_mainPanel.removeAll();
                jp_mainPanel.setLayout(new FlowLayout());
                soft.idea.hospital.kidny2017.se.patient.pl_show_patients show_patient = new pl_show_patients();
                show_patient.setVisible(true);
                jp_mainPanel.add(show_patient);
                jp_mainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_bt_view_patientActionPerformed

    private void bt_best_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_best_patientActionPerformed

          lb_framenames.setText("Best Patient");
        new Thread(() -> {

            try {
                jp_mainPanel.removeAll();
                jp_mainPanel.setLayout(new FlowLayout());
                soft.idea.hospital.kidny2017.se.patient.pl_show_best_patients show_best_patient = new pl_show_best_patients();
                show_best_patient.setVisible(true);
                jp_mainPanel.add(show_best_patient);
                jp_mainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        
    }//GEN-LAST:event_bt_best_patientActionPerformed

    private void bt_add_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_patientActionPerformed

          lb_framenames.setText("Add Patient");
        
        new Thread(() -> {

            try {
                jp_mainPanel.removeAll();
                jp_mainPanel.setLayout(new FlowLayout());
                soft.idea.hospital.kidny2017.se.patient.index add = new soft.idea.hospital.kidny2017.se.patient.index();
                add.setVisible(true);
                jp_mainPanel.add(add);
                jp_mainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_bt_add_patientActionPerformed

    private void bt_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logoutActionPerformed
  lb_framenames.setText("");
        new Thread(() -> {
            jp_mainPanel.removeAll();
            jp_mainPanel.setLayout(new FlowLayout());
            soft.idea.hospital.kidny2017.se.administrator.index home = new soft.idea.hospital.kidny2017.se.administrator.index();
            home.setVisible(true);
            jp_mainPanel.add(home);
            jp_mainPanel.updateUI();
        }).start();


    }//GEN-LAST:event_bt_logoutActionPerformed

    private void bt_add_donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_donorActionPerformed

        lb_framenames.setText("Add Donner");
        
        new Thread(() -> {

            try {
                jp_mainPanel.removeAll();
                jp_mainPanel.setLayout(new FlowLayout());
                soft.idea.hospital.kidny2017.se.donner.index donner = new soft.idea.hospital.kidny2017.se.donner.index();
                donner.setVisible(true);
                jp_mainPanel.add(donner);
                jp_mainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_bt_add_donorActionPerformed

    private void bt_match_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_match_viewActionPerformed

          lb_framenames.setText("Match Donner & Patient");
        
        new Thread(() -> {

            try {
                jp_mainPanel.removeAll();
                jp_mainPanel.setLayout(new FlowLayout());
                soft.idea.hospital.kidny2017.se.kidney_se.pl_match_donner_patient match = new pl_match_donner_patient();
                match.setVisible(true);
                jp_mainPanel.add(match);
                jp_mainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_bt_match_viewActionPerformed

    private void bt_view_donorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_view_donorsActionPerformed

          lb_framenames.setText("View Donner");
        
          new Thread(() -> {

            try {
                jp_mainPanel.removeAll();
                jp_mainPanel.setLayout(new FlowLayout());
                soft.idea.hospital.kidny2017.se.donner.pl_show_donner show_donner = new pl_show_donner();
                show_donner.setVisible(true);
                jp_mainPanel.add(show_donner);
                jp_mainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }//GEN-LAST:event_bt_view_donorsActionPerformed

    private void bt_best_donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_best_donorActionPerformed

          lb_framenames.setText("Best Donner");
        
 new Thread(() -> {

            try {
                jp_mainPanel.removeAll();
                jp_mainPanel.setLayout(new FlowLayout());
                soft.idea.hospital.kidny2017.se.donner.pl_show_best_donner show_best_donner = new pl_show_best_donner();
                show_best_donner.setVisible(true);
                jp_mainPanel.add(show_best_donner);
                jp_mainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();


    }//GEN-LAST:event_bt_best_donorActionPerformed

    private void bt_old_patients_and_donorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_old_patients_and_donorsActionPerformed
       
          lb_framenames.setText("Old Patients & Donners");
        
           new Thread(() -> {

            try {
                jp_mainPanel.removeAll();
                jp_mainPanel.setLayout(new FlowLayout());
                soft.idea.hospital.kidny2017.se.kidney_se.pl_show_old_patients_and_donners patient_old = new pl_show_old_patients_and_donners();
                patient_old.setVisible(true);
                jp_mainPanel.add(patient_old);
                jp_mainPanel.updateUI();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        
    }//GEN-LAST:event_bt_old_patients_and_donorsActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new jf_main_frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton bt_add_donor;
    public static javax.swing.JButton bt_add_patient;
    public static javax.swing.JButton bt_best_donor;
    public static javax.swing.JButton bt_best_patient;
    public static javax.swing.JButton bt_logout;
    public static javax.swing.JButton bt_match_view;
    public static javax.swing.JButton bt_old_patients_and_donors;
    public static javax.swing.JButton bt_view_donors;
    public static javax.swing.JButton bt_view_patient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    public static javax.swing.JPanel jp_mainPanel;
    public static javax.swing.JLabel lb_framenames;
    // End of variables declaration//GEN-END:variables
}
