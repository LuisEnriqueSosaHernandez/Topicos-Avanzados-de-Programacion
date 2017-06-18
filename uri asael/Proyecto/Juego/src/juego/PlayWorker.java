/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Random;
import javax.swing.SwingWorker;

public class PlayWorker
  extends SwingWorker<Integer, Void>
{
  private JFigura jfigura;
  private int value = 0;
  private int wait = 6;
  
  PlayWorker(JFigura jc)
  {
    this.jfigura = jc;
  }
  
  protected Integer doInBackground()
    throws Exception
  {
    int giros = 0;
    Random random = new Random();
    int n = random.nextInt(3) + 1;
    int rotate = random.nextInt(7) + 4;
    while (giros < rotate)
    {
      giros++;
      this.value = 0;
      for (int i = 0; i < n * 10; i++)
      {
        this.value -= 10;
        this.jfigura.updateY(this.value);
        Thread.sleep(this.wait);
      }
      this.wait += 2;
    }
    return Integer.valueOf(this.value);
  }
}

