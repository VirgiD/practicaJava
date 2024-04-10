package ComposicionAbstraccin;

public class ClienteRegular implements Cliente{
    @Override
    public boolean esPremium() {
        return false;
    }
}

