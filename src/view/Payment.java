package view;

import controller.DBConnection;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JFileChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Account;

public class Payment extends javax.swing.JFrame {
    private Account user;
    private String accType;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Payment() {
        initComponents();
    }

    Payment(Account user, String accType) {
        this.user = user;
        this.accType = accType;
        initComponents();
        
        ratingSlider.setValue(0);
        ratingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ratingLabel.setText(String.valueOf(ratingSlider.getValue()));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UploadWindow = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        backButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pembayaranTable = new javax.swing.JTable();
        submitButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        filenameLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        refreshButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ratingSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();

        jDialog1.setMinimumSize(new java.awt.Dimension(400, 300));
        jDialog1.setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        backButton3.setBackground(new java.awt.Color(255, 255, 255));
        backButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        backButton3.setForeground(new java.awt.Color(0, 165, 171));
        backButton3.setText("Kembali");
        backButton3.setBorder(null);
        backButton3.setBorderPainted(false);
        backButton3.setFocusPainted(false);
        backButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(68, 68, 68));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Service berhasil dibayar");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/success-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(backButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel12)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton3)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(463, 686));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(68, 68, 68));
        jLabel2.setText("Pilih service yang ingin dibayar :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        pembayaranTable.setBackground(new java.awt.Color(255, 255, 255));
        pembayaranTable.setForeground(new java.awt.Color(68, 68, 68));
        pembayaranTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "ID", "Tipe", "Status", "Harga", "Client", "Teknisi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(pembayaranTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 450, 239));

        submitButton.setBackground(new java.awt.Color(0, 165, 171));
        submitButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit bukti pembayaran");
        submitButton.setBorder(null);
        submitButton.setMaximumSize(new java.awt.Dimension(153, 34));
        submitButton.setMinimumSize(new java.awt.Dimension(153, 34));
        submitButton.setPreferredSize(new java.awt.Dimension(153, 34));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 400, 36));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(68, 68, 68));
        jLabel7.setText("Pembayaran");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 32, 166, -1));

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
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 42, 102, -1));

        uploadButton.setBackground(new java.awt.Color(255, 255, 255));
        uploadButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        uploadButton.setForeground(new java.awt.Color(0, 165, 171));
        uploadButton.setText("Upload bukti pembayaran");
        uploadButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 165, 171)));
        uploadButton.setMaximumSize(new java.awt.Dimension(153, 34));
        uploadButton.setMinimumSize(new java.awt.Dimension(153, 34));
        uploadButton.setPreferredSize(new java.awt.Dimension(153, 34));
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });
        jPanel1.add(uploadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 401, 36));

        filenameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        filenameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filenameLabel.setText("belum ada file yang ter-upload");
        filenameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(filenameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 401, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 68, 68));
        jLabel9.setText("Upload file");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 158, -1));

        refreshButton1.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        refreshButton1.setForeground(new java.awt.Color(255, 102, 0));
        refreshButton1.setText("refresh");
        refreshButton1.setBorder(null);
        refreshButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        refreshButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(refreshButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 63, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(68, 68, 68));
        jLabel14.setText("Beri rating");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 158, -1));

        ratingSlider.setBackground(new java.awt.Color(255, 255, 255));
        ratingSlider.setForeground(new java.awt.Color(65, 65, 65));
        ratingSlider.setMaximum(5);
        ratingSlider.setMinimum(1);
        ratingSlider.setSnapToTicks(true);
        ratingSlider.setToolTipText("");
        jPanel1.add(ratingSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 401, -1));

        jLabel1.setText("1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jLabel3.setText("5");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        ratingLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ratingLabel.setForeground(new java.awt.Color(0, 165, 171));
        ratingLabel.setText("1");
        jPanel1.add(ratingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            int row = pembayaranTable.getSelectedRow();
            String value = pembayaranTable.getValueAt(row, 1).toString();
            
            con = DBConnection.getConnection();
            pst = con.prepareStatement("update service set Status = 'Selesai', rating =? where id =?");
            pst.setInt(1, ratingSlider.getValue());
            pst.setString(2, value);
            pst.executeUpdate();
            dispose();
            jDialog1.setVisible(true);
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Dashboard obj = new Dashboard(user, accType);
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Dashboard obj = new Dashboard(user, accType);
        jDialog1.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        UploadWindow.addChoosableFileFilter(new FileNameExtensionFilter("Images (.jpg, .png, .jpeg)", "jpg", "png", "jpeg", "bmp"));
        UploadWindow.setAcceptAllFileFilterUsed(true);
        int returnVal = UploadWindow.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = UploadWindow.getSelectedFile();
            filenameLabel.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void backButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        Dashboard obj = new Dashboard(user, accType);
        jDialog1.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_backButton3ActionPerformed
    private void refreshButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton1ActionPerformed
        try{
            con = DBConnection.getConnection();
            pst = con.prepareStatement("select * from service where (Teknisi =? or Klien =?) and Status =?");
            pst.setString(1, user.getNamaLengkap());
            pst.setString(2, user.getNamaLengkap());
            pst.setString(3, "Menunggu pembayaran");
            rs = pst.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)pembayaranTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[]={String.valueOf(rs.getDate("Tanggal")), rs.getString("ID"), rs.getString("Tipe"),
                    rs.getString("Status"), rs.getInt("Harga"), rs.getString("Klien"), rs.getString("Teknisi")};
                tm.addRow(o);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_refreshButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser UploadWindow;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton3;
    private javax.swing.JLabel filenameLabel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable pembayaranTable;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JSlider ratingSlider;
    private javax.swing.JButton refreshButton1;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}   
