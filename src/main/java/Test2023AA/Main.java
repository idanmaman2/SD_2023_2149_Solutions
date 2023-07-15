package Test2023AA;

import java.util.stream.Collectors;
//Question -
public class Main {
    public static void main(String[] args) {
        TXComp<Integer> a = new TXComp<>() ;
        a.add(3);
        a.add(4);
        a.add(32132);
        a.add(5);
        a.add(12321);
        a.add(-1);
        System.out.println(String.join(" " ,a.stream().map(Number::toString).collect(Collectors.toList()) ));
        System.out.println(a.median());
    }
}