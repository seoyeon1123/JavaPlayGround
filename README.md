# JavaPlayGround

1. **상속과 인터페이스 구현**
   - DeliveryChargeCalculator 인터페이스의 getDeliveryCharge 메소드 리턴타입을 BigDecimal 사용해서 구현해보기
     
2. **연락처 관리 프로그램**
   
   ![image](https://github.com/seoyeon1123/JavaPlayGround/assets/155455327/6d3d5586-6000-42c6-afba-ecbae9fabb93)
   - 반복문
   - String 클래스의 내부 메서드
   - 콘솔 입출력(Scanner)
   - ArrayList
  
3. **알고리즘 - 괄호 짝 맞추기**
* Stack 클래스 사용: 스택은 데이터를 나중에 넣은 것이 먼저 나오는 Last-In-First-Out (LIFO) 구조를 가지고 있으며, 괄호 짝을 확인하는데 사용<br>
‼️ **for(char ch : inputString.toCharArray())‼️**<br>
-> 입력된 문자열을 순회하며 각 문자를 확인하는 for-each 루프를 시작,<br>
   현재 문자가 여는 괄호 '('인 경우, 스택에 해당 여는 괄호를 푸시(push),<br>
   현재 문자가 닫는 괄호 ')'인 경우, 스택이 비어있는지 확인한 후,<br>
   비어있다면 닫는 괄호에 대응하는 여는 괄호가 없다는 의미이므로 올바른 괄호 짝이 아니라고 판단하고 false를 반환<br>
   그렇지 않은 경우에는 스택에서 가장 최근에 푸시한 여는 괄호를 팝(pop)한다.
