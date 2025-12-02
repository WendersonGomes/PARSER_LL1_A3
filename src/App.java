public class App {
    public static void main(String[] args) throws Exception {
        try {
            // Alterar arquivo do Léxico (torna ele mais simples para reconhecer toda a
            // STRING de entrada;
            // Construir a Semântica - Enumerar Semantica, para alguns cases, após
            // reconhecer o ";" - como case #7, por exemplo
            // 1° Passo: Colocar entrada para passar pela Análise Léxica
            Lexico Analise_Lexica;

            Analise_Lexica = new Lexico("""
                    int n1, n2, resultado;
                    printf("Coloque os 2 números a serem calculados:");
                    scanf(n1);
                    scanf(n2);
                    resultado=n1+n2;
                    printf(resultado);
                    """);

            // 2° Passo: Criar objetos de Sintatica e Semantica e mandar rodar, após Léxico
            // ok!
            Sintatico Analise_Sintatica = new Sintatico();
            Semantico Analise_Semantica = new Semantico();
            Analise_Sintatica.parse(Analise_Lexica, Analise_Semantica);
        } catch (LexicalError | SyntaticError | SemanticError Erro) {
            System.out.println("Comando não identificado.\nErro: " + Erro);
        }
    }
}