import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer obs= (Observer) it.next();
            obs.update(this);
        }
    }

}

interface Observer {
    public void update(Subject s);
    void redibuja(Subject s);
}


class Temperatura extends Subject  {
    private double temp;

    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
        notifyObservers();
    }
}

class TermometroCelsius implements Observer  {
    public void update(Subject s) {
        double temp = ((Temperatura) s).getTemp();
        System.out.println("Temperatura Celsius: " + temp);
    }

    @Override
    public void redibuja(Subject s) {
        double temp = ((Temperatura) s).getTemp();
    }
}

public class Main {

    public static void  main(String [] args) {
        Temperatura t = new Temperatura();
        t.addObserver(new TermometroCelsius ());
        t.setTemp(100.0);
    }

}