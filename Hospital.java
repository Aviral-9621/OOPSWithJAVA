import java.util.*;
class Patient {
    int patientId;
    String name;
    int age;
    double temperature;

    Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    void checkFever() {
        if (temperature > 100.4) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
    }
}

public class Hospital {
    public static void main(String[] args) {

        Patient p1 = new Patient(101, "Aviral", 20, 101.2);

        p1.checkFever();
    }
}
