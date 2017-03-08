import java.util.ArrayList;
import java.util.Iterator;

/**
 * @title - House class - David Barnes, 14th October 2013
 * @due - 1st November 2013
 *
 * @description
 * A class to store a list of StudentLoan objects. The class will use an Array List
 * to store an arbitrarily-long collection of Student Loan objects. Each Student
 * Loan object will contain a student ID and loan amount.
 * 
 * @author Akash Payne (ap567)  
 * @version Loan_Company_1.11
 * @date 29/11/2013
 */

public class LoanCompany
{
  //An ArrayList for storing the loans for student Loans
  private ArrayList<StudentLoan> loans;
   
  // The number that will be given to the next loan entered
  // into this collection.
  // private int nextLoanNumber;
    
  /**
   * A Constructor for objects of class LoanCompany; 
   * initialises the collection field.
   */
  public LoanCompany()
  {
      loans = new ArrayList<StudentLoan>();
  }
   
  /**
   * A method taking two parameters: the ID of a student and a 
   * loan amount, in that order. The method creates a StudentLoan object using
   * those two parameters and store the StudentLoan in the collection.
   */ 
  public void addLoan(String id, int amount)
  {
      loans.add(new StudentLoan(id, amount));
      //Inserts the specified element at the specified position index in this list.
  }
      
  /**
   * A method that returns the number of Student Loan Objects in the Collection. 
   * @return The number of loans in the collection.
   */
  public int getNumberOfLoans()
  {
      return loans.size();
      // int size() - Returns the number of elements in this list.
  }

  /**
   * Determine whether the given index is valid for the collection.
   * //Print an error message if it is not.
   * @param index The index to be checked.
   * @return true if the index is valid, false otherwise.
   */
  private boolean validIndex(int index)
  {
      // The return value.
      // Set according to whether the index is valid or not.
      boolean valid;
      
      if(index < 0) {
           //System.out.println("Index cannot be negative: " + index);
           valid = false;
      }
       else if(index >= loans.size()) {
           //System.out.println("Index is too large: " + index);
           //Doesn't need to print 
           valid = false;
      }
       else {
           valid = true;
      }
      return valid;
  }
    
  /**
   * A method that prints the deatils of all the Student Loan Objects in the
   * collection, one per line, with an index number against each (index starts
   * at 0).
   */
  public void list()
  {
      int index = 0;
      for (StudentLoan loan : loans) {
          System.out.print(index + " : ");
          loan.printDetails(); 
          index++;
      }
  }
    
  /**
   * A method that prints the deatils of all the Student Loan Objects in the
   * collection, one per line, with an index number against each (index starts
   * at 0). >> WHILE LOOP <<
  */
  public void listAll()
  {
      int index = 0;
      while (index < loans.size()) {
          StudentLoan loan = loans.get(index);
          System.out.print(index + " : ");
          loan.printDetails(); 
          index++;
      }
  }
   
  /**
   * A method that takes an integer index as its parameter and removes 
   * the Student Loan at that Index from the collection. 
   * If the Index is not valid than an error message should be printed
   * and the removal should not be attempted.
  */
  public void removeLoan(int index)
  {
      if(validIndex(index)) { //if(index >= 0 && index < loans.size())
          // This is a valid index number, so remove loan.
          loans.remove(index);
      }
      else {
          // This is a NOT valid index number, so do not remove 
          // loan and display error message
          System.out.println("Valid index range must be between 0 and " + loans.size());
      }
  }
    
  /**
   * A method that takes two integer parameters: an index and an 
   * amount, in that order. This calls the payOff method of 
   * the StudentLoan at the given index, passing the given amount. 
   * Prints an error message if the index is not valid and does 
   * nothing to the collection. 
   */ 
  public void repay(int index, int amount)
  {
      // indexValid checks if index is valid - if not does nothing and gives error message
      if(validIndex(index)) { //if(index >= 0 && index < loans.size())
          // This is a valid index number, so move pointer.
          StudentLoan loan = loans.get(index);
          // Call payoff using amount para'
          loan.payOff(amount);
      }
     else {
          System.out.println("This is not a valid index number"); 
      }
  }
  
  /**
   * a method that prints details of only those students 
   * who have a non-zero amount in their loan.
   */
  public void showOutstanding()
  {
      for(StudentLoan loan : loans) {
          if (loan.getAmount() != 0) { // as minus numbers cannot be entered 
               loan.printDetails(); 
               // prints loan details - could improve by giving same format as the list method
           }
      }
  }
  
  /**
   * a method that removes all StudentLoan 
   * objects from the collection that have a zero 
   * amount left. The method tests with a collection 
   * containing a mixture of cleared and uncleared loans.
   *            >>>>>> FOR LOOP <<<<<<<
   */
  public void removeClearedLoans() 
  {
      
      for (StudentLoan loan : loans) { // loop is repeated once for each element in the loans ArrayList
          if (loan.getAmount() == 0) { // if the loan amount equals zero
              loans.remove(loan);      // removes the element
          } 
      }
   }
   
  /**
   * a method that removes all StudentLoan 
   * objects from the collection that have a zero 
   * amount left. The method tests with a collection 
   * containing a mixture of cleared and uncleared loans.
   *            >>>>>> WHILE LOOP  <<<<<<<
   */
  public void removeCleared() 
  {
      int index = 0;                           // iterating with an index variable 
      while ( index < loans.size() ) {         // loops until index reaches last element of the loans ArrayList
          StudentLoan loan = loans.get(index); 
          if (loan.getAmount() == 0) {
              loans.remove(loan);
          }
          index++; // incrementing the index by 1
      }
  }
  
  /**
   * a method that removes all StudentLoan 
   * objects from the collection that have a zero 
   * amount left. The method tests with a collection 
   * containing a mixture of cleared and uncleared loans.
   *      >>>>>> WHILE LOOP && Iterator <<<<<<<
   */
  public void removeCleared2()
  {
      Iterator<StudentLoan> it = loans.iterator(); // iterator type
      while (it.hasNext() ) { // to get next element 
          StudentLoan l = it.next(); // assigns next element -- l is variable to store loan
          int loan = l.getAmount();  // can put this in if statement but is easier to read this way
          if(loan == 0) {
              it.remove();
          }
      }
  }
}
