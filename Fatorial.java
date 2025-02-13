public class Fatorial {
   // Versão iterativa do cálculo de fatorial
   public static int calcularFatorialIterativo(int n) throws IllegalArgumentException {
      if(n < 0)
         throw new IllegalArgumentException("Não existe fatorial para números negativos!");
      int resultado = 1;

      if(n != 0) {
        for(int i = 2; i <= n; i++) 
          resultado *= i;
      }
        return resultado;
   }

}