/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;
import java.awt.Graphics;
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
    private File rutaImagen;
    
    public JPanelImagen(){
        
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if (rutaImagen!=null && rutaImagen.exists())
        {
            ImageIcon imageIcon = new ImageIcon(rutaImagen.getAbsolutePath());
            g.drawImage(imageIcon.getImage(),0,0, null);
        }
    }

   
    
    
    
}
