package lk.ijse.bakeryitems.dep;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("extra chicken")
@Lover
public class ChickenRoll implements FoodItems{
    @Override
    public void foodLover() {
        System.out.println("chicken roll");
    }
}
