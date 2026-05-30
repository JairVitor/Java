package Projetos.ControleRemoto;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
        tocando = false;
    }

    @Override
    public void maisVolume() {
        if (ligado && volume < 100) {
            volume += 5;
        }
    }

    @Override
    public void menosVolume() {
        if (ligado && volume > 0) {
            volume -= 5;
        }
    }

    @Override
    public void play() {
        if (ligado && !tocando) {
            tocando = true;
        }
    }

    @Override
    public void pause() {
        if (ligado && tocando) {
            tocando = false;
        }
    }
}