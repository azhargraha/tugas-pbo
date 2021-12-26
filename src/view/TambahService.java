package view;

import controller.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Account;
import model.Client;
import model.Service;
import model.Technician;
import org.w3c.dom.NameList;
public class TambahService extends javax.swing.JFrame {
    private Account user;
    private String accType;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public TambahService(){
        
    }
    public TambahService(Account user, String accType) {
        this.user = user;
        this.accType = accType;
        initComponents();
        try{
            con = DBConnection.getConnection();
            pst = con.prepareStatement("select Tipe from certificate group by Tipe");
            rs = pst.executeQuery();
            while(rs.next()){
                String tipe = rs.getString("Tipe");
                tipeComboBox.addItem(tipe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TambahService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TambahService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tipeComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        descTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        callButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        ratingLabel = new javax.swing.JLabel();
        noTelpLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tipeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        tipeComboBox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tipeComboBox.setForeground(new java.awt.Color(68, 68, 68));
        tipeComboBox.setBorder(null);
        tipeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeComboBoxActionPerformed(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel4.setForeground(new java.awt.Color(130, 130, 130));
        jLabel4.setText("Nama");

        jLabel5.setForeground(new java.awt.Color(130, 130, 130));
        jLabel5.setText("Rating");

        jLabel6.setForeground(new java.awt.Color(130, 130, 130));
        jLabel6.setText("No. Telp");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(68, 68, 68));
        jLabel8.setText("Cari teknisi");

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 68, 68));
        jLabel1.setText("Tipe masalah");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(68, 68, 68));
        jLabel10.setText("Deskripsi masalah");
        jPanel2.add(jLabel10);

        descTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        descTextField.setBorder(null);
        jPanel2.add(descTextField);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(68, 68, 68));
        jLabel11.setText("Daftar teknisi");

        callButton.setBackground(new java.awt.Color(0, 165, 171));
        callButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        callButton.setForeground(new java.awt.Color(255, 255, 255));
        callButton.setText("Hubungi teknisi");
        callButton.setBorder(null);
        callButton.setMaximumSize(new java.awt.Dimension(153, 34));
        callButton.setMinimumSize(new java.awt.Dimension(153, 34));
        callButton.setPreferredSize(new java.awt.Dimension(153, 34));
        callButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(68, 68, 68));
        jLabel12.setText("Detail teknisi");

        namaLabel.setForeground(new java.awt.Color(130, 130, 130));

        ratingLabel.setForeground(new java.awt.Color(130, 130, 130));

        noTelpLabel.setForeground(new java.awt.Color(130, 130, 130));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(56, 56, 56)
                                .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(54, 54, 54)
                                .addComponent(ratingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel1)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                            .addComponent(callButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(44, 44, 44)
                                .addComponent(noTelpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ratingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(noTelpLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(callButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Dashboard obj = new Dashboard(user, accType);
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void callButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callButtonActionPerformed
        Service svc = new Service(tipeComboBox.getSelectedItem().toString(), descTextField.getText(), "ongoing", 0, 0, user.getNamaLengkap(), jList1.getSelectedValue());
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        try{
                con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement("insert into service (ID, Tipe, Status, Harga, Teknisi, Klien, Tanggal, Deskripsi, Rating) values (NULL,?,?,?,?,?,?,?,0)");
                ps.setString(1, svc.getType());
                ps.setString(2, svc.getServiceStatus());
                ps.setInt(3, 0);
                ps.setString(4, svc.getTechnician());
                ps.setString(5, svc.getClient());
                ps.setDate(6, date);
                ps.setString(7, svc.getProblem());
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Service added");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_callButtonActionPerformed

    private void tipeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeComboBoxActionPerformed
        Object selectedItem = tipeComboBox.getSelectedItem();
        PreparedStatement st;
        ResultSet rst;
        String tipe = selectedItem.toString();
        DefaultListModel model = new DefaultListModel();
        try{
            st = con.prepareStatement("select * from certificate where Tipe=?");
            st.setString(1, tipe);
            rst = st.executeQuery();
            while(rst.next()){
                String name = rst.getString("Nama");
                model.addElement(name);
            }
            jList1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(TambahService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tipeComboBoxActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        try{
            PreparedStatement st = con.prepareStatement("SELECT account.noTelp, certificate.nama, AVG(service.rating) as average FROM ((account inner join certificate on account.namaLengkap = certificate.Nama) INNER JOIN service on account.namaLengkap = service.Teknisi)");
            ResultSet rst = st.executeQuery();
            while(rst.next()){
                namaLabel.setText(rst.getString("Nama"));
                ratingLabel.setText(String.valueOf(rst.getFloat("average")));
                noTelpLabel.setText(rst.getString("noTelp"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TambahService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jList1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton callButton;
    private javax.swing.JTextField descTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel noTelpLabel;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JComboBox<String> tipeComboBox;
    // End of variables declaration//GEN-END:variables
}
