package view;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ongoingServiceTable = new javax.swing.JTable();
        profileButton = new javax.swing.JButton();
        serviceButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        addCertificateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel2.setMinimumSize(new java.awt.Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 68, 68));
        jLabel1.setText("Ongoing service");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(68, 68, 68));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/app-logo.png"))); // NOI18N

        ongoingServiceTable.setBackground(new java.awt.Color(255, 255, 255));
        ongoingServiceTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ongoingServiceTable.setForeground(new java.awt.Color(255, 255, 255));
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

        profileButton.setBackground(new java.awt.Color(255, 255, 255));
        profileButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        profileButton.setForeground(new java.awt.Color(0, 165, 171));
        profileButton.setText("Profil");
        profileButton.setBorder(null);
        profileButton.setBorderPainted(false);
        profileButton.setFocusPainted(false);

        serviceButton.setBackground(new java.awt.Color(255, 255, 255));
        serviceButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        serviceButton.setForeground(new java.awt.Color(0, 165, 171));
        serviceButton.setText("Service");
        serviceButton.setBorder(null);
        serviceButton.setBorderPainted(false);
        serviceButton.setFocusPainted(false);

        paymentButton.setBackground(new java.awt.Color(255, 255, 255));
        paymentButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        paymentButton.setForeground(new java.awt.Color(0, 165, 171));
        paymentButton.setText("Pembayaran");
        paymentButton.setBorder(null);
        paymentButton.setBorderPainted(false);
        paymentButton.setFocusPainted(false);

        historyButton.setBackground(new java.awt.Color(255, 255, 255));
        historyButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        historyButton.setForeground(new java.awt.Color(0, 165, 171));
        historyButton.setText("History");
        historyButton.setBorder(null);
        historyButton.setBorderPainted(false);
        historyButton.setFocusPainted(false);

        addCertificateButton.setBackground(new java.awt.Color(255, 255, 255));
        addCertificateButton.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        addCertificateButton.setForeground(new java.awt.Color(235, 137, 33));
        addCertificateButton.setText("Tambah sertifikat");
        addCertificateButton.setBorder(null);
        addCertificateButton.setBorderPainted(false);
        addCertificateButton.setFocusPainted(false);
        addCertificateButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serviceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCertificateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileButton)
                    .addComponent(serviceButton)
                    .addComponent(paymentButton)
                    .addComponent(historyButton))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addCertificateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCertificateButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ongoingServiceTable;
    private javax.swing.JButton paymentButton;
    private javax.swing.JButton profileButton;
    private javax.swing.JButton serviceButton;
    // End of variables declaration//GEN-END:variables
}
