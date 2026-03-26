package FactoryMethod;

public class Main {

    public static void main(String[] args) {

        CandyStore store = new DefaultCandyStore();

        store.orderCandy("chocolate");
        store.orderCandy("mint");
    }
}