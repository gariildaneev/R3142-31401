public class Main {
    public static void main(String[] args) {
        SimpleGUI s = new SimpleGUI();
        s.setVisible(true);

        UndefinedKorotishka he = new UndefinedKorotishka("он");
        Object chairs = new Object("несколько стульев");
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
        Korotishka spacemen = new Korotishka("космонавты ");
        Lunatiki lunatiki = new Lunatiki("лунатики");
        Villagers villagers = new Villagers("Деревенские жители ");
        Seeds seeds = new Seeds("семена");
        Seeds giantPlantSeeds = new Seeds(" семена гигантских растений");
        VillageCreator neelovka = new VillageCreator("Нееловка");
        VillageCreator golopyatkino = new VillageCreator("Голопяткино");
        VillageCreator beshlebovo = new VillageCreator("Бесхлебово");
        VillageCreator golodayevka = new VillageCreator("Голодаевка");
        VillageCreator neprolaznoye = new VillageCreator("Непролазное");
        Znayka znayka = new Znayka("Знайка ");
        Factory.Worker workers = new Factory.Worker("рабочие");
        Factory noodleFactory = new Factory("макаронной фабрики ");
        Korotishka skuperfild = new Korotishka("Скуперфильд");
        Factory.ProducedProducts manyProducts = noodleFactory.new ProducedProducts("lkjh");


        he.kickAndMakeDirt();
        he.overturnChairs(chairs);
        he.ranAwayFrom(he, HappeningPlace.TV_PAVILION);

        BeOrNotSeen him = new BeOrNotSeen() {
            public void haveNotBeenSeen(boolean importantKey) throws HaveBeenSeenException{
                if (importantKey){
                    System.out.println(" Больше "+ him +" не видели.");
                }
                else {
                    throw new HaveBeenSeenException("\n" + him + " ЗАМЕТИЛИ.\nКОНЕЦ МЕМА, ПРОДОЛЖЕНИЯ ИСТОРИИ НЕ БУДЕТ");
                }
            }
        };
        him.haveNotBeenSeen(true);

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
        neelovka.create("beginning");
        System.out.print("но и в ");
        golopyatkino.create(",");
        beshlebovo.create(",");
        golodayevka.create(",");
        neprolaznoye.create("continue");

        znayka.order();
        lunatiki.get(seeds.getName() + ", " + weightlessnessDevices.getName());
        lunatiki.getMore(antiLunit.getName());
        lunatiki.wereExplained(lunatiki.toDefend(policemen.getName()));

        workers.arrive(Period.SOON, spacemen, workers, noodleFactory, skuperfild);

        workers.say(workers.decideToKick(noodleFactory, skuperfild));
        workers.doNoodle(noodleFactory.noodle);

        workers.makeZeroGravity(Difficult.TOIMPLEMENT_THISPLAN,HappeningPlace.FACTORY,policemen.beAbleToInterfere(policemen,Difficult.OTHERWISE));
        policemen.beAbleToKickAway(HappeningPlace.FROMFACTORY);

        workers.gotStuff(spacemen, weightlessnessDevices, antiLunit);
        workers.strengthen(workers,HappeningPlace.FACTORY);
        try {
            manyProducts.haveBeenStrengthen();
            manyProducts.canFunction(HappeningPlace.ZEROGRAVITY_COND);
            System.out.println("Эффект от всех этих мероприятий получился огромный");
            manyProducts.haveNoWeight(noodleFactory.flour, noodleFactory.noodleDough, Period.NOW);
            manyProducts.ultraEffectiveness(noodleFactory.mechanisms, HappeningPlace.ZEROGRAVITY_COND);
        }catch (LazyWorkersException e){
            System.err.println(e.getMessage());
            System.err.println("Эффекта соответственно никакого не было");
        }
    }
}
