## mySandbox-FC001
<br>
<br>

<img width="520" height="767" alt="OpenAI Chat_api_joke_ok" src="https://github.com/user-attachments/assets/e48418bd-a2f5-45a1-9218-6205f9e8d0c9" />

<br>
<br>

### 동기 :
지난 중간프로젝트 (MoA Project)때 chatbot을 전시 게시판에 한 요소로 구현해 보려했는데, 전시 공공 데이터를 API로 수집해 와서 전시데이터 DB 구축하는데 예상외로 어려움과 시간이 많이 걸렸고, 이어지는 전시 게시판 목록 조회와 상세 전시글에 대한 CRUD를 구현하느라 chatbot은 화면만 만들어 놓고 실제 구현은 하지 못해서 아쉬운 점이 많았습니다. 파이널 프로젝트에서는 미리 기능의 한 요소로 기준이 될 chatbot을 만들어 놓고 시작하면 실제 구현 가능성이나, 전체 프로젝트에 미치는 파급력이 클 것 같아서 미리 프로토 타입을 만들어 봅니다.

### 챗봇 :
- STS4 IDE
- Spring AI project [ https://spring.io/projects/spring-ai ] 를 이용한 ChatGPT-4o-mini 챗봇
- 상세 dependency는 build.gridle을 참조해 주세요.

### 앱 실행 전 필수 준비사항:
1. openai-api-key 발급: https://platform.openai.com/settings/organization/api-keys 에서 "Create new secret key"로 발급받는다.
2. openai-api-key 등록: STS4 IDE 상단메인메뉴에서 "Run\Run Configurations..." 로 가서 "Environment"탭을 클릭해서 "Add..." 버튼누르고 Variable="OPENAI_API_KEY", Value=sk-proj-.... (<=발급받은키값) 을 세팅해준다.

### 기타:
1. 원래 국내 LLM(Naver HyperClovX 와 LG Exaone)을 달아보고 싶었는데 Spring AI에서는 지원이 않되는 것 같아서 OpenAI-gpt-4o-mini(가성비?)로 하게 되었습니다.
2. OpenAI API 과금 관련하여, 현재 까지 매우 간단한 메시지 몇 개만(아마 전체 ~100토큰 미만)을 성공 여부 테스트로 보낸거라서 그랬는지 API 과금은 아직까지 없었는데, 테스트시 간단한 메시지 부터 시작해 보시고, 만약 API 과금이 되었을 때 그게 페이가 않되면 과금에러가 뜬다고 하니 참고해 주세요.  
3. 관련하여 OpenAI API과금이 토큰수 기준이라 토큰 수 정보가 있으면 참고가 될 것 같아 서버측&클라이이언트측 토큰수 추정값을 보고 싶어 포함해 보았는데, 서버계산 토큰값은 메타정보를 가져오는데 어려움이 있어 그냥 더미값을 넣어줘 의미없는 값이고, 클라이언트 추정 토큰은 4글자당 1 토큰으로 대략 계산한 값 이므로 API사용량 별 과금액수 추정에  대략적인  참고로만 봐주시면 좋을 것 같습니다.(좀더 정확한 토큰 값을 원하시면 JS 계산부분에 토큰나이저를 붙여 보세요)

