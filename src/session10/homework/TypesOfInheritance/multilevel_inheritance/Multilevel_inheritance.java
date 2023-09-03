package session10.homework.TypesOfInheritance.multilevel_inheritance;

public class Multilevel_inheritance {

    public static void main(String[] args) {

        Tesla tesla = new Tesla("Tesla", "Model 3 Long Range", 2020, 750, 330, "1.13");

        tesla.start();
        tesla.stop();
        tesla.accelerate();
        tesla.charge();
        tesla.enableAutopilot();
    }
}