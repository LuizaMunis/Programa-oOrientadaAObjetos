
package br.com.controle;

public class Estudante extends Pessoa{
    
    private int escolha;
    private double media;
    private String estatuto;

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void escolher(){
        
        switch(escolha){
            case 1:
                estatuto ="Especial";
                break;
                
            case 2:
                estatuto ="Integral";
                break;
                
            case 3:
                estatuto ="Parcial";
                break;   
                
            default:
                estatuto = "Desconhecido";    
                
                }
    }
    
    public String Estatutos(){
    return estatuto;
    }
    
    public double media(){
    return this.media;
    }
}
