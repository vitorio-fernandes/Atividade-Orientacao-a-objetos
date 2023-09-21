package Models;
public class Smatphone extends Produto{

    float capBateria;

    Smatphone(float capBateria,float tamanhoTela, String fabricante){
        super(tamanhoTela, fabricante);
        this.capBateria = capBateria;

    }
    
    public void setCapBateria(float capBateria) {
        this.capBateria = capBateria;
    }


    public float getCapBateria() {
        return capBateria;
    }

    @Override
    public String toString() {
        return "Smatphone{" +
                "capacidade da Bateria=" + capBateria +
                ", Tamanho da Tela=" + tamanhoTela +
                ", Fabricante='" + fabricante + '\'' +
                '}';
    }

    
}
