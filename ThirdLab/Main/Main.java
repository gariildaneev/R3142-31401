public class Main {

    public static void main(String[] args) {
        

        Scene scene = new Scene("Эта сцена ",Difficult.ESPECIALLY);
        Televiewer televiewers = new Televiewer("Телезрители");
        Policemen policemen = new Policemen("менты");
        Object telecast = new Object(" передача");
        Object date = new Object(" пора");
        Gun gun = new Gun(" оружие");
        RealInnovation rocket = new RealInnovation(" ракета");
        RealInnovation weightlessnessDevices = new RealInnovation("приборы невесомости");
        RealInnovation antiLunit = new RealInnovation("антилунит");
        Everyone everyone = new Everyone("Все");
        Korotishka spacemen = new Korotishka("космонавты");
        Lunatiki lunatiki = new Lunatiki("лунатики");
        Villagers villagers = new Villagers("Деревенские жители ");
        Seeds seeds = new Seeds("семена");
        Seeds giantPlantSeeds = new Seeds(" семена гигантских растений");
        VillageCreator village = new VillageCreator("деревня");
        VillageCreator neelovka = new VillageCreator("Нееловка");
        VillageCreator golopyatkino = new VillageCreator("Голопяткино");
        VillageCreator beshlebovo = new VillageCreator("Бесхлебово");
        VillageCreator golodayevka = new VillageCreator("Голодаевка");
        VillageCreator neprolaznoye = new VillageCreator("Непролазное");
        Znayka znayka = new Znayka("Знайка ");


        scene.impressed(televiewers.getName(), policemen.getName());
        policemen.watch(telecast.getName(), Period.THATDAY);

        everyone.understood(everyone.getName(), Period.FIRSTTIME, date.getName(), "1");
        gun.forbidden(gun.getName());
        gun.shoot(Difficult.NONE);

        everyone.understood(everyone.getName(), Period.NONE, "", "ясно");
        everyone.liveAsBefore(Period.ASBEFORE, Period.SOON);

        policemen.afraid(Difficult.NONEEDTOSAY, policemen.getName(), Period.NOW, policemen.comeTo(rocket.getName()));
        policemen.shoot(Difficult.ANDNOTTO);

        villagers.beAbleToCome(villagers.getName(), spacemen.getName(), villagers.collect(giantPlantSeeds.getName()));

        giantPlantSeeds.plant(Period.NOW, giantPlantSeeds.getName());
        village.create(" ");
        neelovka.create(",");
        System.out.print("но и в ");
        golopyatkino.create(",");
        beshlebovo.create(",");
        golodayevka.create(",");
        neprolaznoye.create("continue");

        znayka.order();
        lunatiki.get(seeds.getName() + ", " + weightlessnessDevices.getName());
        lunatiki.getMore(antiLunit.getName());
        lunatiki.wereExplained(lunatiki.toDefend(policemen.getName()));



    }
    
}
