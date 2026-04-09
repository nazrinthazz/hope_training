//ITERATOR 
//Traversing collection elemnet by element through cursor

//METHODS
///itr.hasNext() -> checks whether the next elemnt exists or not
///itr.next()-> moves cursor to next element
/// remove()-> remove the element

/*Collection -> Iterator -> cursor() -> elemnet */


//LIST ITERATOR
// Works only with list
//moves forward and backward

//METHODS
//itr.hasPrevious()-> return true or false
//itr.preious()
import java.util.*;
public class IteratorExample {
    public static void main(String[] args){
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        for(int i:list){
            //if(i==4){
            //    list.remove(i);//ConcurrentModificationException (as the size changes in a loop)
            //}  
            System.out.print(i);
        }
        System.out.println();
        /* Iterator is used to avoid ConcurrentModificationException */
        Iterator<Integer>itr=list.iterator();
        while(itr.hasNext()){
            int cur=itr.next();
            if(cur==6){
                itr.remove();
            }
        }
        System.out.println(list);
        
        ListIterator<Integer>litr=list.listIterator();
        while(litr.hasNext()){
            int cur=litr.next();
            if(cur==4){
                litr.remove();
            }
        }
        System.out.println(list);

        while(litr.hasPrevious()){
            int cur=litr.previous();
            if(cur==3){
                litr.remove();
            }
        }
        System.out.println(list);

            
    }
}
