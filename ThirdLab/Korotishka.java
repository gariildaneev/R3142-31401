import java.lang.Object.*;
public class Korotishka implements ToLive {
    @Override
    public void live() {
    }

    private String name;
    public Korotishka(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getPeriod(Period Time) {

        switch(Time){
            case NOW:
                System.out.print(" теперь");
                break;
            case THATDAY:
                System.out.print(" в тот день");
                break;
            case SOON:
                System.out.print(" скоро");
                break;
            case FIRSTTIME:
                System.out.print(" впервые");
                break;
            case FINALLY:
                System.out.print(" наконец");
                break;
            case NONE:
                System.out.print("");
                break;
            case ASBEFORE:
                System.out.print(" по-прежнему");
                break;
        }
    }

}


