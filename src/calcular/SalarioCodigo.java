package calcular;

import javax.swing.*;

import static constantes.ConstantesMain.*;

public class SalarioCodigo extends Salario {

    public void CalcularSalario() {

        int seleccion =0;
        int acum = 0;
        int contador=1;
        boolean resp = false;


        do {
            seleccion = JOptionPane.showConfirmDialog(null,SALPREG.getMsnj(),"", JOptionPane.YES_NO_OPTION);

            if (seleccion==0) {

                int salario = Integer.parseInt(JOptionPane.showInputDialog(null, SALINGRE.getMsnj()));

                if (salario > this.getMayor()) {
                    this.setMayor(salario);
                }
                acum = acum + salario;

                    contador = contador + 1;

            }else {
                break;
            }
        }while (!resp);

            JOptionPane.showMessageDialog(null, SALMAYOR.getMsnj()+ this.getMayor() + "\n" +
              SALACUM.getMsnj()+acum+"\n"+SALPROM.getMsnj()+(acum/(contador-1))+"\n"+SALTOTAL.getMsnj()+(contador-1));
    }


}
