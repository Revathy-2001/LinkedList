import java.util.*;
class Node{
  int data;
  Node prev;
  Node next;
  Node(){
    data = 0;
    prev = null;
    next = null;
  }
}
class DoublyLinkedList{
  public Node head;
  public Node tail;
  public void CreateNodes(int a[]){
    for(int i = 0;i < a.length;i++){
      Node temp = new Node();
      if(temp != null){
        temp.prev = null;
        temp.data = a[i];
        temp.next = null;
        if(head == null){
          head = temp;
          tail = temp;
        }
        else{
          temp.prev = tail;
          tail.next = temp;
          tail = temp;
        }
      }
    }
  }

  public void Display(){
    Node current = head;
    System.out.println("Data's in the List: ");
    while(current != null){
      System.out.println(current.data);
      current=current.next;
    }
  }
}
class Main{
  static Scanner kbd = new Scanner(System.in);
  public static void main(String[] args){
    DoublyLinkedList dl = new DoublyLinkedList();
    int n = 5;
    int[] arr = new int[n];
    System.out.println("Enter Array Values: ");
    for(int i = 0;i < n;i++)
     arr[i] = kbd.nextInt();
    dl.CreateNodes(arr);
    dl.Display();
  }
}