package abstracts;

import examples.Wrapper;
import interfaces.Item;
import interfaces.Packing;

public abstract class Burger implements Item {
    public Packing packing(){
        return new Wrapper();
    }
    public abstract float price();
}
