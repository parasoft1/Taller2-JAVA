package calcular;

import static constantes.ConstantesMain.*;

public class ZodiacoCodigo extends Zodiaco {

    private int dia;
    private int mes;

    public static String calcularSignoZodiacal(int dia, int mes) {
        if (mes == 1) {
            return dia >= 21 ? ZOD_ACUA.getMsnj() : ZOD_CAPRI.getMsnj();
        } else if (mes == 2) {
            return dia >= 19 ? ZOD_PISCIS.getMsnj() : ZOD_ACUA.getMsnj();
        } else if (mes == 3) {
            return dia >= 20 ? ZOD_ARIES.getMsnj() : ZOD_PISCIS.getMsnj();
        } else if (mes == 4) {
            return dia >= 20 ? ZOD_TAURO.getMsnj() : ZOD_ARIES.getMsnj();
        } else if (mes == 5) {
            return dia >= 21 ? ZOD_GEMINIS.getMsnj() : ZOD_TAURO.getMsnj();
        } else if (mes == 6) {
            return dia >= 20 ? ZOD_CANCER.getMsnj(): ZOD_GEMINIS.getMsnj();
        } else if (mes == 7) {
            return dia >= 22 ? ZOD_LEO.getMsnj() : ZOD_CANCER.getMsnj();
        } else if (mes == 8) {
            return dia >= 21 ? ZOD_VIRGO.getMsnj() : ZOD_LEO.getMsnj();
        } else if (mes == 9) {
            return dia >= 22 ? ZOD_LIBRA.getMsnj() : ZOD_VIRGO.getMsnj();
        } else if (mes == 10) {
            return dia >= 22 ? ZOD_ESCORP.getMsnj() : ZOD_LIBRA.getMsnj();
        } else if (mes == 11) {
            return dia >= 21 ? ZOD_SAGIT.getMsnj(): ZOD_ESCORP.getMsnj();
        } else if (mes == 12) {
            return dia >= 21 ? ZOD_CAPRI.getMsnj() : ZOD_SAGIT.getMsnj();
        } else {
            return "Fecha no valida ";
        }
    }
}
