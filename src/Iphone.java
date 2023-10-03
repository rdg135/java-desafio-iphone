public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {
    public void tocar() {
        System.out.println("REPRODUZINDO PLAYER...");
    }

    public void pausar() {
        System.out.println("PLAYER PAUSADO");
    }

    public void selecionarMusica(String musica) {
        System.out.println("MÚSICA " + "SELECIONADA");
    }

    // Implementação para AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero + "...");
    }

    public void atender() {
        System.out.println("LIGAÇÃO ATENDIDA");
    }

    public void iniciarCorreioVoz() {
       System.out.println("INICIANDO CORREIO DE VOZ...");
    }

    // Implementação para NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba(String url) {
        System.out.println("NOVA ABA ADICIONADA...");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA...");
    }
}