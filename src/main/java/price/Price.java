package price;

import course.Course;
import java.util.Calendar;

public class Price {
    private int priceOfCourse;
    private int numberOfThePaymentMonth ;
    private Course course;
    private String currentAccountNumber;
    private Calendar paymentTransactionDate;

    public int getPriceOfCourse() {
        return priceOfCourse;
    }

    public void setPriceOfCourse(int priceOfCourse) {
        this.priceOfCourse = priceOfCourse;
    }

    public int getNumberOfThePaymentMonth() {
        return numberOfThePaymentMonth;
    }

    public void setNumberOfThePaymentMonth(int numberOfThePaymentMonth) {
        this.numberOfThePaymentMonth = numberOfThePaymentMonth;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getCurrentAccountNumber() {
        return currentAccountNumber;
    }

    public void setCurrentAccountNumber(String currentAccountNumber) {
        this.currentAccountNumber = currentAccountNumber;
    }

    public Calendar getPaymentTransactionDate() {
        return paymentTransactionDate;
    }

    public void setPaymentTransactionDate(Calendar paymentTransactionDate) {
        this.paymentTransactionDate = paymentTransactionDate;
    }

    public Price(int priceOfCourse, int numberOfThePaymentMonth, Course course, String currentAccountNumber, Calendar paymentTransactionDate) {
        this.priceOfCourse = priceOfCourse;
        this.numberOfThePaymentMonth = numberOfThePaymentMonth;
        this.course = course;
        this.currentAccountNumber = currentAccountNumber;
        this.paymentTransactionDate = paymentTransactionDate;
    }
    
}
