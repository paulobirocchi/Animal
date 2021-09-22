public class Main {

    public static void main(String[] args) {
        Morcego morcego = new Morcego("Bat");
        Mamifero mamifero = new Mamifero("Mamifero Base");
        Leao leao = new Leao("Simba");
        Baleia baleia = new Baleia("Free Willy");

        
        System.out.println(morcego.getNumeroPatas());
        System.out.println(mamifero.getCaracteristica());
        System.out.println(leao.getAlimentoPreferido());
        System.out.println(baleia.getAmbiente());
    }
}
