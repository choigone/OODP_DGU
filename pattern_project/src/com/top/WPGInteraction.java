package com.top;

import java.util.Scanner;
import java.util.Vector;

//TODO 이 클래스가 너무 많은 책임을 지고있는 것 같다 -> 이게 중재자 패턴은 아니겠지 ?
public class WPGInteraction {

    //member
    //TODO 학생은 하나만 생성되어야 할까? Singleton
    private Student student;
    private Vector<Content> peoples;
    private Vector<Content> things;

    // program message
    static final String START_MESSAGE = "Word Problem Generator가 시작합니다.";
    static final String START_MESSAGE_TO_PARENTS = "환영합니다 ! 학부모님 ! 절차에 맞게 답해주세요.";
    static final String GET_CHILD_NAME_MESSAGE = "자녀의 이름을 입력해주세요 : ";
    static final String GET_IMPORTANT_PEOPLE_NAME_MESSAGE = "자녀에게 중요한 사람의 이름을 입력해주세요, 종료시 0을 입력하세요 : ";
    static final String GET_INTERESTED_THINGS_NAME_MESSAGE = "자녀가 관심을 갖는 항목의 이름을 입력해주세요, 종료시 0을 입력하세요 : (예 > 인형, 책, 비디오, 축구 등) : ";
    static final String GET_CALCULATE_MESSAGE = "연산의 종류를 선택하세요\n1. 더하기 2. 빼기 3. 곱하기 4. 나누기\n : ";
    static final String GET_PROBLEM_NUM_MESSAGE = "생성할 문제의 수를 입력해주세요 : ";
    static final String GET_RANGE_NUM_MESSAGE = "피연산자의 범위를 입력해주세요 : ";
    static final String ALERT_GENERATING_PROBLEM_MESSAGE = "사용자 맞춤형 연습 문제집을 생성합니다. ";
    //TODO 점수 수정
    static final String ALERT_SCORE_MESSAGE = "<점수>점 입니다 ! ";
    static final String PROGRAM_END_MESSAGE = "프로그램을 종료합니다.";

    // non static program message
    final String START_MESSAGE_TO_STUDENT = "환영합니다 !"+ student.getName() +"학생 ! 문제풀기를 시작하세요 !";

    // java object
    Scanner sc = new Scanner(System.in);

    public void getChildName(){
        student = new Student();
        System.out.println(GET_CHILD_NAME_MESSAGE);
        String name = sc.nextLine();
        student.setName(name);
    }

    public void getThings(){
        String name;
        while(true){
            System.out.println(GET_INTERESTED_THINGS_NAME_MESSAGE);
            name = sc.nextLine();
            if(name.equals("0")) break;
            Content things = new Things(name);
            peoples.add(things);
        }
    }

    public void getPeoples(){
        String name;
        int gender;
        while(true){
            System.out.println(GET_IMPORTANT_PEOPLE_NAME_MESSAGE);
            System.out.println("이름 : ");
            name = sc.nextLine();
            System.out.println("성별 ( 1.여 2.남 ) : ");
            gender = sc.nextInt();
            if(name.equals("0")) break;
            Content people = new People(name,gender);
            things.add(people);
        }
    }

    public void run(){
        System.out.println(START_MESSAGE);
        System.out.println(START_MESSAGE_TO_PARENTS);
        getChildName();
        getPeoples();
        getThings();

    }
}
