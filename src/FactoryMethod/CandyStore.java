package FactoryMethod;

public abstract class CandyStore {

    public Candy orderCandy(String type) {

        Candy candy = createCandy(type);

        candy.prepare();
        candy.wrap();

        return candy;
    }

    // FACTORY METHOD
    protected abstract Candy createCandy(String type);
}