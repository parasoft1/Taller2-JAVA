package main;

import calcular.*;

import javax.swing.*;

import java.awt.*;

import static constantes.ConstantesMain.*;


public class Main {

    public static void main(String[] args) {
        MasaCodigo masaCodigo = new MasaCodigo();

        String menu = JOptionPane.showInputDialog(null, MENU_MASA.getMsnj() + "\n" + MENU_ZODIACO.getMsnj() + "\n" + MENU_SALARIO.getMsnj()
                + "\n" + MENU_VECTOR.getMsnj()+ "\n"+ MENU_SALIDA.getMsnj());
        int a = Integer.parseInt(menu);

        if (a == 1) {

            String altura1 = JOptionPane.showInputDialog(null, IMC_ALTURA.getMsnj());
            String peso1 = JOptionPane.showInputDialog(null, IMC_PESO.getMsnj());

            masaCodigo.setAltura(Double.parseDouble(altura1));
            masaCodigo.setPeso(Double.parseDouble(peso1));

            MasaCodigo calculoMasa= new MasaCodigo();
            calculoMasa.MasaCorporar(Double.parseDouble(altura1),Double.parseDouble(peso1));

            Main.main(null);

        } else if (a == 2) {
            ZodiacoCodigo zodiacoCodigo = new ZodiacoCodigo();
            int x = Integer.parseInt(JOptionPane.showInputDialog((Component)null, ZOD_DIA.getMsnj(), "DIA", 3));
            zodiacoCodigo.setDia(x);
            int y = Integer.parseInt(JOptionPane.showInputDialog((Component)null, ZOD_MES.getMsnj(), "MES", 3));
            zodiacoCodigo.setMes(y);
            JOptionPane.showMessageDialog((Component)null, ZOD_SIGNO.getMsnj() + ZodiacoCodigo.calcularSignoZodiacal(zodiacoCodigo.getDia(), zodiacoCodigo.getMes()));
            Main.main(null);
        } else if (a == 3) {
            SalarioCodigo salarioCodigo = new SalarioCodigo();
            salarioCodigo.CalcularSalario();
            Main.main(null);
        } else if (a == 4) {
            VectorCodigo vectorCodigo =new VectorCodigo();
            vectorCodigo.Vectores();

        } else if (a == 0){
            JOptionPane.showMessageDialog(null, MENU_EXIT.getMsnj());

        } else
            Main.main(null);

    }
}