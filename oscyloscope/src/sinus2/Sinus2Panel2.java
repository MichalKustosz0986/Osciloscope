/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinus2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Michał
 */
public class Sinus2Panel2 extends javax.swing.JPanel {
    int Ax=250, Ay=250, OmegaX=1, OmegaY=1, fazaint;
    double faza = 3.1415/2;         //  PI/2      faza bedzie od 0 do 2PI
    
    public double xx(int Ax, int OmegaX, double t)
    {
        return Ax*Math.sin(OmegaX*t);
    }
    
    public double yy(int Ay, int OmegaY, double t)
    {
        return Ay*Math.sin(OmegaY*t + faza);
    }
    
    public Sinus2Panel2() {
        initComponents();
    }
    
    //LissFrame LF = new LissFrame();
  
    public void paintComponent(Graphics g)
    {
       g.setColor(Color.cyan);
       g.fillRect(-1,-1,1500, 1500);
       
       g.setColor(Color.red);
        for(double t=0; t<1000; t=t+0.1)
        {
          //x = int()  
          g.fillOval( (int)xx(Ax,OmegaX,t)+550,(int) yy(Ay,OmegaY,t)+300, 5, 5 );
        }
        repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suwakAxx = new javax.swing.JSlider();
        suwakAyy = new javax.swing.JSlider();
        suwakOmegaX = new javax.swing.JSlider();
        suwakOmegaY = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        powrótZpanel = new javax.swing.JButton();

        suwakAxx.setMaximum(250);
        suwakAxx.setMinimum(50);
        suwakAxx.setPaintLabels(true);
        suwakAxx.setPaintTicks(true);
        suwakAxx.setValue(250);
        suwakAxx.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                suwakAxxStateChanged(evt);
            }
        });

        suwakAyy.setMaximum(250);
        suwakAyy.setMinimum(50);
        suwakAyy.setPaintLabels(true);
        suwakAyy.setPaintTicks(true);
        suwakAyy.setValue(250);
        suwakAyy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                suwakAyyStateChanged(evt);
            }
        });

        suwakOmegaX.setMaximum(10);
        suwakOmegaX.setMinimum(1);
        suwakOmegaX.setPaintLabels(true);
        suwakOmegaX.setPaintTicks(true);
        suwakOmegaX.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                suwakOmegaXStateChanged(evt);
            }
        });

        suwakOmegaY.setMaximum(10);
        suwakOmegaY.setMinimum(1);
        suwakOmegaY.setPaintLabels(true);
        suwakOmegaY.setPaintTicks(true);
        suwakOmegaY.setSnapToTicks(true);
        suwakOmegaY.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                suwakOmegaYStateChanged(evt);
            }
        });

        jLabel1.setText("Amplituda");

        jLabel2.setText("Czestosc Omega");

        jLabel3.setText("przesun faze");

        jScrollBar1.setBlockIncrement(1);
        jScrollBar1.setMaximum(62831853);
        jScrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar1AdjustmentValueChanged(evt);
            }
        });

        powrótZpanel.setText("<< Powrót");
        powrótZpanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powrótZpanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel1))
                                    .addComponent(suwakAxx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 648, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(suwakAyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(276, 276, 276))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suwakOmegaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suwakOmegaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(powrótZpanel)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(powrótZpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suwakOmegaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(suwakOmegaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suwakAxx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(suwakAyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void suwakAxxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_suwakAxxStateChanged
       Ax = suwakAxx.getValue();
    }//GEN-LAST:event_suwakAxxStateChanged

    private void suwakAyyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_suwakAyyStateChanged
       Ay = suwakAyy.getValue();
    }//GEN-LAST:event_suwakAyyStateChanged

    private void suwakOmegaXStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_suwakOmegaXStateChanged
        OmegaX = suwakOmegaX.getValue();
    }//GEN-LAST:event_suwakOmegaXStateChanged

    private void suwakOmegaYStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_suwakOmegaYStateChanged
        OmegaY = suwakOmegaY.getValue();
    }//GEN-LAST:event_suwakOmegaYStateChanged

    private void powrótZpanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powrótZpanelActionPerformed
        JOptionPane.showMessageDialog(powrótZpanel, "nie dzialam jeszcze :)");
                    
        
    }//GEN-LAST:event_powrótZpanelActionPerformed

    private void jScrollBar1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar1AdjustmentValueChanged
        //String s = jScrollBar1.getValue();
        
        fazaint = jScrollBar1.getValue() ;
        faza = (double) fazaint/10000000;
        System.out.println("fazaint= "+fazaint);
        System.out.println("faza= "+faza);
    }//GEN-LAST:event_jScrollBar1AdjustmentValueChanged
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton powrótZpanel;
    private javax.swing.JSlider suwakAxx;
    private javax.swing.JSlider suwakAyy;
    private javax.swing.JSlider suwakOmegaX;
    private javax.swing.JSlider suwakOmegaY;
    // End of variables declaration//GEN-END:variables
}
