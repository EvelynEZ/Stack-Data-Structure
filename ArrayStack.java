//Jiaqi Zhang, CSE 373, Winter 2017
//Assignment 1, 1/11/2017
//ArrayStack: This stack implements the DStack interface
//using an array.

import java.util.EmptyStackException;

public class ArrayStack implements DStack {
   private double[] arr;
   private int size; 
   
   //Array Stack 
   public ArrayStack() {
      arr = new double[10];
      size = 0;  
   }
   
   //returns the size of the ArrayStack
   public int size(){
      return size;
   }
   
   //Takes an input d, and pushes it to the top of the ArrayStack. 
   //When the ArrayStack is full, copies everything to a stack twice as large.
   public void push(double d) {
      arr[size] = d;
      size++;
      //When array is full, resize to use an array twice as large
      if (size == arr.length){
         double[] longArr = new double[arr.length * 2];
         for (int i = 0; i < arr.length; i++) {
            longArr[i] = arr[i];
         }
         arr = longArr;
      }
   }
   
   //When stack is empty, throw an amptyStackException error.
   //Otherwise, returns the value at the top of the stack 
   public double peek(){
      if (this.isEmpty()){
         throw new EmptyStackException();
      }
      return (double)arr[size-1];
   } 
   
   //When stack is empty, throw an amptyStackException error.
   //Otherwise, returns the value at the top of the stack and remove it 
   //from the stack.
   //When 3/4 of the ArrayStack is empty, copies everthing to a stack with half
   //of its size.
   public double pop(){
      double top = this.peek();
      arr[size-1] = 0;
      size--;
      //When the array is 3/4 empty, resize to use an array half of its size.
      if(size <= arr.length/4 && arr.length >= 20){
         double[] shortArr = new double[arr.length/2];
         for (int j = 0; j < arr.length/4; j++) {
            shortArr[j] = arr[j];
         }
         arr = shortArr;
      }

      return top;
   }

   //returns 1 if ArrayStack is empty,
   //0 if ArrayStack is not empty.
   public boolean isEmpty() {
      return (size == 0);
   }
   
   //return a string of the content of the ArrayStack.
   //for an empty stack, returns "top [] bottom".
   public String toString() {
      String result = "top [";
      if (!this.isEmpty()){
         result += arr[size-1];
         for (int i = size - 2; i >= 0; i--) {
            result += ", " + arr[i];
         }
      }
      result += "] bottom"; 
      return result;
   }
  
}
