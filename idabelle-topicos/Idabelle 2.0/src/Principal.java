
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LESH
 */
public class Principal extends javax.swing.JFrame {

    JLabel txtarea = new JLabel();
    /**
     * Creates new form Principal
     */
    int indicador;

    public Principal() {
        initComponents();
        initComponents2();
    }

    public void initComponents2() {

        setLayout(new BorderLayout());

        add(txtarea, BorderLayout.SOUTH);
        txtarea.setText("Área");
        indicador = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ovalo = new javax.swing.JButton();
        arco = new javax.swing.JButton();
        linea = new javax.swing.JButton();
        rectangulo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        coordenadas = new javax.swing.JTextField();
        Recta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 162, 198));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        ovalo.setText("Óvalo");
        ovalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovaloActionPerformed(evt);
            }
        });

        arco.setText("Arco");
        arco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcoActionPerformed(evt);
            }
        });

        linea.setText("Línea");
        linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaActionPerformed(evt);
            }
        });

        rectangulo.setText("Rectángulo redondeado");
        rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloActionPerformed(evt);
            }
        });

        jButton1.setText("Rectángulo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Coordenadas");

        coordenadas.setEditable(false);
        coordenadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordenadasActionPerformed(evt);
            }
        });

        Recta.setText("Linea Recta");
        Recta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(jLabel1)
                .addContainerGap(537, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rectangulo)
                            .addComponent(linea)
                            .addComponent(arco)
                            .addComponent(ovalo)
                            .addComponent(Recta))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(coordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(coordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ovalo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arco)
                .addGap(18, 18, 18)
                .addComponent(linea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Recta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        int x1, y1;
    int x2, y2;
    int x3, y3;
    int x4, y4;

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Point punto = MouseInfo.getPointerInfo().getLocation();
        coordenadas.setText("x: "+punto.x + " y: " + punto.y);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        Graphics g = getGraphics();
        if (indicador !=0 ) {
            if(indicador==1){
            x2 = x3;
            y2 = y1;
            x4 = x1;
            y4 = y3;
            //g.drawRect(x1, y1, x3-x1, y3-y1);
            if (x2 > 0 && x3 > 0 && y3 > 0 && y4 > 0) {

                g.drawLine(x1, y1, x2, y2);
                g.drawLine(x2, y2, x3, y3);
                g.drawLine(x3, y3, x4, y4);
                g.drawLine(x4, y4, x1, y1);
                double area = ((x2 - x1) * (y4 - y1));
                System.out.println(area);
                if(area<0){
                 area*=-1;   
                }
             
                txtarea.setText("Área: " + area+"px");
                System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3 + " " + x4 + " " + y4);
                x1 = 0;
                y1 = 0;
                x2 = 0;
                y2 = 0;
                x3 = 0;
                y3 = 0;
                x4 = 0;
                y4 = 0;
            }
            }
            if(indicador==2){
                g.drawOval(x1, y1, x3-x1, y3-y1);
            }
            if(indicador==3){
                g.drawArc(x1, y1, x3-x1, y3-y1, 270, 180);
              
            }
            if(indicador==5){
                g.drawRoundRect(x1, y1, x3-x1, y3-y1, 10, 10);
            }
            if(indicador==6){
             g.drawLine(x1, y1, x3, y3);
         }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una figura", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Point punto = MouseInfo.getPointerInfo().getLocation();
        x3 = punto.x;
        y3 = punto.y;
        coordenadas.setText("x: "+punto.x + " y: " + punto.y);
        Graphics g = getGraphics();
        
        x2 = x3;
        y2 = y1;
        x4 = x1;
        y4 = y3;
        if(indicador!=0){
        if (indicador ==1) {
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y2, x3, y3);
            g.drawLine(x3, y3, x4, y4);
            g.drawLine(x4, y4, x1, y1);
            repaint();
        }
        if(indicador==2){
                g.drawOval(x1, y1, x3-x1, y3-y1);
                //g.drawRect(x1, y1, x3-x1, y3-y1);
                repaint();
            }
        if(indicador==4){
           Graphics2D g2d = (Graphics2D)g;
           g2d.setStroke(new BasicStroke(10));
             g2d.drawLine(punto.x, punto.y, punto.x, punto.y);
        }
         if(indicador==5){
                g.drawRoundRect(x1, y1, x3-x1, y3-y1, 15, 15);
                repaint();
            }
         if(indicador==6){
             g.drawLine(x1, y1, x3, y3);
             repaint();
         }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una figura", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited

    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        Point punto = MouseInfo.getPointerInfo().getLocation();
        x1 = punto.x;
        y1 = punto.y;

    }//GEN-LAST:event_jPanel1MousePressed

    private void coordenadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordenadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coordenadasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        indicador=1;
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ovaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovaloActionPerformed
       indicador=2;
       repaint();
    }//GEN-LAST:event_ovaloActionPerformed

    private void arcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcoActionPerformed
        indicador=3;
        repaint();
    }//GEN-LAST:event_arcoActionPerformed

    private void lineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaActionPerformed
        indicador=4;
        repaint();
    }//GEN-LAST:event_lineaActionPerformed

    private void rectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloActionPerformed
        indicador=5;
        repaint();
    }//GEN-LAST:event_rectanguloActionPerformed

    private void RectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectaActionPerformed
      indicador=6;
      repaint();
    }//GEN-LAST:event_RectaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Recta;
    private javax.swing.JButton arco;
    private javax.swing.JTextField coordenadas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton linea;
    private javax.swing.JButton ovalo;
    private javax.swing.JButton rectangulo;
    // End of variables declaration//GEN-END:variables
}