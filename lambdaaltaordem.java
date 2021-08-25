public class lambdaaltaordem {

    public static int executaroperacao(Calculo calculo, int a , int b){
        return calculo.calcular(a,b);
    }

    public static void main(String args[]){

        Calculo SOMA = (a,b) -> a + b;
        Calculo DIV = (a,b) ->  a / b;
        Calculo MULT = (a,b) -> a * b;
        Calculo DIMI = (a,b) -> a - b;

        System.out.println(executaroperacao(SOMA,3,2 ));
        System.out.println(executaroperacao(DIV,3,2 ));
        System.out.println(executaroperacao(MULT,3,2 ));
        System.out.println(executaroperacao(DIMI,3,2 ));

    }


}

@FunctionalInterface
interface Calculo{
    public int calcular (int a, int b);
}
