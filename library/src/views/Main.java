package views;

import controller.LibraryManager;
import model.Card;
import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Card> cards = new ArrayList<>();
    public static LibraryManager manager = new LibraryManager(cards);
    public static Scanner input = new Scanner(System.in);
    public static int checkInput;
    public static void main(String[] args) {
        do {
            System.out.println("""
                    Menu-------------------------------
                    1. Nhập thông tin sinh viên
                    2. Hiển thị thông tin cá nhân
                    3. Danh sách sinh vên kèm sách phải trả cuối tháng
                    0. Thoát.""");
            checkInput = Integer.parseInt(input.nextLine());
            switch (checkInput) {
                case 1 -> manager.addStudent(addNewStudent());
                case 2 -> infoStudent();
                case 3 -> listStudent();
                case 0 -> System.out.println("Hẹn gặp lại");
                default -> System.out.println("Vui lòng nhập theo menu!");
            }
        } while (checkInput != 0);
    }
    public static Card addNewStudent(){
        Card studentInfo = null;
        try {
            System.out.println("Nhập tên sinh viên:");
            String name = input.nextLine();
            System.out.println("Nhập mã sinh viên:");
            String id = input.nextLine();
            System.out.println("Nhập ngày sinh:");
            String dateOfBirth = input.nextLine();
            System.out.println("Nhập tên lớp:");
            String className = input.nextLine();
            System.out.println("Nhập số thẻ:");
            String cardNumber = input.nextLine();
            LocalDate day = LocalDate.now();
            System.out.println("Nhập số ngày trước hạn:");
            int date = Integer.parseInt(input.nextLine());
            System.out.println("Nhập số hiệu sách:");
            String bookNumber = input.nextLine();
            Student student = new Student(name, id, dateOfBirth, className);
            studentInfo = new Card(student, cardNumber, day, date, bookNumber);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return studentInfo;
    }

    public static void infoStudent() {
        if (cards.isEmpty()) {
            System.out.println("Không có sinh viên mượn sách");
        } else {
            System.out.println("Danh sách sinh viên: " + manager.display());
        }
    }
    public static void listStudent() {
        if (cards.isEmpty()) {
            System.out.println("Không có sinh viên trả sách ngày cuối tháng");
        } else {
            System.out.println("Danh sách tên sinh viên, tên sách mượn cần trả vào ngày cuối tháng:");
            System.out.println(manager.listStudentReturnBook());
        }

    }
}