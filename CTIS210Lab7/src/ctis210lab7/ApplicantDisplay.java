/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ctis210lab7;

import java.awt.Color;
import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Gahel
 */
public class ApplicantDisplay extends javax.swing.JFrame {

    /**
     * Creates new form ApplicantDisplay
     */
    public ApplicantDisplay() {
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

        applicantPane1 = new javax.swing.JPanel();
        introLabel = new javax.swing.JLabel();
        introText = new javax.swing.JTextField();
        introLabel2 = new javax.swing.JLabel();
        introText2 = new javax.swing.JTextField();
        introLabel3 = new javax.swing.JLabel();
        introText3 = new javax.swing.JTextField();
        introLabel4 = new javax.swing.JLabel();
        introText4 = new javax.swing.JTextField();
        introLabel5 = new javax.swing.JLabel();
        introText5 = new javax.swing.JTextField();
        introLabel6 = new javax.swing.JLabel();
        introText6 = new javax.swing.JTextField();
        introLabel7 = new javax.swing.JLabel();
        introText7 = new javax.swing.JTextField();
        introLabel8 = new javax.swing.JLabel();
        introText8 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        applicantPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Applicant 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        introLabel.setText("Intro to Comp Prog");

        introText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introTextActionPerformed(evt);
            }
        });

        introLabel2.setText("Advanced Comp Prog");

        introText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introText2ActionPerformed(evt);
            }
        });

        introLabel3.setText("Operating Systems");

        introText3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introText3ActionPerformed(evt);
            }
        });

        introLabel4.setText("Networking");

        introText4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introText4ActionPerformed(evt);
            }
        });

        introLabel5.setText("Database Systems");

        introText5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introText5ActionPerformed(evt);
            }
        });

        introLabel6.setText("Algorithms");

        introText6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introText6ActionPerformed(evt);
            }
        });

        introLabel7.setText("Overall College GPA");

        introText7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introText7ActionPerformed(evt);
            }
        });

        introLabel8.setText("Lablename");

        introText8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introText8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout applicantPane1Layout = new javax.swing.GroupLayout(applicantPane1);
        applicantPane1.setLayout(applicantPane1Layout);
        applicantPane1Layout.setHorizontalGroup(
            applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicantPane1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introLabel)
                    .addComponent(introLabel2)
                    .addComponent(introLabel3)
                    .addComponent(introLabel4)
                    .addComponent(introLabel5)
                    .addComponent(introLabel6)
                    .addComponent(introLabel7))
                .addGap(30, 30, 30)
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(introText6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(introText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introText3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introText2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introText4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introText5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introText7))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applicantPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(introLabel8)
                .addGap(52, 52, 52)
                .addComponent(introText8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        applicantPane1Layout.setVerticalGroup(
            applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicantPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introLabel8)
                    .addComponent(introText8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(introText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(introLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(introLabel2)
                    .addComponent(introText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introText3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(introLabel3))
                .addGap(10, 10, 10)
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introLabel4)
                    .addComponent(introText4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introLabel5)
                    .addComponent(introText5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introLabel6)
                    .addComponent(introText6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(applicantPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(introLabel7)
                    .addComponent(introText7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(applicantPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(applicantPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void introTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introTextActionPerformed
        // TODO add your handling code here:
String introString = introText.getText();
//System.out.println("The string entered is: " + introString);
double introNumber = Double.parseDouble(introString);
//System.out.println("The numerical value is: " + introNumber);
double redComponent = redCalc(introNumber);
Color introColor = new Color((int)redComponent, 0, 0);
introLabel.setBackground(introColor);
introLabel.setOpaque(true);
introLabel.setText("Intro to Comp Prog: " + introNumber);
introText.setText("");
    }//GEN-LAST:event_introTextActionPerformed

    private void introText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introText2ActionPerformed
 // TODO add your handling code here:
String introString = introText.getText();
//System.out.println("The string entered is: " + introString);
double introNumber = Double.parseDouble(introString);
//System.out.println("The numerical value is: " + introNumber);
double redComponent = redCalc(introNumber);
Color introColor = new Color((int)redComponent, 0, 0);
introLabel.setBackground(introColor);
introLabel.setOpaque(true);
introLabel.setText("Advanced to Comp Prog: " + introNumber);
introText.setText("");       
    }//GEN-LAST:event_introText2ActionPerformed

    private void introText3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introText3ActionPerformed
        // TODO add your handling code here:
String introString = introText.getText();
//System.out.println("The string entered is: " + introString);
double introNumber = Double.parseDouble(introString);
//System.out.println("The numerical value is: " + introNumber);
double redComponent = redCalc(introNumber);
Color introColor = new Color((int)redComponent, 0, 0);
introLabel.setBackground(introColor);
introLabel.setOpaque(true);
introLabel.setText("Operating Systems: " + introNumber);
introText.setText("");
    }//GEN-LAST:event_introText3ActionPerformed

    private void introText4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introText4ActionPerformed
        // TODO add your handling code here:
String introString = introText.getText();
//System.out.println("The string entered is: " + introString);
double introNumber = Double.parseDouble(introString);
//System.out.println("The numerical value is: " + introNumber);
double redComponent = redCalc(introNumber);
Color introColor = new Color((int)redComponent, 0, 0);
introLabel.setBackground(introColor);
introLabel.setOpaque(true);
introLabel.setText("Networking: " + introNumber);
introText.setText("");
    }//GEN-LAST:event_introText4ActionPerformed

    private void introText5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introText5ActionPerformed
        // TODO add your handling code here:
String introString = introText.getText();
//System.out.println("The string entered is: " + introString);
double introNumber = Double.parseDouble(introString);
//System.out.println("The numerical value is: " + introNumber);
double redComponent = redCalc(introNumber);
Color introColor = new Color((int)redComponent, 0, 0);
introLabel.setBackground(introColor);
introLabel.setOpaque(true);
introLabel.setText("Database Systems: " + introNumber);
introText.setText("");
    }//GEN-LAST:event_introText5ActionPerformed

    private void introText6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introText6ActionPerformed
        // TODO add your handling code here:
String introString = introText.getText();
//System.out.println("The string entered is: " + introString);
double introNumber = Double.parseDouble(introString);
//System.out.println("The numerical value is: " + introNumber);
double redComponent = redCalc(introNumber);
Color introColor = new Color((int)redComponent, 0, 0);
introLabel.setBackground(introColor);
introLabel.setOpaque(true);
introLabel.setText("Algorithms: " + introNumber);
introText.setText("");

    }//GEN-LAST:event_introText6ActionPerformed

    private void introText7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introText7ActionPerformed
        // TODO add your handling code here:
String introString = introText.getText();
//System.out.println("The string entered is: " + introString);
double introNumber = Double.parseDouble(introString);
//System.out.println("The numerical value is: " + introNumber);
double redComponent = redCalc(introNumber);
Color introColor = new Color((int)redComponent, 0, 0);
introLabel.setBackground(introColor);
introLabel.setOpaque(true);
introLabel.setText("Overall College GPA: " + introNumber);
introText.setText("");
    }//GEN-LAST:event_introText7ActionPerformed

    private void introText8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introText8ActionPerformed
        // TODO add your handling code here:

String labelname;
Scanner scan = new Scanner(System.in);
System.out.println("");
labelname = scan.nextLine();
System.out.println(labelname);
    }//GEN-LAST:event_introText8ActionPerformed
public double redCalc(double score) {
double redValue = score * 1.2 + 40;
return redValue;
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
            java.util.logging.Logger.getLogger(ApplicantDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicantDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicantDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicantDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicantDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel applicantPane1;
    private javax.swing.JLabel introLabel;
    private javax.swing.JLabel introLabel2;
    private javax.swing.JLabel introLabel3;
    private javax.swing.JLabel introLabel4;
    private javax.swing.JLabel introLabel5;
    private javax.swing.JLabel introLabel6;
    private javax.swing.JLabel introLabel7;
    private javax.swing.JLabel introLabel8;
    private javax.swing.JTextField introText;
    private javax.swing.JTextField introText2;
    private javax.swing.JTextField introText3;
    private javax.swing.JTextField introText4;
    private javax.swing.JTextField introText5;
    private javax.swing.JTextField introText6;
    private javax.swing.JTextField introText7;
    private javax.swing.JTextField introText8;
    // End of variables declaration//GEN-END:variables
}
