package project;

/*
<멤버변수(Member variable)>
- 클래스부에 선언된 변수들로 객체의 속성에 해당.
-인스턴스 변수와 클래스 변수로 구분됨.

<인스턴스 변수(Instance variable)>
- 클래스가 인스턴스될 때 초기화되는 변수.
- 인스턴스를 통해서만 접근할 수 있음.

<매개 변수(Parameter)>
- 메서드에 인자로 전달되는 값을 받기 위한 변수.
- 메서드 내에서는 지역변수 처럼 사용됨.

<지역 변수(Local variable)>
- 메서드 내에서 선언된 변수.
- 멤버변수와 동일한 이름을 가질수 있으며 지역변수가 우선.

<클래스 변수(Class variable)>
- static 으로 선언된 변수.
- 인스턴스 생성없이 클래스이름.변수명으로 사용가능.
- main() 메서드에서 참조 가능.
*/

public class Variables {
    // 멤버 변수, 인스턴스 변수
    int num1;
    
    // 멤버 변수, 클래스 변수
    static int num2;
    
    // 매개변수
    public void printName(String name) {
        // 지역변수
        String prtMsg = name + " Hello";
        System.out.println(prtMsg);
    }
    
    public static void main(String[] args) {
        // 인스턴스 생성
        Variables mc = new Variables();
        // 인스턴스 변수 사용
        mc.num1 = 100;
        // 클래스 변수 사용
        Variables.num2 = 50; // num2 = 50 으로 사용해도 됨.
        
        // 인자로 매개변수에 값을 전달
        mc.printName("김동진");
        
        System.out.printf("%d,%d%n", mc.num1, Variables.num2);
    }
}
