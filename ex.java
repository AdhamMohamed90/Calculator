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
public class ex {
    //***********work sin function***********\\

    public double sin(double res, double num, String split[], String text) {
        split = text.split("[sin( )]");

        if (!split[4].equals("") && split[0].equals("")) {
            num = Double.parseDouble(split[4]);
            res = Math.sin(Math.toRadians(num));

        } else if (split[0] != null && split[4] != null) {
            num = Double.parseDouble(split[0]);
            double num2 = Double.parseDouble(split[4]);
            res = Math.sin(Math.toRadians(num2));
            res = res * num;

        } else if (split[0] != null && split[4] == null) {
            JOptionPane.showMessageDialog(null, "must write number after sign");

        }
        return res;
    }
    //***********work cos function***********\\

    public double cos(double res, double num, String split[], String text) {
        split = text.split("[cos( )]");

        if (!split[4].equals("") && split[0].equals("")) {
            num = Double.parseDouble(split[4]);
            res = Math.cos(Math.toRadians(num));

        } else if (split[0] != null && split[4] != null) {
            num = Double.parseDouble(split[0]);
            double num2 = Double.parseDouble(split[4]);
            res = Math.cos(Math.toRadians(num2));
            res = res * num;

        } else if (split[0] != null && split[4] == null) {
            JOptionPane.showMessageDialog(null, "must write number after sign");

        }
        return res;
    }

    //***********work tan function***********\\
    public double tan(double res, double num, String split[], String text) {
        split = text.split("[tan( )]");
        if (!split[4].equals("") && split[0].equals("")) {
            num = Double.parseDouble(split[4]);
            res = Math.tan(Math.toRadians(num));

        } else if (split[0] != null && split[4] != null) {
            num = Double.parseDouble(split[0]);
            double num2 = Double.parseDouble(split[4]);
            res = Math.tan(Math.toRadians(num2));
            res = res * num;

        } else if (split[0] != null && split[4] == null) {
            JOptionPane.showMessageDialog(null, "must write number after sign");

        }
        return res;
    }
    //***********work power function***********\\

    public double power(double res, String split[], String text) {
        split = text.split("['^']");
        if(split[1].equals("")){
           JOptionPane.showMessageDialog(null, "must write number after sign");
        }
        for(int i = 0 ; i < split.length-1; i++){
            double base = Double.parseDouble(split[i]);
            double power = Double.parseDouble(split[i+1]);
            
            res = Math.pow(base, power);
        }
        return res;
    }
}
