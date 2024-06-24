package exe05;

class Produto {
    private int codigo;
    private double precoCusto;

    public Produto(int codigo, double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }
}
