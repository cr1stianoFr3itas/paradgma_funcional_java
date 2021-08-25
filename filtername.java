import java.lang.reflect.Array;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filtername {

    public static void imprimirname (String... nomes) {

        String nomesparaimprimir = "";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Joao")) {
                nomesparaimprimir += "" + nomes[i];
            }
        }

        System.out.println(nomesparaimprimir);

        String nomesparaimprimirStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining());

        System.out.println(nomesparaimprimirStream);

    }


    public static void main (String args[]){

        String[] nomes = {"Joao", "Paulo", "Pedro"};
        imprimirname(nomes);







    }
}
