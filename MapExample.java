//MAP INTERFACE
///storing in key value pairs
///HashMap -> HashCode()and equals

// METHODS
/// map.put(key,value); -> add(if not added) and updates(if alr added)
/// map.get(key)-> returns the last updated value of the key
/// map.getOrDefault(key,Default_Value)-> it returns value of key if present else returns the default value
    /*map.put(key,map.getOrDefault(key,DefaultValue)+1) */

/// map.containskey(key)->returns boolean
/// map.remove(key) -> removing the existing key
/// map.keySet()-> to access all the keys ... returns only the values 
    /* print statement prints both keys and values */

///Map.Entry<Integer,Integer>entry:map.entrySet() ->loops
/// entry.getKey()
/// entry.getValue()
/* should not use map methods in the entry set loop */

import java.util.*;
public class MapExample {
    public static Map<Integer,Integer> Frequency(int[] nums){
        Map<Integer,Integer> m=new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
            ///if(m.containsKey(i)){
            /// m.put(i,get(i)+1);
            ///}else m.put(i,1);
        }
        return m;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
        }

        // In Map
        System.out.println(map.keySet());
        System.out.println(map.values());
        
        //In Entry set
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){//Loop
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        System.out.println("Frequency method output:");
        int[] nums={1,2,3,1,1,1,2,4,3};
        Map<Integer,Integer> m=Frequency(nums);
        
        for(Map.Entry<Integer,Integer>entry:m.entrySet()){//Loop
            System.out.println(entry.getKey()+" repeates "+entry.getValue()+" times");
        }
    }
}
