package calc;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Scanner;

class CalculadoraClient {

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        URL url = new URL("http://127.0.0.1:9876/calc?wsdl");
        QName qname = new QName("http://calc/","CalculadoraServerImplService");
        Service ws = Service.create(url, qname);
        CalculadoraServer calc = ws.getPort(CalculadoraServer.class);

        int opcao = 0;
        int n1, n2;
        do {
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.print(": ");
            opcao = scanner.nextInt();

            System.out.println("INSIRA OS VALORES");
            System.out.print("VALOR 01: ");
            n1 = scanner.nextInt();
            System.out.print("VALOR 02: ");
            n2 = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("ENCERRANDO ALGORITMO");
                    break;
                case 1:
                    System.out.println("Soma (" + n1 + "+" + n2 + "): "  + calc.soma(n1,n2));
                    break;
                case 2:
                    System.out.println("Subtracao (" + n1 + "-" + n2 + "): " + calc.subtracao(n1,n2));
                    break;
                case 3:
                    System.out.println("Multiplicacao (" + n1 + "*" + n2 + "): " + calc.multiplicacao(n1,n2));
                    break;
                case 4:
                    System.out.println("Divisao (" + n1 + "/" + n2 + "): " + calc.divisao(n1,n2));
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
            }
        } while (opcao != 0);
    }
}