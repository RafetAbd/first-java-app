package pkg1;

public class Road_Toll_main {
    public static void main(String[] args) {

        Road_Toll rt1 = new Road_Toll();
        rt1.type = "sedan";
        rt1.tires = 4;
        rt1.tollAmount();

        Road_Toll rt2 = new Road_Toll("bike", 2);
        rt2.tollAmount();
    }
}
