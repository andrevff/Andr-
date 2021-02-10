/*Arrays unidimensionais, ou VETORES, são uma forma de organizar vários 
  elementos de um mesmo tipo em um mesmo conjunto, que pode ser acessado por 
  meio de um ídice. Os arrays multidimensionais, ou MATRIZES, são parecidos com
  o vetor, porém permite acessar mais de uma dimensão por meio de variados índices,
  relacionando uma informação com outra.
 */
package questao03;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Exemplo de vetor
        int[] votos = new int [4];
        
        System.out.println("Informe a quantidade de votos no candidato por bairro: "); 
        for(int i = 0; i < 4; i++){
            votos[i] = entrada.nextInt();
        }
        
        for(int i = 0; i < 4; i++){
            System.out.println("Bairro " + (i+1) + ": " +votos[i]);
        }
        
        
        //Exemplo de Matriz
        int[][] votos2 = new int [3][4];
        
        for(int i = 0; i < 3; i++){
            System.out.println("Informe a quantidade de votos no cadidato " + (i+1) + " por bairro: ");
            for(int j = 0; j < 4; j++){
                votos2[i][j] = entrada.nextInt();
            }
        }
        
        for(int i = 0; i < 3; i++){
                System.out.println("");
                System.out.println("Candidato " +(i+1));
            for(int j = 0; j < 4; j++){
                    System.out.println("Bairro " + (j+1) + ": " +votos2[i][j]);
            }
        }
        
    }
    
}
