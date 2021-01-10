public class Policemen extends Korotishka implements Shooter{
    public Policemen(String name) {
        super(name);
    }

    public void getDifficult(Difficult Enum) {
        switch(Enum){
            case ESPECIALLY:
                System.out.print(" ,а в особенности на ");
                break;
            case NONEEDTOSAY:
                System.out.print("Нечего и говорить, что ");
                break;
            case ANDNOTTO:
                System.out.print(", а не то что ");
                break;
        }
    }

    public void watch(String what, Period Time){
        System.out.print(", которые смотрели");
        getPeriod(Time);
        System.out.println(what);
    }

    public void afraid(Difficult Enum,String who,Period Time, String str){
        getDifficult(Enum);
        System.out.print(who + " боялись");
        getPeriod(Time);
        System.out.print(" и близко" + str);
    }

    public String comeTo(String where){
        return(" подходить к" + where);
    }

    @Override
    public void shoot(Difficult Enum){
        getDifficult(Enum);
        System.out.println("стрелять возле неё");
    }
}
