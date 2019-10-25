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

    public static void main(String[] args)
    {
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

        System.out.println("\u001B[31m" + "Мото" + "\u001B[0m");
        Model.MOTO moto = new Model().new MOTO();
        moto.go();
    }
}