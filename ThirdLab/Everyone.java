public class Everyone extends Korotishka{

    public Everyone(String name) {
        super(name);
    }
    public void understood(String who, Period Time, String what, String Case) {
        System.out.print(who);
        if (Case == "1") {
            getPeriod(Time);
            System.out.print(" поняли, что настала" + what);
        } else if (Case == "ясно") {
            getPeriod(Time);
            System.out.print("м стало " + Case);
        }
    }
    public void liveAsBefore(Period Time, Period Time2){
        System.out.print(", что");
        getPeriod(Time2);
        getPeriod(Time);
        System.out.println(" жить будет нельзя");

    }


    @Override
    public void live() {
        System.out.print("");
    }
}
