package exe01;

class Habitante {
    private double salario;
    private int numFilhos;

    public Habitante(double salario, int numFilhos) {
        this.salario = salario;
        this.numFilhos = numFilhos;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumFilhos() {
        return numFilhos;
    }
}
