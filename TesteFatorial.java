public class TesteFatorial { 
   
   public static void main(String [] args) {
        Fatorial fatorial = new Fatorial();
        int resultado = fatorial.calcularFatorialIterativo(0);
        System.out.println(resultado);

        resultado = fatorial.calcularFatorialIterativo(4);
        System.out.println(resultado);
   }

}