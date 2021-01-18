public class UndefinedKorotishka extends Korotishka{
    public UndefinedKorotishka(String name) {
        super(name);
    }
    public void kickAndMakeDirt(){
        class Rifle extends Gun{
            public Rifle(String name) {
                super(name);
            }

            String flewOff(String what) {
                return what + " отлетела в угол, ";
            }
        }

        Rifle rifle = new Rifle("винтовка");
        System.out.print("  Пнув ногой " + rifle.getName() + " так, что " + rifle.flewOff("она"));
    }

    public void overturnChairs(Object what){
        System.out.print("и опрокинув " + what + ", ");
    }
    public void ranAwayFrom(Korotishka who, HappeningPlace fromWhere){
        System.out.print(who + " выбежал из " + fromWhere.getPlace());
    }
}
