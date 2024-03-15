
package controle;

public class Urna {
    private int matricula;
    private int contadorVotos = 0;
    private int voto;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
        contadorVotos++;
    }
    
     public int contador() {
        return contadorVotos;
    }
     
     public int Votar(int voto){
     return 0;
         }
}