public enum Difficult {
    ESPECIALLY(" ,а в особенности на ")
    ,NONEEDTOSAY("Нечего и говорить, что ")
    ,ANDNOTTO(", а не то что ")
    ,NONE("")
    ,TOIMPLEMENT_THISPLAN("Чтоб осуществить этот план, ")
    ,OTHERWISE(" так как в противном случае ")
    ;
    private final String Enum;
    Difficult(String Enum){
        this.Enum = Enum;
    }
    public String getDifficult(){
        return Enum;
    }
}
