/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controller1.Controller;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 2ndyrGroupC
 */
public class JAdminAdd extends javax.swing.JFrame {

    static String name, bname, gname, type, price, stock;

    /**
     * Creates new form JAdminAdd
     */
    public JAdminAdd() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameT = new javax.swing.JLabel();
        bnameT = new javax.swing.JLabel();
        gnameT = new javax.swing.JLabel();
        typeT = new javax.swing.JLabel();
        priceT = new javax.swing.JLabel();
        stockT = new javax.swing.JLabel();
        nameF = new javax.swing.JTextField();
        bnameF = new javax.swing.JTextField();
        gnameF = new javax.swing.JTextField();
        typeF = new javax.swing.JTextField();
        priceF = new javax.swing.JTextField();
        stockF = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        addMed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 160, 122));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 140, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 140, 0));
        jLabel1.setText("Add Medicine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        nameT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameT.setText("Name");

        bnameT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnameT.setText("Brand Name");

        gnameT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gnameT.setText("Generic Name");

        typeT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typeT.setText("Type");

        priceT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceT.setText("Price");

        stockT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stockT.setText("Stock");

        stockF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockFActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        addMed.setText("ADD");
        addMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameT)
                    .addComponent(gnameT)
                    .addComponent(bnameT)
                    .addComponent(typeT)
                    .addComponent(nameF)
                    .addComponent(bnameF)
                    .addComponent(gnameF)
                    .addComponent(typeF)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(priceT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(back, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(stockT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stockF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(addMed, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nameT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnameT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnameF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gnameT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gnameF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceT)
                    .addComponent(stockT)
                    .addComponent(priceF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMed, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stockFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockFActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        JAdminDash back = new JAdminDash();
        back.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_backMouseClicked

    private void addMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMedMouseClicked
        // TODO add your handling code here:
        name = nameF.getText();
        bname = bnameF.getText();
        gname = gnameF.getText();
        type = typeF.getText();
        price = priceF.getText();
        stock = stockF.getText();

        Controller medcontrol = new Controller();
        if (medcontrol.addMedicine(name, bname, gname, type, price, stock) == true) {
            this.setVisible(false);
            new JViewMed().setVisible(true);
            JOptionPane.showMessageDialog(rootPane, "Medicine Added Successfully");
        } else {
            this.setVisible(true);
        }

//        
//        Statement stmt = null;
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/luciferpharmacy", "root", "");
//            stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM `medicine` WHERE name='" + name + "'");
//
//            if (rs.next()) {
//                JOptionPane.showMessageDialog(rootPane, "Medicine Name already existed!\nUpdate " + name, "Error", JOptionPane.ERROR_MESSAGE);
//            } else {
//                System.out.println("successfully connected");
//                if (name.length() > 0 && bname.length() > 0 && gname.length() > 0 && type.length() > 0) {
//                    if (type.matches("Headache Medicine") || type.matches("Allergies Medicine") || type.matches("Body Pain Medicine")) {
//
//                        try {
//                            price = Double.parseDouble(priceF.getText());
//                            priceF.requestFocusInWindow();
//                            stock = Integer.parseInt(stockF.getText());
//                            stockF.requestFocusInWindow();
//                        } catch (NumberFormatException z) {
//                            JOptionPane.showMessageDialog(rootPane, "Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
//                            priceF.setText("");
//                            priceF.requestFocusInWindow();
//                            stockF.setText("");
//                            stockF.requestFocusInWindow();
//                        }
//                        if (price > 0 && stock > 0) {
//                            String sql = "INSERT INTO `medicine`( `name`, `bname`, `gname`, `type`, `price`, `stock`) VALUES ('" + name + "','" + bname + "','" + gname + "','" + type + "','" + price + "'," + stock + ")";
//                            stmt.executeUpdate(sql);
//                            JOptionPane.showMessageDialog(rootPane, "Medicine Added Successfully");
//                            JViewMed view = new JViewMed();
//                            view.setVisible(true);
//                            this.setVisible(false);
//                            con.close();
//
//                        } else {
//                            JOptionPane.showMessageDialog(rootPane, "Number less than zero is not valid", "Error", JOptionPane.ERROR_MESSAGE);
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(rootPane, "For Type\nChoose of the three 'Allergies Medicine' or 'Body Pain Medicine' or 'Headache Medicine' ", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(rootPane, "Fill Up Everything", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
//            System.out.println(e);
//        }
    }//GEN-LAST:event_addMedMouseClicked

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
            java.util.logging.Logger.getLogger(JAdminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAdminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAdminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAdminAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAdminAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMed;
    private javax.swing.JButton back;
    private javax.swing.JTextField bnameF;
    private javax.swing.JLabel bnameT;
    private javax.swing.JTextField gnameF;
    private javax.swing.JLabel gnameT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameF;
    private javax.swing.JLabel nameT;
    private javax.swing.JTextField priceF;
    private javax.swing.JLabel priceT;
    private javax.swing.JTextField stockF;
    private javax.swing.JLabel stockT;
    private javax.swing.JTextField typeF;
    private javax.swing.JLabel typeT;
    // End of variables declaration//GEN-END:variables
}