public class Morcego extends Mamifero{

    String envergadura;

    public Morcego(String nome) {
        super(nome);

        this.comprimento="8 cm";
        this.ambiente = "Aéreo/Terrestre";
        this.numeroPatas="2";
        this.cor="Cinza";
        this.velocidade="160 km/h";
        this.caracteristica="Unico mamifero que voa";
        this.alimentoPreferido="Frutos/Insetos/Sangue";
        envergadura="50 cm";


    }
    public void voar(){}
}
