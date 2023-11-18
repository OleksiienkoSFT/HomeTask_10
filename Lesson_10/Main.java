package Lesson_10;

import Lesson_10.Box.Box;
import Lesson_10.Fruits.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Task 1
        System.out.println("Task 1");
        List<String> list = new ArrayList<>();
        list.add("Hello ");
        list.add("World! ");
        list.add("Goodbye ");
        list.add("School");
        list.add("!!!");

        System.out.println(list.size());
        for (String s: list){
            System.out.print(s + " ");
        }
        System.out.println();

        // Task 2
        System.out.println("Task 2");
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        for (int i = listInteger.size()-1; i >= 0; i--) {
            System.out.print(listInteger.get(i) + " ");
        }
        System.out.println();

        // Task 3 and 4
        System.out.println("Task 3 and 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 5 слів по черзі.");
        List<String> listTask_3_4_5 = new ArrayList<>();
        listTask_3_4_5.add(0,scanner.nextLine());
        listTask_3_4_5.add(0,scanner.nextLine());
        listTask_3_4_5.add(0,scanner.nextLine());
        listTask_3_4_5.add(0,scanner.nextLine());
        listTask_3_4_5.add(0,scanner.nextLine());


        for(String s : listTask_3_4_5){
            System.out.print(s + " ");
        }
        System.out.println();

        // Task 5
        System.out.println("Task 5");
        String lastWord = listTask_3_4_5.get(listTask_3_4_5.size()-1);
        listTask_3_4_5.remove(listTask_3_4_5.size()-1);
        listTask_3_4_5.add(0, lastWord);
        for(String s : listTask_3_4_5){
            System.out.print(s + " ");
        }
        System.out.println();

        // Task 6
        System.out.println("Task 6");
        List<Integer> listTask_5_6 = new ArrayList<>();
        System.out.println("Введіть 5 цілих цифр по черзі");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            if (number%2 != 0){
                listTask_5_6.add(0,number);
            }
            else {
                listTask_5_6.add(number);
            }
        }

        System.out.println();
        for (Integer i : listTask_5_6){
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 7 	Ввести з клавіатури 5 чисел. Видалити числа, які більше 6.
        System.out.println("Task 7");
        for (int i = listTask_5_6.size()-1; i >=0; i--) {
            if (listTask_5_6.get(i) > 6) {
                listTask_5_6.remove(i);
            }
        }

        for (Integer in : listTask_5_6){
            System.out.print(in + " ");
        }
        System.out.println();

        // Task 8
        System.out.println("Task 8");
        Apple apple = new Apple("apple");
        Bananas bananas = new Bananas("bananas");
        Grape grape =  new Grape("grape");
        Pear pear = new Pear("pear");
        Plum plum = new Plum("plum");

        List<Fruits> fruitsList =  new ArrayList<>();
        fruitsList.add(apple);
        fruitsList.add(bananas);
        fruitsList.add(grape);
        fruitsList.add(pear);
        fruitsList.add(plum);

        for (Fruits s: fruitsList){
            System.out.print(s.getName() + " ");
        }

        // Task 9
        System.out.println();
        System.out.println("Task 9");
        Box box1 = new Box(100);
        Box box2 = new Box(200);
        Box box3 = new Box(300);
        Box box4 = new Box(400);
        Box box5 = new Box(500);
        Box box6 = new Box(600);
        Box box7 = new Box(700);
        Box box8 = new Box(800);
        Box box9 = new Box(900);
        Box box10 = new Box(50);


        List<Box> boxList = new ArrayList<>();
        boxList.add(box1);
        boxList.add(box2);
        boxList.add(box3);
        boxList.add(box4);
        boxList.add(box5);
        boxList.add(box6);
        boxList.add(box7);
        boxList.add(box8);
        boxList.add(box9);
        boxList.add(box10);

        List<Box> boxList_Less = new ArrayList<>();
        List<Box> boxList_More = new ArrayList<>();
        for (int j = boxList.size()-1; j >= 0 ; j--) {
            if (300 > boxList.get(j).getWeight()){
                boxList_Less.add(boxList.get(j));
            }
            else {
                boxList_More.add(boxList.get(j));

            }
        }
        for (Box b: boxList_Less){
            System.out.print(b.getWeight() + " ");
        }
        System.out.println();

        for (Box b: boxList_More){
            System.out.print(b.getWeight() + " ");
        }
        System.out.println();

        // Task 10
        System.out.println();
        System.out.println("Task 10");
        Student oleg = new Student("Olegek","OT-2023", 4, 3.3);
        Student serik = new Student("Seregik","OT-2023", 2, 2.3);
        Student petya = new Student("Petrik","OT-2023", 3, 4.3);
        Student dima = new Student("Dimonchik","OT-2023", 4, 1.3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(oleg);
        studentList.add(serik);
        studentList.add(petya);
        studentList.add(dima);

        // переводимо студентів
        removeStudent(studentList);
        System.out.println();

        // друкуємо студентів курсу
        printStudents(studentList, 4);


    }
    // Метод для переведення студентів

    public static void removeStudent(List<Student> list){
        for (int i = list.size()-1; i >=0 ; i--) {
            if (list.get(i).getRating()<3.0){
                System.out.println("Студента " + list.get(i).getName() + " видаоено.");
                list.remove(i);
            }
            else {
                System.out.println("Ура. " + list.get(i).getName() + " переведено на наступний курс.");
            }
        }
        System.out.println();

    }
    // Метод для друку на консоль імена тих студентів зі списку, які навчаються на цьому курсі.
    public static void printStudents(List<Student> students, int course){
        for (Student s: students){
            if (s.course == course){
                System.out.println(s.getName() + " навчається на курсі - " + course);
            }
        }
    }
}
