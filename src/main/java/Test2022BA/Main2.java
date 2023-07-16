package Test2022BA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {
    public static void main(String [] args ){
      //  Libary x = container.select(Libary.class).get();

    }
    //@Produces
    public List<Book> shelfGen(){
        Random x = new Random();
        List<Book> res = new ArrayList<>();
        for(int i = 0 ; i <x.nextInt(0,9) ; i ++ ){
            if(x.nextInt(2) % 2 == 0 ){
                res.add(new FantasyBook());
            }
            else{
                res.add(new HistoryBook());
            }
        }
        return res ;
    }
}
