package Intarface;

interface engine {
    void start();
    void off();
}
interface Music_player {
    void play_music();
    void stop_music();
}

interface accelerate {
    void acc();
}

interface brake {
    void car_brake();
}

class suzuki implements Music_player, accelerate, brake, engine{
    @Override
    public void play_music() {
        System.out.println("Suzuki's Music Player Start . . .");
    }

    @Override
    public void stop_music() {
        System.out.println("Suzuki's Music Player Start . . .");
    }

    @Override
    public void acc() {
        System.out.println("Suzuki's Accelerate Is OSM . . ");
    }

    @Override
    public void car_brake() {
        System.out.println("Suzuki's Has Dis Brake In Their Car's .");
    }

    @Override
    public void start() {
        System.out.println("Car Start's .");
    }

    @Override
    public void off() {
        System.out.println("Car's Engine Off .");
    }
}
class Car extends suzuki{

}

public class Example2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.play_music();
        car.acc();
        car.car_brake();

    }
}
