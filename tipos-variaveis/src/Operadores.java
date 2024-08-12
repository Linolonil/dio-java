public class Operadores {
        public static void main(String[] args) throws Exception {
            String nome1 = "Lino";
            String nome2 = new String("Jorge") ;

            System.out.println(nome1.equals(nome2));
            //                                ^  compara mesmo sendo uma função chamada
    
            int numero1 = 1;
            int numero2 = 2;
    
            boolean simNao = numero1 < numero2;
    
            System.out.println("numero um e igual o numero dois? " + simNao);
            
            simNao = numero1 == numero2 && numero1 < numero2;
            
            System.out.println("numero um e igual o numero dois? " + simNao);
        }

}
