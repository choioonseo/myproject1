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
  * 음식점 상세정보 CRUD 기능
  * 카테고리별 음식점 검색 기능
  * 상세페이지 URL 복사(for 공유하기)
  * 네이버 포털사이트 이동하여 해당 음식점 검색
  * 카카오 API 사용
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
  * 가상의 'texterea' 생성 -> textarea의 값을 복사할 텍스트로 설정 -> textarea를 DOM에 추가 -> textarea 내용을 선택 -> textarea를 DOM에서 제거
	
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

  * 첫 번째 시도 : 문자열을 특정 구분자를 기준으로 나누어 배열로 반환해주는 split 합수 사용 -> ❌비정상작동
	
  * 두 번째 시도 : 두 클래스를 하나의 클래스로 구현해도 될 것 같다는 생각에 JoinCkValidator클래스를 만들어 코드를 합친 후 바인딩할 객체가 하나이기 때문에 setValidator() 메서드로 변경 -> ❌비정상작동
    * 하고자 했던 바인딩을 통한 유효성 검사는 잘 되었지만, 잘 되던 데이터 형식 유효성 검사가 작동하지 않았다.
  * 세 번째 시도 : 객체가 하나이지만 혹시나 하는 마음에 addValidators() 메서드로 다시 변경 -> ⭕정상작동!

	

	
	<details>
	 * 일련의 규칙을 가진 이미지 출력 방법은 여러가지가 있다. 
	 첫 번째로 시도해 본 방법인 split함수를 사용하는 과정에서 오류가 생겨서 다른 방식을 채택했지만, split함수로도 충분히 구현할 수 있었다는 것을 뒤늦게 깨달았다. 
	split 함수사용할 때의 주의점 중에서 이미지 경로들을 포함한 문자열에 공백이 포함되어 있는 경우, split 함수가 공백도 구분자로 인식하여 분리한다는 특징이 있었고, 이로 인한 오류였다는 것을 깨달았다.
	split 함수에 대한 개념이해가 부족했었고, 함수를 사용할 때 개념과 특징을 잘 파악하고 사용한다면 오류를 잡는 데에 걸리는 시간을 단축할 수 있겠다는 생각을 하게 되었다. 하지만 첫 번째 시도에서 막히는 부분에 대해서 오랜 시간을 붙잡지 않고 또 다른 방법을 떠올려서 코드를 작성했다는 부분에 있어서 의의가 있다.
	  </div>
	</details>
	
	
 ##### `2. Null Point Exception`
	** !!문제상황!!**: 메인페이지의 지도 위의 마커를 클릭했을 때 나의 상세페이지로 넘어오도록 구현하는 과정에서, no값이 아닌 landNumAddress를 기준으로 CRUD 기능이 수행되도록 변경하는 과정에서  Null Point Exception 발생
	
  * 첫 번째 시도 : no -> landNumAddress로 바꾸는 작업이 mzlistMapper, mzlistController, mzlistDAO에도 모두 알맞게 반영이 되었는지 확인 -> ⭕모두 반영됨!
  * 두 번째 시도 : controller 부분에서 값을 전달받을 때 system.out.println(vo)로 값을 출력해보면서 값이 유실된 지점을 체크 ->  landNumAddress와 model값이 전달될 때 값 전달⭕! dao.one()메서드가 null!!❌값을 반환
  * 세 번째 시도 : dao의 one 메서드가 올바르게 작성이 되었는지 확인 -> ⭕정상작동!
  * 네 번째 시도 : jsp파일에서 landNumAddress 파라미터를 정확하게 전달하고 있는지 확인 -> jsp에서 주소값을 입력하는 형식에 오류 발견 (' '로 인해 landNumAddress을 문자열로 인식)
  * 다섯 번째 시도 : jsp에서 주소값을 입력하는 형식 수정 -> ⭕정상작동!
<details>
  <summary>👉코드확인</summary>
​
  <div markdown="1">    
​
  ```java
	  //비정상 작동 코드
	 if (${'vo.landNumAddress'} || '${vo.roadNameAddress}') {  
	  geocoder.addressSearch(address, function(result, status) {
	  //정상 작동 코드
	  
	if ('${vo.landNumAddress}' || '${vo.roadNameAddress}') {  
	geocoder.addressSearch(address, function(result, status) {

  ```

</details>
​
<br>
	
	
</details>
	
 
	

