# [팀프로젝트] 맛.JAVA - 맛.ZIP
#### �� 맛.ZIP은 “진짜 믿고 먹을 수 있는 맛집” 을 공유하는 플랫폼입니다.
* (여기 뭐라고 소개를 해야하냐.................?)
​
<br>
​
## 1. 제작 기간
#### `2023년 4월 28일 ~ 6월 9일 (1개월)`
​
<br>
​
## 2. 사용 기술
### `Back-end`
* Java 8
* Spring Framework 5.0.1
* Maven
* Mybatis
* MySQL 8.0.32
​
### `Front-end`
* HTML
* CSS
* JavaScript
* JQuery 3.6.4
* BootStrap 4.1
​
### `Server`
* tomcat 8.5
* AWS
​
<br>
​
## 3. 기능 구현
* #### `회원가입, 로그인, 마이페이지, AI챗봇`
  * (각자 본인의 기능 간략하게 작성바람)
​
* #### `영수증 등록, 검색기능`
  * (각자 본인의 기능 간략하게 작성바람)
​
* #### `음식점 상세페이지`
  * 1. 음식점 상세정보 CRUD 기능
  * 2. 카테고리별 음식점 검색 기능
  * 3. 상세페이지 URL 복사(for 공유하기)
  * 4. 네이버 포털사이트 이동하여 해당 음식점 검색
  * 5. 카카오 API 사용
  * -> 해당 음식점의 주소를 받아서 지도 띄우기 + 해당 음식점의 위치를 기반으로 카테고리별 장소 검색
​
* #### `회원 커뮤니티`
  * (각자 본인의 기능 간략하게 작성바람)
​
* #### `사장 커뮤니티`
  * (각자 본인의 기능 간략하게 작성바람)
​
* #### `포인트 시스템, 랭킹 시스템(또슐랭 가이드)`
  * (각자 본인의 기능 간략하게 작성바람)
​
* #### `캘린더`
  * (각자 본인의 기능 간략하게 작성바람)
​
<br>
​
## 4. 핵심 기능 설명 & 트러블 슈팅
#### 1. 음식점 상세페이지
<details>
  <summary>📌핵심 기능 설명</summary>
	
  ##### `1. 음식점 상세정보 CRUD 기능`
  * 공공데이터 CSV 찾기 & mzlist테이블에 임의로 맛집으로 선정한 음식점들(약 25곳) 삽입
  * 이미지 저장
	* 공공데이터의 데이터들 중, 임의로 맛집으로 선정한 음식점들(약 25곳)들의 이미지들을 5개씩 저장하여 resources 아래에 이미지 저장 
  * CRUD 기능
	-> 주소 클릭 jsp -> MzlistMapper -> MzlistController -> MzlistDAO -> 상세페이지 jsp파일
	* MzlistMapper
		* mzlist 테이블에서 landNumAddress가 주어진 값과 일치하는 데이터를 조회, resultType으로 지정된 mzlistVO 클래스에 매핑되어 결과를 반환함.
	* MzlistController
		* MzlistController에서 경로 요청이 들어오면, landNumAddress를 사용하여 데이터를 조회하고 Model 객체를 통해서 View와의 상호작용을 통해 View에 데이터를 제공함.
	* MzlistDAO
		* mzlist에서 landNumAddress를 기준으로 데이터를 조회해서 MzlistVO 객체로 반환하는 메서드 사용하여, landNumAddress에 대한 정보를 가져옴.
	
	
  * 이미지 저장 및 출력
	* 공공데이터의 데이터들 중, 임의로 맛집으로 선정한 음식점들(약 25곳)들의 이미지들을 5개씩 저장

	
  * **‼결과‼** 주소를 전달하는 jsp 파일에서 쿼리스트링을 통해 주소를 요청하면 그 주소와 동일한 음식점의 데이터들이 검색되고, 상세페이지 jsp파일에 데이터들이 출력됨.
