/**
 * The Student class represents details of a student's loan
 * for a student loan company.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2013.11.21
 */
public class StudentLoan
{
    // the student ID
    private String id;
    // the amount of the loan
    private int amount;

    /**
     * Create a new student with a given ID and loan amount.
     * @param id The student's ID
     * @param amount The loan amount. 
     *               This must not be negative.
     * @throws IllegalStateException if amount is negative.
     */
    public StudentLoan(String id, int amount)
    {
        if(amount >= 0) {
            this.id = id;
            this.amount = amount;
        }
        else {
            throw new IllegalStateException(
                    "The loan amount for " + id +
                    " must not be negative: " +
                    amount);
        }
    }

    /**
     * Return the ID of this student.
     * @return The ID.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Return the amount of the loan for this student.
     * @return The loan amount.
     */
    public int getAmount()
    {
        return amount;
    }

    /**
     * Pay off some of the loan.
     * @param payment The amount to be paid off.
     */
    public void payOff(int payment)
    {
        if(payment >= 0) {
            if(payment <= amount) {
                amount -= payment;
            }
            else {
                System.out.println("The payment is too high.");
                printDetails();
            }
        }
        else {
            System.out.println("Negative payments are not allowed.");
        }
    }

    /**
     * Print the student's ID number and amount left to pay.
     */
    public void printDetails()
    {
        System.out.println("Student ID: " + id +
                           " owes " + amount);
    }
}
