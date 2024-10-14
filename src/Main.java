
public class Main {
    public static void main(String[] args) {
        Planet p = new Planet();
        System.out.println(p.getNome());
        p.setNome("Terra");
        System.out.println(p.getNome());

    }
}
//Função set - atribui um valor ao campo correspondente
//Função get - retorna o valor ao campo correspondente
//Função field - evitar chamadas infinitas

