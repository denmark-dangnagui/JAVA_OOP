package stream;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Food {

    public enum Type {
        MEAT,
        FISH,
        OTHER
    }

    private final String name;
    private final boolean isVegetarian;
    private final int calories;
    private final Type type;

    public Food(String name, boolean isVegetarian, int calories, Type type) {
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public static void main(String[] args) {
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("FlatBread",true,400,Food.Type.OTHER));
        foodList.add(new Food("OnionSoup",true,300,Food.Type.OTHER));
        foodList.add(new Food("LobsterRisotto",false,520,Food.Type.FISH));
        foodList.add(new Food("CaesarSalad",true,200,Food.Type.OTHER));
        foodList.add(new Food("BeefWellington",false,670,Food.Type.MEAT));
        foodList.add(new Food("FiletMignon",false,600,Food.Type.MEAT));
        foodList.add(new Food("CrispySalmon",false,620,Food.Type.FISH));
        foodList.add(new Food("StripSteak",false,740,Food.Type.MEAT));
        foodList.add(new Food("SearedScallops",false,340,Food.Type.FISH));

        List<String> highCaloriesFoodName = foodList.stream()
                .filter(f -> f.getCalories() > 400)
                .map(Food::getName)
                .collect(Collectors.toList());

        System.out.println(highCaloriesFoodName);

    }
}