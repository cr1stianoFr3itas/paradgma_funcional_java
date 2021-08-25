
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



class fatorailmemorization {
          static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();


     public static Integer fatorailmemorization (Integer valor){
         if (valor == 1 ){
             return valor;
         } else {
            if (MAPA_FATORIAL.containsKey(valor)){
                return valor;
            } else {
                Integer resultado = valor * fatorailmemorization( valor -1);
                MAPA_FATORIAL.put(valor, resultado);
                return resultado;

            }
         }

     }
//    interface Funcao {
//        String gerar(String valor);
//       }

    public static void main (String args[]){

//        int[] valor = {1, 2, 3, 4};
//
//        Arrays.stream(valor)
//           .filter(numero -> numero % 2 == 0)
//           .map(numero -> numero * 2)
//                .forEach(numero -> System.out.println(valor + " " + numero));
//

//        Funcao funcao = valor -> {return valor;};
//        System.out.println(funcao.gerar("Cristiano"));

          long I, F;

          I = System.nanoTime();
          System.out.println(fatorailmemorization(15));
          F = System.nanoTime();
          System.out.println("F1" + (I-F));

         I = System.nanoTime();
         System.out.println(fatorailmemorization(15));
         F = System.nanoTime();
         System.out.println("F2" + (I-F));

    }

}
