package view;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        registPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registRoleRadioGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        authLayeredPanel = new javax.swing.JLayeredPane();
        registPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        registSubmit = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        switchToLoginButton = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        registNameTextField = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        registUsernameTextField = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        registPasswordTextField = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        registAlamatTextField = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        registTechnicianRadio = new javax.swing.JRadioButton();
        registClientRadio = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        registNoTelpTextField = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        registEmailTextField = new javax.swing.JTextField();
        loginPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        loginPasswordTextField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        loginUsernameTextField = new javax.swing.JTextField();
        loginSubmit = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        switchToRegistButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(249, 244, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 50, 50, 50));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/technician-illustration.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 15, 1));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(0);
        jPanel2.add(jLabel1);

        jPanel1.setBackground(new java.awt.Color(249, 244, 241));
        jPanel1.setAlignmentY(1.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jasa service online");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 10, 1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 50));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(130, 130, 130));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Membantu masyarakat yang memiliki kendala dirumahnya untuk mendatangkan teknisi");
        jLabel3.setMaximumSize(new java.awt.Dimension(700, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(700, 20));
        jLabel3.setPreferredSize(null);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(130, 130, 130));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("yang memiliki ahli di bidang terkait.");
        jLabel4.setMaximumSize(new java.awt.Dimension(556, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(556, 20));
        jLabel4.setPreferredSize(null);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 540, 20));

        jPanel2.add(jPanel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        registPanel.setBackground(new java.awt.Color(255, 255, 255));
        registPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Register");
        jLabel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 10, 1));

        registSubmit.setBackground(new java.awt.Color(0, 165, 171));
        registSubmit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registSubmit.setForeground(new java.awt.Color(255, 255, 255));
        registSubmit.setText("Registrasi");
        registSubmit.setBorder(null);
        registSubmit.setFocusPainted(false);
        registSubmit.setMaximumSize(new java.awt.Dimension(39, 34));
        registSubmit.setMinimumSize(new java.awt.Dimension(39, 34));
        registSubmit.setPreferredSize(new java.awt.Dimension(39, 34));
        registSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registSubmitActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(100, 100, 100));
        jLabel18.setText("Sudah memiliki akun?");
        jPanel14.add(jLabel18);

        switchToLoginButton.setBackground(new java.awt.Color(255, 255, 255));
        switchToLoginButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        switchToLoginButton.setForeground(new java.awt.Color(0, 165, 171));
        switchToLoginButton.setText("Login disini");
        switchToLoginButton.setBorder(null);
        switchToLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchToLoginButtonMouseClicked(evt);
            }
        });
        switchToLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchToLoginButtonButtonActionPerformed(evt);
            }
        });
        jPanel14.add(switchToLoginButton);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(90, 90, 90));
        jLabel20.setText("Nama Lengkap");
        jPanel15.add(jLabel20, java.awt.BorderLayout.PAGE_START);

        registNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        registNameTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registNameTextField.setForeground(new java.awt.Color(68, 68, 68));
        registNameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registNameTextField.setMaximumSize(new java.awt.Dimension(2147483647, 14));
        registNameTextField.setMinimumSize(new java.awt.Dimension(3, 34));
        registNameTextField.setPreferredSize(new java.awt.Dimension(150, 34));
        registNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registNameTextFieldActionPerformed(evt);
            }
        });
        jPanel15.add(registNameTextField, java.awt.BorderLayout.CENTER);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(90, 90, 90));
        jLabel21.setText("Username");
        jPanel16.add(jLabel21, java.awt.BorderLayout.PAGE_START);

        registUsernameTextField.setBackground(new java.awt.Color(255, 255, 255));
        registUsernameTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registUsernameTextField.setForeground(new java.awt.Color(68, 68, 68));
        registUsernameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registUsernameTextField.setMaximumSize(new java.awt.Dimension(2147483647, 14));
        registUsernameTextField.setMinimumSize(new java.awt.Dimension(3, 34));
        registUsernameTextField.setPreferredSize(new java.awt.Dimension(150, 34));
        registUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registUsernameTextFieldActionPerformed(evt);
            }
        });
        jPanel16.add(registUsernameTextField, java.awt.BorderLayout.CENTER);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(90, 90, 90));
        jLabel24.setText("Password");
        jPanel19.add(jLabel24, java.awt.BorderLayout.PAGE_START);

        registPasswordTextField.setBackground(new java.awt.Color(255, 255, 255));
        registPasswordTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registPasswordTextField.setForeground(new java.awt.Color(68, 68, 68));
        registPasswordTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registPasswordTextField.setMaximumSize(new java.awt.Dimension(2147483647, 14));
        registPasswordTextField.setMinimumSize(new java.awt.Dimension(3, 34));
        registPasswordTextField.setPreferredSize(new java.awt.Dimension(150, 34));
        registPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registPasswordTextFieldActionPerformed(evt);
            }
        });
        jPanel19.add(registPasswordTextField, java.awt.BorderLayout.CENTER);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(90, 90, 90));
        jLabel26.setText("Alamat");
        jPanel21.add(jLabel26, java.awt.BorderLayout.PAGE_START);

        registAlamatTextField.setBackground(new java.awt.Color(255, 255, 255));
        registAlamatTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registAlamatTextField.setForeground(new java.awt.Color(68, 68, 68));
        registAlamatTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registAlamatTextField.setMaximumSize(new java.awt.Dimension(2147483647, 14));
        registAlamatTextField.setMinimumSize(new java.awt.Dimension(3, 34));
        registAlamatTextField.setPreferredSize(new java.awt.Dimension(150, 34));
        registAlamatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registAlamatTextFieldActionPerformed(evt);
            }
        });
        jPanel21.add(registAlamatTextField, java.awt.BorderLayout.CENTER);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(90, 90, 90));
        jLabel27.setText("Role user");
        jPanel22.add(jLabel27, java.awt.BorderLayout.PAGE_START);

        registTechnicianRadio.setBackground(new java.awt.Color(255, 255, 255));
        registRoleRadioGroup.add(registTechnicianRadio);
        registTechnicianRadio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registTechnicianRadio.setForeground(new java.awt.Color(68, 68, 68));
        registTechnicianRadio.setText("Teknisi");
        registTechnicianRadio.setFocusPainted(false);
        registTechnicianRadio.setMaximumSize(new java.awt.Dimension(210, 28));
        registTechnicianRadio.setMinimumSize(new java.awt.Dimension(210, 28));
        registTechnicianRadio.setPreferredSize(new java.awt.Dimension(210, 28));
        jPanel22.add(registTechnicianRadio, java.awt.BorderLayout.LINE_END);

        registClientRadio.setBackground(new java.awt.Color(255, 255, 255));
        registRoleRadioGroup.add(registClientRadio);
        registClientRadio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registClientRadio.setForeground(new java.awt.Color(68, 68, 68));
        registClientRadio.setText("Klien");
        registClientRadio.setFocusPainted(false);
        registClientRadio.setMaximumSize(new java.awt.Dimension(210, 28));
        registClientRadio.setMinimumSize(new java.awt.Dimension(210, 28));
        registClientRadio.setPreferredSize(new java.awt.Dimension(210, 28));
        jPanel22.add(registClientRadio, java.awt.BorderLayout.LINE_START);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel23.setMinimumSize(new java.awt.Dimension(37, 59));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(90, 90, 90));
        jLabel28.setText("No. Telepon");
        jPanel23.add(jLabel28, java.awt.BorderLayout.PAGE_START);

        registNoTelpTextField.setBackground(new java.awt.Color(255, 255, 255));
        registNoTelpTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registNoTelpTextField.setForeground(new java.awt.Color(68, 68, 68));
        registNoTelpTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registNoTelpTextField.setMaximumSize(new java.awt.Dimension(2147483647, 14));
        registNoTelpTextField.setMinimumSize(new java.awt.Dimension(3, 34));
        registNoTelpTextField.setPreferredSize(new java.awt.Dimension(150, 34));
        registNoTelpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registNoTelpTextFieldActionPerformed(evt);
            }
        });
        jPanel23.add(registNoTelpTextField, java.awt.BorderLayout.CENTER);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(90, 90, 90));
        jLabel29.setText("Email");
        jPanel24.add(jLabel29, java.awt.BorderLayout.PAGE_START);

        registEmailTextField.setBackground(new java.awt.Color(255, 255, 255));
        registEmailTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registEmailTextField.setForeground(new java.awt.Color(68, 68, 68));
        registEmailTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registEmailTextField.setMaximumSize(new java.awt.Dimension(2147483647, 14));
        registEmailTextField.setMinimumSize(new java.awt.Dimension(3, 34));
        registEmailTextField.setPreferredSize(new java.awt.Dimension(150, 34));
        registEmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registEmailTextFieldActionPerformed(evt);
            }
        });
        jPanel24.add(registEmailTextField, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout registPanelLayout = new javax.swing.GroupLayout(registPanel);
        registPanel.setLayout(registPanelLayout);
        registPanelLayout.setHorizontalGroup(
            registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registPanelLayout.createSequentialGroup()
                        .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registPanelLayout.createSequentialGroup()
                                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        registPanelLayout.setVerticalGroup(
            registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registPanelLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(registPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Login");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 10, 1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(90, 90, 90));
        jLabel7.setText("Password");
        jPanel5.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        loginPasswordTextField.setBackground(new java.awt.Color(255, 255, 255));
        loginPasswordTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        loginPasswordTextField.setForeground(new java.awt.Color(68, 68, 68));
        loginPasswordTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginPasswordTextField.setMinimumSize(new java.awt.Dimension(3, 34));
        loginPasswordTextField.setPreferredSize(new java.awt.Dimension(78, 34));
        loginPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordTextFieldActionPerformed(evt);
            }
        });
        jPanel5.add(loginPasswordTextField, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(90, 90, 90));
        jLabel6.setText("Username");
        jPanel3.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        loginUsernameTextField.setBackground(new java.awt.Color(255, 255, 255));
        loginUsernameTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        loginUsernameTextField.setForeground(new java.awt.Color(68, 68, 68));
        loginUsernameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginUsernameTextField.setMaximumSize(new java.awt.Dimension(2147483647, 14));
        loginUsernameTextField.setMinimumSize(new java.awt.Dimension(3, 34));
        loginUsernameTextField.setPreferredSize(new java.awt.Dimension(150, 34));
        loginUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameTextFieldActionPerformed(evt);
            }
        });
        jPanel3.add(loginUsernameTextField, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        loginSubmit.setBackground(new java.awt.Color(0, 165, 171));
        loginSubmit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loginSubmit.setForeground(new java.awt.Color(255, 255, 255));
        loginSubmit.setText("Login");
        loginSubmit.setBorder(null);
        loginSubmit.setFocusPainted(false);
        loginSubmit.setMaximumSize(new java.awt.Dimension(39, 34));
        loginSubmit.setMinimumSize(new java.awt.Dimension(39, 34));
        loginSubmit.setPreferredSize(new java.awt.Dimension(39, 34));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(100, 100, 100));
        jLabel8.setText("Belum memiliki akun?");
        jPanel7.add(jLabel8);

        switchToRegistButton.setBackground(new java.awt.Color(255, 255, 255));
        switchToRegistButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        switchToRegistButton.setForeground(new java.awt.Color(0, 165, 171));
        switchToRegistButton.setText("Registrasi disini");
        switchToRegistButton.setBorder(null);
        switchToRegistButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchToRegistButtonMouseClicked(evt);
            }
        });
        switchToRegistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchToRegistButtonButtonActionPerformed(evt);
            }
        });
        jPanel7.add(switchToRegistButton);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/assets/app-logo.png"))); // NOI18N

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(76, 76, 76)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(loginSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        authLayeredPanel.setLayer(registPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        authLayeredPanel.setLayer(loginPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout authLayeredPanelLayout = new javax.swing.GroupLayout(authLayeredPanel);
        authLayeredPanel.setLayout(authLayeredPanelLayout);
        authLayeredPanelLayout.setHorizontalGroup(
            authLayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(authLayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(authLayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        authLayeredPanelLayout.setVerticalGroup(
            authLayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(authLayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(authLayeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(authLayeredPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 560, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switchToRegistButtonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchToRegistButtonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_switchToRegistButtonButtonActionPerformed

    private void loginUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameTextFieldActionPerformed

    }//GEN-LAST:event_loginUsernameTextFieldActionPerformed

    private void loginPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordTextFieldActionPerformed

    private void switchToLoginButtonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchToLoginButtonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_switchToLoginButtonButtonActionPerformed

    private void registSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registSubmitActionPerformed

    private void switchToRegistButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchToRegistButtonMouseClicked
        loginPanel.setVisible(false);
        registPanel.setVisible(true);
    }//GEN-LAST:event_switchToRegistButtonMouseClicked

    private void switchToLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchToLoginButtonMouseClicked
        registPanel.setVisible(false);
        loginPanel.setVisible(true);
    }//GEN-LAST:event_switchToLoginButtonMouseClicked

    private void registNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registNameTextFieldActionPerformed

    private void registUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registUsernameTextFieldActionPerformed

    private void registPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registPasswordTextFieldActionPerformed

    private void registAlamatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registAlamatTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registAlamatTextFieldActionPerformed

    private void registNoTelpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registNoTelpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registNoTelpTextFieldActionPerformed

    private void registEmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registEmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registEmailTextFieldActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane authLayeredPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel loginPanel1;
    private javax.swing.JPasswordField loginPasswordTextField;
    private javax.swing.JButton loginSubmit;
    private javax.swing.JButton loginSubmit1;
    private javax.swing.JTextField loginUsernameTextField;
    private javax.swing.JPasswordField passwordTextField1;
    private javax.swing.JTextField registAlamatTextField;
    private javax.swing.JRadioButton registClientRadio;
    private javax.swing.JTextField registEmailTextField;
    private javax.swing.JTextField registNameTextField;
    private javax.swing.JTextField registNoTelpTextField;
    private javax.swing.JPanel registPanel;
    private javax.swing.JTextField registPasswordTextField;
    private javax.swing.ButtonGroup registRoleRadioGroup;
    private javax.swing.JButton registSubmit;
    private javax.swing.JRadioButton registTechnicianRadio;
    private javax.swing.JTextField registUsernameTextField;
    private javax.swing.JButton switchToLoginButton;
    private javax.swing.JButton switchToRegistButton;
    private javax.swing.JTextField usernameTextField1;
    // End of variables declaration//GEN-END:variables
}
