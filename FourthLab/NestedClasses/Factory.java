import java.util.Arrays;
import java.util.List;

public class Factory {
    private String name;
    public Factory(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Worker extends Korotishka {
        public Worker(String name) {
            super(name);
        }
        public void arrive(Period Time,Korotishka toWhom, Worker who,Factory from,Korotishka whoS){
            Time.getPeriod();
            System.out.println(" к "+ toWhom + "прибыли несколько " + who +" c "+ from + whoS + "a");
        }

        public void say(String str){
            System.out.print("Они сказали, что " + str);
        }

        public String decideToKick(Factory fromWhere, Korotishka who){
            return "решили прогнать с " + fromWhere + who + "a";
        }

        public void doNoodle(ProducedProducts what){
            System.out.println(", а "+what+" будут делать сами без всяких хозяев");
        }

        public void makeZeroGravity(Difficult start,HappeningPlace where,String str){
            System.out.print(start.getDifficult() + "им нужно устроить " + where.getPlace() + " невесомость," + str);
        }

        public void gotStuff(Korotishka who, RealInnovation what,RealInnovation what2){
            System.out.print("Получив от " + who + what.getName() + " и достаточное количество " + what2.getName() + "a, ");
        }
        public void strengthen(Worker who,HappeningPlace where){
            System.out.print(who.getName() + " укрепили " + where.getPlace());
        }
    }

    public class ProducedProducts extends Object{
        public ProducedProducts(String name) {
            super(name);
        }
        public void haveBeenStrengthen()throws LazyWorkersException{
            if(Math.random()<0.7) {
                for (int i = 0; i < manyProducts.size(); i++) {
                    System.out.print(manyProducts.get(i));
                }
            }else {
                throw new LazyWorkersException("...а ничего они собственно не укрепили");
            }
        }
        public void canFunction(HappeningPlace condition){
            System.out.println(", чтобы все эти " + mechanisms + " могли работать" + condition.getPlace());
        }

        public void haveNoWeight(ProducedProducts what,ProducedProducts whatElse,Period when){
            System.out.print("Ни " + what + ",ни " + whatElse);
            when.getPeriod();
            System.out.print(" ничего не весили, ");
        }
        public void ultraEffectiveness(ProducedProducts what, HappeningPlace where){
            System.out.println(what + " же" + where.getPlace() + " работали во много раз быстрее");
        }
    }
    @Override
    public String toString() {
        return this.name;
    }
    ProducedProducts stanki = new ProducedProducts(" все станки для раскатки теста,\n");
    ProducedProducts mesilki = new ProducedProducts("макаронные и вермишельные месилки,");
    ProducedProducts dryers = new ProducedProducts(" сушилки,");
    ProducedProducts steemers = new ProducedProducts(" парилки,");
    ProducedProducts mashers = new ProducedProducts(" прессы");
    ProducedProducts furnaces = new ProducedProducts(" и печи");
    ProducedProducts mechanisms = new ProducedProducts("механизмы");


    List<Factory.ProducedProducts> manyProducts = Arrays.asList(stanki,mesilki,dryers,steemers,mashers,furnaces);

    ProducedProducts noodle = new ProducedProducts("макароны");
    ProducedProducts flour = new ProducedProducts("мука");
    ProducedProducts noodleDough = new ProducedProducts("макаронное тесто");

}
