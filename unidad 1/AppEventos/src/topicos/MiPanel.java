package topicos;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class MiPanel extends JPanel {
 
  private static final int WIDTH = 300, HEIGHT = 300;
  private static final int LEFT = 10;
  private static final int TOP = 10;
  private static final int BORDER = 30;
 
  private static final Color backColor = Color.gray;
  private static final Color lineColor = Color.red;
 
  // points for rectangles to draw go here
  private List<Point> pointList = new ArrayList<Point>();
 
  public MiPanel() {
    MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
    addMouseMotionListener(myMouseAdapter);
    addMouseListener(myMouseAdapter);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
  }
 
  
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g); // 
    Dimension d = getSize();
    g.setColor(lineColor);
    g.fillRect(0, 0, LEFT, TOP);
    g.drawRect(LEFT, TOP, d.width - BORDER, d.height - BORDER);
 
    g.drawString("Arrastrar para dibujar; Hacer click en el cuadro rojo para borrar.", LEFT, d.height - 5);
    g.setColor(Color.blue);
 
    // paintComponent paints the rects based on points in the list
    for (Point point : pointList) {
      g.fillRect(point.x, point.y, 10, 10);
    }
  }
  
  

 
  private class MyMouseAdapter extends MouseAdapter {
    public void mouseDragged(MouseEvent e) {
      processPoint(e.getPoint());
    }
     
    public void mouseClicked(MouseEvent e) {
      processPoint(e.getPoint());
    }
 
    // Adiciona y remueve la lista de puntos
    private void processPoint(Point point) {
      Dimension d = getSize();
      if ((point.x > LEFT) && (point.x < LEFT + d.width - BORDER) && (point.y > TOP)
          && (point.y < TOP + d.height - BORDER)) {
        pointList.add(point);
      }
      if ((point.x < LEFT) && (point.y < TOP)) {
        pointList.clear();
      }
      repaint();
    }
  }
}