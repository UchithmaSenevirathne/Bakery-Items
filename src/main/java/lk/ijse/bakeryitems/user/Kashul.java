package lk.ijse.bakeryitems.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.bakeryitems.dep.FoodItems;
import lk.ijse.bakeryitems.dep.Lover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Kashul {

    @Qualifier("extra chicken")
    private final FoodItems foodItems;

    @Autowired
    @Lover
    public Kashul(FoodItems foodItems) {
        this.foodItems = foodItems;
    }

    @PostConstruct
    public void init(){
        foodItems.foodLover();
    }
}
