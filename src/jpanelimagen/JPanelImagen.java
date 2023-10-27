/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import javax.swing.JPanel;
import java.io.Serializable;
import javax.swing.ImageIcon;
/**
 *
 * @author Dani
 */
public class JPanelImagen extends JPanel implements Serializable
{
    private ImagenFondo imagenFondo;
    
    public JPanelImagen(){
        
    }

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if(imagenFondo!=null)
        {
            if (imagenFondo.getRutaImagen()!=null && imagenFondo.getRutaImagen().exists());
            {
                ImageIcon imageIcon = new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
                Graphics2D g2d = (Graphics2D)g;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, imagenFondo.getOpacidad()));
                g.drawImage(imageIcon.getImage(),0,0, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
            }
        }
    }
    
}
