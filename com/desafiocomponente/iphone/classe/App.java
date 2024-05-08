package com.desafiocomponente.iphone.classe;

public class App {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.tocar();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        meuIphone.ligar("1234-5678");
        meuIphone.selecionarMusica("Ave Maria");
        meuIphone.pausar();
        meuIphone.exibirPagina("https://www.exemplo.com");
        meuIphone.adicionarNovaAba("https://www.exemplo2.com");
        meuIphone.atualizarPagina();
    }
}
