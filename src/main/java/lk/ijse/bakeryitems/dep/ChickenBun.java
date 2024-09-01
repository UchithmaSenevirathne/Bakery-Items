package lk.ijse.bakeryitems.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("extra chicken")
public class ChickenBun implements FoodItems{
    @Override
    public void foodLover() {
        System.out.println("chicken bun");
    }
}
