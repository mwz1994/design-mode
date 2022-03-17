package basic.action.c2;

import basic.action.c1.Apple;
import basic.action.c1.Color;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
