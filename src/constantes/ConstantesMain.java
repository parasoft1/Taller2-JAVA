package constantes;

public enum ConstantesMain {

    MENU_MASA("1: Masa corporal"),
    MENU_ZODIACO("2: Zodiaco"),
    MENU_SALARIO("3: Salario"),
    MENU_VECTOR("4: Vector"),
    MENU_SALIDA("0: Salida."),
    MENU_EXIT("Hasta Luego"),
    IMC_ALTURA("cual es su altura?"),
    IMC_PESO("cual es su peso?"),
    IMC_SALIDA("su IMC es: "),
    IMC1("delgadez muy severa"),
    IMC2("delgadez severa"),
    IMC3("delgadez "),
    IMC4("peso saludable"),
    IMC5("sobrepeso"),
    IMC6("obesidad moderada"),
    IMC7("obesidad severa"),
    IMC8("obesidad muy severa"),
    VEC_INGRE("cantidad de datos ingresados: "),
    VEC_POSIT("promedio de numeros positivos : "),
    VEC_NEG("promedio de numeros negativos : "),
    VEC_VAL("ingrese el valor"),
    VEC_CANT_NUM("cuantos numeros desea ingresar?"),
    ZOD_SIGNO("Su signo zodiacal es : "),
    ZOD_DIA("Ingerese el Dia: "),
    ZOD_MES("Ingerese el Mes: "),
    ZOD_CAPRI("Capricornio"),
    ZOD_ACUA("Acuario"),
    ZOD_PISCIS("Piscis"),
    ZOD_ARIES("Aries"),
    ZOD_TAURO("Tauro"),
    ZOD_GEMINIS("Géminis"),
    ZOD_CANCER("Cáncer"),
    ZOD_LEO("Leo"),
    ZOD_VIRGO("Virgo"),
    ZOD_LIBRA("Libra"),
    ZOD_ESCORP("Escorpio"),
    ZOD_SAGIT("Sagitario"),
    SALPREG("Desea Ingreasr un Salario?: "),
    SALINGRE("Salario a Ingresar"),
    SALMAYOR("Salario mayor: " ),
    SALACUM("Salario acumulado: "),
    SALPROM("Salario Promedio: "),
    SALTOTAL("Total de Salarios: ");

    private String msnj;

    ConstantesMain(String msnj)
    {
        this.msnj = msnj;
    }

    public String getMsnj()
    {
        return msnj;
    }
}
