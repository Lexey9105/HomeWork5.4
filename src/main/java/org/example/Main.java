package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        //код к перому вопросу пятго билета
        Student student= new Student("Студент",14);
        SkyProStudent skyProStudent=new SkyProStudent("Василий Пупкин",20);
        //Student student2=new SkyProStudent("Василий Пупкин",20);
        Student student2=new SkyProStudent("Леон",18);
        System.out.println(skyProStudent.hashCode());
        System.out.println(student2.hashCode());

        student.greetings();
        skyProStudent.greetings();
        student2.greetings();





        //код ко второму вопросу пятго билета

        String e1="A";
        String e2="A";
        StringBuffer a1=new StringBuffer();
        StringBuffer a2=new StringBuffer();
        a1.append("A");
        a2.append("A");
        StringBuilder b1=new StringBuilder();
        StringBuilder b2=new StringBuilder();
        b1.append("A");
        b2.append("A");

         System.out.println(e1.hashCode()+" " + e2.hashCode());
         System.out.println(a1.hashCode()+" " + a2.hashCode());
         System.out.println(b1.hashCode()+" " + b2.hashCode());






        //код к третьему вопросу пятго билета

        int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }}
            System.out.println(Arrays.toString(arr));


        List<Integer> list = Arrays.asList(5,4,3,2,1,9,8,7,6);
        Collections.sort(list);
        System.out.println(list);


        Set<Student> unsortedSet =new HashSet<>();
        unsortedSet.add(student);
        unsortedSet.add(student2);
        unsortedSet.add(skyProStudent);
        System.out.println(unsortedSet.toString());
        Set<Student> sortedSet = new TreeSet<Student>(new Comparator<Student>()
        { public int compare(Student o1, Student o2) { return o1.toString().compareTo(o2.toString());
        }
        });
        sortedSet.addAll(unsortedSet);
        System.out.println(sortedSet.toString());

    }
}