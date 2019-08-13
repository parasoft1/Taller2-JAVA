package calcular;

import javax.swing.*;

import java.text.DecimalFormat;

import static constantes.ConstantesMain.*;

public class MasaCodigo extends Masa {

    public void MasaCorporar(double altura, double peso){

        DecimalFormat formato = new DecimalFormat("#.##");

        double masaCorporal=peso/(altura*altura);

        if (masaCorporal <= 15.9) {
            JOptionPane.showMessageDialog(null, IMC_SALIDA.getMsnj() +"\n"+ IMC1.getMsnj() +"\n"+ formato.format(masaCorporal));

        } else if (masaCorporal <= 18.4) {
            JOptionPane.showMessageDialog(null, IMC_SALIDA.getMsnj() +"\n"+ IMC2.getMsnj() +"\n"+ formato.format(masaCorporal));

        } else if (masaCorporal <= 24.9) {
            JOptionPane.showMessageDialog(null, IMC_SALIDA.getMsnj() +"\n"+ IMC3.getMsnj() +"\n"+ formato.format(masaCorporal));

        } else if (masaCorporal <= 29.9) {
            JOptionPane.showMessageDialog(null, IMC_SALIDA.getMsnj() +"\n"+ IMC4.getMsnj() +"\n"+ formato.format(masaCorporal));

        } else if (masaCorporal <= 34.9) {
            JOptionPane.showMessageDialog(null, IMC_SALIDA.getMsnj() +"\n"+ IMC5.getMsnj() +"\n"+ formato.format(masaCorporal));

        } else if (masaCorporal <= 39.9) {
            JOptionPane.showMessageDialog(null, IMC_SALIDA.getMsnj() +"\n"+ IMC6.getMsnj() +"\n"+formato.format(masaCorporal));

        } else if (masaCorporal > 40) {
            JOptionPane.showMessageDialog(null, IMC_SALIDA.getMsnj() +"\n"+ IMC7.getMsnj() +"\n"+ formato.format(masaCorporal));
        }
    }
}
