//  SimpleModelInteface.java
//
import javax.swing.*;
import javax.swing.event.*;

public interface SimpleModelInterface 
{
    public int getValue(); 
    public void setValue(int v);

    public boolean isActivated();
    public void setActivated(boolean b);

    public void addChangeListener(ChangeListener l); 
    public void removeChangeListener(ChangeListener l);
}
