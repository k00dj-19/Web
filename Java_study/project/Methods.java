package project;

/*
메서드는 특정 객체의 동작이나 행위를 정의한 것으로 클래스의 주요 구성요소 입니다.

<메서드 선언 방법>
[접근제어자] 리턴타입 메서드명([인자..]) {

}

- 접근제어자: 메서드의 접근 범위를 지정.
- 리턴 타입을 반드시 명시해야 하며 리턴이 없는 경우에도 void를 사용.
    
<메서드 오버로딩(Overloading)>
- 리턴값이나 인자가 다른 여러 메서드를 동일한 이름으로 선언하는것.

<가변 인자(Variable arguments)>
- 인자의 수가 유동적인 메서드
- String... msg와 같이 가변인자를 사용.

<생성자 메서드(Constructor method)>
- 클래스가 인스턴스될 때 호출되는 메서드.
- 클래스 실행시 초기화 작업을 수행.
- 메서드 오버로딩에 의해 여러 생성자가 있을 수 있음.

*/


public class Methods {
    String name;
    
    // 생성자 메서드
    Methods() {
        name = "김동진";
        System.out.printf("#생성자: %s\n", name);
    }
    
    // 인자가 없는 메서드
    void printName() {
        System.out.printf("#printName(): %s\n", name);
    }
    
    // 인자가 하나인 메서드(메서드 오버로딩), 인자 값이 출력됨.
    void printName(String name) {
        System.out.printf("#printName(String name): %s\n", name);
    }
    
    // 가변인자를 사용한 메서드
    void printNames(String...name) {
        System.out.println("#printNames(String...name)");
        for(String s : name) {
            System.out.println(s);
        }
    }
    
    // 인자가 두개인 메서드
    int calc(int num1, int num2){
        return num1+num2;
    }
    
    public static void main(String[] args) {
        Methods m = new Methods();
        m.printName();
        m.printName("홍길동");
        m.printNames("아무개","홍길동","박하람");
        System.out.printf("#calc(int num1, int num2): %d\n", m.calc(20,50));
    }
    
}
