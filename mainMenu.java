
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeina
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form mainMenu
     */
    public mainMenu() {
        initComponents();
        userlog = new Login();
        int currentUserPosition = userlog.getUser();
        if(currentUserPosition != 1){
            bEmployee.setEnabled(false);
            bAccount.setEnabled(false);
            bQualif.setEnabled(false);
            bPosition.setEnabled(false);            
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

        bLogout = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        lTitle = new javax.swing.JLabel();
        bMeds = new javax.swing.JButton();
        bClients = new javax.swing.JButton();
        bTransac = new javax.swing.JButton();
        bOrders = new javax.swing.JButton();
        bPosition = new javax.swing.JButton();
        bEmployee = new javax.swing.JButton();
        bAccount = new javax.swing.JButton();
        bQualif = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bLogout.setText("Logout");
        bLogout.setName("bLogout"); // NOI18N
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        bExit.setText("Exit");
        bExit.setToolTipText("");
        bExit.setName("bExit"); // NOI18N
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        lTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lTitle.setText("Pharmacy Management Software");
        lTitle.setName("lTitle"); // NOI18N

        bMeds.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bMeds.setText("Medications");
        bMeds.setMargin(new java.awt.Insets(40, 60, 40, 60));
        bMeds.setName("bMeds"); // NOI18N
        bMeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMedsActionPerformed(evt);
            }
        });

        bClients.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bClients.setText("Clients");
        bClients.setMargin(new java.awt.Insets(40, 60, 40, 60));
        bClients.setName("bClients"); // NOI18N
        bClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientsActionPerformed(evt);
            }
        });

        bTransac.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bTransac.setText("Transactions");
        bTransac.setName("bTransac"); // NOI18N
        bTransac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTransacActionPerformed(evt);
            }
        });

        bOrders.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bOrders.setText("Orders");
        bOrders.setName("bOrders"); // NOI18N
        bOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrdersActionPerformed(evt);
            }
        });

        bPosition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bPosition.setText("Positions");
        bPosition.setName("bPosition"); // NOI18N
        bPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPositionActionPerformed(evt);
            }
        });

        bEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bEmployee.setText("Employees");
        bEmployee.setName("bEmpList"); // NOI18N
        bEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmployeeActionPerformed(evt);
            }
        });

        bAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bAccount.setText("Accounts");
        bAccount.setName("bEmpList"); // NOI18N
        bAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAccountActionPerformed(evt);
            }
        });

        bQualif.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bQualif.setText("Qualifications");
        bQualif.setName("bEmpList"); // NOI18N
        bQualif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQualifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bLogout)
                .addGap(18, 18, 18)
                .addComponent(bExit)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bClients, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bTransac, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bQualif, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bMeds, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(bPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLogout)
                    .addComponent(bExit))
                .addGap(25, 25, 25)
                .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bClients, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMeds, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTransac, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bQualif, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        bAccount.getAccessibleContext().setAccessibleName("Accounts");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        this.setVisible(false);
        Login l1 = new Login();
        l1.setVisible(true);
    }//GEN-LAST:event_bLogoutActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

    private void bClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientsActionPerformed
        this.setVisible(false);
        Clients cl1 = new Clients();
        cl1.setVisible(true);
    }//GEN-LAST:event_bClientsActionPerformed

    private void bMedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMedsActionPerformed
        this.setVisible(false);
        Medications med = new Medications();
        med.setVisible(true);
    }//GEN-LAST:event_bMedsActionPerformed

    private void bTransacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTransacActionPerformed
        this.setVisible(false);
        Transactions trans = new Transactions();
        trans.setVisible(true);
    }//GEN-LAST:event_bTransacActionPerformed

    private void bOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrdersActionPerformed
        this.setVisible(false);
        Orders ord = new Orders();
        ord.setVisible(true);
    }//GEN-LAST:event_bOrdersActionPerformed

    private void bEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmployeeActionPerformed
        this.setVisible(false);
        Employees emp = new Employees();
        emp.setVisible(true);
    }//GEN-LAST:event_bEmployeeActionPerformed

    private void bPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPositionActionPerformed
        this.setVisible(false);
        Positions pos = new Positions();
        pos.setVisible(true);
    }//GEN-LAST:event_bPositionActionPerformed

    private void bQualifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQualifActionPerformed
        this.setVisible(false);
        Qualifications qual = new Qualifications();
        qual.setVisible(true);
    }//GEN-LAST:event_bQualifActionPerformed

    private void bAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAccountActionPerformed
        this.setVisible(false);
        Accounts acc = new Accounts();
        acc.setVisible(true);
    }//GEN-LAST:event_bAccountActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAccount;
    private javax.swing.JButton bClients;
    private javax.swing.JButton bEmployee;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bMeds;
    private javax.swing.JButton bOrders;
    private javax.swing.JButton bPosition;
    private javax.swing.JButton bQualif;
    private javax.swing.JButton bTransac;
    private javax.swing.JLabel lTitle;
    // End of variables declaration//GEN-END:variables
    private Login userlog;
}
