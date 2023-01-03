package CodingTest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 학생 이름을 검색할지 물어본 후 y,n으로 의사 수령 (반복)
 * 학생 이름이 있을 시 학번 출력
 * 없을 시 없는 학생이라고 출력
 */


public class Student {
    private String name;
    private String no;

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Student(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public static void main(String[] args) {
        Student student1 = new Student("철수", "0106");
        Student student2 = new Student("유리", "0107");
        Student student3 = new Student("짱구", "0108");

        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        for (Student student : list) {
            System.out.println("이름: " + student.getName() + " ||학번: " + student.getNo());
        }

        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("계속하려면 'y', 종료하려면 'n' ");
            String input = scanner.next();
            if (input.equals("y")) {
                System.out.println("진행중");
                String name = scanner.next();
                boolean flag = false;

                for(Student student : list){
                    if (name.equals(student.getName())) {
                        System.out.println(student.getNo());;
                        flag = true;
                    }
                }
                if(!flag){
                    System.out.println("해당 학생이 없습니다.");
                }

            } else if (input.equals("n")){
                break;
            }
        }
        System.out.println("종료되었습니다.");
    }

}
