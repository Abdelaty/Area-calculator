/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;
import java.awt.event.KeyEvent;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;
import javax.swing.JOptionPane;



/**
 *
 * @author Abdel
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        calcButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        baseField = new javax.swing.JTextField();
        angleField = new javax.swing.JTextField();
        lengthField = new javax.swing.JTextField();
        widthField = new javax.swing.JTextField();
        heightField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        upperBaseField = new javax.swing.JTextField();
        radiusField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calcButton.setText("Calculate");
        calcButton.setName(""); // NOI18N
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Triangle", "Rectangle", "Trapezoid", "Square", "Parallelogram", "Circle ", "Sector" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Shape is ");

        baseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseFieldActionPerformed(evt);
            }
        });
        baseField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                baseFieldKeyTyped(evt);
            }
        });

        angleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angleFieldActionPerformed(evt);
            }
        });
        angleField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                angleFieldKeyTyped(evt);
            }
        });

        lengthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthFieldActionPerformed(evt);
            }
        });
        lengthField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lengthFieldKeyTyped(evt);
            }
        });

        widthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthFieldActionPerformed(evt);
            }
        });
        widthField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                widthFieldKeyTyped(evt);
            }
        });

        heightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightFieldActionPerformed(evt);
            }
        });
        heightField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heightFieldKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Vertical height:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Base:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Width:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("length of side:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Angle in radians:");

        jLabel10.setText("(Rectangle- Triangle- Parallelogram) ");

        jLabel11.setText("(Parallelogram- Triangle- Trapezoid)");

        jLabel12.setText("(Rectangle)");

        jLabel13.setText("(Square)");

        jLabel14.setText("(Sector)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Upper base ");

        jLabel15.setText("(Trapezoid)");

        upperBaseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperBaseFieldActionPerformed(evt);
            }
        });
        upperBaseField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upperBaseFieldKeyTyped(evt);
            }
        });

        radiusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiusFieldActionPerformed(evt);
            }
        });
        radiusField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                radiusFieldKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Radius (r)");

        jLabel16.setText("(Circle)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radiusField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upperBaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(baseField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(heightField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(widthField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lengthField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(angleField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(calcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(baseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(widthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upperBaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16))
                .addGap(66, 66, 66)
                .addComponent(calcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedIndex()==0)
        {
        double base, height, area;
        base=Double.parseDouble(baseField.getText());
        height=Double.parseDouble(baseField.getText());
        area=((0.5)*(base*height));
        JOptionPane.showMessageDialog(this,"The Area of Triangle is: "+ area );              
        }
else    if (jComboBox1.getSelectedIndex()==1)
        {
        double width, height, area;
        width=Double.parseDouble(widthField.getText());
        height=Double.parseDouble(heightField.getText());
        area=(width*height);
        JOptionPane.showMessageDialog(this,"The Area of Rectangle is: "+ area );              
        }
else    if (jComboBox1.getSelectedIndex()==2)
        {
        double base, height, area, upperBase;
        base=Double.parseDouble(baseField.getText());
        upperBase=Double.parseDouble(upperBaseField.getText());
        height=Double.parseDouble(heightField.getText());
        area=(0.5*(base+upperBase)*height);
        JOptionPane.showMessageDialog(this,"The Area of Trapezoid is: "+ area );              
        }
else    if (jComboBox1.getSelectedIndex()==3)
        {
        double length, area;
        length=Double.parseDouble(lengthField.getText());
        area=(length*length);
        JOptionPane.showMessageDialog(this,"The Area of Square is: "+ area );              
        }
else    if (jComboBox1.getSelectedIndex()==4)
        {
        double base, height, area;
        base=Double.parseDouble(baseField.getText());
        height=Double.parseDouble(baseField.getText());
        area=(base*height);
        JOptionPane.showMessageDialog(this,"The Area of Parallelogram is: "+ area );              
        }
else    if (jComboBox1.getSelectedIndex()==5)
        { 
        double radius, area, P=3.14;
        radius=Double.parseDouble(radiusField.getText());
        area=(radius*radius*P);
        JOptionPane.showMessageDialog(this,"The Area of Circle is: "+ area );              
        }   
else    if (jComboBox1.getSelectedIndex()==6)
        {
        double radius, area, angle;
        radius=Double.parseDouble(radiusField.getText());
        angle=Double.parseDouble(angleField.getText());
        area=(0.5*radius*radius*angle);
        JOptionPane.showMessageDialog(this,"The Area of Sector is: "+ area );              
        }   
        
    }//GEN-LAST:event_calcButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        switch (jComboBox1.getSelectedIndex()) {
            case 6:
                heightField.disable();
                widthField.disable();
                baseField.disable();
                upperBaseField.disable();
                lengthField.disable();
                radiusField.enable();
                angleField.enable();
                break;
            case 0:
                angleField.disable();
                lengthField.disable();
                widthField.disable();
                upperBaseField.disable();
                radiusField.disable();
                baseField.enable();
                heightField.enable();
                break;
            case 1:
                angleField.disable();
                lengthField.disable();
                baseField.disable();
                radiusField.disable();
                upperBaseField.disable();
                widthField.enable();
                heightField.enable();
                break;
            case 2:
                radiusField.disable();
                angleField.disable();
                lengthField.disable();
                widthField.disable();
                heightField.enable();
                upperBaseField.enable();
                baseField.enable();
                break;
            case 3:
                angleField.disable();
                heightField.disable();
                widthField.disable();
                baseField.disable();
                upperBaseField.disable();
                radiusField.disable();
                lengthField.enable();
                break;
            case 4:
                angleField.disable();
                lengthField.disable();
                widthField.disable();
                radiusField.disable();
                upperBaseField.disable();
                baseField.enable();
                heightField.enable();
                break;
            case 5:
                angleField.disable();
                heightField.disable();
                widthField.disable();
                baseField.disable();
                upperBaseField.disable();
                lengthField.disable();
                radiusField.enable();
                break;   
            default:
                break;
        }
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void lengthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lengthFieldActionPerformed

    private void baseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseFieldActionPerformed

    private void heightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightFieldActionPerformed

    private void baseFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_baseFieldKeyTyped
char vChar = evt.getKeyChar(); 
if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) 
{ 
    evt.consume();
}       
    }//GEN-LAST:event_baseFieldKeyTyped

    private void heightFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightFieldKeyTyped
      char vChar = evt.getKeyChar(); 
if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) 
{ 
    evt.consume();
}       
    }//GEN-LAST:event_heightFieldKeyTyped

    private void widthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthFieldActionPerformed

    private void widthFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthFieldKeyTyped
char vChar = evt.getKeyChar(); 
if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) 
{ 
    evt.consume();
}           }//GEN-LAST:event_widthFieldKeyTyped

    private void lengthFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lengthFieldKeyTyped
char vChar = evt.getKeyChar(); 
if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) 
{ 
    evt.consume();
}           }//GEN-LAST:event_lengthFieldKeyTyped

    private void angleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angleFieldActionPerformed

    private void angleFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_angleFieldKeyTyped
char vChar = evt.getKeyChar(); 
if (!(Character.isDigit(vChar) || (vChar == KeyEvent.VK_BACK_SPACE) || (vChar == KeyEvent.VK_DELETE))) 
{ 
    evt.consume();
}           }//GEN-LAST:event_angleFieldKeyTyped

    private void upperBaseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperBaseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperBaseFieldActionPerformed

    private void upperBaseFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upperBaseFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_upperBaseFieldKeyTyped

    private void radiusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiusFieldActionPerformed

    private void radiusFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radiusFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_radiusFieldKeyTyped

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angleField;
    private javax.swing.JTextField baseField;
    private javax.swing.JButton calcButton;
    private javax.swing.JTextField heightField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lengthField;
    private javax.swing.JTextField radiusField;
    private javax.swing.JTextField upperBaseField;
    private javax.swing.JTextField widthField;
    // End of variables declaration//GEN-END:variables
}
