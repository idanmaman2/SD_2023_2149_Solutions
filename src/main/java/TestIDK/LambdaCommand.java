package TestIDK;

import javax.swing.*;
import java.util.function.Consumer;

public class LambdaCommand<T> implements  ICommand<T>{
    public Consumer<T> x ;
    public LambdaCommand(){}
    public LambdaCommand(Consumer<T> x){
        this.x = x ;
    }
    @Override
    public void execute(T a) {
        x.accept(a);
    }
}
