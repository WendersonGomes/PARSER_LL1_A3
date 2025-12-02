import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Semantico implements Constants {
    // Add essas linhas para estruturas que vamos precisar
    Stack<Integer> Pilha = new Stack();
    Map<String, Integer> Variaveis_Valores;
    String Variavel_Atual;

    public Semantico() {
        this.Variaveis_Valores = new HashMap<>();
    }

    public void executeAction(int action, Token token) throws SemanticError {
        System.out.println("Ação #" + action + ", Token: " + token);
        Integer a, b;
        Scanner Entrada = new Scanner(System.in);
        // Switch criado para avaliar cada CASE (#Numero) que foi colocado na Semântida do GALS
        switch (action) {
            case 1 -> {
                Pilha.push(Variaveis_Valores.get(token.getLexeme()));
                System.out.println("Add Pilha: " + Variaveis_Valores.get(token.getLexeme()));
            }
            case 2 -> Pilha.push(Integer.parseInt(token.getLexeme()));
            case 3 -> {
                b = Pilha.pop();
                a = Pilha.pop();
                Pilha.push(a / b);
            }
            case 4 -> {
                b = Pilha.pop();
                a = Pilha.pop();
                Pilha.push(a * b);
            }
            case 5 -> {
                b = Pilha.pop();
                a = Pilha.pop();
                Pilha.push(a - b);
            }
            case 6 -> {
                b = Pilha.pop();
                a = Pilha.pop();
                Pilha.push(a + b);
            }
            case 7 -> Variaveis_Valores.put(Variavel_Atual, Pilha.pop());
            case 8 -> Variavel_Atual = token.getLexeme();
            case 9 -> System.out.println(token.getLexeme());// testar
            case 10 -> Variavel_Atual = token.getLexeme();
            case 11 -> {
                System.out.print("Digite um inteiro: ");
                Pilha.push(Entrada.nextInt());
                Variaveis_Valores.put(Variavel_Atual, Pilha.pop());
            }
            case 12 -> {
                int result = Pilha.pop();
                System.out.print("Resultado: " + result + "\n");
            } // System.out.print("Resultado: " + (Variaveis_Valores.get(Variavel_Atual)) + "\n");
            case 13 -> {
                Variavel_Atual = token.getLexeme();
                Variaveis_Valores.put(Variavel_Atual, 0);
            }
        }
    }
}
