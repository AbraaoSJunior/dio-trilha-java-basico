import java.util.concurrent.ThreadLocalRandom;
//simulador de valores aleatórios
public class ExemploWhile {
    
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;  //sem essa atribuição o valor pode dar negativo

            System.out.println("Doce de valor: " + valorDoce + " adicionado ao carrinho.");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces.");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }


}