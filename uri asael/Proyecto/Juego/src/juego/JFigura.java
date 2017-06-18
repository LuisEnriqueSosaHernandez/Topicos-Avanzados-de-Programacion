/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class JFigura
  extends JComponent
{
  private ImageIcon image = new ImageIcon(getClass().getResource("/juego/figuras.jpg"));
  private int y = 0;
  private Dimension d = new Dimension(100, 100);
  
  JFigura()
  {
    setSize(this.d);
    setPreferredSize(this.d);
    setVisible(true);
  }
  
  public void updateY(int value)
  {
    this.y = value;
    repaint();
  }
  
  public void paint(Graphics g)
  {
    super.paint(g);
    g.drawImage(this.image.getImage(), 0, this.y, 100, 400, this);
    g.dispose();
  }
}

