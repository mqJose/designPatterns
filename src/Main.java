import com.josedavid.decorator.Car;
import com.josedavid.decorator.ElectricCar;
import com.josedavid.decorator.StandardCar;
import com.josedavid.observer.Accelerator;
import com.josedavid.observer.Motor;

public class Main {
    public static void main(String [] args){
        Main A = new Main();
        A.decorator();
        A.observer();
    }

    private void decorator() {
        System.out.println("Ford Mustang");
        Car car = new StandardCar("Ford Mustang");
        car.start();
        car.speedUp();
        car.stop();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tesla");
        Car car1 = new ElectricCar(new StandardCar("Tesla"));
        car1.start();
        car1.speedUp();
        car1.stop();
    }

    private void observer(){
        Motor motorHarley = new Motor();
        Accelerator accelerator = new Accelerator();

        accelerator.linkedObserver(motorHarley);
        accelerator.speedUp();
        System.out.println("removed: "+ accelerator.removeObserver());
    }
}
