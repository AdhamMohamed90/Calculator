/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorsemester2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Normal {

    //***********work sum function***********\\
    public double sum(String num[], String text, double res) {
        num = text.split("[+]");

        for (int i = 0; i < num.length; i++) {
            double num1 = Double.parseDouble(num[i]);

            res += num1;

        }
        return res;
    }

    //***********work subtract function***********\\
    public double sub(String num[], String text, double res) {
        num = text.split("[-]");

        if (num.length > 2) {
            for (int i = 0; i < num.length - 2; i++) {

                double num1 = Double.parseDouble(num[i]);
                double num2 = Double.parseDouble(num[i + 1]);
                double num3 = Double.parseDouble(num[i + 2]);

                res += num1 - num2;
                res = res - num3;

            }
        } else if (num.length == 2) {
            for (int i = 0; i < num.length - 1; i++) {

                double num1 = Double.parseDouble(num[i]);
                double num2 = Double.parseDouble(num[i + 1]);

                res = num1 - num2;
            }

       
        }
        return res;
    }

    //***********work multiply function***********\\
    public double mult(String num[], String text, double res) {
        res = 1;
        num = text.split("[X]");
        for (int i = 0; i < num.length; i++) {
            double num1 = Double.parseDouble(num[i]);

            res *= num1;

        }
        return res;
    }

    //***********work divide function***********\\
    public double div(String num[], String text, double res) {
        num = text.split("[÷]");
        if (num.length > 2) {
            for (int i = 0; i < num.length - 2; i++) {
                double num1 = Double.parseDouble(num[i]);
                double num2 = Double.parseDouble(num[i + 1]);
                double num3 = Double.parseDouble(num[i + 2]);

                res = num1 / num2;
                res = res / num3;
            }
        } else if (num.length == 2) {
            for (int i = 0; i < num.length - 1; i++) {
                double num1 = Double.parseDouble(num[i]);
                double num2 = Double.parseDouble(num[i + 1]);

                res = num1 / num2;
            }
        }
//        } else {
//            JOptionPane.showMessageDialog(null, "invalid input");
//        }
        return res;
    }

    //***********work sqrt function***********\\
    public double sqrt(String num[], String text, double res) {
        num = text.split("[%]");

        if (num.length == 1) {
            JOptionPane.showMessageDialog(null, "must write number after sqrt");
            return 0;

        } else if (num.length == 2) {

            if (!num[0].equals("")) {

                for (int i = 0; i < num.length - 1; i++) {
                    double num1 = Double.parseDouble(num[i]);
                    double num2 = Double.parseDouble(num[i + 1]);
                    res = Math.sqrt(num2);
                    res = res * num1;
                }

            } else if (!num[1].equals("")) {
                for (int i = 0; i < num.length - 1; i++) {
                    double num1 = Double.parseDouble(num[i + 1]);

                    res = Math.sqrt(num1);

                }

            }

        }
        return res;
    }

    //***********work start subtract function***********\\
    public double startSub(String num[], String text, double res) {
        num = text.split("[-]");

        for (int i = 0; i < num.length - 1; i++) {

            double num1 = Double.parseDouble(num[i + 1]);
            res -= num1;
        }
        return res;
    }

    //***********work asolute function***********\\   
    public double abs(String num[], String text, double res) {
        num = text.split("[abs ( )]");
        for (int i = 4; i < num.length; i++) {
            double num1 = Double.parseDouble(num[i]);

            if (!num[0].equals("")) {
                JOptionPane.showMessageDialog(null, "must not start number before abs");

            } else if (!num[4].equals("") && num[0].equals("")) {

                res = Math.abs(num1);
            }

        }
        return res;
    }

    public double sumAndSub(String num[], String text, double res) {
        num = text.split("[-+]");

        if (num.length > 2) {
            for (int i = 0; i < num.length - 2; i++) {

                double num1 = Double.parseDouble(num[i]);
                double num2 = Double.parseDouble(num[i + 1]);
                double num3 = Double.parseDouble(num[i + 2]);

                res += num1 + num2;
                res = res - num3;

            }

        } else if (num.length == 2) {
            for (int i = 0; i < num.length - 1; i++) {

                double num1 = Double.parseDouble(num[i]);

                res = num1;
            }
        }

        return res;
    }

    public double subAndsum(String num[], String text, double res) {

        num = text.split("[-+]");

        if (num.length > 2) {
            for (int i = 0; i < num.length - 2; i++) {

                double num1 = Double.parseDouble(num[i]);
                double num2 = Double.parseDouble(num[i + 1]);
                double num3 = Double.parseDouble(num[i + 2]);

                res += num1 - num2;
                res = res + num3;

            }

        } else if (num.length == 2) {
            for (int i = 0; i < num.length - 1; i++) {

                double num1 = Double.parseDouble(num[i]);

                res = num1;
            }
        }
        return res;
    }

    public double multAndDiv(String num[], String text, double res) {
        num = text.split("[X÷]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 * num2;
            res = res / num3;
        }
        return res;
    }

    public double divAndMult(String num[], String text, double res) {
        num = text.split("[÷X]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 / num2;
            res = res * num3;
        }
        return res;
    }

    public double sumAndMult(String num[], String text, double res) {
        num = text.split("[+X]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 + num2;
            res = res * num3;
        }
        return res;
    }

    public double multAndSum(String num[], String text, double res) {
        num = text.split("[X+]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 * num2;
            res = res + num3;
        }
        return res;
    }

    public double multAndSub(String num[], String text, double res) {
        num = text.split("[X-]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 * num2;
            res = res - num3;
        }
        return res;
    }

    public double subAndMult(String num[], String text, double res) {
        num = text.split("[-X]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 - num2;
            res = res * num3;
        }
        return res;
    }

    public double divAndSum(String num[], String text, double res) {
        num = text.split("[÷+]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 / num2;
            res = res + num3;
        }
        return res;
    }

    public double sumAndDiv(String num[], String text, double res) {
        num = text.split("[+÷]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 + num2;
            res = res / num3;
        }
        return res;
    }

    public double divAndSub(String num[], String text, double res) {
        num = text.split("[÷-]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 / num2;
            res = res - num3;
        }
        return res;
    }

    public double subAndDiv(String num[], String text, double res) {
        num = text.split("[-÷]");
        for (int i = 0; i < num.length - 2; i++) {
            double num1 = Double.parseDouble(num[i]);
            double num2 = Double.parseDouble(num[i + 1]);
            double num3 = Double.parseDouble(num[i + 2]);

            res += num1 / num2;
            res = res - num3;
        }
        return res;
    }
}
