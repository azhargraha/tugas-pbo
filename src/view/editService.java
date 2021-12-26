package view;

import model.Account;

public class editService extends javax.swing.JFrame {
    private Account user;
    private String accType;
    
    public editService() {
        initComponents();
    }
    
    public editService(Account user, String accType) {
        this.user = user;
        this.accType = accType;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        statusTextField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        hargaTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ongoingServiceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 668));
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
        jLabel7.setText("Edit Service");

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(200, 0, 0));
        cancelButton.setText("Batal");
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 0, 0)));
        cancelButton.setFocusPainted(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(0, 165, 171));
        saveButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Simpan");
        saveButton.setBorder(null);
        saveButton.setBorderPainted(false);
        saveButton.setFocusPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(68, 68, 68));
        jLabel11.setText("Status");
        jPanel6.add(jLabel11);

        statusTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        statusTextField.setText(user.getNoTelp());
        statusTextField.setBorder(null);
        jPanel6.add(statusTextField);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(68, 68, 68));
        jLabel12.setText("Harga");
        jPanel7.add(jLabel12);

        hargaTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hargaTextField.setText(user.getAlamat());
        hargaTextField.setBorder(null);
        jPanel7.add(hargaTextField);

        ongoingServiceTable.setBackground(new java.awt.Color(255, 255, 255));
        ongoingServiceTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ongoingServiceTable.setForeground(new java.awt.Color(68, 68, 68));
        ongoingServiceTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "ID", "Tipe", "Status", "Harga", "Teknisi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ongoingServiceTable);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 68, 68));
        jLabel1.setText("Pilih service yang akan diedit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(backButton))
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        Dashboard obj = new Dashboard(user, accType);
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_saveButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ongoingServiceTable;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField statusTextField;
    // End of variables declaration//GEN-END:variables
}
