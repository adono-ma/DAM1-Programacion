/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class OrdenarNPorN2 implements Comparator <N>{

    @Override
    public int compare(N o1, N o2) {
       if(o1 == o2){
       return 0;
       }
       if((o1 == null) || (o2 == null)){
       throw new NullPointerException();
       }
       if((o1.getClass() != N.class) || (o2.getClass() != N.class)){
           throw new ClassCastException();
    }
       N obj1 = (N) o1;
       N obj2 = (N) o2;
       
       if(obj1.getN()!= obj2.getN()){
           return Integer.compare(obj1.getN(), obj2.getN());
       }
         if(obj1.getValor()!= obj2.getValor()){
           return Integer.compare(obj1.getValor(), obj2.getValor());
       }
         return 0;
    }

    @Override
    public Comparator<N> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<N> thenComparing(Comparator<? super N> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<N> thenComparing(Function<? super N, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<N> thenComparing(Function<? super N, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Comparator<N> thenComparingInt(ToIntFunction<? super N> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Comparator<N> thenComparingLong(ToLongFunction<? super N> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Comparator<N> thenComparingDouble(ToDoubleFunction<? super N> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
