import java.util.Scanner;

public class App {
    /* Faça um programa que receba uma quantidade indeterminada
     * de valores, calcule e mostre:
     * a quantidade de valores positivos, negativos e % deles
     */
    public static void main(String[] args) throws Exception {
        int valorLido,contPositivos=0,contNegativos=0,contZeros=0,
        porcentagemPositivos, porcentagemNegativos;
        String resposta=new String();// = "";
        String numerosPositivosDigitados = new String();
        String numerosNegativosDigitados = new String();
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número:");
            valorLido = teclado.nextInt();
            System.out.println("Deseja digitar outro número? S[Sim], N(Não)");
            resposta = teclado.next();
            if(valorLido>0) {
                contPositivos++;
                numerosPositivosDigitados+=valorLido+" | ";
            }
            else if (valorLido<0) {
                contNegativos++;
                numerosNegativosDigitados+=valorLido+" | ";
            }
            else contZeros++;
        } while (resposta.equalsIgnoreCase("s")); //(valorLido!=9999); 
        System.out.println("Quantidade de números positivos:"+contPositivos);
        System.out.println("Quantidade de números negativos:"+contNegativos);
        int totalValores = contNegativos+contPositivos+contZeros;
        porcentagemNegativos = contNegativos*100/totalValores;
        porcentagemPositivos = contPositivos*100/totalValores;
        System.out.println("Porcentagem de números positivos:"+porcentagemPositivos);
        System.out.println("Porcentagem de números negativos:"+porcentagemNegativos);
        System.out.println("Os números positivos digitados foram:"
        +numerosPositivosDigitados);
        System.out.println("Os números negativos digitados foram:"
        +numerosNegativosDigitados);
    }
}
