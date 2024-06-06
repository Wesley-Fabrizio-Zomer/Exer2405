import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
       Scanner valordigitado = new Scanner(System.in);
       double volume = 3.14159;
       System.out.println(" Digite o valor de Raio do uma lata de óleo");
       double raio = valordigitado.nextDouble();
       System.out.println(" Digite o valor da altura da lata do óleo");
       Double altura= valordigitado.nextDouble();
       System.out.println("O Resultado é:" +volume*raio*raio*altura);


   }
}