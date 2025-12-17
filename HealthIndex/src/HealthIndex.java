public class HealthIndex extends javax.swing.JFrame {

    
    public HealthIndex() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextWeight = new javax.swing.JTextField();
        jTextHeight = new javax.swing.JTextField();
        jCalculator = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jlblBMI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"< 18.5", "UNDERWEIGHT"},
                {"18.5 - 24.9", "NORMAL WEIGHT"},
                {"25 - 29.9", "OVERWEIGHT"},
                {">30", "OBESE"}
            },
            new String [] {
                "BMI", "CLASSIFICATION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BMI Table ", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"19-24", "19-24"},
                {"25-34", "20-25"},
                {"35-44", "21-26"},
                {"45-54", "22-27"},
                {"55-64", "23-28"},
                {"ABOVE 65", "24-49"}
            },
            new String [] {
                "AGE", "BMI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BMI Table NCI", jPanel2);

        jPanel6.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 119, 241, -1));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 3, 48)); // NOI18N
        jLabel1.setText("HEALTH INDEX");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 469, -1));

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel2.setText("ENTER HEIGHT IN METERS");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 165, -1, -1));

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel3.setText("ENTER WEIGHT IN KG");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 243, -1, -1));

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel4.setText("BMI");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 319, 59, -1));

        jTextWeight.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextWeightActionPerformed(evt);
            }
        });
        jPanel6.add(jTextWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 242, 82, 30));

        jTextHeight.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHeightActionPerformed(evt);
            }
        });
        jPanel6.add(jTextHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 161, 82, 30));

        jCalculator.setBackground(new java.awt.Color(204, 204, 204));
        jCalculator.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCalculator.setText("CALCULATE BMI");
        jCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalculatorActionPerformed(evt);
            }
        });
        jPanel6.add(jCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 400, 201, 41));

        jReset.setBackground(new java.awt.Color(204, 204, 204));
        jReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jReset.setText("RESET");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });
        jPanel6.add(jReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 146, 40));

        jExit.setBackground(new java.awt.Color(204, 204, 204));
        jExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jExit.setText("EXIT");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jPanel6.add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 138, 41));

        jlblBMI.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jlblBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblBMIActionPerformed(evt);
            }
        });
        jPanel6.add(jlblBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 318, 82, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextWeightActionPerformed
      
    }//GEN-LAST:event_jTextWeightActionPerformed

    private void jTextHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHeightActionPerformed

    }//GEN-LAST:event_jTextHeightActionPerformed

    private void jlblBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblBMIActionPerformed
    
    }//GEN-LAST:event_jlblBMIActionPerformed

    private void jCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalculatorActionPerformed
        double iHeight = Double.parseDouble(jTextHeight.getText());
        double iWeight = Double.parseDouble(jTextWeight.getText());
        double iBMI = iWeight / (iHeight * iHeight);
        
        String Calc_BMI = String.format("%.2f", iBMI);
        jlblBMI.setText(Calc_BMI);
    }//GEN-LAST:event_jCalculatorActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        jTextHeight.setText(null);
        jTextWeight.setText(null);
        jlblBMI.setText(null);
    }//GEN-LAST:event_jResetActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCalculator;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextHeight;
    private javax.swing.JTextField jTextWeight;
    private javax.swing.JTextField jlblBMI;
    // End of variables declaration//GEN-END:variables
}
