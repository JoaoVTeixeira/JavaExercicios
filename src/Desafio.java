import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cliente = "Joao";
        String tipoConta = "Corrente";
        double saldo = 0;
        int opc = 0;
        double valor;
        String menu = """
                    Digite sua opção:
                    
                    1-Consultar
                    2-Transferir Valor
                    3-Receber Valor
                    9-Sair
                """;


        System.out.println("**********************");
        System.out.println("\nNome do Cliente = " + cliente);
        System.out.println("Tipo de conta = " + tipoConta);
        System.out.println("Saldo Atual = " + saldo);
        System.out.println("\n**********************");

        while(opc != 9){

            System.out.println("\n" + menu);
            opc = sc.nextInt();

            if(opc == 1){
                System.out.println("O saldo atual é de : " + saldo);
            }else if(opc == 2){
                System.out.println("Qual o valor que deseja transferir?");
                valor = sc.nextDouble();
                if (valor > saldo){
                    System.out.println("Quantia inválida, Favor escolher quantia menor que o seu saldo.");
                }else{
                    System.out.println("Quantia transferida com sucesso.");
                    saldo -= valor;
                }
            }else if (opc == 3){
                System.out.println("Qual o valor que deseja depositar?");
                valor = sc.nextDouble();
                if (valor>0){
                    saldo += valor;
                    System.out.println("Quantia depositada com sucesso. Seu saldo atual é de : " +saldo);
                }else {
                    System.out.println("Valor inválido, insira um numero positivo e maior que 0.");
                }
            }else if(opc != 9){
                System.out.println("Opção inválida");
            }

        }



    }


}
