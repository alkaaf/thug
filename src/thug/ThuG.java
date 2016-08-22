/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thug;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author alkaaf
 */
public class ThuG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        javax.swing.UIManager.setLookAndFeel(new com.sun.java.swing.plaf.windows.WindowsLookAndFeel());
        new homeWin().setVisible(true);
        int a;
    }
}
