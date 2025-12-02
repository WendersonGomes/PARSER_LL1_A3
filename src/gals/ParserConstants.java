public interface ParserConstants
{
    int START_SYMBOL = 19;

    int FIRST_NON_TERMINAL    = 19;
    int FIRST_SEMANTIC_ACTION = 36;

    int[][] PARSER_TABLE =
    {
        { -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3,  2, -1, -1 },
        {  5, -1,  4,  4,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        {  7, -1,  6,  6,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  8,  9, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 13, 13, 12, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 16, 16, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 19, 17, 18, -1, -1, -1, 19, -1, -1, -1 },
        { -1, -1, -1, -1, 20, 20, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 23, 23, 23, 21, 22, -1, 23, -1, -1, -1 },
        { -1, -1, -1, -1, 26, 25, -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27 },
        { 30, -1, 30, 30, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        {  2, 34, 20, 15, 35, 22 },
        {  5, 49, 21 },
        { 16, 34,  5, 49, 21 },
        {  0 },
        { 24, 23 },
        {  0 },
        { 24, 23 },
        {  0 },
        { 25 },
        { 27 },
        { 28 },
        {  3,  8, 26,  9, 15, 35 },
        {  7, 45 },
        { 29, 48 },
        {  4,  8,  5, 46,  9, 15, 47, 35 },
        {  5, 44, 14, 29, 15, 43, 35 },
        { 31, 30 },
        { 10, 31, 42, 30 },
        { 11, 31, 41, 30 },
        {  0 },
        { 33, 32 },
        { 12, 33, 40, 32 },
        { 13, 33, 39, 32 },
        {  0 },
        {  8, 29,  9 },
        {  6, 38 },
        {  5, 37 },
        { 18, 34 },
        {  0 },
        { 17, 35 },
        {  0 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado PLV_RESER_DECL",
        "Era esperado PLV_RESER_IMPR",
        "Era esperado PLV_RESER_PEGA",
        "Era esperado IDENTIFICADOR",
        "Era esperado NUM_INTEIRO",
        "Era esperado STRING",
        "Era esperado DELIMITADOR_O",
        "Era esperado DELIMITADOR_C",
        "Era esperado SOMA",
        "Era esperado SUBT",
        "Era esperado MULT",
        "Era esperado DIVI",
        "Era esperado ATRIBUICAO",
        "Era esperado PONT_VIRG",
        "Era esperado VIRGULA",
        "Era esperado ORGANIZADOR_Linha",
        "Era esperado ORGANIZADOR_Espaco",
        "<Inicio> inválido",
        "<Variaveis> inválido",
        "<VariaveisRest> inválido",
        "<Sequencia> inválido",
        "<SequenciaRest> inválido",
        "<Comando> inválido",
        "<CmdPrint> inválido",
        "<CmdPrintConteudo> inválido",
        "<CmdScan> inválido",
        "<CmdAtrib> inválido",
        "<Expr> inválido",
        "<ExprRest> inválido",
        "<Term> inválido",
        "<TermRest> inválido",
        "<Fator> inválido",
        "<Espaco> inválido",
        "<Quebra_L> inválido"
    };
}
