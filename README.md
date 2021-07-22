스프링부트 2.5.2<br/>
java 1.8<br/>
테스트 코드 : junit4.12<br/>
코드 커버리지 : lombok, jacoco<br/>
<br/>
model에서 롬복을 이용한 어노테이션은 커버리지의 정확한 측정을 위해 필요한 @Getter, @Setter만 선언


• model, controller, service, repository 패키지 구조<br/>
1. model : dto, vo 클래스 정의<br/>
  1-1) param : 컨트롤러에서 파라미터로 받는 클래스<br/>
  1-2) entity :  DB에서 select문 결과를 반환할 클래스<br/>
  1-3) result : ResponseEntity Json 현태로 반환될 결과값 저장 클래스<br/>
  <br/>
2. service : 중간 매개체 역할을 할 클래스<br/>
3. controller : 비즈니스 로직 및 요청을 처리할 클래스<br/>
4. repository : DB에서 받아온 값을 관리할 클래스<br/>
<br/>
<img width="308" alt="스크린샷 2021-07-22 오후 5 16 53" src="https://user-images.githubusercontent.com/80495138/126609633-2920c19b-f020-49af-9efc-84ec43104d65.png">






한글값을 http 파라미터로 넘겼을 때 인코딩 문제를 해결하기 위해 application.properties에 http encoding UTF-8 설정<br/>
<br/>
<img width="702" alt="스크린샷 2021-07-22 오후 5 09 15" src="https://user-images.githubusercontent.com/80495138/126608016-fdddc47d-13aa-4dbf-9164-fc25a6c132cb.png">

junit / jacoco 의존성 주입<br/>
<br/>
<img width="627" alt="스크린샷 2021-07-22 오후 5 10 32" src="https://user-images.githubusercontent.com/80495138/126608220-cfa21716-42a8-4183-8f62-4e2bfe512966.png">

