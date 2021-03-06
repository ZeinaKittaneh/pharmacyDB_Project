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


/**
 *
 * @author Kenny, Latifah
 */
public class Orders extends javax.swing.JFrame {
    /**
     * Creates new form Orders
     */
    Connection conn;
    ResultSet rs;
    public Orders() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        spOrdList = new javax.swing.JScrollPane();
        tbOrders = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bSearch.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        bExit.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bLogout.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        bLogout.setText("Logout");
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        bBack.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 30)); // NOI18N
        jLabel1.setText("Orders");

        tSearchBar.setText("Search Company Names...");
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

        bAdd.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDelete.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bModify.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        bModify.setText("Modify");
        bModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifyActionPerformed(evt);
            }
        });

        tbOrders.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tbOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OID", "COMPANY", "AMOUNT", "TOTAL", "DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        spOrdList.setViewportView(tbOrders);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(spOrdList)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(bSearch)
                        .addGap(40, 40, 40)
                        .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bLogout)
                            .addComponent(bModify))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bDelete)
                            .addComponent(bExit))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bBack)
                    .addComponent(bLogout)
                    .addComponent(bExit))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch)
                    .addComponent(bAdd)
                    .addComponent(bModify)
                    .addComponent(bDelete))
                .addGap(30, 30, 30)
                .addComponent(spOrdList, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /* When search button is pressed, get text from the search text 
    field and look for it in data base and display the results in table 
    */
    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        createConnection();
        String sql = "select * from orders where lower(company) = '" + tSearchBar.getText().toLowerCase() + "'";
        getResultSet(sql, "no orders found!");
        closeConnection();
    }//GEN-LAST:event_bSearchActionPerformed

    //Exit button. Will exit the program
    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bExitActionPerformed
    
     //When logout button is pressed, exit current form and open the login form
    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        this.setVisible(false);
        Login l1 = new Login();
        l1.setVisible(true);
    }//GEN-LAST:event_bLogoutActionPerformed
    
    //When back button is pressed, exit current form and go back to main menu form
    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        this.setVisible(false);
        mainMenu m1 = new mainMenu();
        m1.setVisible(true);
    }//GEN-LAST:event_bBackActionPerformed
     
    //Add a new order to the order table in database
    //A new window will appear for the user to fill
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        createConnection();
        JTextField companyField = new JTextField("");
        JTextField amountField = new JTextField("");
        JTextField total_priceField = new JTextField("");
        JTextField odateField = new JTextField("");
        JTextField order_idField = new JTextField("");
        String company, amount, total_price, odate, order_id;
        
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Order ID:"));
        panel.add(order_idField);
        panel.add(new JLabel("Company:"));
        panel.add(companyField);
        panel.add(new JLabel("Amount:"));
        panel.add(amountField);
        panel.add(new JLabel("Total Price:"));
        panel.add(total_priceField);
        panel.add(new JLabel("Order Date:"));
        panel.add(odateField);        
        
        //Show panel in a dialog "Add orders Form":
        int result = JOptionPane.showConfirmDialog(null, panel, "Add Order Form",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        //When the user presses OK, get every text value and store each in a variable
        if (result == JOptionPane.OK_OPTION) {
            order_id = order_idField.getText();
            company = companyField.getText();
            amount = amountField.getText();
            total_price = total_priceField.getText();
            odate = odateField.getText();
            
            //insert new order:
            String sql = "INSERT INTO orders VALUES (" + order_id + ", '"+ company +  "', " + amount +
                        ", " + total_price + ", TO_DATE('" + odate.substring(0, 10) + "','yyyy/mm/dd'))";
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
        } else { // if cancel button pressed
            System.out.println("Cancelled");
        }
        
    }//GEN-LAST:event_bAddActionPerformed
    
    /* When "orders" form opened at start load table with all rows 
    from the orders column */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        createConnection();
        String sql = "select * from orders";
        getResultSet(sql, "no orders found!");
    }//GEN-LAST:event_formWindowOpened
    // When the "modify" button is pressed, modify the selected row from the table
    private void bModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyActionPerformed
         if(tbOrders.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to modify!");
        else{
            createConnection();
            int rowSelected = tbOrders.getSelectedRow();
            String selectOrder_id = tbOrders.getValueAt(rowSelected, 0).toString();
            String selectCompany = tbOrders.getValueAt(rowSelected, 1).toString();
            String selectAmount = tbOrders.getValueAt(rowSelected, 2).toString();
            String selectTotal_Price = tbOrders.getValueAt(rowSelected, 3).toString();
            String selectOdate = tbOrders.getValueAt(rowSelected, 4).toString();       
            
            JTextField companyField = new JTextField(selectCompany);
            JTextField amountField = new JTextField(selectAmount);
            JTextField total_priceField = new JTextField(selectTotal_Price);
            JTextField odateField = new JTextField(selectOdate);
            JTextField order_idField = new JTextField(selectOrder_id);
            String company, amount, total_price, odate, order_id;

            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Company Name:"));
            panel.add(companyField);
            panel.add(new JLabel("Amount:"));
            panel.add(amountField);
            panel.add(new JLabel("Price:"));
            panel.add(total_priceField);
            panel.add(new JLabel("Order Date:"));
            panel.add(odateField);
            panel.add(new JLabel("Order ID:"));
            panel.add(order_idField);
            
            //show panel in a dialog "Add orders Form":
            int result = JOptionPane.showConfirmDialog(null, panel, "Modify Orders Form",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            //When the user presses ok, the data on each field will be retrieved
            if (result == JOptionPane.OK_OPTION) {
                company = companyField.getText();
                amount = amountField.getText();
                total_price = total_priceField.getText();
                odate = odateField.getText();
                order_id = order_idField.getText();

                String sql1 = "delete from orders where Order_ID = '" + selectOrder_id + "'";
                String sql2 = "INSERT INTO orders VALUES (" + order_id + ", '"+ company +  "', " + amount +
                        ", " + total_price + ", TO_DATE('" + odate.substring(0, 10) + "','yyyy/mm/dd'))";
         
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
    // When the delete button is pressed, delete the selected row
    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        if(tbOrders.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "Please select a row to delete!");
        else{
            createConnection();
            int rowSelected = tbOrders.getSelectedRow();
            String selectOrder_ID = tbOrders.getValueAt(rowSelected, 0).toString();
            System.out.println(selectOrder_ID);
            //deletion from the orders according to the order id
            String sql = "delete from orders where Order_id = '" + selectOrder_ID + "'";
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
        }
    }//GEN-LAST:event_bDeleteActionPerformed
    
//The event when search text field is changed
    private void tSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchBarActionPerformed
        tSearchBar.addKeyListener(new KeyListener() {
        //When user types in the search text bar start searching the orders table
        public void keyTyped(KeyEvent event) {
        //if search bar is empty load table with all rows from the orders column
            if(tSearchBar.getText().equals("")){
                createConnection();
                updateTable();
                closeConnection();
            }
            else{
            //lookfor the specified text of the search bar in the database 
            //and display the results in table 
                createConnection();
                String sql = "select * from orders where lower(company) = '" + tSearchBar.getText().toLowerCase() + "'";
                getResultSet(sql, "no orders found for the company name given!");
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
    /*When the search bar gaines focus, if it has the placeholder
    replace it with empty string*/
    private void tSearchBarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusGained
        if(tSearchBar.getText().equals("Search Company Names..."))
            tSearchBar.setText("");        
    }//GEN-LAST:event_tSearchBarFocusGained
    //When the search bar loses focus, if it is empty fill it with the placeholder
    private void tSearchBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSearchBarFocusLost
        if(tSearchBar.getText().equals(""))
            tSearchBar.setText("Search Company Names...");      
    }//GEN-LAST:event_tSearchBarFocusLost
    //A method to create connection with database
    public void createConnection(){
        try{
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ZEINAJK", "Welcome1");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection to database can't be esatblished!");
            System.out.println(e);
        }
    }
    
    //A method to close the connection with the database
     public void closeConnection(){
        try{
            conn.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "connection error!");
            System.out.println(e);
        }
    }
      /*
    a method to execute sql query and get results from the database
    if an error occured during execution an error message will be shown
    @para1: sql query
    @para2: errorMsg (a suitable error message associated with the sql query)
    return: result set
    */
    public ResultSet getResultSet(String sql, String errorMsg){
        try{
        PreparedStatement ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        tbOrders.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, errorMsg);
            System.out.println(e);
        }
        return rs;
    }
     //A method to update the table shown in the form to keep the data
    //shown in the application in sync with the database
     public void updateTable(){         
        String sql = "select order_id, company, amount, total_price, TO_CHAR(ODATE, 'yyyy-mm-dd') from orders";
        getResultSet(sql, "no orders found!");
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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
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
    private javax.swing.JScrollPane spOrdList;
    private javax.swing.JTextField tSearchBar;
    private javax.swing.JTable tbOrders;
    // End of variables declaration//GEN-END:variables
}
