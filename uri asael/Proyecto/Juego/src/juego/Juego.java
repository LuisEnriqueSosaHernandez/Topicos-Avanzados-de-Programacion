/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import jcMousePanel.jcMousePanel;

public class Juego
  extends JFrame
{
  JFigura jfa = new JFigura();
  JFigura jfb = new JFigura();
  JFigura jfc = new JFigura();
  private JPanel jFigA;
  private JPanel jFigB;
  private JPanel jFigC;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private jcMousePanel jcMousePanel1;
  private JTextField lbApuesta;
  private JLabel lbBoton;
  private JTextField lbCredito;
  private JLabel lbEstado;
  
  public Juego()
  {
    initComponents();
    setTitle("Topicos Avanzados");
    
    this.jFigA.add(this.jfa);
    this.jFigB.add(this.jfb);
    this.jFigC.add(this.jfc);
    
    this.lbEstado.setText("");
    repaint();
  }
  
  private void initComponents()
  {
    this.jcMousePanel1 = new jcMousePanel();
    this.jFigA = new JPanel();
    this.jFigB = new JPanel();
    this.jFigC = new JPanel();
    this.lbEstado = new JLabel();
    this.jLabel2 = new JLabel();
    this.lbCredito = new JTextField();
    this.jLabel3 = new JLabel();
    this.lbApuesta = new JTextField();
    this.lbBoton = new JLabel();
    
    setDefaultCloseOperation(3);
    getContentPane().setLayout(new GridBagLayout());
    
    this.jcMousePanel1.setIcon(new ImageIcon(getClass().getResource("/juego/bgt.jpg")));
    this.jcMousePanel1.setPreferredSize(new Dimension(700, 400));
    this.jcMousePanel1.setVisibleLogo(false);
    
    GroupLayout jFigALayout = new GroupLayout(this.jFigA);
    this.jFigA.setLayout(jFigALayout);
    jFigALayout.setHorizontalGroup(jFigALayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 327));
    


    jFigALayout.setVerticalGroup(jFigALayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
    



    GroupLayout jFigBLayout = new GroupLayout(this.jFigB);
    this.jFigB.setLayout(jFigBLayout);
    jFigBLayout.setHorizontalGroup(jFigBLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
    


    jFigBLayout.setVerticalGroup(jFigBLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
    



    GroupLayout jFigCLayout = new GroupLayout(this.jFigC);
    this.jFigC.setLayout(jFigCLayout);
    jFigCLayout.setHorizontalGroup(jFigCLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
    


    jFigCLayout.setVerticalGroup(jFigCLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
    



    this.lbEstado.setFont(new Font("Tahoma", 1, 48));
    this.lbEstado.setForeground(new Color(255, 255, 0));
    this.lbEstado.setHorizontalAlignment(0);
    this.lbEstado.setText("jLabel1");
    
    this.jLabel2.setForeground(new Color(255, 255, 255));
    this.jLabel2.setText("CREDITO");
    
    this.lbCredito.setBackground(new Color(0, 0, 0));
    this.lbCredito.setFont(new Font("Tahoma", 1, 14));
    this.lbCredito.setForeground(new Color(255, 0, 0));
    this.lbCredito.setHorizontalAlignment(0);
    this.lbCredito.setText("200");                //////////////////////////////////////////////////////////////////////////
    
    this.jLabel3.setForeground(new Color(255, 255, 255));
    this.jLabel3.setText("APUESTA");
    
    this.lbApuesta.setBackground(new Color(0, 0, 0));
    this.lbApuesta.setFont(new Font("Tahoma", 1, 14));
    this.lbApuesta.setForeground(new Color(255, 0, 0));
    this.lbApuesta.setHorizontalAlignment(0);
    this.lbApuesta.setText("100");
    
    this.lbBoton.setIcon(new ImageIcon(getClass().getResource("/juego/boton.jpg")));
    this.lbBoton.setCursor(new Cursor(12));
    this.lbBoton.setDisabledIcon(new ImageIcon(getClass().getResource("/juego/boton.jpg")));
    this.lbBoton.addMouseListener(new MouseAdapter()
    {
      public void mouseClicked(MouseEvent evt)
      {
        Juego.this.lbBotonMouseClicked(evt);
      }
    });
    GroupLayout jcMousePanel1Layout = new GroupLayout(this.jcMousePanel1);
    this.jcMousePanel1.setLayout(jcMousePanel1Layout);
    jcMousePanel1Layout.setHorizontalGroup(jcMousePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jcMousePanel1Layout.createSequentialGroup().addGroup(jcMousePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jcMousePanel1Layout.createSequentialGroup().addGap(68, 68, 68).addComponent(this.lbEstado, -2, 379, -2)).addGroup(jcMousePanel1Layout.createSequentialGroup().addGap(58, 58, 58).addComponent(this.jFigA, -2, -1, -2).addGap(50, 50, 50).addComponent(this.jFigB, -2, -1, -2).addGap(51, 51, 51).addComponent(this.jFigC, -2, -1, -2))).addGap(61, 61, 61).addGroup(jcMousePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jcMousePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel3).addComponent(this.jLabel2).addComponent(this.lbCredito, -1, 122, 32767).addComponent(this.lbApuesta)).addComponent(this.lbBoton)).addContainerGap(58, 32767)));
   
    jcMousePanel1Layout.setVerticalGroup(jcMousePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jcMousePanel1Layout.createSequentialGroup().addGroup(jcMousePanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jcMousePanel1Layout.createSequentialGroup().addGap(107, 107, 107).addGroup(jcMousePanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jFigC, -2, -1, -2).addComponent(this.jFigB, -2, -1, -2).addComponent(this.jFigA, -2, -1, -2)).addGap(67, 67, 67).addComponent(this.lbEstado)).addGroup(jcMousePanel1Layout.createSequentialGroup().addGap(47, 47, 47).addComponent(this.jLabel2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.lbCredito, -2, 32, -2).addGap(18, 18, 18).addComponent(this.jLabel3).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.lbApuesta, -2, 36, -2).addGap(45, 45, 45).addComponent(this.lbBoton))).addContainerGap(51, 32767)));
 

    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    getContentPane().add(this.jcMousePanel1, gridBagConstraints);
    
    pack();
  }
  
  private void lbBotonMouseClicked(MouseEvent evt)
  {
     
      this.lbEstado.setText("");
    if (Integer.parseInt(this.lbApuesta.getText()) <= Integer.parseInt(this.lbCredito.getText()))
    {
      this.lbBoton.setEnabled(false);
      PlayWorker pwA = new PlayWorker(this.jfa);
      pwA.execute();
      
      PlayWorker pwB = new PlayWorker(this.jfb);
      pwB.execute();
      
      PlayWorker pwC = new PlayWorker(this.jfc);
      pwC.execute();
      
      CheckWorker cw = new CheckWorker(pwA, pwB, pwC, this.lbEstado, this.lbCredito, this.lbApuesta, this.lbBoton);
      cw.execute();
    }
    else
    {
      JOptionPane.showMessageDialog(this, "Losentimos,Credito insuficiente!");
    }
  }
  
  public static void main(String[] args)
  {
    try
    {
      for (LookAndFeelInfo info: UIManager.getInstalledLookAndFeels () ) {
        if ("Windows".equals(info.getName()))
        {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
    }
    catch (UnsupportedLookAndFeelException ex)
    {
      Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
    }
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Juego().setVisible(true);
        
        
      }
    });
  }
}
