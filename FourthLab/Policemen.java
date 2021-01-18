public class Policemen extends Korotishka implements Shooter{
    public Policemen(String name) {
        super(name);
    }

    public void watch(String what, Period Time){
        System.out.print(", которые смотрели");
        Time.getPeriod();
        System.out.println(what);
    }

    public void afraid(Difficult Enum,String who,Period Time, String str){
        System.out.print(Enum.getDifficult() + who + " боялись");
        Time.getPeriod();
        System.out.print(" и близко" + str);
    }

    public String comeTo(String where){
        return(" подходить к" + where);
    }
    public String beAbleToInterfere(Korotishka who,Difficult start){
        return (start.getDifficult() + who + " могут помешать им");
    }
    public void beAbleToKickAway(HappeningPlace fromWhere){
        System.out.println(" или вовсе прогонят их "+ fromWhere.getPlace());
    }

    @Override
    public void shoot(Difficult Enum){
        System.out.println(Enum.getDifficult() + "стрелять возле неё");
    }
}
