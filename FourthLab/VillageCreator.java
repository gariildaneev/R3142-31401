public class VillageCreator {
    private String name;

    public VillageCreator(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void create(String split){
        if (split == ",") {
            System.out.print(name + ", ");
        }
        else if (split == "continue"){
            System.out.println(name + " и во многих других");
        }
        else if (split == "beginning"){
            System.out.print("деревне " + name + ", ");
        }
        else{
            System.out.print(name+" ");
        }
    }
}
