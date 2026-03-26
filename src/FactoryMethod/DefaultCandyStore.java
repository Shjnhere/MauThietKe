package FactoryMethod;

public class DefaultCandyStore extends CandyStore {

    @Override
    protected Candy createCandy(String type) {

        if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCandy();
        } 
        else if (type.equalsIgnoreCase("mint")) {
            return new MintCandy();
        }

        throw new IllegalArgumentException("Unknown candy type");
    }
}
