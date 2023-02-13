package model;

import java.time.LocalDate;

public class Card{
    private Student student;
    private String cardNumber;
    private LocalDate borrowedDate;
    private int date;
    private String bookNumber;

    public Card() {
    }

    public Card(Student student, String cardNumber, LocalDate borrowedDate, int date, String bookNumber) {
        this.student = student;
        this.cardNumber = cardNumber;
        this.borrowedDate = borrowedDate;
        this.date = date;
        this.bookNumber = bookNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }
    public LocalDate bookReturnDate() {
        return borrowedDate.plusDays(getDate());
    }

    @Override
    public String toString() {
        return "[" +student.toString() +
                ", Số thẻ'" + cardNumber +
                ", Ngày mượn'" + borrowedDate +
                ", Số ngày mượn: '" + date +
                ", Số hiệu sách'" + bookNumber + '\n' +
                ']';
    }
}
