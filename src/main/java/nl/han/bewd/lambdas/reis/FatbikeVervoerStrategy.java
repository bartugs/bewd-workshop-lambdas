package nl.han.bewd.lambdas.reis;

public class FatbikeVervoerStrategy implements VervoerStrategy  {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        return 20;
    }
}
