import java.awt.image.BufferedImage ;
import java.awt.Image;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public abstract class SpikeTower extends Tower
{
  public SpikeTower(BloonGame bg) 
  {
    this.bg = bg;
  }
   public void paint(Graphics g)
  {
    g.drawImage(spikeTower, 450, 625, null);
  }
}
