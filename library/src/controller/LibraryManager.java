package controller;

import model.Card;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

public class LibraryManager {
    List<Card> cards;
    public LibraryManager(List<Card> cards) {
        this.cards = cards;
    }
    public void addStudent(Card card){
        cards.add(card);
    }
    public String display(){
        return cards.toString();
    }

    public String listStudentReturnBook(){
        LocalDate now = LocalDate.now();
        LocalDate lastDay = now.with(TemporalAdjusters.lastDayOfMonth());
        StringBuilder builder = new StringBuilder();
        for (Card card:cards) {
            if (card.bookReturnDate().equals(lastDay)){
                builder.append("Tên sinh viên: ").append(card.getStudent().getName()).
                        append("; mã số sách: ").append(card.getBookNumber()).append("\n");
            }
        }
        return builder.toString();
    }
}
