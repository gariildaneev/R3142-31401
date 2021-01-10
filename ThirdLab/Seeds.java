public class Seeds extends RealInnovation{
    public Seeds(String name) {
        super(name);
    }
    public void getPeriod(Period Time) {
        switch(Time){
            case NOW:
                System.out.print("Теперь");
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

    public void plant(Period Time, String what){
        getPeriod(Time);
        System.out.print(what + " сажали не только в ");
    }
}
