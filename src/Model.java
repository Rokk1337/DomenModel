interface means_of_transport
{
    void go();
    void not_work();
    void sounds();
}

abstract class cars implements means_of_transport {
    public abstract void go();

    public abstract void not_work();

    public abstract void sounds();
}

    abstract class aircraft implements means_of_transport {
        public abstract void go();

        public abstract void not_work();

        public abstract void sounds();

    }
        class boing extends aircraft
        {
            @Override
            public void go()
            {
                System.out.println("летит");
            }

            @Override
            public void not_work()
            {
                System.out.println("не вышел в рейс");
            }

            @Override
            public void sounds()
            {
                System.out.println("гудит");
            }
        }

        class MIG extends aircraft
        {
            @Override
            public void go()
            {
                System.out.println("быстро летит");
            }

            @Override
            public void not_work()
            {
                System.out.println("небо без защиты");
            }

            @Override
            public void sounds()
            {
                System.out.println("гудит ");
            }
        }

            class Cycyryznic extends aircraft
            {
                @Override
                public void go()
                {
                    System.out.println("телил как фанера");
                }

                @Override
                public void not_work()
                {
                    System.out.println("полетит в любом случае");
                }

                @Override
                public void sounds()
                {
                    System.out.println("пердит как дед");
                }
            }





class subbaru extends cars
{
    @Override
    public void go()
    {
        System.out.println("наваливает");
    }

    @Override
    public void not_work()
    {
        System.out.println("Застучала поршневая");
    }

    @Override
    public void sounds()
    {
        System.out.println("делает бубубу");
    }
}

class BMW extends cars
{
    @Override
    public void go()
    {
        System.out.println("едет");
    }

    @Override
    public void not_work()
    {
        System.out.println("опять жрёт масло");
    }

    @Override
    public void sounds()
    {
        System.out.println("ДИИИИИМОООН");
    }
}

class VAZ extends cars {
    @Override
    public void go()
    {
        System.out.println("кое-как катится");
    }

    @Override
    public void not_work()
    {
        System.out.println("снова пропала искра");
    }

    @Override
    public void sounds()
    {
        System.out.println("издаёт звуки из приисподни");
    }
}



public class Model
{

    abstract class motorcycles implements means_of_transport
    {
        @Override
        public void go()
        {
            System.out.println("");
        }

        @Override
        public void not_work()
        {

        }

        @Override
        public void sounds()
        {

        }
    }

        class MOTO extends motorcycles
    {
        @Override
        public void go()
        {
            System.out.println("MOTO в фарш");
        }

        @Override
        public void not_work()
        {
            System.out.println("украли гады");
        }

        @Override
        public void sounds()
        {
            System.out.println("жу жу жу");
        }
    }

    class moto_whis_koliaska extends motorcycles
    {
        @Override
        public void go()
        {
            System.out.println("гонит как ветер");
        }

        @Override
        public void not_work()
        {
            System.out.println("стоит в гараже 40 лет");
        }

        @Override
        public void sounds()
        {
            System.out.println("звук знакомый с дестсва");
        }
    }

    class yamaha extends motorcycles
    {
        @Override
        public void go()
        {
            System.out.println("летит примиком на тот свет");
        }

        @Override
        public void not_work()
        {
            System.out.println("вечно течёт мотор");
        }

        @Override
        public void sounds()
        {
            System.out.println("жужит как бензопила");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("\u001B[33m" + "машины" + "\u001B[0m");
        System.out.println("\u001B[31m" + "суба" + "\u001B[0m");
        subbaru Car1 = new subbaru();
        Car1.go();
        Car1.not_work();
        Car1.sounds();

        System.out.println("\u001B[31m" + "БеМеВе" + "\u001B[0m");
        BMW Car2 = new BMW();
        Car2.go();
        Car2.not_work();
        Car2.sounds();

        System.out.println("\u001B[31m" + "любимый ваз" + "\u001B[0m");
        VAZ Car3 = new VAZ();
        Car3.go();
        Car3.not_work();
        Car3.sounds();

        System.out.println("\u001B[33m" + "мотоциклы" + "\u001B[0m");
        System.out.println("\u001B[31m" + "Мото" + "\u001B[0m");
        Model.MOTO moto = new Model().new MOTO();
        moto.go();
        moto.not_work();
        moto.sounds();

        System.out.println("\u001B[31m" + "Мотоцикл с коляской" + "\u001B[0m");
        Model.moto_whis_koliaska colizska = new Model().new moto_whis_koliaska();
        colizska.go();
        colizska.not_work();
        colizska.sounds();

        System.out.println("\u001B[31m" + "Ямаха" + "\u001B[0m");
        Model.yamaha yamaha = new Model().new yamaha();
        yamaha.go();
        yamaha.not_work();
        yamaha.sounds();

        System.out.println("\u001B[33m" + "самолёты" + "\u001B[0m");
        System.out.println("\u001B[31m" + "боинг" + "\u001B[0m");
        boing Fly1 = new boing();
        Fly1.go();
        Fly1.not_work();
        Fly1.sounds();

        System.out.println("\u001B[31m" + "Миг" + "\u001B[0m");
        MIG Fly2 = new MIG();
        Fly2.go();
        Fly2.not_work();
        Fly2.sounds();

        System.out.println("\u001B[31m" + "кукурузник" + "\u001B[0m");
        Cycyryznic Fly3 = new Cycyryznic();
        Fly3.go();
        Fly3.not_work();
        Fly3.sounds();
    }
}