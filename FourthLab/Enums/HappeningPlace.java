public enum HappeningPlace {
    TV_PAVILION("телевизионного павильона."),
    FACTORY("на фабрике"),
    FROMFACTORY("с фабрики"),
    ZEROGRAVITY_COND(" в состоянии невесомости");
    private final String place;
    HappeningPlace(String place){
        this.place = place;
    }
    public String getPlace(){
        return place;
    }
}
