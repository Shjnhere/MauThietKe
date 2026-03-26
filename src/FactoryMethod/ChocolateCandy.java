package FactoryMethod;

public class ChocolateCandy extends Candy {
	@Override
    public void prepare() {
        System.out.println("Preparing chocolate candy...");
    }

    @Override
    public void wrap() {
        System.out.println("Wrapping chocolate candy...");
    }
}
