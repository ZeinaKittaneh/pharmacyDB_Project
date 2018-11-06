
import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.*;

/**
 * 
 * @author zeina
 */
public class Theme {
    private int selection;
    
    public int getSelection(){
        return selection;
    }
    
    public void setSelection(int selection){
        this.selection = selection;
    }
    public void changeTheme(JFrame frameObj ) {
        //get all components of the frame
        Component[] components=frameObj.getContentPane().getComponents();
        //change colors based on selection
        //orange theme:
        if(this.selection == 1){
            frameObj.getContentPane().setBackground(Color.decode("#2C3E50"));           
            frameObj.getContentPane().setForeground(Color.decode("#ECF0F1"));
            //set colors for specific components
            for(Component c : components)
                if (c instanceof JButton){ 
                    c.setBackground(Color.decode("#F89406"));
                    c.setForeground(Color.decode("#ECF0F1"));
                    if(((JButton) c).getText().equals("Logout"))
                        c.setBackground(Color.decode("#22A7F0"));
                    else if(((JButton) c).getText().equals("Exit"))
                        c.setBackground(Color.decode("#C0392B"));
                }
                else if(c instanceof  JLabel)
                    c.setForeground(Color.decode("#ECF0F1"));
        }
        //blue theme
        else if(this.selection == 2){
            frameObj.getContentPane().setBackground(Color.decode("#2a4a8b"));           
            frameObj.getContentPane().setForeground(Color.decode("#ECF0F1"));           
            //set colors for specific components
            for(Component c : components)
                if (c instanceof JButton){ 
                    c.setBackground(Color.decode("#f8d90f"));
                    c.setForeground(Color.decode("#2a4a8b"));
                    if(((JButton) c).getText().equals("Logout"))
                        c.setBackground(Color.decode("#eeba00"));
                    else if(((JButton) c).getText().equals("Exit"))
                        c.setBackground(Color.decode("#db5000"));
                }
                else if(c instanceof  JLabel)
                    c.setForeground(Color.decode("#ECF0F1"));
        }
        //rosy theme
        else if(this.selection == 3){
            frameObj.getContentPane().setBackground(Color.decode("#efdfe4"));           
            frameObj.getContentPane().setForeground(Color.decode("#bf0154"));           
            //set colors for specific components
            for(Component c : components)
                if (c instanceof JButton){
                    //btn.setBackground(new JButton().getBackground());
                    c.setBackground(null);
                    c.setForeground(Color.decode("#bf0154"));
                    if(((JButton) c).getText().equals("Logout"))
                        c.setBackground(new JButton().getBackground());
                    else if(((JButton) c).getText().equals("Exit"))
                        c.setBackground(new JButton().getBackground());
                }
                else if(c instanceof  JLabel)
                    c.setForeground(new JLabel().getBackground());
        }
        //classic theme
        else if(this.selection == 4){
            frameObj.getContentPane().setBackground(null);           
            frameObj.getContentPane().setForeground(null);           
            //set colors for specific components
            for(Component c : components)
                if (c instanceof JButton){
                    //btn.setBackground(new JButton().getBackground());
                    c.setBackground(null);
                    c.setForeground(null);
                    if(((JButton) c).getText().equals("Logout"))
                        c.setBackground(new JButton().getBackground());
                    else if(((JButton) c).getText().equals("Exit"))
                        c.setBackground(new JButton().getBackground());
                }
                else if(c instanceof  JLabel)
                    c.setForeground(new JLabel().getBackground());
        }
    }
}
