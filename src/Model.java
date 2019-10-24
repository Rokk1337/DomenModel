import java.util.Arrays;

public class Model {

    public interface means_of_transport {
        void go ();
        void not_work ();
        void sounds ();
    }

        public abstract class aircraft implements means_of_transport {
            @Override
            public void go() {
            }
            @Override
            public void not_work() {
            }
            @Override
            public void sounds() {
            }
        }

    public abstract class cars implements means_of_transport {
        @Override
        public void go() {
        }
        @Override
        public void not_work() {
        }
        @Override
        public void sounds() {
        }
    }
        public class subbaru extends cars {
            @Override
            public void go () {
                System.out.println("наваливает");
            }
            @Override
            public void not_work () {
                System.out.println("Застучала поршневая");
            }
            @Override
            public void sounds () {
                System.out.println("делает бубубу");
            }
        }

    public class BMW extends cars {
        @Override
        public void go () {
            System.out.println("едет");
        }
        @Override
        public void not_work () {
            System.out.println("опять жрёт масло");
        }
        @Override
        public void sounds () {
            System.out.println("ДИИИИИМОООН");
        }
    }

    public class VAZ extends cars {
        @Override
        public void go () {
            System.out.println("кое-как катится");
        }
        @Override
        public void not_work () {
            System.out.println("снова пропала искра");
        }
        @Override
        public void sounds () {
            System.out.println("издаёт звуки из приисподни");
        }
    }


    public abstract class motorcycles implements means_of_transport {
        @Override
        public void go() {
        }
        @Override
        public void not_work() {
        }
        @Override
        public void sounds() {
        }
    }





    public static void main(String[] args) {
        System.out.println();
    }
}
