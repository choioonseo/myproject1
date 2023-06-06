
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
  	-> 해당 음식점의 주소를 받아서 지도 띄우기 + 해당 음식점의 위치를 기반으로 카테고리별 장소 검색
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
  * 이미지 저장
	* 공공데이터의 데이터들 중, 맛집으로 선정한 음식점들(약 25곳)들의 이미지들을 5개씩 저장하여 resources 아래에 이미지 저장 
  * CRUD 기능
	-> 주소 클릭 jsp -> MzlistMapper -> MzlistController -> MzlistDAO -> 상세페이지 jsp파일
	* MzlistMapper
		* mzlist 테이블에서 landNumAddress가 주어진 값과 일치하는 데이터를 조회, resultType으로 지정된 mzlistVO 클래스에 매핑되어 결과를 반환함.
	* MzlistController
		* MzlistController에서 경로 요청이 들어오면, landNumAddress를 사용하여 데이터를 조회하고 Model 객체를 통해서 View와의 상호작용을 통해 View에 데이터를 제공함.
	* MzlistDAO
		* mzlist에서 landNumAddress를 기준으로 데이터를 조회해서 MzlistVO 객체로 반환하는 메서드 사용하여, landNumAddress에 대한 정보를 가져옴.
	
  * **‼결과‼** 주소를 전달하는 jsp 파일에서 쿼리스트링을 통해 주소를 요청하면 그 주소와 동일한 음식점의 데이터들이 검색되고, 상세페이지 jsp파일에 데이터들이 출력됨.
	![image](https://github.com/choioonseo/myproject1/assets/124110679/ba862026-b288-4f4b-ac10-a463834f2417)


	
	
  ##### `2. 카테고리별 음식점 검색 기능`
  * CRUD 기능
	-> 상세페이지 jsp 파일에서 카테고리별 음식점 이미지 클릭 -> MzlistMapper -> MzlistController -> MzlistDAO -> 카테고리별 음식점 jsp파일
	* MzlistMapper
		* select 문을 사용하여 mzlist 테이블의 모든 열을 조회하는 SQL 쿼리를 정의
	* MzlistController
		* 해당 경로로 요청이 들어오면 메서드가 실행되며, 'food' 파라미터를 받아와 출력하며, dao 객체의 메서드를 호출하여 food를 인자로 전달하고, 그 결과를 list에 저장하고, model에 list를 추가하여 화면에 전달
	* MzlistDAO
		* 메서드를 호출하여 SQL 쿼리를 실행하며, food를 인자로 전달하여 실행 결과를 출력하고 반환.

	
  * **‼결과‼** 카테고리별 음식(한식, 중식, 일식, 분식 등..) 이미지 박스를 클릭하면 해당 음식점 카테고리 페이지로 이동하여 mzlist테이블에 저장되어 있는 해당 카테고리의 음식점들의 상세정보와 이미지들이 출력됨.
	![image](https://github.com/choioonseo/myproject1/assets/124110679/ac925293-ddb8-42da-8d11-6c4c2006f49c)

	
	
	
	
  ##### `3. 상세페이지 URL 복사(for 공유하기)`
	-> 클립보드에 텍스트를 복사하는 기능
  * 전체 흐름: 가상의 'texterea' 생성 -> textarea의 값을 복사할 텍스트로 설정 -> textarea를 DOM에 추가 -> textarea 내용을 선택 -> textarea를 DOM에서 제거 -> 복사 완료 메세지
  * copyToClipboard() 함수 : 매개변수로 복사할 텍스트(text)를 받음
  * 함수 내부에서는 복사할 텍스트를 가상의 <textarea> 엘리먼트에 설정함
  * <textarea> 엘리먼트를 동적으로 생성하고 현재 페이지의 URL을 할당하며, URL은 window.location.href로 가져옴
  * 복사할 텍스트를 <textarea>에 설정한 후, 해당 <textarea>를 DOM에 추가함
  * <textarea> 내용을 선택하고, document.execCommand('copy')를 호출하여 선택한 내용을 클립보드로 복사함
  * 마지막으로, <textarea>를 DOM에서 제거함
  * 복사 완료 메시지를 alert 함수를 통해 사용자에게 표시됨
	
	
  * **‼결과‼** URL 복사(공유하기) 버튼을 클릭하면 'URL이 클립보드에 복사되었습니다' 라는 문구의 alert가 뜨며, 'copyToClipboard()' 함수를 호출하여 텍스트를 클립보드로 복사
	![image](https://github.com/choioonseo/myproject1/assets/124110679/a3b2de6d-bc43-4c5f-9f58-0cb4c2f3d894)

	
	
	
	
	
	
 ##### `4. 네이버 포털사이트 이동하여 해당 음식점 검색`
 	 -> location.href를 사용하여 생성된 URL로 페이지를 이동해서 사용자가 해당 음식점의 'landAddress'와 동일한 주소에 해당하는 네이버지도 URL로 이동할 수 있도록 함.
  * 함수 생성
	* searchOnNaverMaps() -> URL을 생성하고 페이지를 이동하는 역할을 하기 위함.
	* encodeURIComponent() -> name, landAddress, roadAddress를 URL 인코딩하기 위함.
  * 변수 설정
	* 'naverMapsURL' 변수를 생성해서 네이버 지도 URL을 할당
		if) 'landAddress'!= null 이면 해당 주소를 추가로 전달
		if) 'roadAddress'!= null 이면 해당 주소를 추가로 전달
	
  * location.href
	* JavaScript에서 현재 문서의 URL을 나타내는 속성인 location.href를 사용하여 생성된 URL로 페이지 이동

	
  * **‼결과‼** 네이버 포털사이트로 이동하는 버튼을 클릭하면 해당 음식점의 정보와 주소를 URL에 인코딩하여 네이버 지도 페이지로 이동
	![image](https://github.com/choioonseo/myproject1/assets/124110679/104534d8-a928-480b-8e88-f86d7fd0c317)

	
	
	
 ##### `5. 카카오 API 사용'
 -> 해당 음식점의 주소를 받아서 지도 띄우기 + 해당 음식점의 위치를 기반으로 카테고리별 장소 검색
   * 카카오 API 코드 분석
	* 해당 음식점의 주소를 받아서 지도 띄우기
		* address 변수를 선언하고, 해당 주소 변수를 초기화
		* 주소값이 존재한다면 해당 변수 값을 할당하고, 값이 존재하지 않으면 빈 문자열로 설정
		* geocoder.addressSearch() 함수를 통해 주소를 좌표로 변환하여 검색
			* address에는 변환할 주소가 전달되고, 콜백 함수 내부에서 변환 결과를 처리
	
	
	* 해당 음식점의 위치를 기반으로 카테고리별 장소 검색
		* API 코드 사용
	
	
	
   * **‼결과‼** 상세정보페이지에 해당하는 음식점이 지도 위에 마커로 표시되며, 좌상단의 카테고리별 장소를 클릭하면 장소들이 마커 기준으로 근처에 있는 해당 장소들의 마커가 띄워지고, 마커를 클릭했을 때 카카오맵으로 이동됨.
	![image](https://github.com/choioonseo/myproject1/assets/124110679/b01a27ee-9d37-4d85-885b-acce8e4bfdb6)

	
</details>

	
	
	
	
	
	
	
	
	<details>
  <summary>⚽ 트러블 슈팅</summary>

  * `일련의 규칙이 있는 이미지 출력 과정에서의 오류`, `CRUD 과정에서 NullPointException`, 'URL복사기능에서의 오류',`API사용과정에서의 오류`에 관한 트러블 슈팅

		
		
		

		
		

  ### `1. 일련의 규칙이 있는 이미지 출력 과정에서의 오류 `
  #### ❓ 문제가 뭐지? - 문제 정의
  * URL복사 버튼을 눌렀을 때 해당 페이지와 동일한 주소가 복사되어야 하는데, 고정된 기본 URL 주소의 일부(변수: 'base_url') + 추가적으로 붙게 되는 URL(변수: 'url') 부분에서 기존의 주소와 다른 %등과 같은 추가 기호와 함께 변수가 그대로 출력되어서 주소가 일치하지 않음.
  
  #### ❓ 왜 이런 문제가 발생하지? - 원인 추론
  1. ${vo.landNumAddress} 변수
  2. 내가 리턴하는 방식에 문제가 있나?
  
  #### 이렇게 하면 해결되려나? - 시도
    1. 주소로 전달된 문자열에 포함될 수 있는 특수문자나 공백 등의 문제 ❌ 
       encodeURIComponent()함수는  인자로 전달된 문자열을 URL에서 사용 가능한 형식으로 인코딩하도록 하는 함수이므로, URL에 포함될 수 있는 특수 문자나 공백 등을 안전하게 처리하여 URL이 유효하고 정확하게 동작할 수 있도록 함.
       => 주소가 전달될 때 포함될 수 있는 특수문자나 공백의 문제는 아니다.
		
  #### 💡 이렇게 해서 해결! - 해결 방법 & 결과
    2. 추가적으로 붙게 되는 URL 부분에서 주소 유효성 검사와 인코딩 문제가 아니므로 문제 없이 출력이 되어야 한다. ⭕️ -> 주소값을 출력할 때 형식에 맞게 올바른 형태로 출력하고 있는가
  
  * 원래 코드 -> 수정 코드
  * `+ encodeURIComponent('{$vo.landNumAddress}')` -> `+ encodeURIComponent('${vo.landNumAddress}')`
  
  #### 📖 그래서 이런 지식을 얻었다! - 알게 된 점
  **올바른 이엘 태그 표기법**
  
  #### 이엘($) 
  * $ 기호:  주로 jQuery 라이브러리와 관련하여 사용되는 표기법
  * 문자열로 변수 사용할 시: 변수를 문자열 안에 삽입해야 함
  * ex) $(`.${className}`) 또는 $('. + className)와 같이 변수를 문자열 안에 삽입

  ***
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  ### `3. URL복사를 할 때 해당 페이지가 뜨지만, 음식점 정보가 출력되지 않음 `
  #### ❓ 문제가 뭐지? - 문제 정의
  * URL복사 버튼을 눌렀을 때 해당 페이지와 동일한 주소가 복사되어야 하는데, 고정된 기본 URL 주소의 일부(변수: 'base_url') + 추가적으로 붙게 되는 URL(변수: 'url') 부분에서 기존의 주소와 다른 %등과 같은 추가 기호와 함께 변수가 그대로 출력되어서 주소가 일치하지 않음.
  
  #### ❓ 왜 이런 문제가 발생하지? - 원인 추론
  1. ${vo.landNumAddress} 변수
  2. 내가 리턴하는 방식에 문제가 있나?
  
  #### 이렇게 하면 해결되려나? - 시도
    1. 주소로 전달된 문자열에 포함될 수 있는 특수문자나 공백 등의 문제 ❌ 
       encodeURIComponent()함수는  인자로 전달된 문자열을 URL에서 사용 가능한 형식으로 인코딩하도록 하는 함수이므로, URL에 포함될 수 있는 특수 문자나 공백 등을 안전하게 처리하여 URL이 유효하고 정확하게 동작할 수 있도록 함.
       => 주소가 전달될 때 포함될 수 있는 특수문자나 공백의 문제는 아니다.
		
  #### 💡 이렇게 해서 해결! - 해결 방법 & 결과
    2. 추가적으로 붙게 되는 URL 부분에서 주소 유효성 검사와 인코딩 문제가 아니므로 문제 없이 출력이 되어야 한다. ⭕️ -> 주소값을 출력할 때 형식에 맞게 올바른 형태로 출력하고 있는가
  
  * 원래 코드 -> 수정 코드
  * `+ encodeURIComponent('{$vo.landNumAddress}')` -> `+ encodeURIComponent('${vo.landNumAddress}')`
  
  #### 📖 그래서 이런 지식을 얻었다! - 알게 된 점
  **올바른 이엘 태그 표기법**
  
  #### 이엘($) 
  * $ 기호:  주로 jQuery 라이브러리와 관련하여 사용되는 표기법
  * 문자열로 변수 사용할 시: 변수를 문자열 안에 삽입해야 함
  * ex) $(`.${className}`) 또는 $('. + className)와 같이 변수를 문자열 안에 삽입

  ***
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
  <summary>👉코드확인</summary>

	  <div markdown="1">    

  ```java
	'''
	  //비정상 작동 코드
	 if (${'vo.landNumAddress'} || '${vo.roadNameAddress}') {  
	  geocoder.addressSearch(address, function(result, status) {

	  
	  //정상 작동 코드
	  
	if ('${vo.landNumAddress}' || '${vo.roadNameAddress}') {  
	geocoder.addressSearch(address, function(result, status) {

  ```

</details>
	

	
	<details>
	 * 일련의 규칙을 가진 이미지 출력 방법은 여러가지가 있다. 
	 첫 번째로 시도해 본 방법인 split함수를 사용하는 과정에서 오류가 생겨서 다른 방식을 채택했지만, split함수로도 충분히 구현할 수 있었다는 것을 뒤늦게 깨달았다. 
	split 함수사용할 때의 주의점 중에서 이미지 경로들을 포함한 문자열에 공백이 포함되어 있는 경우, split 함수가 공백도 구분자로 인식하여 분리한다는 특징이 있었고, 이로 인한 오류였다는 것을 깨달았다.
	split 함수에 대한 개념이해가 부족했었고, 함수를 사용할 때 개념과 특징을 잘 파악하고 사용한다면 오류를 잡는 데에 걸리는 시간을 단축할 수 있겠다는 생각을 하게 되었다. 하지만 첫 번째 시도에서 막히는 부분에 대해서 오랜 시간을 붙잡지 않고 또 다른 방법을 떠올려서 코드를 작성했다는 부분에 있어서 의의가 있다.
	  </div>
	</details>
	
	
 ##### `2. Null Point Exception`
	** 문제상황**: 메인페이지의 지도 위의 마커를 클릭했을 때 나의 상세페이지로 넘어오도록 구현하는 과정에서, no값이 아닌 landNumAddress를 기준으로 CRUD 기능이 수행되도록 변경하는 과정에서  Null Point Exception 발생
	
  * 첫 번째 시도 : no -> landNumAddress로 바꾸는 작업이 mzlistMapper, mzlistController, mzlistDAO에도 모두 알맞게 반영이 되었는지 확인 -> ⭕모두 반영됨!
  * 두 번째 시도 : controller 부분에서 값을 전달받을 때 system.out.println(vo)로 값을 출력해보면서 값이 유실된 지점을 체크 ->  landNumAddress와 model값이 전달될 때 값 전달⭕! dao.one()메서드가 null!!❌값을 반환
  * 세 번째 시도 : dao의 one 메서드가 올바르게 작성이 되었는지 확인 -> ⭕정상작동!
  * 네 번째 시도 : jsp파일에서 landNumAddress 파라미터를 정확하게 전달하고 있는지 확인 -> jsp에서 주소값을 입력하는 형식에 오류 발견 (' '로 인해 landNumAddress을 문자열로 인식)
  * 다섯 번째 시도 : jsp에서 주소값을 입력하는 형식 수정 -> ⭕정상작동!
<details>
	
  <summary>👉코드확인</summary>

	  <div markdown="1">    

  ```java
	'''
	  //비정상 작동 코드
	 if (${'vo.landNumAddress'} || '${vo.roadNameAddress}') {  
	  geocoder.addressSearch(address, function(result, status) {

	  
	  //정상 작동 코드
	  
	if ('${vo.landNumAddress}' || '${vo.roadNameAddress}') {  
	geocoder.addressSearch(address, function(result, status) {

  ```

</details>
</details>

	
 
	

