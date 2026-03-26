package FactoryMethod;

public class MintCandy extends Candy {
	 @Override
	    public void prepare() {
	        System.out.println("Preparing mint candy...");
	    }

	    @Override
	    public void wrap() {
	        System.out.println("Wrapping mint candy...");
	    }
}
