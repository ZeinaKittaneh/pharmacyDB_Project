/**
 *
 * @author zeina
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import javax.accessibility.AccessibleRole;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Qualifications extends javax.swing.JFrame {
    DefaultTableModel model;

    public Qualifications() {
        initComponents();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bExit = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tSearchBar = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bModify = new javax.swing.JButton();
        spQualList = new javax.swing.JScrollPane();
        tbQualifications = new javax.swing.JTable();
        bSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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
        jLabel1.setText("Qualifications");

        tSearchBar.setText("Search qualification...");
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

        tbQualifications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "QualID", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spQualList.setViewportView(tbQualifications);

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bBack)
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bLogout)
                        .addGap(18, 18, 18)
                        .addComponent(bExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bSearch))
                            .addComponent(spQualList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
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
                        .addComponent(bExit))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bBack)
                        .addComponent(jLabel1)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(spQualList, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection conn;
    ResultSet rs;
    String selectHCN;
//    public String[] selectedItems = new String[6];
    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        createConnection();
        JTextField qualIDField = new JTextField("");
        JTextField descriptionField = new JTextField("");
        
        String qualID, description;
        
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("QualificationID:"));
        panel.add(qualIDField);
        panel.add(new JLabel("Description:"));
        panel.add(descriptionField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Add Qualification Form",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            qualID = qualIDField.getText();
            description = descriptionField.getText();

            
            String sql = "INSERT INTO qualifications VALUES ('" + qualID + "', '"
                    + description +"')";
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

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        createConnection();
        String sql = "select * from qualifications where lower(QualDesc) = "
                + "'" + tSearchBar.getText().toLowerCase() + "'";
        getResultSet(sql, "no qualification found!");
        closeConnection();
    }//GEN-LAST:event_bSearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        createConnection();
        updateTable();
        closeConnection();
    }//GEN-LAST:event_formWindowOpened

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
                String sql = "select * from qualifications where lower(QualDesc) = '" + tSearchBar.getText().toLowerCase() + "'";
                getResultSet(sql, "no qualification found!");
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

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        createConnection();
        int rowSelected = tbQualifications.getSelectedRow();
        String selectQualID = tbQualifications.getValueAt(rowSelected, 0).toString();
        System.out.println(selectHCN);
        String sql = "delete from qualifications where QualID = '" + selectQualID + "'";
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

    private void bModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyActionPerformed
        if(tbQualifications.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to modify!");
        else{
            createConnection();
            int rowSelected = tbQualifications.getSelectedRow();
            String selectQualID = tbQualifications.getValueAt(rowSelected, 0).toString();
            String selectDescription = tbQualifications.getValueAt(rowSelected, 1).toString();
            
            
            JTextField qualIDField = new JTextField(selectQualID);
            JTextField descriptionField = new JTextField(selectDescription);
            
            String qualid, description;

            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("QualificationID:"));
            panel.add(qualIDField);
            panel.add(new JLabel("Description:"));
            panel.add(descriptionField);

            int result = JOptionPane.showConfirmDialog(null, panel, "Modify Qualification Form",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            //UIManager.put("OptionPane.okButtonText", "Save");
            if (result == JOptionPane.OK_OPTION) {
                qualid = qualIDField.getText();
                description = descriptionField.getText();


                String sql1 = "delete from qualifications where QualID = '" + 
                        selectQualID + "'";
                String sql2 = "INSERT INTO qualifications VALUES ('" + qualid + "', '"+ 
                        description + "')";
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

    private void tSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusGained
        if(tSearchBar.getText().equals("Search qualification..."))
            tSearchBar.setText("");
    }//GEN-LAST:event_tSearchBarFocusGained

    private void tSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusLost
        if(tSearchBar.getText().equals(""))
            tSearchBar.setText("Search qualification...");
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
            tbQualifications.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, errorMsg);
            System.out.println(e);
        }
        return rs;
    }
    public void updateTable(){
        String sql = "select * from qualifications";
        getResultSet(sql, "no qualifications found!");
    }
    
//    public static void applyModifications(String[] newInfo){
//        String sql1 = "delete from qualifications where HCN = '" + selectHCN + "'";
//        String sql2 = "INSERT INTO qualifications VALUES ('" + newInfo[0] + "', '"+ newInfo[1] +
//                "', '" + newInfo[2] + "', TO_DATE('" + newInfo[3] + "','yyyy/mm/dd'), " +
//                newInfo[4] + "," + "'" + newInfo[5] + "')";
//        try{
//            PreparedStatement ps = conn.prepareStatement(sql1);
//            ps.executeQuery();
//            PreparedStatement ps2 = conn.prepareStatement(sql2);
//            ps2.executeQuery();
//            updateTable();
//            closeConnection();
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null, "invalid data");
//            System.out.println(e);
//        }
//    }
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
            java.util.logging.Logger.getLogger(Qualifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Qualifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Qualifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Qualifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Qualifications().setVisible(true);
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
    private static javax.swing.JScrollPane spQualList;
    private javax.swing.JTextField tSearchBar;
    private static javax.swing.JTable tbQualifications;
    // End of variables declaration//GEN-END:variables
}
