

// @author caua_marinho
/*Implemente uma classe PopulacaoBaratas que simule o crescimento de uma população
de baratas. O construtor recebe o tamanho da população inicial de baratas. O método
dobrarPopulacao simula um período durante o qual a população dobra. O método
sprayVeneno pulveriza as baratas com inseticida, o que reduz a população em 10%. O
método obterBaratas devolve o número atual de baratas. Implemente a classe e um
programa de teste que simule uma cozinha que começa com 10 baratas. Espere, use o
inseticida e imprima a contagem de baratas. Repita a operação três vezes.*/
package populacaobaratas;
public class PopulacaoBaratas{
    private int PopulaçãoInicial, PopulacaoTotal;
     
    public PopulacaoBaratas(int PopulaçãoInicial){
        this.PopulaçãoInicial = PopulaçãoInicial;
    }
    public void baratas(int PopulaçãoInicial){
        PopulacaoTotal = PopulaçãoInicial;
    }
    public void dobrarPopulacao(){
        PopulacaoTotal = (PopulaçãoInicial * 2);
    }
    public void sprayVeneno(){
       PopulacaoTotal -= PopulacaoTotal * 10/100;        
    }
    public void obterBaratas(){
        System.out.println("O total de baratas atualmente é: "+PopulacaoTotal);
    } 
    public static void main(String[] args) {
        System.out.println("Cozinha...");
        PopulacaoBaratas populacao = new PopulacaoBaratas(10);
        populacao.dobrarPopulacao();
        System.out.println("A população de baratas em sua cozinha dobrou!");
        populacao.obterBaratas();
        System.out.println("Usando inseticida para matar baratas!");
        populacao.sprayVeneno();
        populacao.obterBaratas();
        //novamente
        System.out.println("Usando inseticida novamente!");
        populacao.sprayVeneno();
        populacao.obterBaratas();
        //Ultima vez
        System.out.println("Usando inseticida mais uma vez!");
        populacao.sprayVeneno();
        populacao.obterBaratas();
        System.out.println("Os inseticidas acabaram!!! ._. ");
    }
    
}
