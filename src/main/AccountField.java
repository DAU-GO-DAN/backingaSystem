/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class AccountField extends JTextField{
    
    private String placeholder;
    
    public AccountField(){
        // Xóa border mặc định của JTextField
        setBorder(BorderFactory.createEmptyBorder());

        // Thiết lập màu nền của JTextField
        setBackground(Color.WHITE);
    }
    
    @Override
    protected void paintBorder(Graphics g) {
        // Không vẽ border
    }
    
    public void setPlaceholder(String placeholder) {
        this.placeholder = Objects.requireNonNull(placeholder);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        if (getText().isEmpty() && placeholder != null) {
            // Thiết lập màu và font cho placeholder
            g.setColor(Color.GRAY);
            g.setFont(getFont().deriveFont(Font.ITALIC));
            
            // Lấy kích thước của JTextField
            Insets insets = getInsets();
            int left = insets.left;
            int top = insets.top;
            int width = getWidth() - left - insets.right;
            int height = getHeight() - top - insets.bottom;

            // Vẽ placeholder ở giữa JTextField
            FontMetrics fm = getFontMetrics(getFont());
            int x = left + (width - fm.stringWidth(placeholder)) / 2;
            int y = top + (height - fm.getHeight()) / 2 + fm.getAscent();
            g.drawString(placeholder, x, y);
        }
        
    }
    
}
