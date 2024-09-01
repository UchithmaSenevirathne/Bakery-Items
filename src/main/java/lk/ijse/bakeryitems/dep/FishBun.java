package lk.ijse.bakeryitems.dep;

import org.springframework.stereotype.Component;

@Component
public class FishBun implements FoodItems{
    @Override
    public void foodLover() {
        System.out.println("fish bun");
    }
}
