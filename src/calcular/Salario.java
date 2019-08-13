package calcular;

public class Salario {
    private int cantidadSalarios=0;
    private int acum=0;
    private int mayor=0;

    public Salario() {

    }

    public int getCantidadSalarios(){
        return cantidadSalarios;
    }

    public void setCantidadSalarios(int cantidadSalarios) {
        this.cantidadSalarios = cantidadSalarios;
    }

    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
}
