//TRESET
// Uses self balancing tree (red-black tree) internally
//Binary Search Tree
//   2
//  / \
// 1   3 
//DFS(Inorder, pre- order and postOrder search) and BFS
//Inorder- LNR(it is always sorted)
//PreOder - NLR
//PostOrder- LRN
// Self balancing tree
//*TreeSet is always used to find the nearest elements */
//Methods in TreeSet
//add()
//remove()
//contains()

// first()-lowet
//last()-highest

//[10,20,30,40,50]
/*Includes target element(if target element is already present , it is returned in both the functions ) */
//ceiling()-check highest ~ ceil(25)-30
//floor()-check lowest ~ floor(25)-20
/*Doesnt include the target element */
// higher(25) -higher than
// lower(25)- lower than
import java.util.*;

public class Tree {
    public static int closest(int arr[], int target){
        TreeSet<Integer>t=new TreeSet<>();
        for(int n:arr){
            t.add(n);
        }
        Integer a=t.higher(target);//ceiling()doesnt work if target is present in the set
        Integer b=t.lower(target);//floor()
        if(a==null)return b;
        if(b==null)return a;

        return (target - b <= a - target) ? b : a;
    }
    public static void main(String[] args){
        TreeSet<Integer>t=new TreeSet<>();
        int arr[]={15,3,9,1,7,2};
        //int arr[]={10,20,30,40,50};
        for(int n:arr){
            t.add(n);
        }
        System.out.println(t.higher(15));
        System.out.println(t.lower(15));
        System.out.println("Closest to 25 is: "+closest(arr,15));
    }
}
