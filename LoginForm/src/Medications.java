/**
 *
 * @author Kenny, Zeina
 */

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Medications extends javax.swing.JFrame {
    DefaultTableModel model;
    /**
     * Creates new form Medications
     */
    Connection conn;
    ResultSet rs;
   
    public Medications() {
        initComponents();
        this.model = (DefaultTableModel) tbMeds.getModel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bSearch = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tSearchBar = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bModify = new javax.swing.JButton();
        spMedsList = new javax.swing.JScrollPane();
        tbMeds = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bLogout.setText("Logout");
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Medications");

        tSearchBar.setText("Search medications names...");
        tSearchBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tSearchBarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tSearchBarFocusLost(evt);
            }
        });
        tSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSearchBarActionPerformed(evt);
            }
        });

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bModify.setText("Modify");
        bModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifyActionPerformed(evt);
            }
        });

        tbMeds.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MID", "MNAME", "EFFECT", "DOSAGE", "GENERIC", "PRICE", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spMedsList.setViewportView(tbMeds);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(150, 150, 150)
                        .addComponent(bLogout)
                        .addGap(18, 18, 18)
                        .addComponent(bExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spMedsList)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bModify)
                            .addComponent(bDelete)
                            .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bLogout)
                        .addComponent(bExit)
                        .addComponent(jLabel1))
                    .addComponent(bBack))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(bAdd)
                        .addGap(28, 28, 28)
                        .addComponent(bModify)
                        .addGap(31, 31, 31)
                        .addComponent(bDelete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spMedsList, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        createConnection();
        String sql = "select * from medications where lower(mname) = '" + tSearchBar.getText().toLowerCase() + "'";
        getResultSet(sql, "no Medications found!");
        closeConnection();
    }//GEN-LAST:event_bSearchActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        this.setVisible(false);
        Login l1 = new Login();
        l1.setVisible(true);
    }//GEN-LAST:event_bLogoutActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        this.setVisible(false);
        mainMenu m1 = new mainMenu();
        m1.setVisible(true);
    }//GEN-LAST:event_bBackActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        createConnection();
        JTextField midField = new JTextField("");
        JTextField mnameField = new JTextField("");
        JTextField effectField = new JTextField("");
        JTextField dosageField = new JTextField("");
        JTextField genericField = new JTextField("");
        JTextField priceField = new JTextField("");
        JTextField quantityField = new JTextField("");
        
        String mid, mname, effect, dosage, generic, price, quantity;
        
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Medication ID:"));
        panel.add(midField);
        panel.add(new JLabel("Medication Name:"));
        panel.add(mnameField);
        panel.add(new JLabel("Effect:"));
        panel.add(effectField);
        panel.add(new JLabel("Dosage:"));
        panel.add(dosageField);
        panel.add(new JLabel("Generic:"));
        panel.add(genericField);
        panel.add(new JLabel("Price:"));
        panel.add(priceField);
        panel.add(new JLabel("Quantity:"));
        panel.add(quantityField);
        
        int result = JOptionPane.showConfirmDialog(null, panel, "Add Medication Form",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            mid = midField.getText();
            mname = mnameField.getText();
            effect = effectField.getText();
            dosage = dosageField.getText();
            generic = genericField.getText();
            price = priceField.getText();
            quantity = quantityField.getText();
            
            String sql = "INSERT INTO medications VALUES (" + mid + ", '"+ mname +"', '" + effect + 
                "', '" + dosage + "', '" + generic + "', " + price + ", " + quantity + ")";
            try{
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.executeQuery();
                updateTable();
                closeConnection();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "invalid data");
                System.out.println(e);
            }
        } else {
            System.out.println("Cancelled");
        }
        
    }//GEN-LAST:event_bAddActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        createConnection();
        String sql = "select * from medications";
        getResultSet(sql, "no medications found!");
    }//GEN-LAST:event_formWindowOpened

    private void bModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyActionPerformed
        if(tbMeds.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to modify!");
        else{
            createConnection();
            int rowSelected = tbMeds.getSelectedRow();
            String selectMid = tbMeds.getValueAt(rowSelected, 0).toString();
            String selectMname = tbMeds.getValueAt(rowSelected, 1).toString();
            String selectEffect = tbMeds.getValueAt(rowSelected, 2).toString();
            String selectDosage = tbMeds.getValueAt(rowSelected, 3).toString();       
            String selectGeneric = tbMeds.getValueAt(rowSelected, 4).toString();
            String selectPrice = tbMeds.getValueAt(rowSelected, 5).toString();
            String selectQuantity = tbMeds.getValueAt(rowSelected, 6).toString();
            
            JTextField midField = new JTextField(selectMid);
            JTextField mnameField = new JTextField(selectMname);
            JTextField effectField = new JTextField(selectEffect);
            JTextField dosageField = new JTextField(selectDosage);
            JTextField genericField = new JTextField(selectGeneric);
            JTextField priceField = new JTextField(selectPrice);
            JTextField quantityField = new JTextField(selectQuantity);

            String mid, mname, effect, dosage, generic, price, quantity;

            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Medication ID:"));
            panel.add(midField);
            panel.add(new JLabel("Medication Name:"));
            panel.add(mnameField);
            panel.add(new JLabel("Effect:"));
            panel.add(effectField);
            panel.add(new JLabel("Dosage:"));
            panel.add(dosageField);
            panel.add(new JLabel("Generic:"));
            panel.add(genericField);
            panel.add(new JLabel("Price:"));
            panel.add(priceField);
            panel.add(new JLabel("Quantity:"));
            panel.add(quantityField);
            
            int result = JOptionPane.showConfirmDialog(null, panel, "Modify Medications Form",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            //UIManager.put("OptionPane.okButtonText", "Save");
            if (result == JOptionPane.OK_OPTION) {
                mid = midField.getText();
                mname = mnameField.getText();
                effect = effectField.getText();
                dosage = dosageField.getText();
                generic = genericField.getText();
                price = priceField.getText();
                quantity = quantityField.getText();

                String sql1 = "delete from medications where mid = '" + selectMid + "'";
                String sql2 = "INSERT INTO medications VALUES (" + mid + ", '"+ mname +"', '" + effect + 
                "', '" + dosage + "', '" + generic + "', " + price + ", " + quantity + ")";
                
                try{
                    PreparedStatement ps = conn.prepareStatement(sql1);
                    PreparedStatement ps2 = conn.prepareStatement(sql2);
                    ps.executeQuery();
                    ps2.executeQuery();
                    updateTable();
                    closeConnection();
                }
                catch(Exception e){
                    try{
                    PreparedStatement ps3 = conn.prepareStatement("rollback");
                    ps3.executeQuery();
                    }
                    catch(Exception exe){
                        System.out.println(e);
                    }
                    JOptionPane.showMessageDialog(null, "invalid data");
                    System.out.println(e);
                }
            }
            else {
                System.out.println("Cancelled");
            }        
        }
    }//GEN-LAST:event_bModifyActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        createConnection();//add exception if no rows selected
        int rowSelected = tbMeds.getSelectedRow();
        String selectMid = tbMeds.getValueAt(rowSelected, 0).toString();
        System.out.println(selectMid);
        String sql = "delete from medications where mid = '" + selectMid + "'";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            updateTable();
            closeConnection();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "can not delete");
            System.out.println(e);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void tSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchBarActionPerformed
        tSearchBar.addKeyListener(new KeyListener() { 
        public void keyTyped(KeyEvent event) {
            if(tSearchBar.getText().equals("")){
                createConnection();
                updateTable();
                closeConnection();
            }
            else{
                createConnection();
                String sql = "select * from medications where lower(mname) = '" + tSearchBar.getText().toLowerCase() + "'";
                getResultSet(sql, "no medications found!");
                closeConnection();
            }
        }

        @Override
        public void keyReleased(KeyEvent event) {
        }

        @Override
        public void keyPressed(KeyEvent event) {
        }

           
        });
    }//GEN-LAST:event_tSearchBarActionPerformed

    private void tSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusGained
        if(tSearchBar.getText().equals("Search medications names..."))
            tSearchBar.setText("");
    }//GEN-LAST:event_tSearchBarFocusGained

    private void tSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusLost
        if(tSearchBar.getText().equals(""))
            tSearchBar.setText("Search medications names...");
    }//GEN-LAST:event_tSearchBarFocusLost
              
    public void createConnection(){
        try{
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ZEINAJK", "Welcome1");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection to database can't be esatblished!");
            System.out.println(e);
        }
    }
    public void closeConnection(){
        try{
            conn.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection error!");
            System.out.println(e);
        }
    }
    public ResultSet getResultSet(String sql, String errorMsg){
        try{
        PreparedStatement ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        tbMeds.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, errorMsg);
            System.out.println(e);
        }
        return rs;
    }
    public void updateTable(){
    String sql = "select * from medications";
    getResultSet(sql, "no medications found!");
    }
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
            java.util.logging.Logger.getLogger(Medications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bModify;
    private javax.swing.JButton bSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane spMedsList;
    private javax.swing.JTextField tSearchBar;
    private javax.swing.JTable tbMeds;
    // End of variables declaration//GEN-END:variables
}