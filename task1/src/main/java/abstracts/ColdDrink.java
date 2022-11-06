package abstracts;

import examples.Bottle;
import interfaces.Item;
import interfaces.Packing;

public abstract class ColdDrink implements Item {
      public Packing packing(){
          return new Bottle();
    }
    public abstract float price();

}
