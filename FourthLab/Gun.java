public class Gun extends RealInnovation implements Shooter{
    public Gun(String name) {
        super(name);
    }
    public void forbidden(String what ){
        System.out.print(" ,когда нельзя уже было безнаказанно хвататься за" + what);
    }
    /*public String flewOff(){
        class Rifle {
            String name;
            Rifle(String name){
                this.name = name;}


        }
    }*/
    @Override
    public void shoot(Difficult Enum){
        System.out.println(" и палить в кого-попало");
    }
}
