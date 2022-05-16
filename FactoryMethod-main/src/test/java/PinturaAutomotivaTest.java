import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PinturaAutomotivaTest {

    @Test
    void testeCarroCorAmarelo() {
        PinturaAutomotivaFactory corCarro = new PinturaAutomotivaFactory();
        CarroCor meuCarro = corCarro.criarCarro("amarelo");
        assertEquals("Criado um carro amarelo", meuCarro.criarCarro());
    }

    @Test
    void testeCarroCorVerde() {
        PinturaAutomotivaFactory corCarro = new PinturaAutomotivaFactory();
        CarroCor meuCarro = corCarro.criarCarro("verde");
        assertEquals("Criado um carro na cor verde", meuCarro.criarCarro());
    }
    @Test
    void testeCarroCorBranca() {
        PinturaAutomotivaFactory corCarro = new PinturaAutomotivaFactory();
        CarroCor meuCarro = corCarro.criarCarro("branco");
        assertEquals("Criado um carro branco", meuCarro.criarCarro());
    }

    @Test
    void testeCarroCorAzul() {
        PinturaAutomotivaFactory corCarro = new PinturaAutomotivaFactory();
        CarroCor meuCarro = corCarro.criarCarro("azul");
        assertEquals("Criado um carro na cor azul", meuCarro.criarCarro());
    }

}


