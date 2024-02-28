import javax.swing.JOptionPane;
import java.sql.*;

public class NewManufacturer extends javax.swing.JFrame {

    public NewManufacturer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel1.setText("Manufacturer ID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel3.setText("Mobile :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel5.setText("Address :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel7.setText("State :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 190, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 190, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 190, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setFocusable(false);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 90, -1));

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel2.setText("Manufacturer Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel4.setText("Phone number :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel6.setText("City :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel8.setText("No. of Supplies :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 210, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 210, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 210, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setFocusable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 210, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Menu");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jTextField9.setFocusable(false);
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 310, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Elephant", 2, 36)); // NOI18N
        jLabel9.setText("New Manufacturer");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 380, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\Pharmacy-Management-System-master\\Pharmacy-Management-System-master\\src\\manufactorr.PNG")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField3.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField6.getText().equals("")||jTextField7.getText().equals("")||jTextField8.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Enter all values before updating");
        else
        {       
            try
            { 
                String manname=jTextField2.getText();
                int manid=Integer.parseInt(jTextField1.getText());
                String city=jTextField4.getText();
                int supplies=Integer.parseInt(jTextField5.getText());
                String address=jTextField7.getText();
                String state=jTextField8.getText();
                String phone=jTextField3.getText();
                //int purchases=Integer.parseInt(jTextField4.getText());
                int s=phone.length();
                if(s==11)
                {
                    long landline=Long.parseLong(phone);
                    String mobile=jTextField6.getText();
                    int l=mobile.length();
                    char a=mobile.charAt(0);
                    if(l==10&&(a=='9'||a=='8'||a=='7'))
                    {
                        long cell=Long.parseLong(mobile);
                        if(cell<0||landline<0)
                        {
                            JOptionPane.showMessageDialog(null, "Invalid Mobile or Phone Number");
                            jTextField6.setText("");
                            jTextField3.setText("");
                        }
                        Class.forName("java.sql.DriverManager" );
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
                        Statement stmt=con.createStatement();
                        String query="insert into manufacturer values("+manid+","+cell+",'"+address+"',"+supplies+",'"+city+"','"+state+"','"+manname+"',"+phone+");";
                        stmt.executeUpdate(query); 
                        JOptionPane.showMessageDialog(null,"Record Added");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Invalid Mobile Number");   
                        jTextField6.setText("");
                    } 
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid Phone Number");   
                    jTextField3.setText("");
                }   
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
         new manuintro().setVisible(true);
        dispose();}
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
// TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new manuintro().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        jTextField1.setText(""+(BasisClass.itemcount+1));
       jTextField2.setText("Manufacturer"+(BasisClass.itemcount+1));
      // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new menu_page().setVisible(true);     // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jTextField9.setText("Click to add Record");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
         jTextField9.setText("Click to Go Back");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jTextField9.setText("Click to go to Menu Page");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jTextField9.setText("Click to Exit");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jTextField9.setText("");      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jTextField9.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jTextField9.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jTextField9.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseExited

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewManufacturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
