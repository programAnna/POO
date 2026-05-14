public class Circulo implements from formaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public int quantidadeArestas() {
        return 0; // círculo não possui arestas
    }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}
