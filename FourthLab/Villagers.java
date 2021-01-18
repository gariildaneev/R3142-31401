public class Villagers extends Korotishka{
    public Villagers(String name) {
        super(name);
    }

    public void beAbleToCome(String who, String toWhom, String str){
        System.out.println(who + "могли беспрепятственно приходить к " + toWhom + str);
    }

    public String collect(String what){
        return ("и получать" + what);

    }

}
