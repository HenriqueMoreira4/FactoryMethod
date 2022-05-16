public class PinturaAutomotivaFactory {

    public CarroCor criarCarro(String carro) {
        if (carro == "" || carro == null) {
            return null;
        }
        if(carro.toUpperCase().equals("AMARELO")){
            return new CarroAmarelo();
        }else if(carro.toUpperCase().equals("VERDE")) {
            return new CarroVerde();
        }else if(carro.toUpperCase().equals("BRANCO")){
            return new CarroBranco();
        }else if(carro.toUpperCase().equals("AZUL")) {
            return new CarroAzul();
        }

        return null;
    }
}
