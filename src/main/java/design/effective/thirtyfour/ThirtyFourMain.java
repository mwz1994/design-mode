package design.effective.thirtyfour;

public class ThirtyFourMain {

    public static void main(String[] args) {
        for (PlanetEnum p:PlanetEnum.values()){
            System.out.println(String.format("on %s , weight is %s ",p,p.surfaceWeight(10)));
        }
    }
}
