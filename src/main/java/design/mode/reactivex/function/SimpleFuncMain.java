package design.mode.reactivex.function;

public class SimpleFuncMain {

    interface Body{
        String lowwer(String low);
    }

    interface Printer{
        String print(String num);
    }

    interface MultiPrinter{
        String multiPrint(String left,String right);
    }

    static MultiPrinter multiPrinter = (x,y)->x+" and "+y;

    static Body bod=h->h.toLowerCase();

    static Printer printerA = (String p)->"lambada print : "+p;

    static Printer printerB = new Printer() {
        @Override
        public String print(String str) {
            return "implement print : "+str;
        }
    };

    public static void main(String[] args) {
        System.out.println(bod.lowwer("OH MY JUICE!"));
        System.out.println(printerA.print("Printer A"));
        System.out.println(printerB.print("Printer B"));
        System.out.println(multiPrinter.multiPrint("water","book"));
    }
}
