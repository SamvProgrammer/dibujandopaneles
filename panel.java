/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5clase2.interfaz;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author samv
 */
public class panel extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        int anchura = getWidth();
        
        int altura = getHeight();
        
        g.drawLine(0,0, anchura, altura);
        
        g.drawLine(0, altura, anchura, 0);
    }
    
    
    public static void main(String[] args) {
        panel p = new panel();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(p);
        ventana.setSize(500,500);
        ventana.setVisible(true);
    }
}
