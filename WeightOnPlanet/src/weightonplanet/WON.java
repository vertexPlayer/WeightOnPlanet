/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightonplanet;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class WON extends javax.swing.JFrame {

    /**
     * Creates new form WON
     */
    public WON() {
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

        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mercury = new javax.swing.JRadioButton();
        venus = new javax.swing.JRadioButton();
        earth = new javax.swing.JRadioButton();
        mars = new javax.swing.JRadioButton();
        jupiter = new javax.swing.JRadioButton();
        saturn = new javax.swing.JRadioButton();
        uranus = new javax.swing.JRadioButton();
        neptune = new javax.swing.JRadioButton();
        pluto = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weight On Planet");
        setResizable(false);

        jLabel1.setText("First name");

        jLabel2.setText("Last name");

        jLabel3.setText("Age");

        jLabel4.setText("Select Planet");

        mercury.setText("Mercury");
        mercury.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercuryActionPerformed(evt);
            }
        });

        venus.setText("Venus");
        venus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venusActionPerformed(evt);
            }
        });

        earth.setText("Earth");
        earth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earthActionPerformed(evt);
            }
        });

        mars.setText("Mars");
        mars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marsActionPerformed(evt);
            }
        });

        jupiter.setText("Jupiter");
        jupiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupiterActionPerformed(evt);
            }
        });

        saturn.setText("Saturn");
        saturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturnActionPerformed(evt);
            }
        });

        uranus.setText("Uranus");
        uranus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uranusActionPerformed(evt);
            }
        });

        neptune.setText("Neptune");
        neptune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neptuneActionPerformed(evt);
            }
        });

        pluto.setText("Pluto");
        pluto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plutoActionPerformed(evt);
            }
        });

        jLabel5.setText("Weight");

        jta.setColumns(20);
        jta.setRows(5);
        jScrollPane1.setViewportView(jta);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addComponent(mars)
                            .addComponent(earth)
                            .addComponent(venus)
                            .addComponent(jLabel4)
                            .addComponent(mercury)
                            .addComponent(pluto)
                            .addComponent(neptune)
                            .addComponent(uranus)
                            .addComponent(saturn)
                            .addComponent(jupiter))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lname)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mercury)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(venus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(earth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jupiter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uranus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neptune)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pluto))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        fname.getAccessibleContext().setAccessibleName("txtFirstName");
        jLabel2.getAccessibleContext().setAccessibleName("firstname");
        lname.getAccessibleContext().setAccessibleName("txtLastName");
        age.getAccessibleContext().setAccessibleName("txtAge");
        weight.getAccessibleContext().setAccessibleName("txtWeight");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        String first_name =fname.getText();
        String last_name= lname.getText();
        String uage = age.getText();
        String uWeight = weight.getText();
        
        int age = Integer.parseInt(uage);
        double weight = Double.parseDouble(uWeight);
        //method
        
        String ud = userDetail(first_name, last_name, uage);
        
        Planet p1 = new Planet();
        Planet p2 = new Planet();
        Planet p3 = new Planet();
        Planet p4 = new Planet();    
        Planet p5 = new Planet();
        Planet p6 = new Planet();
        Planet p7 = new Planet();
        Planet p8 = new Planet();
        Planet p9 = new Planet();
        
        p1.setName("Mercury");
        p1.setWeight(weight);
        //p1.setDiameter(345.34);
        
        p2.setName("Venus");
        p2.setWeight(weight);
        //p2.setDiameter(345.34);
        
        p3.setName("Earth");
        p3.setWeight(weight);
        //p3.setDiameter(345.34);
        
        p4.setName("Mars");
        p4.setWeight(weight);
        //p4.setDiameter(345.34);
        
        p5.setName("Jupiter");
        p5.setWeight(weight);
        //p5.setDiameter(345.34);
        
        p6.setName("Saturn");
        p6.setWeight(weight);
        //p6.setDiameter(345.34);
        
        p7.setName("Uranus");
        p7.setWeight(weight);
        //p7.setDiameter(345.34);
        
        p8.setName("Neptune");
        p8.setWeight(weight);
        //p8.setDiameter(345.34);
        
        p9.setName("Pluto");
        p9.setWeight(weight);
        //p9.setDiameter(345.34);
        
        if(mercury.isSelected()){
            
            String m = "\n\nPlanet "+p1.getName().toString();
            String j = "\n\nYour actual weight on planet "+p1.getName()+" is "+p1.getWeight()*0.38+" kg";
            jta.setText(ud+m+j);
        }else if(venus.isSelected()){
            
            String v = "\n\nPlanet "+p2.getName().toString();
            String j = "\n\nYour actual weight on planet "+p2.getName()+" is "+p2.getWeight()*0.47+" kg";
            jta.setText(ud+v+j);
            
        }else if (earth.isSelected()){
        
            String e = "\n\nPlanet "+p3.getName().toString();
            String j = "\n\nYour actual weight on planet "+p3.getName()+" is "+p3.getWeight()+" kg";
            jta.setText(ud+e+j);
        }else if (mars.isSelected()){
        
            String m = "\n\nPlanet "+p4.getName().toString();
            String j = "\n\nYour actual weight on planet "+p4.getName()+" is "+p4.getWeight()*0.47+" kg";
            jta.setText(ud+m+j);
        }else if (jupiter.isSelected()){
        
            String j = "\n\nPlanet "+p5.getName().toString();
            String jh = "\n\nYour actual weight on planet "+p5.getName()+" is "+p5.getWeight()*1.56+" kg";
            jta.setText(ud+j+jh);
            
        }else if (saturn.isSelected()){
        
            String s = "\n\nPlanet "+p6.getName().toString();
            String j = "\n\nYour actual weight on planet "+p6.getName()+" is "+p6.getWeight()*0.98+" kg";
            jta.setText(ud+s+j);
        }else if (uranus.isSelected()){
        
            String u = "\n\nPlanet "+p7.getName().toString();
            String j = "\n\nYour actual weight on planet "+p7.getName()+" is "+p7.getWeight()*0.86+" kg";
            jta.setText(ud+u+j);
            
        }else if (neptune.isSelected()){
        
            String n = "\n\nPlanet "+p8.getName().toString();
            String j = "\n\nYour actual weight on planet "+p8.getName()+" is "+p8.getWeight()*0.68+" kg";
            jta.setText(ud+n+j);
        }else if (pluto.isSelected()){
        
            String p = "\n\nPlanet "+p9.getName().toString();
            String j = "\n\nYour actual weight on planet "+p9.getName()+" is "+p9.getWeight()*0.38+" kg";
            jta.setText(ud+p+j);
        }
        }catch(Exception ex){
        
            JOptionPane.showMessageDialog(null, ex.toString());
        }

        //String m = "\nPlanet "+p1.getName().toString()+"\nWeight "+p1.getWeight()*1.2+"\nDiameter "+p1.getDiameter();
        
        
        
        
        //jta.setText(w.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mercuryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercuryActionPerformed
        // TODO add your handling code here:
        if(mercury.isSelected()){
        
            venus.setSelected(false);
            earth.setSelected(false);
            mars.setSelected(false);
            jupiter.setSelected(false);
            saturn.setSelected(false);
            uranus.setSelected(false);
            neptune.setSelected(false);
            pluto.setSelected(false);
        }
        
    }//GEN-LAST:event_mercuryActionPerformed

    private void venusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venusActionPerformed
        // TODO add your handling code here:
        if(venus.isSelected()){
        
            mercury.setSelected(false);
            earth.setSelected(false);
            mars.setSelected(false);
            jupiter.setSelected(false);
            saturn.setSelected(false);
            uranus.setSelected(false);
            neptune.setSelected(false);
            pluto.setSelected(false);
        }
    }//GEN-LAST:event_venusActionPerformed

    private void earthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earthActionPerformed
        // TODO add your handling code here:
        if(earth.isSelected()){
        
            venus.setSelected(false);
            mercury.setSelected(false);
            mars.setSelected(false);
            jupiter.setSelected(false);
            saturn.setSelected(false);
            uranus.setSelected(false);
            neptune.setSelected(false);
            pluto.setSelected(false);
        }
    }//GEN-LAST:event_earthActionPerformed

    private void marsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marsActionPerformed
        // TODO add your handling code here:
        if(mars.isSelected()){
        
            venus.setSelected(false);
            earth.setSelected(false);
            mercury.setSelected(false);
            jupiter.setSelected(false);
            saturn.setSelected(false);
            uranus.setSelected(false);
            neptune.setSelected(false);
            pluto.setSelected(false);
        }
    }//GEN-LAST:event_marsActionPerformed

    private void jupiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupiterActionPerformed
        // TODO add your handling code here:
        if(jupiter.isSelected()){
        
            venus.setSelected(false);
            earth.setSelected(false);
            mars.setSelected(false);
            mercury.setSelected(false);
            saturn.setSelected(false);
            uranus.setSelected(false);
            neptune.setSelected(false);
            pluto.setSelected(false);
        }
    }//GEN-LAST:event_jupiterActionPerformed

    private void saturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturnActionPerformed
        // TODO add your handling code here:
        if(saturn.isSelected()){
        
            venus.setSelected(false);
            earth.setSelected(false);
            mars.setSelected(false);
            jupiter.setSelected(false);
            mercury.setSelected(false);
            uranus.setSelected(false);
            neptune.setSelected(false);
            pluto.setSelected(false);
        }
    }//GEN-LAST:event_saturnActionPerformed

    private void uranusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uranusActionPerformed
        // TODO add your handling code here:
        if(uranus.isSelected()){
        
            venus.setSelected(false);
            earth.setSelected(false);
            mars.setSelected(false);
            jupiter.setSelected(false);
            saturn.setSelected(false);
            mercury.setSelected(false);
            neptune.setSelected(false);
            pluto.setSelected(false);
        }
    }//GEN-LAST:event_uranusActionPerformed

    private void neptuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neptuneActionPerformed
        // TODO add your handling code here:
        if(neptune.isSelected()){
        
            venus.setSelected(false);
            earth.setSelected(false);
            mars.setSelected(false);
            jupiter.setSelected(false);
            saturn.setSelected(false);
            uranus.setSelected(false);
            mercury.setSelected(false);
            pluto.setSelected(false);
        }
    }//GEN-LAST:event_neptuneActionPerformed

    private void plutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plutoActionPerformed
        // TODO add your handling code here:
        if(pluto.isSelected()){
        
            venus.setSelected(false);
            earth.setSelected(false);
            mars.setSelected(false);
            jupiter.setSelected(false);
            saturn.setSelected(false);
            uranus.setSelected(false);
            neptune.setSelected(false);
            mercury.setSelected(false);
        }
    }//GEN-LAST:event_plutoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int exit = JOptionPane.showConfirmDialog(null, "Are you sure?" , null, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (exit == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        //System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        fname.setText("");
        lname.setText("");
        age.setText("");
        weight.setText("");
        
        jta.setText("");
        
        mercury.setSelected(false);
        venus.setSelected(false);
        earth.setSelected(false);
        mars.setSelected(false);
        jupiter.setSelected(false);
        saturn.setSelected(false);

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Develop by Amirul, Asyraf, Azfar");
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static String userDetail(String f, String l, String a){
        
    String welc = "Hello";
        
    String s = " ";
    
    String h = welc+s+ f +s+ l+"\nYour age "+a;
    return h;
    }
    
    

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
            java.util.logging.Logger.getLogger(WON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WON.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WON().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JRadioButton earth;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta;
    private javax.swing.JRadioButton jupiter;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton mars;
    private javax.swing.JRadioButton mercury;
    private javax.swing.JRadioButton neptune;
    private javax.swing.JRadioButton pluto;
    private javax.swing.JRadioButton saturn;
    private javax.swing.JRadioButton uranus;
    private javax.swing.JRadioButton venus;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
