package view;

import controller.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Account;

public class Profile extends javax.swing.JFrame {

    private Account user;
    private String accType;
    private float rating = 0;
    private int pendapatan = 0;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Profile() {
        initComponents();
    }

    Profile(Account user, String accType) {
        this.user = user;
        this.accType = accType;
        initComponents();
        
        if(this.accType.equalsIgnoreCase("Technician")){
            try {
                con = DBConnection.getConnection();
                pst = con.prepareStatement("select * from service where Teknisi =? and Status =?");
                pst.setString(1, user.getNamaLengkap());
                pst.setString(2, "Selesai");
                rs = pst.executeQuery();
                int i = 0;
                while (rs.next()){
                    this.rating = this.rating + (float) rs.getInt("rating");
                    this.pendapatan = this.pendapatan + rs.getInt("Harga");
                    i++;
                }
                this.rating = this.rating / i;
                pendapatanLabel.setText("Rp." + String.valueOf(this.pendapatan));
                ratingLabel.setText(String.valueOf(this.rating));
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            tipeUserTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            tipeUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            pendapatanPanel.setVisible(false);
            ratingPanel.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        namaTextField4 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        alamatTextField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        tipeUserTitle = new javax.swing.JLabel();
        tipeUserLabel = new javax.swing.JLabel();
        ratingPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();
        pendapatanPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pendapatanLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 480));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 165, 171));
        backButton.setText("Kembali");
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(68, 68, 68));
        jLabel7.setText("Profil Anda");

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(200, 0, 0));
        logoutButton.setText("Logout");
        logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 0, 0)));
        logoutButton.setFocusPainted(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(0, 165, 171));
        saveButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Edit Profil");
        saveButton.setBorder(null);
        saveButton.setBorderPainted(false);
        saveButton.setFocusPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 68, 68));
        jLabel1.setText("Nama Lengkap");
        jPanel2.add(jLabel1);

        namaTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        namaTextField.setText(user.getNamaLengkap());
        namaTextField.setBorder(null);
        namaTextField.setEditable(false);
        jPanel2.add(namaTextField);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(68, 68, 68));
        jLabel8.setText("Username");
        jPanel3.add(jLabel8);

        usernameTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        usernameTextField.setText(user.getUsername());
        usernameTextField.setBorder(null);
        usernameTextField.setEditable(false);
        jPanel3.add(usernameTextField);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 68, 68));
        jLabel9.setText("Password");
        jPanel4.add(jLabel9);

        passwordTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passwordTextField.setText(user.getPassword());
        passwordTextField.setBorder(null);
        passwordTextField.setEditable(false);
        jPanel4.add(passwordTextField);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(68, 68, 68));
        jLabel10.setText("Email");
        jPanel5.add(jLabel10);

        emailTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        emailTextField.setText(user.getEmail());
        emailTextField.setBorder(null);
        emailTextField.setEditable(false);
        jPanel5.add(emailTextField);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(68, 68, 68));
        jLabel11.setText("No. Telepon");
        jPanel6.add(jLabel11);

        namaTextField4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        namaTextField4.setText(user.getNoTelp());
        namaTextField4.setBorder(null);
        namaTextField4.setEditable(false);
        jPanel6.add(namaTextField4);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(68, 68, 68));
        jLabel12.setText("Alamat");
        jPanel7.add(jLabel12);

        alamatTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        alamatTextField.setText(user.getAlamat());
        alamatTextField.setBorder(null);
        alamatTextField.setEditable(false);
        jPanel7.add(alamatTextField);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipeUserTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tipeUserTitle.setForeground(new java.awt.Color(68, 68, 68));
        tipeUserTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipeUserTitle.setText("Tipe user");
        jPanel8.add(tipeUserTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        tipeUserLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tipeUserLabel.setForeground(new java.awt.Color(68, 68, 68));
        tipeUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipeUserLabel.setText(accType);
        jPanel8.add(tipeUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 100, 30));

        ratingPanel.setBackground(new java.awt.Color(255, 255, 255));
        ratingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(68, 68, 68));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Rating");
        ratingPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        ratingLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ratingLabel.setForeground(new java.awt.Color(68, 68, 68));
        ratingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ratingPanel.add(ratingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 90, 30));

        pendapatanPanel.setBackground(new java.awt.Color(255, 255, 255));
        pendapatanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(68, 68, 68));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Pendapatan");
        pendapatanPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        pendapatanLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pendapatanLabel.setForeground(new java.awt.Color(68, 68, 68));
        pendapatanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pendapatanPanel.add(pendapatanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 200, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pendapatanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ratingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(backButton))
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ratingPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pendapatanPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Dashboard obj = new Dashboard(user, accType);
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        Login obj = new Login();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        EditProfil obj = new EditProfil(user, accType);
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField namaTextField4;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel pendapatanLabel;
    private javax.swing.JPanel pendapatanPanel;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JPanel ratingPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel tipeUserLabel;
    private javax.swing.JLabel tipeUserTitle;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
