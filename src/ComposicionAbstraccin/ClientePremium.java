package ComposicionAbstraccin;

public class ClientePremium implements Cliente{

    @Override
    public boolean esPremium() {
        return true;
    }
}

