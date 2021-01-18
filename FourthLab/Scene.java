public class Scene {
    private String name;
    private Difficult Enum;
    public Scene(String name,Difficult Enum){
        this.name = name;
        this.Enum = Enum;
    }
public String getName(){
    return name;
    }
public void impressed(String who, String who2){
    System.out.print(getName() + "произвела впечатление на " + who);
    getEnum();
    System.out.print(who2);
    }
    public void getEnum() {
        switch(Enum){
            case ESPECIALLY:
                System.out.print(" ,а в особенности на ");
                break;
            case NONEEDTOSAY:
                System.out.print(" Нечего и говорить, что");
                break;
        }
    }

}