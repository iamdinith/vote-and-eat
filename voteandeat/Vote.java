/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voteandeat;

/**
 *
 * @author vipar
 */
public class Vote extends javax.swing.JFrame {

    /**
     * Creates new form Vote
     */
    public Vote() {
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

        Curry01 = new javax.swing.ButtonGroup();
        Curry02 = new javax.swing.ButtonGroup();
        Curry03 = new javax.swing.ButtonGroup();
        Chicken = new javax.swing.ButtonGroup();
        Fish = new javax.swing.ButtonGroup();
        Egg = new javax.swing.ButtonGroup();
        vpjDialog1 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        vpdbbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        vpsbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vperbtn1 = new javax.swing.JRadioButton();
        vperbtn2 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        vpc3rbtn1 = new javax.swing.JRadioButton();
        vpc3rbtn2 = new javax.swing.JRadioButton();
        vpc3rbtn3 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        vpc2rbtn1 = new javax.swing.JRadioButton();
        vpc2rbtn2 = new javax.swing.JRadioButton();
        vpc2rbtn3 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        vpc1rbtn1 = new javax.swing.JRadioButton();
        vpc1rbtn2 = new javax.swing.JRadioButton();
        vpc1rbtn3 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        vpcrbtn1 = new javax.swing.JRadioButton();
        vpcrbtn2 = new javax.swing.JRadioButton();
        vpcrbtn3 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        vpfrbtn1 = new javax.swing.JRadioButton();
        vpfrbtn2 = new javax.swing.JRadioButton();
        vpfrbtn3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dlbl = new javax.swing.JLabel();
        mlbl = new javax.swing.JLabel();
        hbtn = new javax.swing.JButton();
        vbtn = new javax.swing.JButton();
        obtn = new javax.swing.JButton();
        oobtn = new javax.swing.JButton();
        cbtn = new javax.swing.JButton();

        vpjDialog1.setTitle("Vote Placed !");
        vpjDialog1.setLocation(new java.awt.Point(540, 350));
        vpjDialog1.setPreferredSize(new java.awt.Dimension(365, 205));
        vpjDialog1.setResizable(false);
        vpjDialog1.setSize(new java.awt.Dimension(365, 205));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Thank you, Your vote has been successfully placed!");

        vpdbbtn.setText("OK");
        vpdbbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpdbbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vpjDialog1Layout = new javax.swing.GroupLayout(vpjDialog1.getContentPane());
        vpjDialog1.getContentPane().setLayout(vpjDialog1Layout);
        vpjDialog1Layout.setHorizontalGroup(
            vpjDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpjDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpjDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vpdbbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        vpjDialog1Layout.setVerticalGroup(
            vpjDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vpjDialog1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(vpdbbtn)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 234, 116), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 102, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        jLabel7.setText("VOTE HERE");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 830, 92));

        vpsbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        vpsbtn.setText("Submit");
        vpsbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vpsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpsbtnActionPerformed(evt);
            }
        });
        jPanel2.add(vpsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, 184, 79));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Select an option from each Category and press \"Submit\" to place your vote.");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jPanel4.setBackground(new java.awt.Color(174, 234, 116));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 234, 116), 5));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Egg:");

        Egg.add(vperbtn1);
        vperbtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vperbtn1.setText("jRadioButton1");

        Egg.add(vperbtn2);
        vperbtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vperbtn2.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vperbtn2)
                    .addComponent(vperbtn1))
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(vperbtn1)
                .addGap(18, 18, 18)
                .addComponent(vperbtn2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 220, 180));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 5));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Curry 03:");

        Curry03.add(vpc3rbtn1);
        vpc3rbtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpc3rbtn1.setText("jRadioButton1");

        Curry03.add(vpc3rbtn2);
        vpc3rbtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpc3rbtn2.setText("jRadioButton1");

        Curry03.add(vpc3rbtn3);
        vpc3rbtn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpc3rbtn3.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vpc3rbtn3)
                    .addComponent(vpc3rbtn2)
                    .addComponent(vpc3rbtn1))
                .addGap(33, 33, 33))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(vpc3rbtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpc3rbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpc3rbtn3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 220, 180));

        jPanel8.setBackground(new java.awt.Color(174, 234, 116));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 234, 116), 5));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Curry 02:");

        Curry02.add(vpc2rbtn1);
        vpc2rbtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpc2rbtn1.setText("jRadioButton1");

        Curry02.add(vpc2rbtn2);
        vpc2rbtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpc2rbtn2.setText("jRadioButton1");

        Curry02.add(vpc2rbtn3);
        vpc2rbtn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpc2rbtn3.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vpc2rbtn2)
                            .addComponent(vpc2rbtn1)
                            .addComponent(vpc2rbtn3))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(vpc2rbtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpc2rbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpc2rbtn3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 220, 180));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 5));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Curry 01:");

        Curry01.add(vpc1rbtn1);
        vpc1rbtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpc1rbtn1.setText("jRadioButton1");

        Curry01.add(vpc1rbtn2);
        vpc1rbtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpc1rbtn2.setText("jRadioButton1");

        Curry01.add(vpc1rbtn3);
        vpc1rbtn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpc1rbtn3.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vpc1rbtn3)
                    .addComponent(vpc1rbtn2)
                    .addComponent(vpc1rbtn1))
                .addGap(34, 34, 34))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(vpc1rbtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpc1rbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpc1rbtn3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 220, 180));

        jPanel10.setBackground(new java.awt.Color(174, 234, 116));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 234, 116), 5));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Chicken:");

        Chicken.add(vpcrbtn1);
        vpcrbtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpcrbtn1.setText("jRadioButton1");

        Chicken.add(vpcrbtn2);
        vpcrbtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpcrbtn2.setText("jRadioButton1");

        Chicken.add(vpcrbtn3);
        vpcrbtn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpcrbtn3.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vpcrbtn2)
                            .addComponent(vpcrbtn1)
                            .addComponent(vpcrbtn3))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(vpcrbtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpcrbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpcrbtn3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 220, 180));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 5));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Fish:");

        Fish.add(vpfrbtn1);
        vpfrbtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpfrbtn1.setText("jRadioButton1");

        Fish.add(vpfrbtn2);
        vpfrbtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpfrbtn2.setText("jRadioButton1");

        Fish.add(vpfrbtn3);
        vpfrbtn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vpfrbtn3.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vpfrbtn2)
                            .addComponent(vpfrbtn1)
                            .addComponent(vpfrbtn3))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(vpfrbtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpfrbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vpfrbtn3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 220, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("yyyy");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 70, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Vote your lunch preferences for ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        dlbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dlbl.setText("dd");
        dlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dlbl.setOpaque(true);
        jPanel2.add(dlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 40, -1));

        mlbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mlbl.setText("mm");
        mlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mlbl.setOpaque(true);
        jPanel2.add(mlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 50, -1));

        hbtn.setBackground(new java.awt.Color(0, 102, 0));
        hbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hbtn.setText("Home");
        hbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbtnActionPerformed(evt);
            }
        });

        vbtn.setBackground(new java.awt.Color(174, 234, 116));
        vbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        vbtn.setForeground(new java.awt.Color(255, 255, 255));
        vbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voteandeat/Images/vote-64.png"))); // NOI18N
        vbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vbtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/voteandeat/Images/r-arrow-64.png"))); // NOI18N
        vbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vbtnActionPerformed(evt);
            }
        });

        obtn.setBackground(new java.awt.Color(0, 102, 0));
        obtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        obtn.setText("Order");
        obtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        obtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtnActionPerformed(evt);
            }
        });

        oobtn.setBackground(new java.awt.Color(0, 102, 0));
        oobtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        oobtn.setText("<html><p align = center>Other</p><p>Orders</p>");
        oobtn.setActionCommand("<html><p>O t h e r</p><p>O r d e r s</p>");
        oobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oobtnActionPerformed(evt);
            }
        });

        cbtn.setBackground(new java.awt.Color(204, 0, 0));
        cbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbtn.setText("Cancel");
        cbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(vbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(obtn, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(oobtn, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(cbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(hbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(obtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(oobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        new WelcomePage().setVisible(true);
    }//GEN-LAST:event_cbtnActionPerformed

    private void hbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_hbtnActionPerformed

    private void vbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vbtnActionPerformed

    private void obtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtnActionPerformed
        // TODO add your handling code here:
        dispose();
        new Order().setVisible(true);
    }//GEN-LAST:event_obtnActionPerformed

    private void oobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oobtnActionPerformed
        // TODO add your handling code here:
        dispose();
        new OtherOrders().setVisible(true);
    }//GEN-LAST:event_oobtnActionPerformed

    private void vpsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpsbtnActionPerformed
        // TODO add your handling code here:
        vpjDialog1.setVisible(true);
    }//GEN-LAST:event_vpsbtnActionPerformed

    private void vpdbbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpdbbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        vpjDialog1.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_vpdbbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Chicken;
    private javax.swing.ButtonGroup Curry01;
    private javax.swing.ButtonGroup Curry02;
    private javax.swing.ButtonGroup Curry03;
    private javax.swing.ButtonGroup Egg;
    private javax.swing.ButtonGroup Fish;
    private javax.swing.JButton cbtn;
    private javax.swing.JLabel dlbl;
    private javax.swing.JButton hbtn;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel mlbl;
    private javax.swing.JButton obtn;
    private javax.swing.JButton oobtn;
    private javax.swing.JButton vbtn;
    private javax.swing.JRadioButton vpc1rbtn1;
    private javax.swing.JRadioButton vpc1rbtn2;
    private javax.swing.JRadioButton vpc1rbtn3;
    private javax.swing.JRadioButton vpc2rbtn1;
    private javax.swing.JRadioButton vpc2rbtn2;
    private javax.swing.JRadioButton vpc2rbtn3;
    private javax.swing.JRadioButton vpc3rbtn1;
    private javax.swing.JRadioButton vpc3rbtn2;
    private javax.swing.JRadioButton vpc3rbtn3;
    private javax.swing.JRadioButton vpcrbtn1;
    private javax.swing.JRadioButton vpcrbtn2;
    private javax.swing.JRadioButton vpcrbtn3;
    private javax.swing.JButton vpdbbtn;
    private javax.swing.JRadioButton vperbtn1;
    private javax.swing.JRadioButton vperbtn2;
    private javax.swing.JRadioButton vpfrbtn1;
    private javax.swing.JRadioButton vpfrbtn2;
    private javax.swing.JRadioButton vpfrbtn3;
    private javax.swing.JDialog vpjDialog1;
    private javax.swing.JButton vpsbtn;
    // End of variables declaration//GEN-END:variables
}
