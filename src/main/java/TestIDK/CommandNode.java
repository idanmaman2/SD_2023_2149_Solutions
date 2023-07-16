package TestIDK;

import java.util.function.Predicate;

public class CommandNode<T> implements ICommand<T>{
    ICommand<T> left ;
    ICommand<T> right ;
    Predicate<T> x ;

    public CommandNode(ICommand<T> left ,ICommand<T> right , Predicate<T> x){
        this.left=  left ;
        this.right = right ;
        this.x = x ;

    }
    @Override
    public void execute(T z) {
        if(x.test(z)){
            left.execute(z);
        }
        else{
            right.execute(z);
        }
    }
}
