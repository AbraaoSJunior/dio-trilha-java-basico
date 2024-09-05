public class ResutadoEscolar {
//Condicional Composta
    public static void main(String[] args) {
        int nota = 7;

        if(nota >= 7)
           System.out.println("Aprovado");

         //Condicional Encadeada
        else if (nota >=5 && nota < 7)
           System.out.println("Prova recuperação");

        else
           System.out.println("Reprovado");
    }
    
}
