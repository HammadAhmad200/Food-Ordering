
package foodorderingsystem;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Biryani extends javax.swing.JFrame {

    ConnectionToDB conObj = new ConnectionToDB();
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet res;
    Connection con;
    String Orderno = "";
    ArrayList<String> biryaniList=new ArrayList<>(); 
        int qtyChk = 0;
    int qtyBeef = 0;
    int qtyMutton = 0;
    int qtyMatka = 0;

    boolean chickenBiryani = false;
    boolean beefBiryani = false;
    boolean muttonBiryani = false;
    boolean matkaBiryani = false;

    public Biryani() {
                conObj.EstablishCon();
        con = conObj.EstablishCon();
        initComponents();
        this.setLocation(500, 0);
        autoID();
    }

        public final void autoID() {

        String query = "select max(orderNo) from customerInfo";

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                Orderno = rs.getString(1);
//                System.out.println(Orderno);
            }
        } catch (SQLException e) {
            Logger.getLogger(Biryani.class.getName()).log(Level.SEVERE, null, e);
        }

        String setOrder = "insert into Biryani(orderNo) values('" + Orderno + "')";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(setOrder);
        } catch (SQLException e) {

            Logger.getLogger(Biryani.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        chkMuttonBiryani = new javax.swing.JCheckBox();
        chkBeefBiryani = new javax.swing.JCheckBox();
        unitBeefBiryani = new javax.swing.JLabel();
        priceBeefBiryani = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        qtyBeefBiryani = new javax.swing.JComboBox<>();
        unitMatkaBiryani = new javax.swing.JLabel();
        priceMatkaBiryani = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        qtyMatkaBiryani = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        chkMatkaBiryani = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        unitChickenBiryani = new javax.swing.JLabel();
        qtyChickenBiryani = new javax.swing.JComboBox<>();
        priceChickenBiryani = new javax.swing.JTextField();
        unitMuttonBiryani = new javax.swing.JLabel();
        qtyMuttonBiryani = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        chkChickenBiryani = new javax.swing.JCheckBox();
        priceMuttonBiryani = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtTotal = new javax.swing.JTextField();
        btnCalTotal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Biryani/BiryaniPic.png"))); // NOI18N

        chkMuttonBiryani.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkMuttonBiryani.setText("Mutton Biryani");
        chkMuttonBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMuttonBiryaniActionPerformed(evt);
            }
        });

        chkBeefBiryani.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkBeefBiryani.setText("Beef Biryani");
        chkBeefBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBeefBiryaniActionPerformed(evt);
            }
        });

        unitBeefBiryani.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitBeefBiryani.setText("450");

        priceBeefBiryani.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceBeefBiryani.setText("0");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Biryani/beefBiryani.png"))); // NOI18N

        qtyBeefBiryani.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyBeefBiryani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyBeefBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyBeefBiryaniActionPerformed(evt);
            }
        });

        unitMatkaBiryani.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitMatkaBiryani.setText("450");

        priceMatkaBiryani.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceMatkaBiryani.setText("0");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Biryani/matkaBiryani.png"))); // NOI18N

        qtyMatkaBiryani.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyMatkaBiryani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyMatkaBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyMatkaBiryaniActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item");

        chkMatkaBiryani.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkMatkaBiryani.setText("Matka Biryani");
        chkMatkaBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMatkaBiryaniActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Unit Price/kg");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Qty/kg");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price");

        unitChickenBiryani.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitChickenBiryani.setText("300");

        qtyChickenBiryani.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyChickenBiryani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyChickenBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyChickenBiryaniActionPerformed(evt);
            }
        });

        priceChickenBiryani.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceChickenBiryani.setText("0");
        priceChickenBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceChickenBiryaniActionPerformed(evt);
            }
        });

        unitMuttonBiryani.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unitMuttonBiryani.setText("500");

        qtyMuttonBiryani.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qtyMuttonBiryani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        qtyMuttonBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyMuttonBiryaniActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Biryani/chicken Biryani.png"))); // NOI18N

        chkChickenBiryani.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chkChickenBiryani.setText("Chicken Biryani");
        chkChickenBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkChickenBiryaniActionPerformed(evt);
            }
        });

        priceMuttonBiryani.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceMuttonBiryani.setText("0");
        priceMuttonBiryani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceMuttonBiryaniActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodorderingsystem/Images/Biryani/MuttonBiryani.png"))); // NOI18N

        btnCalTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalTotal.setText("Calculate Total");
        btnCalTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalTotalActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        BtnMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnMenu.setText("Go to Menu");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addGap(181, 181, 181)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chkMatkaBiryani)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(chkMuttonBiryani)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chkBeefBiryani)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitBeefBiryani)
                            .addComponent(unitMuttonBiryani)
                            .addComponent(unitMatkaBiryani)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chkChickenBiryani)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64)
                        .addComponent(unitChickenBiryani)))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qtyChickenBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priceChickenBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qtyMatkaBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priceMatkaBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qtyMuttonBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(priceMuttonBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qtyBeefBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priceBeefBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCalTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(priceChickenBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(unitChickenBiryani)
                                .addComponent(qtyChickenBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(chkChickenBiryani)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qtyMuttonBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceMuttonBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unitMuttonBiryani))
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(chkMuttonBiryani)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitBeefBiryani)
                            .addComponent(qtyBeefBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceBeefBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unitMatkaBiryani)
                            .addComponent(qtyMatkaBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceMatkaBiryani, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(chkBeefBiryani)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(chkMatkaBiryani)))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMenu)
                    .addComponent(btnClear))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkMuttonBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMuttonBiryaniActionPerformed
        if(chkMuttonBiryani.isSelected()){
             biryaniList.add("Mutton Biryani");
            qtyMuttonBiryani.setSelectedIndex(1);
            muttonBiryani = true;
            
            qtyMuttonBiryani.enable(true);
            int a = Integer.parseInt(unitMuttonBiryani.getText());
            int b = qtyMuttonBiryani.getSelectedIndex();
            priceMuttonBiryani.setText(""+(a*b));
        }
        else {
                        qtyMuttonBiryani.setSelectedIndex(0);
            muttonBiryani = false;
            biryaniList.remove("Mutton Biryani");

            
            priceMuttonBiryani.setText("0");
            qtyMuttonBiryani.setSelectedIndex(0);
            qtyMuttonBiryani.enable(false);
        }

    }//GEN-LAST:event_chkMuttonBiryaniActionPerformed

    private void chkBeefBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBeefBiryaniActionPerformed
        if(chkBeefBiryani.isSelected()){
            qtyBeefBiryani.setSelectedIndex(1);
             biryaniList.add("Beef Biryani");
            beefBiryani = true;
            qtyBeefBiryani.enable(true);
            int a = Integer.parseInt(unitBeefBiryani.getText());
            int b = qtyBeefBiryani.getSelectedIndex();
            priceBeefBiryani.setText(""+(a*b));
        }
        else {
            qtyBeefBiryani.setSelectedIndex(0);
            beefBiryani = false;
            biryaniList.remove("Beef Biryani");

            
            priceBeefBiryani.setText("0");
            
            qtyBeefBiryani.enable(false);
        }
    }//GEN-LAST:event_chkBeefBiryaniActionPerformed

    private void qtyBeefBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyBeefBiryaniActionPerformed
        if(chkBeefBiryani.isSelected()){
            int a = Integer.parseInt(unitBeefBiryani.getText());
            int b = qtyBeefBiryani.getSelectedIndex();
            qtyBeef = b;
            priceBeefBiryani.setText(""+(a*b));
        }
    }//GEN-LAST:event_qtyBeefBiryaniActionPerformed

    private void qtyMatkaBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyMatkaBiryaniActionPerformed
        if(chkMatkaBiryani.isSelected()){
            int a = Integer.parseInt(unitMatkaBiryani.getText());
            int b = qtyMatkaBiryani.getSelectedIndex();
            qtyMatka=b;
            priceMatkaBiryani.setText(""+(a*b));
        }
    }//GEN-LAST:event_qtyMatkaBiryaniActionPerformed

    private void chkMatkaBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMatkaBiryaniActionPerformed
        if(chkMatkaBiryani.isSelected()){
            
             biryaniList.add("Matka Biryani");
            qtyMatkaBiryani.setSelectedIndex(1);
            matkaBiryani = true;
            
            qtyMatkaBiryani.enable(true);
            int a = Integer.parseInt(unitMatkaBiryani.getText());
            int b = qtyMatkaBiryani.getSelectedIndex();
            priceMatkaBiryani.setText(""+(a*b));
        }
        else {
                      
            matkaBiryani = false;
            biryaniList.remove("Matka Biryani");

            
            priceMatkaBiryani.setText("0");
            qtyMatkaBiryani.setSelectedIndex(0);
            qtyMatkaBiryani.enable(false);
        }
    }//GEN-LAST:event_chkMatkaBiryaniActionPerformed

    private void qtyChickenBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyChickenBiryaniActionPerformed
        if(chkChickenBiryani.isSelected()){
            int a = Integer.parseInt(unitChickenBiryani.getText());
            int b = qtyChickenBiryani.getSelectedIndex();
            qtyChk = b;
            priceChickenBiryani.setText(""+(a*b));
        }
    }//GEN-LAST:event_qtyChickenBiryaniActionPerformed

    private void qtyMuttonBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyMuttonBiryaniActionPerformed

        if(chkMuttonBiryani.isSelected()){
            int a = Integer.parseInt(unitMuttonBiryani.getText());
            int b = qtyMuttonBiryani.getSelectedIndex();
            qtyMutton = b;
            priceMuttonBiryani.setText(""+(a*b));
        }
    }//GEN-LAST:event_qtyMuttonBiryaniActionPerformed

    private void chkChickenBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkChickenBiryaniActionPerformed
        if(chkChickenBiryani.isSelected()){
            
             biryaniList.add("Chicken Biryani");
            qtyChickenBiryani.setSelectedIndex(1);
            chickenBiryani = true;
            
            qtyChickenBiryani.enable(true);
            int a = Integer.parseInt(unitChickenBiryani.getText());
            int b = qtyChickenBiryani.getSelectedIndex();
            priceChickenBiryani.setText(""+(a*b));
        }
        else {
             qtyChickenBiryani.setSelectedIndex(0);
            chickenBiryani = false;
            biryaniList.remove("Chicken Biryani");
            
            priceChickenBiryani.setText("0");
            qtyChickenBiryani.setSelectedIndex(0);
            qtyChickenBiryani.enable(false);
        }
    }//GEN-LAST:event_chkChickenBiryaniActionPerformed

    private void priceMuttonBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceMuttonBiryaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceMuttonBiryaniActionPerformed

    private void priceChickenBiryaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceChickenBiryaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceChickenBiryaniActionPerformed

    private void btnCalTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalTotalActionPerformed

        int a = Integer.parseInt(priceChickenBiryani.getText());
        int b = Integer.parseInt(priceMuttonBiryani.getText());
        int c = Integer.parseInt(priceBeefBiryani.getText());
        int d = Integer.parseInt(priceMatkaBiryani.getText());

        int total = a+b+c+d ;
        txtTotal.setText(""+total);
        
         //================== DATABASE CONNECTION================
        int p = biryaniList.indexOf("Chicken Biryani");
        int q = biryaniList.indexOf("Mutton Biryani");
        int x = biryaniList.indexOf("Beef Biryani");
        int y = biryaniList.indexOf("Matka Biryani");
        String chk = "";
        String Mutton ="";
        String Beef="";
        String Matka="";
        if (chickenBiryani == true) {
            chk = (qtyChk + " " + biryaniList.get(p)+",");
        }
        if (muttonBiryani == true) {
            Beef = (qtyMutton + " " + biryaniList.get(q)+",");
        }
        if (beefBiryani == true) {
            Mutton = (qtyBeef + " " + biryaniList.get(x)+",");
        }
        if (matkaBiryani == true) {
            Matka = (qtyMatka + " " + biryaniList.get(y)+",");
        }
      
        String biryanis = chk + Mutton + Beef + Matka;
        System.out.println(biryanis);

        // set values in database
        String addbiryani = "update Biryani set items = '" + biryanis + "' where orderNo = '" + Orderno + "'";
        String addTotal = "update Biryani set Total = '" + total + "' where orderNo = '" + Orderno + "'";
        try {

            stmt = con.createStatement();
            stmt.executeUpdate(addbiryani);
            stmt.executeUpdate(addTotal);
            JOptionPane.showMessageDialog(null, "mobarak ho bahiii....");
        } catch (SQLException ex) {
            Logger.getLogger(Biryani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCalTotalActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        chkChickenBiryani.setSelected(false);
        priceChickenBiryani.setText("0");
        qtyChickenBiryani.setSelectedIndex(0);
        qtyChickenBiryani.enable(false);

        chkMuttonBiryani.setSelected(false);
        priceMuttonBiryani.setText("0");
        qtyMuttonBiryani.setSelectedIndex(0);
        qtyMuttonBiryani.enable(false);

        chkBeefBiryani.setSelected(false);
        priceBeefBiryani.setText("0");
        qtyBeefBiryani.setSelectedIndex(0);
        qtyBeefBiryani.enable(false);

        chkMatkaBiryani.setSelected(false);
        priceMatkaBiryani.setText("0");
        qtyMatkaBiryani.setSelectedIndex(0);
        qtyMatkaBiryani.enable(false);

        txtTotal.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        this.setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_BtnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Biryani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biryani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biryani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biryani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biryani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton btnCalTotal;
    private javax.swing.JButton btnClear;
    private javax.swing.JCheckBox chkBeefBiryani;
    private javax.swing.JCheckBox chkChickenBiryani;
    private javax.swing.JCheckBox chkMatkaBiryani;
    private javax.swing.JCheckBox chkMuttonBiryani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField priceBeefBiryani;
    private javax.swing.JTextField priceChickenBiryani;
    private javax.swing.JTextField priceMatkaBiryani;
    private javax.swing.JTextField priceMuttonBiryani;
    private javax.swing.JComboBox<String> qtyBeefBiryani;
    private javax.swing.JComboBox<String> qtyChickenBiryani;
    private javax.swing.JComboBox<String> qtyMatkaBiryani;
    private javax.swing.JComboBox<String> qtyMuttonBiryani;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel unitBeefBiryani;
    private javax.swing.JLabel unitChickenBiryani;
    private javax.swing.JLabel unitMatkaBiryani;
    private javax.swing.JLabel unitMuttonBiryani;
    // End of variables declaration//GEN-END:variables
}
