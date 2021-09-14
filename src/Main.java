public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal Base");
        Morcego morcego = new Morcego("Bat");
        Mamifero mamifero = new Mamifero("Mamifero Base");
        Leao leao = new Leao("Simba");
        Baleia baleia = new Baleia("Free Willy");

        System.out.println(animal.getNome());
        System.out.println(morcego.getNumeroPatas());
        System.out.println(mamifero.getCaracteristica());
        System.out.println(leao.getAlimentoPreferido());
        System.out.println(baleia.getAmbiente());
    }
}
