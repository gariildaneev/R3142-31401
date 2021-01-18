public enum Period {
    THATDAY(" в тот день")
    ,NOW(" теперь")
    ,SOON("скоро")
    ,FIRSTTIME(" впервые")
    ,FINALLY(" наконец")
    ,NONE("")
    ,ASBEFORE(" по-прежнему");
    private final String time;
    Period(String time){
        this.time = time;
    }
    public void getPeriod(){
        System.out.print(time);
    }
}
