package lk.ijse.bakeryitems.dep;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements FoodItems{
    @Override
    public void foodLover() {
        System.out.println("fish pastry");
    }
}
