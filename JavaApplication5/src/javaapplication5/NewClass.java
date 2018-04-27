/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author albertgeorge
 */

    import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class NewClass extends JComponent{
@Override
public void paintComponent(Graphics g) {
Graphics2D graphicsObj = (Graphics2D) g;

Rectangle binRectangle1 = new Rectangle(10,20,200,50);
Color binColor1 = new Color(220,230,120);
graphicsObj.setColor(binColor1);
graphicsObj.fill(binRectangle1);

Rectangle bingRectangle2 = new Rectangle(10,40,200,50);
Color binColor2 = new Color(200,0,200);
graphicsObj.setColor(binColor2);
graphicsObj.fill(bingRectangle2);

Rectangle binRectangle3 = new Rectangle(10,60,200,50);
Color binColor3 = new Color(150,20,30);
graphicsObj.setColor(binColor3);
graphicsObj.fill(binRectangle3);
}
}

