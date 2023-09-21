package Models;
public abstract class Produto {
    float tamanhoTela;
    String fabricante;

    Produto(float tamanho, String fabricante){
        this.fabricante = fabricante;
        this.tamanhoTela = tamanho;
    }


    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getFabricante() {
        return fabricante;
    }
    public float getTamanhoTela() {
        return tamanhoTela;
    }

    @Override

    public String toString() {
        return "Produto{" +
                "tamanhoTela=" + tamanhoTela +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
