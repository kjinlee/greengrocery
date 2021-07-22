스프링부트 2.5.2<br/>
java 1.8<br/>
테스트 코드 : junit4.12<br/>
코드 커버리지 : lombok, jacoco<br/>
<br/>
model에서 롬복을 이용한 어노테이션은 커버리지의 정확한 측정을 위해 필요한 @Getter, @Setter만 선언

한글값을 http 파라미터로 넘겼을 때 인코딩 문제를 해결하기 위해 application.properties에 http encoding UTF-8 설정<br/>
<img width="702" alt="스크린샷 2021-07-22 오후 5 09 15" src="https://user-images.githubusercontent.com/80495138/126608016-fdddc47d-13aa-4dbf-9164-fc25a6c132cb.png">

junit / jacoco 의존성 주입<br/>
<img width="627" alt="스크린샷 2021-07-22 오후 5 10 32" src="https://user-images.githubusercontent.com/80495138/126608220-cfa21716-42a8-4183-8f62-4e2bfe512966.png">

