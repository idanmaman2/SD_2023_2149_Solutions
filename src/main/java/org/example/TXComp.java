package org.example;

import java.util.ArrayList;
import java.util.Collection;
// Question -
public class TXComp<E extends Comparable<E>> extends  ArrayList<E> {
    public E median(){
        return this.stream().sorted().skip(this.stream().count() / 2 ).findFirst().get() ;
    }
}
