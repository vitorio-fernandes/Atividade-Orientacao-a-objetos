package Models;

public class Televisao extends Produto {
    String tipoControle;
    
    Televisao(float tamanhoTela, String fabricante, String tipoControle){
        super(tamanhoTela, fabricante);
        this.tipoControle = tipoControle;
        
    }

    public void setTipoControle(String tipoControle) {
        this.tipoControle = tipoControle;
    }
    
    public String getTipoControle() {
        return tipoControle;
    }

    @Override
    public String toString() {
        return "Televisao{" + "Tipo de Controle=" + tipoControle + ", Tamanho Tela=" + tamanhoTela + ", Fabricante=" + fabricante + '}';
    }
}
