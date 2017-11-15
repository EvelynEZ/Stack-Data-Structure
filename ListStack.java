//Jiaqi Zhang, CSE 373, Winter 2017
//Assignment 1, 1/11/2017
//ListStack: This stack implements the DStack interface
//using linked lists.

import java.util.EmptyStackException;

public class ListStack implements DStack {
   private ListStackNode head;
   private int size;
   
   //ListStack
   public ListStack(){
      head = null;
      size = 0;
   } 
   
   //return the number of nodes 
   public int size(){
      return size;
   }
   
   //return 1 if the stack is empty
   //0 if it's not empty
   public boolean isEmpty(){
      return (head == null);
   }
   
   //Take an input d, add a ListStackNode with data d to the head of the node.
   //Size increases.
   public void push(double d) {
      if(this.isEmpty()){
         head = new ListStackNode(d);
      } else {
         head = new ListStackNode(d, head);
      }  
      size++;
   }  
   
   //When stack is empty, throw an amptyStackException error.
   //Otherwise, returns the value at the top of the stack.
   public double peek(){
      if (this.isEmpty()){
         throw new EmptyStackException();
      }
      return head.data;
   }  
   
   //When stack is empty, throw an emptyStackException error.
   //Otherwise, returns the value at the top of the stack and remove it 
   //from the stack.
   public double pop(){
      double topData = peek();
      head = head.next;
      size--;
      return topData;
   }
   
   //return a string of the content of the ListStack.
   //for an empty stack, returns "top [] bottom".
   public String toString() {
      ListStackNode current = head;
      String result = "top [";
      if (!this.isEmpty()) {
         result += current.data;
         while (current.next != null){
            current = current.next;
            result += ", " + current.data;
         }
      }
      result += "] bottom";
      return result;  
   }  
}