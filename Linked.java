class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}

class LinkedList{
    Node head,tail;
    public void insertAtStart(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node temp=head;
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void deleteAtStart(){
        if(head==null){
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    public void deleteAtEnd(){
        Node temp=head;
        if(head==null)return;
        if(head.next==null)head=null;
        while(temp.next.next!=null){
            temp=temp.next;
        }
       temp.next = null; 

    }
    public void insertAtPosition(int Position, int data){
        if(Position==0){
            insertAtStart(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;i<Position;i++){
            if(temp==null)return;
            temp=temp.next;
        }
        if(temp == null) return;
        newNode.next=temp.next;
        temp.next=newNode;    
    }
    public void deletePosition(int position){
        if(head==null)return;
        if(position==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<position-1;i++){
            if(temp.next==null)return;
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }

    }
    public void display(){
        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
public class Linked {
    public static void main(String[] args){
        LinkedList l=new LinkedList();
        l.insertAtStart(10);
        l.insertAtEnd(50);
        l.insertAtEnd(60);
        l.insertAtEnd(20);
        l.insertAtStart(100);
        l.display();
        l.deleteAtStart();
        l.deleteAtEnd();
        l.display();
        l.insertAtPosition(3,80);
        l.display();
        l.deletePosition(3);
        l.display();

    }
}

