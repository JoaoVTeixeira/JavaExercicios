public class Condicional {

    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaFilme = 8.1;
        String tipoPlano = "Not";

        if(anoDeLancamento>=2022){
            System.out.println("Lançamento!");
        }else {
            System.out.println("Filme antigo...");
        }

        if (incluidoNoPlano && tipoPlano.equals("Plus")){
            System.out.println("Pode assistir!");
        }else {
            System.out.println("Assine o Plus ou faça o aluguel!");
        }
    }

}
