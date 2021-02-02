import java.util.*;
class Node{
   public int data;
   public Node next;
   Node(){
     data = 0;
     next = null;
   }
}
class SinglyLinkedList{
   public Node head;
   public Node tail;
   SinglyLinkedList(){
     head = null;
     tail = null;
   }
   public void CreateNodes(int a[]){
      for(int i = 0;i < a.length;i++){
          Node temp = new Node();
          if(temp != null){
            temp.data = a[i];
            temp.next = null;
            if(head == null){
              head = temp;
              tail = temp;
            }
            else{
              tail.next = temp;
              tail = temp;
            }
          }
      }      
   }

   public void Display(){
     Node current = head;
     System.out.println("Values in the List: ");
     while(current != null){
       System.out.println(current.data);
       current = current.next;
     }
   }
}
class Main{
  static Scanner kbd = new Scanner(System.in);
  public static void main(String[] args){
     SinglyLinkedList sl = new SinglyLinkedList();
     int n = 5;
     int[] arr = new int[n];
     System.out.println("Enter Array Values: ");
     for(int i = 0;i < n;i++)
       arr[i] = kbd.nextInt();
     sl.CreateNodes(arr);
     sl.Display();
  }
}