public class IPhone extends AparelhoTelefonico implements AparelhoMusica, NavegadorInternet{
    private String modeloString;

    @Override
    public void ligar(String numero){
        System.out.println("Ligando para" + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioEletronico(){
        System.out.println("Reproduzindo mensagem");
    }

    @Override
    public void tocar(){
        System.out.println("Tocando agora...");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando música.");
    }

    @Override
    public void novaAba(){
        System.out.println("Nova aba aberta.");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Página atualizada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(".()");
    }

    @Override
    public void exibirPagina(String urlString) {
        System.out.println(".()");
    }
}
