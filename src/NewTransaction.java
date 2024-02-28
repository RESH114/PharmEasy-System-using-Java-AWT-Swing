
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewTransaction extends javax.swing.JFrame {

    public NewTransaction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Date:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Mobile NO :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Customer Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 146, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 942, 10));

        jLabel6.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Total :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 248, -1));

        jLabel8.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Discount(if any) :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Amount :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 248, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 248, -1));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Manufacturer Name", "Quantity(in strips)", "Price Per Unit", "Expiry Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 922, 190));

        jButton1.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jButton1.setText("Calculate Amount");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Search:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jButton5.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jButton5.setText("Bill");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 99, -1));

        jButton2.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jButton3.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jButton3.setText("Menu Page");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 119, -1));

        jButton4.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jButton4.setText("Undo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setFocusable(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 37, -1));

        jLabel9.setText("/");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setFocusable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 40, -1));

        jTextField5.setFocusable(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 39, -1));

        jLabel10.setFont(new java.awt.Font("Aharoni", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("(Year/Month/Date)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        jLabel11.setText("/");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jCheckBox1.setText("Proceed for billing");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 180, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 430, 520));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartt.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int id;
    double amt=0.0,disc=0.0;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        jComboBox1.removeAllItems();
        jComboBox1.addItem("-Select Medicines-");
        try
        {
            Class.forName("java.sql.DriverManager" );
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
            Statement stmt=con.createStatement();
            String query="select Medicine from medicines;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                jComboBox1.addItem(rs.getString(1));
            }
            String yearquery="select year(curdate()) as year;";
            ResultSet rs1=stmt.executeQuery(yearquery);
            if(rs1.next())
            jTextField3.setText(rs1.getString(1));
            String monthquery="select month(curdate()) as month;";
            ResultSet rs2=stmt.executeQuery(monthquery);
            if(rs2.next())
            jTextField4.setText(rs2.getString(1));
            String dayquery="select dayofmonth(curdate()) as day;";
            ResultSet rs3=stmt.executeQuery(dayquery);
            if(rs3.next())
            jTextField5.setText(rs3.getString(1));
        }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try{
              String meds=(String)jComboBox1.getSelectedItem();
              Class.forName("java.sql.DriverManager" );
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
              Statement stmt=con.createStatement();
              String query="select * from medicines where Medicine='"+meds+"';";
              ResultSet rs=stmt.executeQuery(query);
              int qnty=0;
              while(rs.next())
              {
                int med_code=rs.getInt("Med_Code");
                int totqnty=rs.getInt("Quantity");
                String man_name=rs.getString("ManufacturerName");
                int price=rs.getInt("Price");
                String date=rs.getString("Expiry_date");
                String reply=JOptionPane.showInputDialog(null,"Total Quantity (in strips)is '"+totqnty+ "'","Enter Medicine Quantity",JOptionPane.PLAIN_MESSAGE);
                qnty=Integer.parseInt(reply);
                while(qnty>totqnty||qnty<0)
                {
                    JOptionPane.showMessageDialog(null,"Enter valid Quantity ");
                String reply1=JOptionPane.showInputDialog(null,"Total Quantity (in strips)is '"+totqnty+ "'","Enter Medicine Quantity",JOptionPane.PLAIN_MESSAGE);
                qnty=Integer.parseInt(reply1);
                }
                model.addRow(new Object[] {med_code,meds,man_name,qnty,price,date});
                amt=amt+(price*qnty);
              }
              Statement stmt1=con.createStatement();
              String query2="update medicines set Quantity=Quantity-'"+qnty+"'";
              stmt1.executeUpdate(query2);
        }
             catch(Exception e)
             {
             JOptionPane.showMessageDialog(null,e.getMessage());
             }
                // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
	if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                model.removeRow(0);
            }
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        amt=0;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1PropertyChange

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        if(rows>0)
        {
            String medname=String.valueOf(jTable1.getModel().getValueAt(rows-1,1));
            int price=Integer.parseInt(String.valueOf(jTable1.getModel().getValueAt(rows-1,4)));
            int qnty=Integer.parseInt(String.valueOf(jTable1.getModel().getValueAt(rows-1,3)));
            try
            {
                Class.forName("java.sql.DriverManager" );
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
                Statement stmt=con.createStatement();
                String query="update medicines set Quantity=Quantity+'"+qnty+"' where Medicine='"+medname+"'";
                stmt.executeUpdate(query);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            amt=amt-(price*qnty);
            model.removeRow(rows-1);
            jButton1.doClick();
        }
        else
            JOptionPane.showMessageDialog(null,"No More Values To Undo");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jCheckBox1.isSelected()==false)
        {
            if(jTextField1.getText().equals("")||jTextField2.getText().equals(""))
                   JOptionPane.showMessageDialog(null, "Enter all details before proceeding");
            else
            {    
                try
                {
                      String name=jTextField1.getText();
                      long mobile=Long.parseLong(jTextField2.getText());
                      Class.forName("java.sql.DriverManager" );
                      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
                      Statement stmt=con.createStatement();
                      String query="select * from customer where Name='"+name+"' AND Mobile_no='"+mobile+"';";
                      ResultSet rs=stmt.executeQuery(query);
                      if(rs.next())
                      {
                        id=rs.getInt("CustomerID");
                        int purchases=rs.getInt("No_of_purchases");
                        if(purchases>5)
                        disc=10;
                        double total=amt-disc;
                        jTextField6.setText(""+amt);
                        jTextField7.setText(""+disc);
                        jTextField8.setText(""+total);
                      }
                      else
                      JOptionPane.showMessageDialog(null,"No such Record. Try Again");    
                }
                catch(Exception e)
                {
                     JOptionPane.showMessageDialog(null,e.getMessage());
                }
            }
        }
        else
        {
              double total=amt-disc;
              jTextField6.setText(""+amt);
              jTextField7.setText(""+disc);
              jTextField8.setText(""+total);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new menu_page().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        if(jCheckBox1.isSelected()==false)
        {
            if(jTextField1.getText().equals("")||jTextField2.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")||jTextField8.getText().equals("")||rows==0)
                   JOptionPane.showMessageDialog(null, "Enter All Details And Calculate Amount Before Proceeding.");
            else
            {
                try{
                      String date=jTextField3.getText()+"/"+jTextField4.getText()+"/"+jTextField5.getText();
                      String name=jTextField1.getText();
                      long mobile=Long.parseLong(jTextField2.getText());
                      Class.forName("java.sql.DriverManager" );
                      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
                      Statement stmt=con.createStatement();
                      String query="select CustomerID from customer where Name='"+name+"' AND Mobile_no='"+mobile+"';";
                      ResultSet rs=stmt.executeQuery(query);
                      if(rs.next())
                      id=rs.getInt("CustomerID");
                      for(int i=0;i<rows;i++)
                      {
                        int qnty=Integer.parseInt(String.valueOf(jTable1.getModel().getValueAt(i,3)));
                        String meds=String.valueOf(jTable1.getModel().getValueAt(i,1));
                        String ex_date=String.valueOf(jTable1.getModel().getValueAt(i,5));
                        String sqlquery="insert into purchase values('"+date+"','"+id+"','"+meds+"','"+qnty+"','"+ex_date+"');";
                        stmt.executeUpdate(sqlquery);
                        String sqlquery2="update medicines set Quantity=Quantity-'"+qnty+"' where Medicine='"+meds+"';";
                        stmt.executeUpdate(sqlquery2);
                      }
                      String sqlquery3="update customer set No_of_purchases=No_of_purchases+1 where CustomerID='"+id+"';";
                      stmt.executeUpdate(sqlquery3);
                      JOptionPane.showMessageDialog(null,"Your Bill Is Produced.");
                      jButton2.doClick();      
                }
                catch(Exception e)
                {
                     JOptionPane.showMessageDialog(null,e.getMessage());
                }
            }
        }
        else{
            if(jTextField6.getText().equals("")||jTextField7.getText().equals("")||jTextField8.getText().equals("")||rows==0)
            JOptionPane.showMessageDialog(null, "Select Medicines And Calculate Amount Before Proceeding.");
            else
            {JOptionPane.showMessageDialog(null,"Your Bill Is Produced.");
            jButton2.doClick();}
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            jTextField1.setFocusable(false);
            jTextField2.setFocusable(false);
        }
        else{
            jTextField1.setFocusable(true);
            jTextField2.setFocusable(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        PrintData();
        
        try{
        
            jTextArea1.print();
        }
        catch(Exception e)
        {
        
        
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTransaction().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private void PrintData() {
    //To change body of generated methods, choose Tools | Templates.
     jTextArea1.setText("                                BILL \n\n");
    jTextArea1.setText(jTextArea1.getText()+"\n\n\n");
        jTextArea1.setText(jTextArea1.getText()+" CUSTOMER NAME - "+jTextField1.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+" CUSTOMER MOBILE NUMBER - "+jTextField2.getText()+" "+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+" DATE - "+jTextField3.getText()+"/"+jTextField4.getText()+"/"+jTextField5.getText()+"\n\n");
        for(int i = 0; i<jTable1.getRowCount(); i++){
            String code = jTable1.getValueAt(i, 0).toString () ;
            String name = jTable1.getValueAt(i, 1).toString() ;
            String mname = jTable1.getValueAt(i,2).toString() ;
            String qn = jTable1.getValueAt(i,3).toString() ;
            String price = jTable1.getValueAt(i,4).toString() ;
            String exp = jTable1.getValueAt(i,5).toString() ;
            jTextArea1.setText(jTextArea1.getText()+code+"\t"+name+"\t"+mname+"\t"+qn+"\t"+price+"\t"+exp+"\n\n");}

         jTextArea1.setText(jTextArea1.getText()+"TOTAL AMOUNT - "+jTextField8.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"\n\n\n\n\n\n\n");
        jTextArea1.setText(jTextArea1.getText()+"    Signature : ......................." ); 

                }
    }


    
