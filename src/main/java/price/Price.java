package price;

import course.Course;
//import java.util.Calendar;

public class Price {
    private int priceOfCourse;
    private int numberOfThePaymentMonth ;
    private Course course;
//    private Calendar paymentTransactionDate;

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

//    public Calendar getPaymentTransactionDate() {
//        return paymentTransactionDate;
//    }
//
//    public void setPaymentTransactionDate(Calendar paymentTransactionDate) {
//        this.paymentTransactionDate = paymentTransactionDate;
//    }

    public Price(int priceOfCourse, int numberOfThePaymentMonth, Course course) {
        this.priceOfCourse = priceOfCourse;
        this.numberOfThePaymentMonth = numberOfThePaymentMonth;
        this.course = course;
//        this.paymentTransactionDate = paymentTransactionDate;
    }
    public Price (){
        this.priceOfCourse = 1500;
        this.numberOfThePaymentMonth = 6; 
    }
    
}
