public class Lunatiki extends Korotishka{
    public Lunatiki(String name) {
        super(name);
    }
    public void get(String what){
        System.out.print(getName() + " получали " + what);
    }
    public void getMore(String what){
        System.out.print(" а так же " + what);
    }
    public void wereExplained(String str){
        System.out.println(" и им обьяснили, как всем этим пользоваться," + str);
    }
    public String toDefend(String who){
        return (" чтобы защититься от " + who);
    }
}
