package patterns.strategy;

public class Factory {

    public I3PL selectStrategy(String type) {

        switch (type) {
            case "Mochila": return new MochilaImp();
            case "Sinostar": return new SinostarImp();
        }

        return null;
    }
}
