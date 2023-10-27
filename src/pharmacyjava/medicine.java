/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyjava;

import static java.awt.event.PaintEvent.UPDATE;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.objects.annotations.Where;
import static sun.misc.MessageUtils.where;
//import pharmacyjava.DBUtils;
public class medicine extends javax.swing.JFrame {

    /**
     * Creates new form medicine
     */
     Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;
    private JComboBox<String> Where;
    public medicine() {
        initComponents();
        GetCompany();
       // SelectMed();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CompLabel = new javax.swing.JLabel();
        AgentLabel = new javax.swing.JLabel();
        SellingsLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        MedId = new javax.swing.JTextField();
        MedName = new javax.swing.JTextField();
        MedQty = new javax.swing.JTextField();
        MedPrice = new javax.swing.JTextField();
        MedComp = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        MedFab = new javax.swing.JTextField();
        MedExp = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 0));

        CompLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CompLabel.setForeground(new java.awt.Color(255, 255, 255));
        CompLabel.setText("COMPANY");
        CompLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompLabelMouseClicked(evt);
            }
        });

        AgentLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        AgentLabel.setForeground(new java.awt.Color(255, 255, 255));
        AgentLabel.setText("AGENTS");
        AgentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgentLabelMouseClicked(evt);
            }
        });

        SellingsLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SellingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        SellingsLabel.setText("SELLINGS");
        SellingsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellingsLabelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 204, 0));
        jLabel4.setText("MANAGE MEDICINE");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 204, 0));
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 204, 0));
        jLabel6.setText("MED NAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 204, 0));
        jLabel7.setText("PRICE");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 204, 0));
        jLabel8.setText("QUANTITY");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 204, 0));
        jLabel9.setText("FABDATE");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 204, 0));
        jLabel10.setText("EXPDATE");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 204, 0));
        jLabel12.setText("COMPANY");

        MedId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        MedName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        MedQty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        MedPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        MedComp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MedComp.setForeground(new java.awt.Color(102, 204, 0));
        MedComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedCompActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MedFab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MedFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedFabActionPerformed(evt);
            }
        });

        MedExp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AddBtn.setBackground(new java.awt.Color(102, 255, 0));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("ADD");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(102, 255, 0));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(102, 255, 0));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MedId", "MedName", "MedPrice", "MedQty", "MedFab", "MedExp", "MedCompl"
            }
        ));
        jScrollPane1.setViewportView(MedicineTable);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 204, 0));
        jLabel14.setText("MEDICINS LIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(MedId, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                            .addComponent(MedName)
                                            .addComponent(MedPrice)
                                            .addComponent(MedQty))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45)
                                                .addComponent(MedFab, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(MedExp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(MedComp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(248, 248, 248)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(AddBtn)
                                .addGap(32, 32, 32)
                                .addComponent(UpdateBtn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(DeleteBtn)))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(MedFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(MedExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(MedQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(MedComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn))
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CompLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AgentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SellingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(CompLabel)
                        .addGap(18, 18, 18)
                        .addComponent(AgentLabel)
                        .addGap(18, 18, 18)
                        .addComponent(SellingsLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  /*  public void SelectMed()
    {
        try{
        Con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","root","12345");
        St=(Statement) Con.createStatement();
        Rs=St.executeQuery("Select * from root.MEDICINETBL");
        MedicineTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }
        catch(SQLException e){
            e.printStackTrace();
        }*/
    private void MedCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedCompActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed

        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
       
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy1","root","12345");
            PreparedStatement ps=Con.prepareStatement("insert into MEDICINETBL1 values(?,?,?,?,?,?,?)");
            ps.setInt(1, Integer.valueOf(MedId.getText()));
            ps.setString(2, MedName.getText());
             ps.setInt(3, Integer.valueOf(MedPrice.getText()));
              ps.setInt(4, Integer.valueOf(MedQty.getText()));
              ps.setString(5, MedFab.getText());
              ps.setString(6, MedExp.getText());
               ps.setString(7, MedComp.getSelectedItem().toString());
               int row=ps.executeUpdate();
               JOptionPane.showMessageDialog(this, "Medicine sucessfully added");
               Con.close();
              // SelectMed();
        }
        catch(SQLException e){
            e.printStackTrace();
            
        }
        
    }//GEN-LAST:event_AddBtnMouseClicked

    public void GetCompany(){
        
         try {
             Con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy1","root","12345");
             St=Con.createStatement();
             String Query="select * from root.COMPANYTBL";
             Rs=St.executeQuery(Query);
             while(Rs.next()){
                 String MyComp=Rs.getString("CompName");
                 MedComp.addItem(MyComp);
             }
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
    }
    
    
    private void MedFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedFabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedFabActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
       
        if(MedId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "please Enter MedicineId to Delete");
            
        }else{
            try{
                Con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy1","root","12345");
                String id=MedId.getText();
                String Query="Delete from root.MEDICINETBL1 where MedId="+id;
                //Statement st=Con.createStatement();
                PreparedStatement ps=Con.prepareStatement(Query);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Medicine deleted sucessfully1");
                Con.close();
            }catch(SQLException e){
               e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if(MedId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "please Enter MedicineId to Update");
            
        }else{
            try{
                Con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy1","root","12345");
                String id=MedId.getText();
                String Query="Delete from root.MEDICINETBL1 where MedId="+id;
                Statement st=Con.createStatement();
                st.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Medicine deleted sucessfully1");
                Con.close();
            }catch(SQLException e){
               e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void CompLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompLabelMouseClicked
       new company().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CompLabelMouseClicked

    private void AgentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgentLabelMouseClicked
       new Agents().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_AgentLabelMouseClicked

    private void SellingsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellingsLabelMouseClicked
        new Billings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SellingsLabelMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)MedicineTable.getModel();
        model.addRow(new Object[]{MedId.getText(), MedName.getText(), MedPrice.getText(), MedQty.getText(), MedFab.getText(), MedExp.getText(), MedComp.getSelectedItem()});
    }//GEN-LAST:event_AddBtnActionPerformed

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
            java.util.logging.Logger.getLogger(medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel AgentLabel;
    private javax.swing.JLabel CompLabel;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JComboBox<String> MedComp;
    private javax.swing.JTextField MedExp;
    private javax.swing.JTextField MedFab;
    private javax.swing.JTextField MedId;
    private javax.swing.JTextField MedName;
    private javax.swing.JTextField MedPrice;
    private javax.swing.JTextField MedQty;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JLabel SellingsLabel;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
