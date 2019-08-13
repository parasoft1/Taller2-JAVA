package calcular;

import javax.swing.*;

import static constantes.ConstantesMain.*;


public class VectorCodigo extends Vector {

    public void Vectores() {

        int ingresar =Integer.parseInt(JOptionPane.showInputDialog(null,VEC_CANT_NUM.getMsnj()));

        int [] cantPos = new int[ingresar];
        int [] cantNeg = new int[ingresar];
        int contP=0;
        int contN=0;
        double promPos=0;
        double promNeg=0;

        int i=0;
        int j=0;

        for (int k = 0; k < ingresar; k++) {

            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, VEC_VAL.getMsnj()));
            if (numero > 0) {
                cantPos[i] = numero;
                contP+=1;
                promPos+=cantPos[i];
                i+=1;


            } else if (numero< 0) {
                cantNeg[j] = numero;
                contN+=1;
                promNeg+=cantNeg[j];
                j+=j;
            }

        }

        if (contP==0){
            contP=1;
        }

        if (contN==0){
            contN=1;
        }

        JOptionPane.showMessageDialog(null,VEC_INGRE.getMsnj() + ingresar + "\n" +
                VEC_POSIT.getMsnj()+promPos/contP+"\n"+VEC_NEG.getMsnj()+promNeg/contN);

    }
}
