//Jiaqi Zhang, CSE 373, Winter 2017
//Assignment 1, 1/11/2017
//Test: This program is the client code which tests the functions of the ArrayStack
//and ListStack.

public class Test {
   public static void main (String [] args) {
      //Test ArrayStack
      System.out.println("Testing ArrayStack: ");
      ArrayStack aStack = new ArrayStack(); //create an empty ArrayStack
      System.out.println("Empty Stack? " + aStack.isEmpty()); //print true
      System.out.println("Size of empty stack? " + aStack.size());  //print 0
      System.out.println(aStack.toString()); //print 'top [] bottom'
      aStack.push(1.0);
      aStack.push(2.0);
      aStack.push(3.0);
      aStack.push(4.0);
      aStack.push(5.0);
      aStack.push(6.0);
      aStack.push(7.0);
      aStack.push(8.0);
      aStack.push(9.0);
      aStack.push(10.0);
      aStack.push(11.0);
      //Check array length here: 20. Array length doubled.
      System.out.println("Size of stack after 11 push(): " + aStack.size());//print 11 - size() works.
      System.out.println(aStack.toString()); //print 'top [11.0 ... 1.0] bottom'
      System.out.println("peek current stack: " + aStack.peek()); //print 11.0 - peek() works
      aStack.pop(); //pop 11.0 
      aStack.pop(); //pop 10.0
      aStack.pop(); //pop 9.0
      aStack.pop(); //pop 8.0
      aStack.pop(); //pop 7.0
      aStack.pop(); //pop 6.0
      //Check array length here: 10. Array length cut to half.
      System.out.println("Size of stack after 6 pop(): " + aStack.size());  //print 5 - pop() works
      System.out.println(aStack.toString()); //print 'top [8.0 ... 1.0] bottom'
      System.out.println("Empty stack? " + aStack.isEmpty()); //print false
      System.out.println();
      
      //Testing ListStack
      System.out.println("Testing ListStack:");
      ListStack lStack = new ListStack();
      System.out.println("Empty stack? " + lStack.isEmpty()); //print true
      System.out.println("Size of empty stack? " + lStack.size());  //print 0
      System.out.println(lStack.toString()); //print 'top [] bottom'
      lStack.push(1.0);
      lStack.push(2.0);
      lStack.push(3.0);
      System.out.println("Size of stack after 3 push(): " + lStack.size());  
      System.out.println(lStack.toString()); //print 'top [3.0 ... 1.0] bottom'
      System.out.println("peek current stack: " + lStack.peek()); //print 3.0 - peek() works
      lStack.pop();
      lStack.pop();
      System.out.println("LstStack after 2 pop(): " + lStack.toString()); //print "top [1.0] bottom'
      System.out.println("Empty stack? " + lStack.isEmpty()); //print false
   }
}