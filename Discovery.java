import java.util.*;
import java.lang.*;
/*Utilisation de tableau dynamique ArrayList contient la méthode à deux arguments add qui est utile dans ce cas(éviter Vector))*/
public class Discovery<T>{
    private ArrayList<T> elements;
    public Discovery(int capacity){
	elements=new ArrayList<T>(capacity);
    }
    public void add(T element, int index){
	elements.add(index,element);
    }
    public T get(int index){
	return elements.get(index);
    }
    public static void main(String args[]){
	
    }
}
