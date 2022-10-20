package pkg1;

public class Road_Toll {

    String type;
    int tires;
    public Road_Toll() {
        System.out.println("the 1st constructor is excuted!");
    }

    public Road_Toll(String type, int tires) {
        this.type = type;
        this.tires = tires;
        System.out.println("the 2nd constructor is excuted!");
    }


    public void tollAmount() {
        if ( tires == 2 ) {
            System.out.println("The toll amount is $0");
        } else if ( tires == 4 ) {
            System.out.println("The toll amount is $10");
        } else if ( tires > 4 ){
            System.out.println("The toll amount is $20");
        } else {
            System.out.println("incorrect tire count!!");
        }
    }

}
