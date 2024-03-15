
package controle;
public class Apolice {
    
    private String nome,cidade;
    private int idade;
    private double premio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    public void calcularPremio(){
	if(idade>=18&&idade<=25) {
            premio+=(premio*20)/100;}
                
	else if(idade>25&&idade<=36) {//Joao tem um erro na escrita da questao, entao eu supôs que era pra ser 36.
            premio+=(premio*15)/100;}
		
        else if(idade>36) {
            premio+=(premio*10)/100;}
	}
    
    
    public void Desconto(){
	switch(cidade){
            
            case "São Paulo":
		premio-=premio*0.2;
            break;
            
            case "Rio de Janeiro":
		premio-=premio*0.15;
            break;
            
            case "Goiania":
		premio-=premio*0.1;
            break;
            
            case "Belo Horizonte":
            premio-=premio*0.05;
            break;
            
	default:
		}
	}
    
       public void imprimir(){
	System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Premio: "+premio);
        
	}
    
}
