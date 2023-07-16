package TestIDK;

import Test2023AA.TXComp;

import java.util.stream.Collectors;

//Question -
public class Main {
    public static  boolean isTurnOn(String x){
        return x.contains("ON");
    }
    public static boolean isTurnOff(String x){
        return x.contains("OFF");
    }
    public static  boolean isTurnHeater(String x){
        return x.contains("Heater");
    }
    public static void main(String[] args) {
        CommandNode<String> root = new CommandNode<>(
                        new CommandNode<>(
                                new LambdaCommand<>((x)-> System.out.println("TURN ON HEATER")) ,
                                new CommandNode<>(
                                    new LambdaCommand<>((x)->System.out.println("TURN OFF HEATER")),
                                    new LambdaCommand<>((x)->{}) ,
                                    Main::isTurnOff
                                    ) ,
                                Main::isTurnOn
                                ) ,
                        new LambdaCommand<>((x)->{} )  ,
                         Main::isTurnHeater );
        root.execute("Heater  TURN OFF ");
    }
}