package view;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Payment extends javax.swing.JFrame {

    public Payment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UploadWindow = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        submitButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        filenameLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel2.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel6.setText("Bukti Pembayaran Berhasil Disubmit, mohon tunggu sampai di acc oleh sistem");

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(211, 211, 211))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel6)
                .addGap(49, 49, 49)
                .addComponent(jButton4)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 686));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(68, 68, 68));
        jLabel2.setText("Pilih service yang ingin dibayar :");

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setForeground(new java.awt.Color(68, 68, 68));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "ID", "Tipe", "Status", "Harga", "Teknisi"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

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

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(68, 68, 68));
        jLabel7.setText("Pembayaran");

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

        filenameLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        filenameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filenameLabel.setText("belum ada file yang ter-upload");
        filenameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 68, 68));
        jLabel9.setText("Upload file");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filenameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel7))
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filenameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        jDialog1.setVisible(true);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Dashboard obj = new Dashboard();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Dashboard obj = new Dashboard();
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
    private javax.swing.JLabel filenameLabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