<!--   * [👉이미지로 전체 흐름 확인하기](null) -->
​
  ##### `2. 카테고리별 음식점 검색 기능` (위의 음식점 상세정보 CRUD 기능과 유사)
  * CRUD 기능
	-> 주소 클릭 jsp -> MzlistMapper -> MzlistController -> MzlistDAO -> 상세페이지 jsp파일

	
  * **‼결과‼** 카테고리별 음식(한식, 중식, 일식, 분식 등..) 이미지 박스를 클릭하면 해당 음식점 카테고리 페이지로 이동하여 mzlist테이블에 저장되어 있는 해당 카테고리의 음식점들의 상세정보와 이미지들이 출력됨.
  * [👉이미지로 전체 흐름 확인하기](null)
	
  ##### `3. 상세페이지 URL 복사(for 공유하기)`
	-> 클립보드에 텍스트를 복사하는 기능
  * 가상의 'texterea' 생성 -> textarea의 값을 복사할 텍스트로 설정 -> 
	textarea를 DOM에 추가 -> textarea 내용을 선택 -> textarea를 DOM에서 제거
	
  * **‼결과‼** URL 복사(공유하기) 버튼을 클릭하면 'URL이 클립보드에 복사되었습니다' 라는 문구의 alert가 뜨며, 'copyToClipboard()' 함수를 호출하여 텍스트를 클립보드로 복사
	
 ##### `4. 네이버 포털사이트 이동하여 해당 음식점 검색`
 	 -> location.href를 사용하여 생성된 URL로 페이지를 이동해서 사용자가 해당 음식점의 'landAddress'와 동일한 주소에 해당하는 네이버지도 URL로 이동할 수 있도록 함.
  * 함수 생성
	* searchOnNaverMaps() -> URL을 생성하고 페이지를 이동하는 역할을 하기 위함.
	* encodeURIComponent() -> name, landAddress, roadAddress를 URL 인코딩하기 위함.
  * 변수 설정
	* 'naverMapsURL' 변수를 생성해서 네이버 지도 URL을 할당
  * location.href를 사용하여 생성된 URL로 페이지 이동
	
  * **‼결과‼** 버튼을 클릭하면 name, landAddress, roadAddress를 인코딩하여 URL에 추가한 후 페이지를 이동   * [👉이미지로 전체 흐름 확인하기](null)
	
 ##### `5. 카카오 API 사용'
 -> 해당 음식점의 주소를 받아서 지도 띄우기 + 해당 음식점의 위치를 기반으로 카테고리별 장소 검색
   * 카카오 API 코드 분석
   * 
	
   * **‼결과‼** 상세정보페이지에 해당하는 음식점이 지도 위에 마커로 표시되며, 좌상단의 카테고리별 장소를 클릭하면 장소들이 마커 기준으로 근처에 있는 해당 장소들의 마커가 띄워지고, 마커를 클릭했을 때 카카오맵으로 이동됨.
   * [👉이미지로 전체 흐름 확인하기](null)
	
</details>
<details>
  <summary>⚽트러블 슈팅</summary>
​
<br>
	
  ##### `1. 일련의 규칙을 가진 이미지 출력 방법`
	** 문제상황: 카테고리별 음식점 검색 기능 구현 중, 각 음식점에 알맞은 이미지들이 출력되어야 하는데 동일한 음식점의 이미지들이 출력
	 -> 여러 이미지들을 DB에 저장하는 방식에 대한 고민 
	 -> **!!이미지를 DB에 저장할 때 일련의 규칙을 정해서 이미지 저장 -> 일련의 규칙대로 이미지들을 분리하는 작업을 통해 해당 음식점들에 이미지 분배!!**
	 -> mzlist테이블 중, 이미지 칼럼의 한 데이터 값에 여러 이미지 경로들을 저장해서, mapper파일을 통해 해당 mzlist테이블의 row를 읽을 때 그 음식점에 해당하는 이미지들이 모두 읽히도록 함.

  * 첫 번째 시도 : 이중 for문 사용 -> ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ여기서부터 수정
	
	
  * 두 번째 시도 : 두 클래스를 하나의 클래스로 구현해도 될 것 같다는 생각에 JoinCkValidator클래스를 만들어 코드를 합친 후 바인딩할 객체가 하나이기 때문에 setValidator() 메서드로 변경 -> ❌비정상작동
    * 하고자 했던 바인딩을 통한 유효성 검사는 잘 되었지만, 잘 되던 데이터 형식 유효성 검사가 작동하지 않았다.
  * 세 번째 시도 : 객체가 하나이지만 혹시나 하는 마음에 addValidators() 메서드로 다시 변경 -> ⭕정상작동!
