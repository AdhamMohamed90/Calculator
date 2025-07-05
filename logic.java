/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculatorsemester2;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class logic {

        //***********work nand function***********\\

    public void NAND(String text) {
        String[] split = text.split("[NAND]");

        if (split[0].equals("true") && split[4].equals("true") || split[0].equals("1") && split[4].equals("1")) {
            JOptionPane.showMessageDialog(null, "False");
        } else if (split[0].equals("false") && split[4].equals("false") || split[0].equals("0") && split[4].equals("0")) {
            JOptionPane.showMessageDialog(null, "True");

        } else if (split[0].equals("1") || split[0].equals("true") && split[4].equals("0") || split[4].equals("false")) {
            JOptionPane.showMessageDialog(null, "True");

        } else if (split[0].equals("0") || split[0].equals("false") && split[4].equals("1") || split[4].equals("true")) {
            JOptionPane.showMessageDialog(null, "True");

        } else {
            JOptionPane.showMessageDialog(null, "Invalid number");
        }
    }
    //***********work and function***********\\

    public void AND(String text) {
        String[] split = text.split("[AND]");
        if (split[0].equals("1") && split[3].equals("1") || split[0].equals("true") && split[3].equals("true")) {
            JOptionPane.showMessageDialog(null, "True");

        } else if (split[0].equals("1") || split[0].equals("true") && split[3].equals("0") || split[3].equals("false")) {
            JOptionPane.showMessageDialog(null, "False");

        } else if (split[0].equals("0") || split[0].equals("false") && split[3].equals("1") || split[3].equals("true")) {
            JOptionPane.showMessageDialog(null, "False");
        } else if (split[0].equals("0") || split[0].equals("false") && split[3].equals("0") || split[3].equals("false")) {
            JOptionPane.showMessageDialog(null, "False");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid number");
        }
    }
    //***********work xnor function***********\\

    public void XNOR(String text) {
        String[] split = text.split("[XNOR]");
        if (split[0].equals("TrueXN") && split[4].equals("true") || split[0].equals("1XN") && split[4].equals("1")) {
            JOptionPane.showMessageDialog(null, "True");

        } else if (split[0].equals("FalseXN") && split[4].equals("false") || split[0].equals("0XN") && split[4].equals("0")) {
            JOptionPane.showMessageDialog(null, "True");

        } else if (split[0].equals("1XN") || split[0].equals("trueXN") && split[4].equals("0") || split[4].equals("false")) {
            JOptionPane.showMessageDialog(null, "False");

        } else if (split[0].equals("0XN") || split[0].equals("falseXN") && split[4].equals("1") || split[4].equals("true")) {
            JOptionPane.showMessageDialog(null, "False");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid number");
        }
    }
    //***********work xor function***********\\

    public void XOR(String text) {
        String[] split = text.split("[XOR]");
        if (split[0].equals("true") && split[2].equals("true") || split[0].equals("1") && split[2].equals("1")) {
            JOptionPane.showMessageDialog(null, "False");

        } else if (split[0].equals("false") && split[2].equals("false") || split[0].equals("0") && split[2].equals("0")) {
            JOptionPane.showMessageDialog(null, "False");

        } else if (split[0].equals("1") || split[0].equals("true") && split[2].equals("0") || split[2].equals("false")) {
            JOptionPane.showMessageDialog(null, "True");

        } else if (split[0].equals("0") || split[0].equals("false") && split[2].equals("1") || split[2].equals("true")) {
            JOptionPane.showMessageDialog(null, "True");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid number");
        }
    }
    //***********work nor function***********\\

    public void NOR(String text) {
        String[] split = text.split("[NOR]");
        if (split[0].equals("0") && split[2].equals("0") || split[0].equals("false") && split[2].equals("false")) {
            JOptionPane.showMessageDialog(null, "True");

        } else if (split[0].equals("1") && split[2].equals("1") || split[0].equals("true") && split[2].equals("true")) {
            JOptionPane.showMessageDialog(null, "False");

        } else if (split[0].equals("1") || split[0].equals("true") && split[2].equals("0") || split[2].equals("false")) {
            JOptionPane.showMessageDialog(null, "False");

        } else if (split[0].equals("0") || split[0].equals("false") && split[2].equals("1") || split[2].equals("true")) {
            JOptionPane.showMessageDialog(null, "False");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid number");
        }
    }
    //***********work or function***********\\

    public void OR(String text) {
        String[] split = text.split("[OR]");
        if (split[0].equals("0") && split[2].equals("0") || split[0].equals("false") && split[2].equals("false")) {
            JOptionPane.showMessageDialog(null, "False");

        } else if (split[0].equals("1") && split[2].equals("1") || split[0].equals("true") && split[2].equals("true")) {
            JOptionPane.showMessageDialog(null, "True");

        } else if (split[0].equals("1") || split[0].equals("true") && split[2].equals("0") || split[2].equals("false")) {
            JOptionPane.showMessageDialog(null, "True");

        } else if (split[0].equals("0") || split[0].equals("false") && split[2].equals("1") || split[2].equals("true")) {
            JOptionPane.showMessageDialog(null, "True");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid number");
        }
    }
    //***********work not function***********\\

    public void NOT(String text) {
        try {
            String[] split = text.split("[NOT]");
            if (split[3].equals("0") || split[3].equals("false")) {
                JOptionPane.showMessageDialog(null, "True");
                return;
            } else if (split[3].equals("1") || split[3].equals("true")) {
                JOptionPane.showMessageDialog(null, "False");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "must enter one Type");
                //return;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "must start not or !");
        }
    }
    

}
