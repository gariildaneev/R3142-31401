public class Gun extends RealInnovation implements Shooter{
    public Gun(String name) {
        super(name);
    }
    public void forbidden(String what ){
        System.out.print(" ,когда нельзя уже было безнаказанно хвататься за" + what);
    }
    @Override
    public void shoot(Difficult Enum){
        System.out.println(" и палить в кого-попало");
    }
}
