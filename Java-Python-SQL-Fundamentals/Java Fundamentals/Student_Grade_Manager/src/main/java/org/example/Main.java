package org.example;

import java.util.ArrayList;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Part 1 - Array
        String[] studentNames = {"Andrew", "Sarah", "Lucky", "Tracy", "Morgan"};

        System.out.println("Testing: " + studentNames[1]);


        for (int indexNumber = 0; indexNumber < studentNames.length; indexNumber++) {

            System.out.println("Student Name: " + studentNames[indexNumber]);
        }

        System.out.println("\n------------------------------------------------------------------------------\nPart 2: \n");

        //Part 2- Array list
        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Mathematics");
        subjects.add("English");
        subjects.add("Science ");
        subjects.add("History");
        subjects.add("Physics");

        System.out.println(subjects.size());
        System.out.println("Subjects: " + subjects);
        System.out.println("\n---------------------------------------------------------\n");

        subjects.add(2, "Geography");
        subjects.add(1, "Arts");
        System.out.println("Subjects: " + subjects);
        //i dont really know how we use size
        System.out.println("Total Subjects: " + subjects.size());

        System.out.println("\n---------------------------------------------------------\n");
        subjects.remove(0);
        subjects.remove(3);
        System.out.println("Subjects: " + subjects);
        System.out.println("Total Subjects: " + subjects.size());

        System.out.println("\n---------------------------------------------------------\n");

        subjects.set(4, "Robotics");
        subjects.set(0, "Isizulu");
        System.out.println("Subjects: " + subjects);
        System.out.println("Total Subjects: " + subjects.size());

        System.out.println("\n------------------------------------------------------------------------------\nPart 3:\n");


        //Part 3 - Map

        Map<String, Integer> studentMarks = Map.of(
                "Andrew", 78,
                "Sarah", 50,
                "Lucky", 98,
                "Tracy", 60,
                "Morgan", 90
        );

        System.out.println("Andrew scored: " + studentMarks.get("Andrew"));
        System.out.println("Sarah scored: " + studentMarks.get("Sarah"));
        System.out.println("Lucky scored: " + studentMarks.get("Lucky"));
        System.out.println("Tracy scored: " + studentMarks.get("Tracy"));
        System.out.println("Morgan scored: " + studentMarks.get("Morgan"));

        System.out.println("\n------------------------------------------------------------------------------\nPart 5: \n");
        

        // part 5
        for (int subjectIndex = 0; subjectIndex < subjects.size(); subjectIndex++) {

            System.out.println("Subject: " + subjects.get(subjectIndex));
        }

        // this is how java suggests i do it, i think its enhanced for loop:
        /*for (String subject : subjects) {

            System.out.println("Subject: " + subject);
        }

         */


        System.out.println("\n---------------------------------------------------------\nPart 4: \n");

        for (String student : studentNames) {
            System.out.println("Student Name: " + student);


        }
        System.out.println("\n---------------------------------------------------------\n");


        int highestMark = 0;

        for (int mark : studentMarks.values()) {

            if (mark > highestMark) {
                highestMark = mark;
            }

        }

        System.out.println("Highest Mark: " + highestMark);

        System.out.println("\n---------------------------------------------------------\nPart 7: \n");








    }


}