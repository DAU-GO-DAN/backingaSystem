
package main;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class SearchTextField extends JTextField {
    
    private Icon prefixIcon;
    private Icon suffixIcon;
    
    public Icon getPrefixIcon() {
        return prefixIcon;
    }
    
    public void setPrefixIcon(Icon prefixIcon) {
        this.prefixIcon = prefixIcon;
        initBorder();
    }
    
    public Icon getSuffixIcon() {
        return suffixIcon;
    }
    
    public void setSuffixIcon(Icon suffixIcon) {
        this.suffixIcon = suffixIcon;
        initBorder();
    }
    
    public SearchTextField() {
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }
 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        paintIcon(g);
    }
    
     private void paintIcon(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        if(prefixIcon!=null){
            Image prefix=((ImageIcon) prefixIcon).getImage();
            int y=(getHeight()-prefixIcon.getIconHeight())/2;
            g2.drawImage(prefix,0,y,this);
        }
        if(suffixIcon!=null){
            Image suffix=((ImageIcon) suffixIcon).getImage();
            int y=(getHeight()-suffixIcon.getIconHeight())/2;
            g2.drawImage(suffix,getWidth()-suffixIcon.getIconWidth(),y,this);
        }
    }
     
     private void initBorder(){
        int left=5;
        int right=5;
        if(prefixIcon!=null){
            left=prefixIcon.getIconWidth();
        }
        if(suffixIcon!=null){
            right=suffixIcon.getIconWidth();
        }
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, left, 5, right));
    }
    
}
