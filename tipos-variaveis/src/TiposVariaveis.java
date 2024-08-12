public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos
        // estudem a classe string que representa texto na aplicação
        String lino = "Lino Jorge";
        System.out.println(lino);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // ^ casting

        final double pi = 3.14;
        // ^ faz a variavel ficar constant imutavel

        System.out.println(pi);
        System.out.println(numeroCurto2);

    }
}
