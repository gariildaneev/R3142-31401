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

    @Override
    public String toString() {
        return this.name;
    }

}


