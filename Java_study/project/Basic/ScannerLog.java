package project.Basic;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
<java.util.logging>
자바에서 기본으로 제공되는 로깅 라이브러리 입니다. 기본적으로 로그 메시지들은 다음과 같이 레벨에 따른 의미를 가지고 있어 로그를 남길때 적절하게 선택해 사용해야 합니다. 로그 레벨은 로깅 프레임워크에 따라 조금씩 다를수 있습니다.

- SEVERE: 가장 심각한 레벨로 시스템에 문제가 발생한 경우 사용.
- WARNING: 문제를 발생시킬수도 있는 잠재적 문제 발생시 사용.
- INFO: 정보성 메시지로 실행기록, 입력값 확인 등에 사용.
- CONFIG: 프로그램의 설정관련 메시지.
- FINE: 개발자 레벨로 로거에 따라 DEBUG 레벨로 취급되기도 함. 프로그램 분석등을 위한 정보 출력에 사용.
- FINER: 비교적 상세한 Trace 메시지로 특정 함수나 클래스 진입, 리턴등에 대한 정보가 포함됨.
- FINEST: 가상 상세한 Trace 메시지로 시스템의 정보나 송수신된 메시지 전문등.
*/

public class ScannerLog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int num = scan.nextInt();

        System.out.println(name);
        System.out.println(num);

        Logger logger = Logger.getLogger("MyLogger");
        logger.info("Main program started !!");
        logger.log(Level.WARNING, "Data file size too big");

        logger.setLevel(Level.FINE);
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.FINE);
        logger.addHandler(ch);

        logger.fine("Shutdown main program !!");
    }
}
