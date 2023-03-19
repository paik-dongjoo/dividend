# Dividend Project

<h3> 🔥 Goal </h3>
<ul>
  <li> 미국 주식 배당금 정보를 제공하는 API 서비스 개발 </li>
</ul>

<h3> 📌 Point </h3>
<ul>
  <li> 웹 페이지를 분석하고 스크래핑 기법을 활용하여 필요한 데이터를 추출/저장 </li>
  <li> 사용자별 데이터를 관리하고 예상 배당금 액수를 계산 </li>
  <li> 서비스에서 캐시의 필요성을 이해하고 캐시 서버를 구성 </li>
</ul>

<h3> 📚 Tech Stack </h3>

<div align="left">
	<img src="https://img.shields.io/badge/Spring%20Boot-32cd32?style=flat&logo=Spring%20Boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Java-6495ed?style=flat&logo=Java&logoColor=white" />
  <img src="https://img.shields.io/badge/JPA-9400d3?style=flat&logo=JPA&logoColor=white" />
  <img src="https://img.shields.io/badge/Jsoup-ff6347?style=flat&logo=Jsoup&logoColor=white" />
	<img src="https://img.shields.io/badge/H2-daa520?style=flat&logo=H2&logoColor=white" />
  <img src="https://img.shields.io/badge/Redis-8b008b?style=flat&logo=Redis&logoColor=white" />
  <img src="https://img.shields.io/badge/Docker-4169e1?style=flat&logo=Docker&logoColor=white" />	
</div>

<h3> 📜 Final Implementation List </h3>

1. GET : finance/dividend/{companyName}  <br>
<ul>
  <li> 회사 이름을 인풋으로 받아서 해당 회사의 메타 정보와 배당금 정보를 반환 </li>
  <li> 잘못된 회사명이 입력으로 들어온 경우 400 status 코드와 에러메시지 반환 </li>
</ul>

2. GET : company/autocomplete <br>
<ul>
  <li> 자동완성 기능을 위한 API </li>
  <li> 검색하고자 하는 prefix 를 입력으로 받고, 해당 prefix 로 검색되는 회사명 리스트 중 10개 반환 </li>
</ul>

3. GET : company <br>
<ul>
  <li> 서비스에서 관리하고 있는 모든 회사 목록을 반환 </li>
  <li> 반환 결과는 Page 인터페이스 형태 </li>
</ul>

4. POST : company <br>
<ul>
  <li> 새로운 회사 정보 추가 </li>
  <li> 추가하고자 하는 회사의 ticker 를 입력으로 받아 해당 회사의 정보를 스크래핑하고 저장 </li>
  <li> 이미 보유하고 있는 회사의 정보일 경우 400 status 코드와 적절한 에러 메시지 반환 </li>
  <li> 존재하지 않는 회사 ticker 일 경우 400 status 코드와 적절한 에러 메시지 반환 </li>
</ul>

5. DELETE : company/{ticker} <br>
<ul>
  <li> ticker 에 해당하는 회사 정보 삭제 </li>
  <li> 삭제시 회사의 배당금 정보와 캐시도 모두 삭제되어야 함 </li>
</ul>

6. POST : auth/signup <br>
<ul>
  <li> 회원가입 API </li>
  <li> 중복 ID 는 허용하지 않음 </li>
  <li> 패스워드는 암호화된 형태로 저장되어야함 </li>
</ul>

7. POST : auth/signin <br>
<ul>
  <li> 로그인 API </li>
  <li> 회원가입이 되어있고, 아이디/패스워드 정보가 옳은 경우 JWT 발급 </li>
</ul>
