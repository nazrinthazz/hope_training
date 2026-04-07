import java.util.*; 
public class AList {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,2,4,4,5,6));
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
            System.out.print(list);

    }
}
