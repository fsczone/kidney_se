/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.idea.hospital.kidny2017.se.kidney_se;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import soft.idea.hospital.kidny2017.se.controler.HibernateUtil;
import static soft.idea.hospital.kidny2017.se.kidney_se.jf_main_frame.jp_mainPanel;
import soft.idea.hospital.kidny2017.se.models.User;
import soft.idea.hospital.kidny2017.se.patient.index;

/**
 *
 * @author deepalsuranga
 */
public class pl_user_login extends javax.swing.JPanel {

    /**
     * Creates new form jp_login
     */
    public pl_user_login() {
        initComponents();

        tf_user_email.grabFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_user_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pf_user_password = new javax.swing.JPasswordField();
        bt_login = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_count = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(42, 172, 174));
        setMaximumSize(new java.awt.Dimension(1366, 663));
        setMinimumSize(new java.awt.Dimension(1366, 663));
        setPreferredSize(new java.awt.Dimension(1366, 663));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(1, 87, 155));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Username:");

        tf_user_email.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        tf_user_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_user_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_user_emailKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Password:");

        pf_user_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pf_user_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pf_user_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pf_user_passwordKeyReleased(evt);
            }
        });

        bt_login.setBackground(new java.awt.Color(250, 250, 250));
        bt_login.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        bt_login.setText("LOGIN HERE");
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 250, 250));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Forget Password?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bt_login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_user_email)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pf_user_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_user_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pf_user_password, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1001, 402, 370, 260));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(780, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(780, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(780, 500));

        jl_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_count.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/idea/hospital/kidny2017/se/assets/UMH_P_PV_LivingKidney_smail.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Donor And Patients ");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Portal System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jl_count, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(420, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_count, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 0, 370, 663));

        jPanel1.setBackground(new java.awt.Color(40, 172, 174));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 250, 250));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("The National Institute of Nephrology Dialysis");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/idea/hospital/kidny2017/se/assets/Emblem_of_Sri_Lanka.svg.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 250, 250));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Transplantation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/idea/hospital/kidny2017/se/assets/doctor_login_qu.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pf_user_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_user_passwordKeyReleased

        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            check_login();
        }
    }//GEN-LAST:event_pf_user_passwordKeyReleased

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed

        check_login();
    }//GEN-LAST:event_bt_loginActionPerformed

    private void tf_user_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_user_emailKeyReleased

        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {

            pf_user_password.grabFocus();

        }
    }//GEN-LAST:event_tf_user_emailKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jl_count;
    private javax.swing.JPasswordField pf_user_password;
    private javax.swing.JTextField tf_user_email;
    // End of variables declaration//GEN-END:variables

    private void check_login() {

        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    jl_count.setText(i + "%");
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(pl_user_login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(User.class);
        String password = new String(pf_user_password.getPassword());
        criteria.add(Restrictions.and(Restrictions.eq("userEmail", tf_user_email.getText().toLowerCase().trim()), Restrictions.eq("userPw", password)));

        User uniqueResult = (User) criteria.uniqueResult();

        if (uniqueResult != null) {

            new Thread(() -> {
                try {

                    jp_mainPanel.removeAll();
                    jp_mainPanel.setLayout(new FlowLayout());
                    soft.idea.hospital.kidny2017.se.administrator.index home = new soft.idea.hospital.kidny2017.se.administrator.index();
                    home.setVisible(true);
                    jp_mainPanel.add(home);
                    jp_mainPanel.updateUI();

                    try {

                        jf_main_frame.bt_add_donor.setVisible(true);
                        jf_main_frame.bt_add_patient.setVisible(true);
                        jf_main_frame.bt_best_donor.setVisible(true);
                        jf_main_frame.bt_best_patient.setVisible(true);
                        jf_main_frame.bt_match_view.setVisible(true);
                        jf_main_frame.bt_old_patients_and_donors.setVisible(true);
                        jf_main_frame.bt_view_donors.setVisible(true);
                        jf_main_frame.bt_view_patient.setVisible(true);
                        jf_main_frame.bt_logout.setVisible(true);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

            JOptionPane.showMessageDialog(this, "Correct Username & Password! \n Welcome " + tf_user_email.getText().toUpperCase());

        } else {

            JOptionPane.showMessageDialog(this, "Incorrect Username or Password! \n Please Try Again");

        }
        //System.out.println("OKKKKKKKKKKKKKKKKKKKK naha" + password);

    }
}
