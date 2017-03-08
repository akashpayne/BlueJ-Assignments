import java.util.ArrayList;

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
 * @version Loan_Company_1.0
 * @date 26/11/2013
 */

public class LoanCompany
{
    //An ArrayList for storing the loans for student Loans
    private ArrayList<StudentLoan> loans;
    
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
    public void addLoan(StudentLoan loan)
    {
        loans.add(loan);
    }
       
    /**
     * A method that returns the number of Student Loan Objects in the Collection. 
     * @return The number of loans in the collection.
     */
    public int getNumberOfLoans()
    {
        return loans.size();
    }

    /**
     * A ...
     */
    public boolean validIndex()
    {
        
    }
    
    /**
     * A method that prints the deatils of all the Student Loan Objects in the
     * collection, one per line, with an index number against each (index starts
     * at 0).
     */
    public void list(int index)
    {
        index = 0;
        for (StudentLoan loan : loans) {
            System.out.println(index + ": " + loan.printDetails());
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
       if(indexValid(index)) {
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
       if(indexValid(index)) {
           // This is a valid index number, so move pointer.
           Loan loan = loans.get(index);
           // Call payoff using amount para'
           StudentLoan.payOff(amount);
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
           if (StudentLoan.getAmount != 0) {
                System.out.println(Loan.printDetails());
            }
        }
   }
   
   /**
    * a method that removes all StudentLoan 
    * objects from the collection that have a zero 
    * amount left. The method tests with a collection 
    * containing a mixture of cleared and uncleared loans.
    */
   public void ClearedLoans()
   {
       for (StudentLoan loan : loans) {
           if (StudentLoan.getAmount = 0) {
           } 
       }
    }
  
  // or 
  
  public StudentLoan ClearLoans(int index)
  {
      if (index == 0) {
          System.out.println("Invalid Entry: You need to enter a valid Index");
      } 
      else if (index <= loans.size()) {
          loans.remove(index-1);
          System.out.println("Loan at Index: " + index + ", has been deleted.");
      }
      return null;
  }
  
  // or  
   public StudentLoan ClearedLoans(int index) //get lot page 133
   {
       StudentLoan loan = null;
       if((index >= 1)) {
           loan = loans.get(index - 1);
        }
       if(loan != null) {
           loans.remove(loan);
        }
       return loan;
   }
}
