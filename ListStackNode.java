//Jiaqi Zhang, CSE 373, Winter 2017
//Assignment 1, 1/11/2017
//ListStackNode: an object which stores an value 'data' and 
//points to the next ListStackNode (this.next).

public class ListStackNode {
   public double data;
   public ListStackNode next;
   
   //ListStackNode with a given data.
   public ListStackNode(double data){
      this(data, null);
   }
   
   //ListStackNode with given data and pointed to the next node.
   public ListStackNode(double data, ListStackNode next){
      this.data = data;
      this.next = next;
   } 
}