<details>
  <summary>👉코드확인</summary>
​
  <div markdown="1">    
​
  ```java
	  //첫 번째 코드 - 정상작동
	  @InitBinder
	  public void validator(WebDataBinder binder) {
		  binder.addValidators(IdDuplCkValidator);
	  	  binder.addValidators(passMctCkValidator);
	  }
	  
	  //두 번째 코드 - 비정상작동
	  @InitBinder
	  public void validator(WebDataBinder binder) {
		  binder.setValidator(joinCkValidator);
	  }
​
	  //세 번째 코드 - 정상작동
	  @InitBinder
	  public void validator(WebDataBinder binder) {
		  binder.addValidators(joinCkValidator);
	  }
  ```
  </div>
</details>
	
객체가 하나인데 setValidator() 메서드가 아닌 addValidators() 메서드를 사용했을 때 정상 작동하는 이유가 무엇일까?  
사실 정확한 이유는 찾지 못했지만, 아래 로그인 시 유효성 검사까지 완료해보니 짐작 가는 부분이 생겼다.  
	
  ##### `2. 로그인 시 유효성 검사 미작동`
  * 첫 번째 시도 : validator가 아닌 Model을 사용해서 아이디, 비밀번호가 존재하지 않으면 메시지를 전송하는 방식을 적용 -> ⭕정상작동!
  * 두 번째 시도 : 로그인도 validator를 적용해보고 싶다는 생각에 아이디, 비밀번호 존재 여부를 검사하는 클래스를 만든 후 회원가입과 똑같이 addValidators() 메서드 사용 -> ❌비정상작동
    * 회원가입 시에 필요한 MemberDto객체의 데이터 형식 검사를 진행하며 에러 발생
  * 세 번째 시도 : setValidator() 메서드로 변경 -> ⭕정상작동!
<details>
  <summary>👉코드확인</summary>
​
  <div markdown="1">    
​
  ```java
	  //첫 번째 코드 - 정상작동 (login메서드)
	  if(memberService.login(memberDto) != 1){
		  model.addAttribute("loginFailMsg", "아이디 또는 비밀번호가 올바르지 않습니다.");
		  return "/member/loginForm";
          }
	  
	  //두 번째 코드 - 비정상작동
	  @InitBinder
	  public void validator(WebDataBinder binder) {
		  binder.addValidators(LoginCkValidator);
	  }
	  
	  //세 번째 코드 - 정상작동
	  @InitBinder
	  public void validator(WebDataBinder binder) {
		  binder.setValidator(LoginCkValidator);
	  }
  ```
  </div>
</details>
​
<br>
	
로그인 시에는 데이터 형식을 검사하길 원하지 않았는데 두 번째 시도에선 데이터 형식을 검사하며 에러가 발생했다.  
문득 setValidator() 메서드가 아닌 addValidators() 메서드를 사용하고 있었다는 사실을 깨닫고, setValidator() 메서드로 수정해주었다.  
이 과정에서 회원가입 두 번째 시도와 같이 데이터 형식 검사를 하지 않는다는 것을 알아냈고,  힌트를 얻을 수 있었다.
​
위 두 경우를 보면 회원가입 유효성 검사에서는 addValidators()메서드를,  
로그인 유효성 검사에서는 setValidator()메서드를 사용해야 정상작동하는 것을 알 수 있다.  
회원가입도 검사할 객체가 하나인데 왜 addValidators() 메서드만 정상작동하는걸까?  
내가 찾은 답은 `'어노테이션을 통한 데이터 유효성 검사 또한 하나의 유효성 검사 객체(?)로 인식한다.'` 이다.  
​
`그렇다면?`  
회원가입에서는 ①데이터 형식 유효성 검사와 ②커스텀 유효성 검사 두 개가 이루어지니 **addValidators()메서드를**,  
로그인은 ①커스텀 유효성 검사만 하면 되니 **setValidator()메서드를** 사용하면 된다는 것이 내가 찾은 결론이다.  
또한 검증객체가 하나 이상일 땐 제약조건 어노테이션으로 정의한 데이터 형식 유효성 검사가 우선적으로 이루어진다는 것을 예상할 수 있다.
	
</details>
​
<br>
​
