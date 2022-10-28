<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file = "../_include/inc_header.jsp" %>    

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>최병철's Story</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link
    href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
    rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: iPortfolio - v3.9.1
  * Template URL: https://bootstrapmade.com/iportfolio-bootstrap-portfolio-websites-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Mobile nav toggle button ======= -->
  <i class="bi bi-list mobile-nav-toggle d-xl-none"></i>

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="d-flex flex-column">

      <div class="profile">
        <img src="assets/img/profile-img.jpg" alt="" class="img-fluid rounded-circle">
        <h1 class="text-light"><a href="${path }">최병철</a></h1>
        <!-- <div class="social-links mt-3 text-center">
          <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
          <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
          <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
          <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
          <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
        </div> -->
      </div>

      <nav id="navbar" class="nav-menu navbar">
        <ul>
          <li><a href="#hero" class="nav-link scrollto active"><i class="bx bx-home"></i> <span>Home</span></a></li>
          <li><a href="#about" class="nav-link scrollto"><i class="bx bx-user"></i> <span>About</span></a></li>
          <li><a href="#resume" class="nav-link scrollto"><i class="bx bx-file-blank"></i> <span>Resume</span></a></li>
          <li><a href="#portfolio" class="nav-link scrollto"><i class="bx bx-book-content"></i>
              <span>Portfolio</span></a></li>
<!--           <li><a href="#services" class="nav-link scrollto"><i class="bx bx-server"></i> <span>Services</span></a></li> -->
          <li><a href="#contact" class="nav-link scrollto"><i class="bx bx-envelope"></i> <span>Contact</span></a></li>
        </ul>
      </nav><!-- .nav-menu -->
    </div>
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id="hero" class="d-flex flex-column justify-content-center align-items-center">
    <div class="hero-container" data-aos="fade-in">
      <h1>Choi Byung Chul</h1>
      <p>I'm <span class="typed" data-typed-items="Back-End New Developer"></span></p>
    </div>
  </section><!-- End Hero -->

  <main id="main">

    <!-- ======= About Section ======= -->
    <section id="about" class="about">
      <div class="container">

        <div class="section-title">
          <h2>About</h2>
        </div>

        <div class="row">
          <div class="col-lg-4" data-aos="fade-right">
            <img src="assets/img/profile-img.jpg" class="img-fluid" alt="">
          </div>
          <div class="col-lg-8 pt-4 pt-lg-0 content" data-aos="fade-left">
            <h3>Back-End New Developer.</h3>
            <p class="fst-italic">
              될성부른 나무의 떡잎, 신입 개발자 입니다.
            </p>
            <div class="row">
              <div class="col-lg-6">
                <ul>
                  <li><i class="bi bi-chevron-right"></i> <strong>Name:</strong> <span>최병철</span></li>
                  <li><i class="bi bi-chevron-right"></i> <strong>Birthday:</strong> <span>1986년 5월 18일</span></li>
                  <li><i class="bi bi-chevron-right"></i> <strong>Phone:</strong> <span>010 5266 2125</span></li>
                  <li><i class="bi bi-chevron-right"></i> <strong>Email:</strong> <span>bcchoi518@gmail.com</span></li>
                  <li><i class="bi bi-chevron-right"></i> <strong>Github:</strong> <span><a href="https://github.com/bcchoi518" target="_blank">https://github.com/bcchoi518</a></span></li>
                </ul>
              </div>
            </div>
                <ul>
					<li>
						<i class="bi bi-chevron-right"></i> <strong>Work Capability:</strong>
					</li>
                </ul>
                <ul>
                	<li>&emsp;&emsp;
                		<ul>
							<li>
								<i class="bi bi-chevron-double-right"></i>
								<span>JSP Model1, Model2로 간단한 단위 웹 서비스를 만든 경험이 있습니다.</span>
							</li>
							<li>
								<i class="bi bi-chevron-double-right"></i>
								<span>JSP로 만든 단위 웹 서비스를 Spring Framework를 적용하여 만든 경험이 있습니다.</span>
							</li>
							<li>
								<i class="bi bi-chevron-double-right"></i>
								<span>문서 작업 툴(한글, Excel, Word)를 사용하여 업무를 한 경험이 있습니다.</span>
							</li>
						</ul>
                	</li>
                </ul>
          </div>
        </div>

      </div>
    </section><!-- End About Section -->

    <!-- ======= Facts Section ======= -->
<!--     <section id="facts" class="facts"> -->
<!--       <div class="container"> -->

<!--         <div class="section-title"> -->
<!--           <h2>Facts</h2> -->
<!--           <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint -->
<!--             consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit -->
<!--             in iste officiis commodi quidem hic quas.</p> -->
<!--         </div> -->

<!--         <div class="row no-gutters"> -->

<!--           <div class="col-lg-3 col-md-6 d-md-flex align-items-md-stretch" data-aos="fade-up"> -->
<!--             <div class="count-box"> -->
<!--               <i class="bi bi-emoji-smile"></i> -->
<!--               <span data-purecounter-start="0" data-purecounter-end="232" data-purecounter-duration="1" -->
<!--                 class="purecounter"></span> -->
<!--               <p><strong>Happy Clients</strong> consequuntur quae</p> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-3 col-md-6 d-md-flex align-items-md-stretch" data-aos="fade-up" data-aos-delay="100"> -->
<!--             <div class="count-box"> -->
<!--               <i class="bi bi-journal-richtext"></i> -->
<!--               <span data-purecounter-start="0" data-purecounter-end="521" data-purecounter-duration="1" -->
<!--                 class="purecounter"></span> -->
<!--               <p><strong>Projects</strong> adipisci atque cum quia aut</p> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-3 col-md-6 d-md-flex align-items-md-stretch" data-aos="fade-up" data-aos-delay="200"> -->
<!--             <div class="count-box"> -->
<!--               <i class="bi bi-headset"></i> -->
<!--               <span data-purecounter-start="0" data-purecounter-end="1453" data-purecounter-duration="1" -->
<!--                 class="purecounter"></span> -->
<!--               <p><strong>Hours Of Support</strong> aut commodi quaerat</p> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-3 col-md-6 d-md-flex align-items-md-stretch" data-aos="fade-up" data-aos-delay="300"> -->
<!--             <div class="count-box"> -->
<!--               <i class="bi bi-people"></i> -->
<!--               <span data-purecounter-start="0" data-purecounter-end="32" data-purecounter-duration="1" -->
<!--                 class="purecounter"></span> -->
<!--               <p><strong>Hard Workers</strong> rerum asperiores dolor</p> -->
<!--             </div> -->
<!--           </div> -->

<!--         </div> -->

<!--       </div> -->
<!--     </section>End Facts Section -->

    <!-- ======= Skills Section ======= -->
    <section id="skills" class="skills section-bg">
      <div class="container">

        <div class="section-title">
          <h2>Skills</h2>
        </div>

        <div class="row skills-content">

          <div class="col-lg-6" data-aos="fade-up">

            <div class="progress">
              <span class="skill">Java <i class="val">90%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100">
                </div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">JavaScript <i class="val">70%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100">
                </div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">Oracle <i class="val">90%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100">
                </div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">Git <i class="val">60%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100">
                </div>
              </div>
            </div>

          </div>

          <div class="col-lg-6" data-aos="fade-up" data-aos-delay="100">

            <div class="progress">
              <span class="skill">JSP(Model1, Model2) <i class="val">100%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">
                </div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">Spring Framework <i class="val">60%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100">
                </div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">Spring Boot <i class="val">50%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">
                </div>
              </div>
            </div>

            <div class="progress">
              <span class="skill">Mybatis <i class="val">80%</i></span>
              <div class="progress-bar-wrap">
                <div class="progress-bar" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100">
                </div>
              </div>
            </div>

          </div>

        </div>

      </div>
    </section><!-- End Skills Section -->

    <!-- ======= Resume Section ======= -->
    <section id="resume" class="resume">
      <div class="container">

        <div class="section-title">
          <h2>Resume</h2>
        </div>

        <div class="row">
          <div class="col-lg-6" data-aos="fade-up">
            <h3 class="resume-title">Sumary</h3>
            <div class="resume-item pb-0">
              <h4>최병철</h4>
              <p><em>Back-End 신입 개발자로 시작하여 Low-Level 개발 분야의 개발자가 되는 그날까지...<br>
              Career Goal 달성을 목표로 배움에 임하는 개발자입니다. </em></p>
              <ul>
                <li>경상북도 구미 거주</li>
                <li>010 5266 2125</li>
                <li>bcchoi518@gmail.com</li>
              </ul>
            </div>

            <h3 class="resume-title">Education</h3>
            <div class="resume-item">
              <h4>금오공과대학교 대학원</h4>
              <h5>2012.03 - 2014.08</h5>
              <p><em> 지능기계공학과 석사 졸업</em></p>
            </div>
            <div class="resume-item">
              <h4>금오공과대학교</h4>
              <h5>2005.03 - 2012.02</h5>
              <p><em> 기계공학부 학사 졸업</em></p>
            </div>
          </div>
          <div class="col-lg-6" data-aos="fade-up" data-aos-delay="100">
            <h3 class="resume-title">Professional Experience</h3>
            <div class="resume-item">
              <h4>백엔드(자바/프레임워크)개발 실무 &amp; 정보처리산업기사A</h4>
              <h5>2022.04 - 2022.10</h5>
              <p><em>한국IT교육원</em></p>
              <ul>
                <li>JSP 웹 프로그래밍(기초이론, 응용기술, 실전 프로그래밍) 교육</li>
                <li>Spring Framework(데이터액세스층, 비지니스로직층, 프레젠테이션층 구현) 교육</li>
                <li>Data Base(Oracle) 기초이론 및 SQL 교육</li>
              </ul>
            </div>
            
            <h3 class="resume-title">Work Experience</h3>
            <div class="resume-item">
              <h4>(주)트리엔</h4>
              <h5>2016.10 - 2021.12</h5>
              <p><em>기술연구소 / 주임연구원</em></p>
              <ul>
                <li>디스플레이 이송용 흡착판/부상판 생산 및 생산관리 업무 수행</li>
                <li>
                	반도체 패키지용 Substrate 제작 관련 Laser Drilling MC 개발에 참여<br>
                	&nbsp;- 생산 공정 조건 도출 업무 수행<br>
                	&nbsp;- 샘플 제품 품질 측정 업무 수행<br>
                	&nbsp;- 장비 제어 S/W 테스트 업무 수행<br>
                </li>
                <li>장비 Set-Up 및 C/S 업무 수행</li>
              </ul>
            </div>
          </div>
        </div>

      </div>
    </section><!-- End Resume Section -->

    <!-- ======= Services Section ======= -->
    <section id="services" class="services">
      <div class="container">

        <div class="section-title">
          <h2>Cover-letter</h2>
        </div>

        <div class="row">
          <div class="col-lg-12 col-md-12 icon-box" data-aos="fade-up">
            <div class="icon"><i class="bi bi-dice-1"></i></div>
            <h4 class="title">개발자로 전향한 이유</h4>
            <p class="description">&emsp;장비 개발 프로젝트를 진행하면서 <strong>임베디드 S/W 개발자와 함께 소통하며 업무를 수행</strong>한 적이 있습니다.
            장비 제어와 생산 공정 프로세스를 구현하기 위해 개발자와 소통하는 과정에서 <strong>원하는 것을 원하는 형태로 만들어내는 개발자의 모습</strong>과 <strong>성공하였을 때의 성취감</strong>을 같이 느낌으로 <strong>개발자라는 직업에 관심</strong>을 가지게 되었습니다.<br>
			&emsp;초등학생때 일체형 컴퓨터를 접하고 DOS기반(M방)으로 동작하던 시절 컴퓨터 학원에 다니며 관련 직업에 꿈을 가졌고 인터넷이 점차 발전되며 보급되던 청소년 시기에 컴퓨터공학과로 진학을 꿈꿨습니다. 하지만 IT 업종의 전망이 흐렸던 시기에 선생님과 부모님의 권유로 기계공학부로 진학을 하게 되었고 컴퓨터 공학과는 멀어진 삶을 살게 되었습니다.<br>
			&emsp;직장 생활을 하면서 다시 마주한 개발자의 모습을 보고 <strong>어렸을 적 꿈꿔왔던 모습에 다시 도전하고 싶다</strong>는 생각이 들었고 <strong>IT 교육을 수강하며 개발자의 꿈을 키워가고 있습니다.</strong>
			</p>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-12 col-md-12 icon-box" data-aos="fade-up" data-aos-delay="100">
            <div class="icon"><i class="bi bi-dice-2"></i></div>
            <h4 class="title">관심있는 개발 분야</h4>
            <p class="description">&emsp;개발자로서 <strong>최종 목표는 Low-Level 개발 분야</strong>입니다.
            하지만 비전공자의 입장에서 진입하기엔 CS지식, 통신지식, OS지식, 하드웨어 지식 등 부족한 부분이 많기 때문에 <strong>단계적으로 성장하여 최종 목표에 도달할 계획</strong>입니다.<br>
            &emsp;Low-Level 개발 분야도 Setting 화면이나 User Interface는 <strong>웹 형식으로 동작한다는 정보</strong>를 바탕으로 <strong>서버 영역에서 데이터를 처리하는 Back-End 분야</strong>에서 개발자의 커리어를 시작하는 것이 <strong>꿈을 향한 첫 걸음으로 적합하다고 판단</strong>되어 Back-End 분야에 관심을 가지고 공부하고 있습니다.</p>
          </div>
          <div class="col-lg-12 col-md-12 icon-box" data-aos="fade-up" data-aos-delay="150">
            <div class="icon"><i class="bi bi-dice-3"></i></div>
            <h4 class="title">기억에 남는 개발 프로젝트</h4>
            <p class="description">&emsp;1개월간의 Java 프로그래밍 이론수업을 듣고 바로 시작된 첫 팀 프로젝트인 <strong>OTT 서비스를 간단하게 구현한 프로젝트</strong>가 기억에 남습니다.
            <strong>첫번째</strong>로는 스스로 Code를 작성하면서 <strong>수업시간에 배웠던 막연한 지식들이 어떻게 활용될 수 있는지 깨달을 수 있는 값진 경험</strong> 이기 때문 이였고, <strong>두번째</strong>로는 프로젝트를 진행하면서 <strong>회원가입 로직을 구현하는 도중 HashSet을 잘 못 이해하여 생긴 버그</strong> 때문 이였습니다.<br>
			&emsp;HashSet에 저장되는 객체는 hashCode()와 equals()를 Overriding하면 add()를 할 때 마다 Overriding한 메서드로 인해 중복으로 저장이 되지 않는 특징을 이용하여 로직을 구현하려고 했습니다.&nbsp; 
			회원가입 시 프로필 객체를 생성하여 초기값을 가진 그대로 프로필저장소(HashSet)에 저장한 후 추후에 프로필 생성 기능을 통해 회원가입 시 저장해 뒀던 프로필 객체를 불러와서 nickname등 멤버변수를 setting 하는 방식으로 구현하였고 1계정당 5개의 프로필을 가질 수 있기에 새로운 프로필을 생성할 때 nickname이 같으면 중복된 nickname이 존재함으로 새로운 nickname 사용을 권하는 로직이었습니다.
			하지만 <strong>중복된 nickname으로 프로필 생성이 되는 문제점이 발생</strong>되었습니다.<br>
			&emsp;강사님께 조언을 구해 <strong>문제의 원인을 분석</strong>한 결과 HashSet은 add()로 저장되는 순간의 정보로 처음 한번만 HashCode를 생성하여 HashSet 내부의 HashMap에 생성된 HashCode를 Key값으로 value값이 저장되며 다음에 추가하는 값이 있을 때 저장되어 있는 HashCode와 저장하는 값의 HashCode를 비교하여 중복여부를 판단하는 것을 알게 되었습니다.
			클래스 내부에 hashCode()와 equals()를 nickname을 key값으로 하여 Overring 하면 add()로 추가할 때 마다 저장된 nickname을 가지고 hashCode()와 equals()로 비교할 것이라는 생각이 잘못된 생각이었고 <strong>HashSet에 저장 후 값을 수정하여도 수정된 값에 대한 HashCode를 새로 만들어 저장하지 않는 다는 것</strong>을 알게 되었습니다.<br>
			&emsp;<strong>문제 해결 방안</strong>으로 HashSet에 add() 하기 전에 비교 대상이 되는 key값(nickname)을 먼저 설정하는 순서로 변경하였으며 add()된 정보는 수정하지 못하도록 하였습니다. 하지만 nickname은 언제든 변경될 수 있는 값이기에 변경 시에는 해당 객체를 HashSet에서 remove() 하고 값을 변경 후 add() 하는 방식으로 변경하였습니다.<br>
			&emsp;처음 하는 협업이기에 각 조원들의 개발환경이 달라서 소스 파일 공유 시 한글과 이모티콘이 깨지는 현상이 자주 발생되어 불편을 겪었으며 <strong>협업을 시작할 때 개발환경을 동일하게 구축하는 것이 얼마나 중요한 것인지도 깨달을 수 있는 값진 경험</strong>이었습니다.
			</p>
          </div>
          <div class="col-lg-12 col-md-12 icon-box" data-aos="fade-up" data-aos-delay="200">
            <div class="icon"><i class="bi bi-dice-4"></i></div>
            <h4 class="title">성격의 장점과 단점</h4>
            <p class="description">&emsp;<strong>감정 기복이 크지 않고 몰입을 잘 하는 것</strong>이 제 성격의 장점이라고 생각합니다. 삶을 살면서 무엇을 하든 좋은 부분이 있으면 좋지 않은 부분도 있음을 인지하고 사고하는 습관으로 “그럴 수도 있지” 라는 말을 자주 합니다. 이러한 성격으로 인해 직장에서 또는 학원에서 주변 사람들이 쉽게 다가와 도움을 요청하는 일들이 자주 있었고 어떤 상황이든 도움을 요청하는 사람의 입장에서 최선을 다하여 도와주려고 합니다.<br>
			&emsp;하지만 반대로 “왜?” 라는 의문이 생기면 <strong>의문을 해결하기 위해 끝없이 파고 드는 것</strong>이 단점이라고 생각합니다. 원래의 목표를 이루기 위해 필요한 정보를 조사하는 과정에서 궁금증의 연쇄작용으로 주객이 전도되는 경우를 종종 겪었습니다. 시간이 제한 되어있는 상황에서는 큰 단점이기 때문에 필요한 정보만 취하고 나머지 정보는 다음에 확인하도록 마인드 컨트롤 하는 법을 익히고 있습니다.
			</p>
          </div>
          <div class="col-lg-12 col-md-12 icon-box" data-aos="fade-up" data-aos-delay="250">
            <div class="icon"><i class="bi bi-dice-5"></i></div>
            <h4 class="title">구직동기</h4>
            <p class="description">&emsp;백엔드 분야 실무를 통하여 학업 수준을 벗어나 <strong>전문성을 기르고 싶어서 구직</strong>을 하게 되었습니다. 6개월 국비과정이 끝난 후 실무에서 사용되는 스킬들은 학습할 시간이 부족했다고 느꼈으며 Spring Framework와 대용량 데이터 처리 등 <strong>실무에 필요한 스킬을 온라인 강의로 수강</strong>하고 있지만 <strong>경험 없이 하는 막연한 학습은 성장의 방향성이 명확하지 않다고 생각됩니다.</strong>
            비록 비전공자에 짧은 교육기간 이였지만 개발자로 성장하기 위해 열정적으로 새로운 지식들을 학습하였고 <strong>회사의 발전과 함께 성장해 나갈 수 있다고 자신합니다.</strong></p>
          </div>
        </div>

      </div>
    </section>
    <!-- End Services Section -->

    <!-- ======= Portfolio Section ======= -->
    <section id="portfolio" class="portfolio section-bg">
      <div class="container">

        <div class="section-title">
          <h2>Portfolio</h2>
        </div>

<!--         <div class="row" data-aos="fade-up"> -->
<!--           <div class="col-lg-12 d-flex justify-content-center"> -->
<!--             <ul id="portfolio-flters"> -->
<!--               <li data-filter="*" class="filter-active">All</li> -->
<!--               <li data-filter=".filter-app">App</li> -->
<!--               <li data-filter=".filter-card">Card</li> -->
<!--               <li data-filter=".filter-web">Web</li> -->
<!--             </ul> -->
<!--           </div> -->
<!--         </div> -->

        <div class="row portfolio-container" data-aos="fade-up" data-aos-delay="100">

          <div class="col-lg-4 col-md-6 portfolio-item filter-app">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-1.jpg" class="img-fluid" alt="">
              <div class="portfolio-links">
                <a href="assets/img/portfolio/portfolio-1.jpg" data-gallery="portfolioGallery"
                  class="portfolio-lightbox" title="App 1"><i class="bx bx-plus"></i></a>
                <a href="${path }/portfolioDetails" title="More Details"><i class="bx bx-link"></i></a>
              </div>
            </div>
          </div>

<!--           <div class="col-lg-4 col-md-6 portfolio-item filter-web"> -->
<!--             <div class="portfolio-wrap"> -->
<!--               <img src="assets/img/portfolio/portfolio-2.jpg" class="img-fluid" alt=""> -->
<!--               <div class="portfolio-links"> -->
<!--                 <a href="assets/img/portfolio/portfolio-2.jpg" data-gallery="portfolioGallery" -->
<!--                   class="portfolio-lightbox" title="Web 3"><i class="bx bx-plus"></i></a> -->
<!--                 <a href="portfolio-details.html" title="More Details"><i class="bx bx-link"></i></a> -->
<!--               </div> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-4 col-md-6 portfolio-item filter-app"> -->
<!--             <div class="portfolio-wrap"> -->
<!--               <img src="assets/img/portfolio/portfolio-3.jpg" class="img-fluid" alt=""> -->
<!--               <div class="portfolio-links"> -->
<!--                 <a href="assets/img/portfolio/portfolio-3.jpg" data-gallery="portfolioGallery" -->
<!--                   class="portfolio-lightbox" title="App 2"><i class="bx bx-plus"></i></a> -->
<!--                 <a href="portfolio-details.html" title="More Details"><i class="bx bx-link"></i></a> -->
<!--               </div> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-4 col-md-6 portfolio-item filter-card"> -->
<!--             <div class="portfolio-wrap"> -->
<!--               <img src="assets/img/portfolio/portfolio-4.jpg" class="img-fluid" alt=""> -->
<!--               <div class="portfolio-links"> -->
<!--                 <a href="assets/img/portfolio/portfolio-4.jpg" data-gallery="portfolioGallery" -->
<!--                   class="portfolio-lightbox" title="Card 2"><i class="bx bx-plus"></i></a> -->
<!--                 <a href="portfolio-details.html" title="More Details"><i class="bx bx-link"></i></a> -->
<!--               </div> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-4 col-md-6 portfolio-item filter-web"> -->
<!--             <div class="portfolio-wrap"> -->
<!--               <img src="assets/img/portfolio/portfolio-5.jpg" class="img-fluid" alt=""> -->
<!--               <div class="portfolio-links"> -->
<!--                 <a href="assets/img/portfolio/portfolio-5.jpg" data-gallery="portfolioGallery" -->
<!--                   class="portfolio-lightbox" title="Web 2"><i class="bx bx-plus"></i></a> -->
<!--                 <a href="portfolio-details.html" title="More Details"><i class="bx bx-link"></i></a> -->
<!--               </div> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-4 col-md-6 portfolio-item filter-app"> -->
<!--             <div class="portfolio-wrap"> -->
<!--               <img src="assets/img/portfolio/portfolio-6.jpg" class="img-fluid" alt=""> -->
<!--               <div class="portfolio-links"> -->
<!--                 <a href="assets/img/portfolio/portfolio-6.jpg" data-gallery="portfolioGallery" -->
<!--                   class="portfolio-lightbox" title="App 3"><i class="bx bx-plus"></i></a> -->
<!--                 <a href="portfolio-details.html" title="More Details"><i class="bx bx-link"></i></a> -->
<!--               </div> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-4 col-md-6 portfolio-item filter-card"> -->
<!--             <div class="portfolio-wrap"> -->
<!--               <img src="assets/img/portfolio/portfolio-7.jpg" class="img-fluid" alt=""> -->
<!--               <div class="portfolio-links"> -->
<!--                 <a href="assets/img/portfolio/portfolio-7.jpg" data-gallery="portfolioGallery" -->
<!--                   class="portfolio-lightbox" title="Card 1"><i class="bx bx-plus"></i></a> -->
<!--                 <a href="portfolio-details.html" title="More Details"><i class="bx bx-link"></i></a> -->
<!--               </div> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-4 col-md-6 portfolio-item filter-card"> -->
<!--             <div class="portfolio-wrap"> -->
<!--               <img src="assets/img/portfolio/portfolio-8.jpg" class="img-fluid" alt=""> -->
<!--               <div class="portfolio-links"> -->
<!--                 <a href="assets/img/portfolio/portfolio-8.jpg" data-gallery="portfolioGallery" -->
<!--                   class="portfolio-lightbox" title="Card 3"><i class="bx bx-plus"></i></a> -->
<!--                 <a href="portfolio-details.html" title="More Details"><i class="bx bx-link"></i></a> -->
<!--               </div> -->
<!--             </div> -->
<!--           </div> -->

<!--           <div class="col-lg-4 col-md-6 portfolio-item filter-web"> -->
<!--             <div class="portfolio-wrap"> -->
<!--               <img src="assets/img/portfolio/portfolio-9.jpg" class="img-fluid" alt=""> -->
<!--               <div class="portfolio-links"> -->
<!--                 <a href="assets/img/portfolio/portfolio-9.jpg" data-gallery="portfolioGallery" -->
<!--                   class="portfolio-lightbox" title="Web 3"><i class="bx bx-plus"></i></a> -->
<!--                 <a href="portfolio-details.html" title="More Details"><i class="bx bx-link"></i></a> -->
<!--               </div> -->
<!--             </div> -->
<!--           </div> -->

        </div>
      </div>
    </section><!-- End Portfolio Section -->

    <!-- ======= Testimonials Section ======= -->
<!--     <section id="testimonials" class="testimonials section-bg"> -->
<!--       <div class="container"> -->

<!--         <div class="section-title"> -->
<!--           <h2>Testimonials</h2> -->
<!--           <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint -->
<!--             consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit -->
<!--             in iste officiis commodi quidem hic quas.</p> -->
<!--         </div> -->

<!--         <div class="testimonials-slider swiper" data-aos="fade-up" data-aos-delay="100"> -->
<!--           <div class="swiper-wrapper"> -->

<!--             <div class="swiper-slide"> -->
<!--               <div class="testimonial-item" data-aos="fade-up"> -->
<!--                 <p> -->
<!--                   <i class="bx bxs-quote-alt-left quote-icon-left"></i> -->
<!--                   Proin iaculis purus consequat sem cure digni ssim donec porttitora entum suscipit rhoncus. Accusantium -->
<!--                   quam, ultricies eget id, aliquam eget nibh et. Maecen aliquam, risus at semper. -->
<!--                   <i class="bx bxs-quote-alt-right quote-icon-right"></i> -->
<!--                 </p> -->
<!--                 <img src="assets/img/testimonials/testimonials-1.jpg" class="testimonial-img" alt=""> -->
<!--                 <h3>Saul Goodman</h3> -->
<!--                 <h4>Ceo &amp; Founder</h4> -->
<!--               </div> -->
<!--             </div>End testimonial item -->

<!--             <div class="swiper-slide"> -->
<!--               <div class="testimonial-item" data-aos="fade-up" data-aos-delay="100"> -->
<!--                 <p> -->
<!--                   <i class="bx bxs-quote-alt-left quote-icon-left"></i> -->
<!--                   Export tempor illum tamen malis malis eram quae irure esse labore quem cillum quid cillum eram malis -->
<!--                   quorum velit fore eram velit sunt aliqua noster fugiat irure amet legam anim culpa. -->
<!--                   <i class="bx bxs-quote-alt-right quote-icon-right"></i> -->
<!--                 </p> -->
<!--                 <img src="assets/img/testimonials/testimonials-2.jpg" class="testimonial-img" alt=""> -->
<!--                 <h3>Sara Wilsson</h3> -->
<!--                 <h4>Designer</h4> -->
<!--               </div> -->
<!--             </div>End testimonial item -->

<!--             <div class="swiper-slide"> -->
<!--               <div class="testimonial-item" data-aos="fade-up" data-aos-delay="200"> -->
<!--                 <p> -->
<!--                   <i class="bx bxs-quote-alt-left quote-icon-left"></i> -->
<!--                   Enim nisi quem export duis labore cillum quae magna enim sint quorum nulla quem veniam duis minim -->
<!--                   tempor labore quem eram duis noster aute amet eram fore quis sint minim. -->
<!--                   <i class="bx bxs-quote-alt-right quote-icon-right"></i> -->
<!--                 </p> -->
<!--                 <img src="assets/img/testimonials/testimonials-3.jpg" class="testimonial-img" alt=""> -->
<!--                 <h3>Jena Karlis</h3> -->
<!--                 <h4>Store Owner</h4> -->
<!--               </div> -->
<!--             </div>End testimonial item -->

<!--             <div class="swiper-slide"> -->
<!--               <div class="testimonial-item" data-aos="fade-up" data-aos-delay="300"> -->
<!--                 <p> -->
<!--                   <i class="bx bxs-quote-alt-left quote-icon-left"></i> -->
<!--                   Fugiat enim eram quae cillum dolore dolor amet nulla culpa multos export minim fugiat minim velit -->
<!--                   minim dolor enim duis veniam ipsum anim magna sunt elit fore quem dolore labore illum veniam. -->
<!--                   <i class="bx bxs-quote-alt-right quote-icon-right"></i> -->
<!--                 </p> -->
<!--                 <img src="assets/img/testimonials/testimonials-4.jpg" class="testimonial-img" alt=""> -->
<!--                 <h3>Matt Brandon</h3> -->
<!--                 <h4>Freelancer</h4> -->
<!--               </div> -->
<!--             </div>End testimonial item -->

<!--             <div class="swiper-slide"> -->
<!--               <div class="testimonial-item" data-aos="fade-up" data-aos-delay="400"> -->
<!--                 <p> -->
<!--                   <i class="bx bxs-quote-alt-left quote-icon-left"></i> -->
<!--                   Quis quorum aliqua sint quem legam fore sunt eram irure aliqua veniam tempor noster veniam enim culpa -->
<!--                   labore duis sunt culpa nulla illum cillum fugiat legam esse veniam culpa fore nisi cillum quid. -->
<!--                   <i class="bx bxs-quote-alt-right quote-icon-right"></i> -->
<!--                 </p> -->
<!--                 <img src="assets/img/testimonials/testimonials-5.jpg" class="testimonial-img" alt=""> -->
<!--                 <h3>John Larson</h3> -->
<!--                 <h4>Entrepreneur</h4> -->
<!--               </div> -->
<!--             </div>End testimonial item -->

<!--           </div> -->
<!--           <div class="swiper-pagination"></div> -->
<!--         </div> -->

<!--       </div> -->
<!--     </section> -->
    <!-- End Testimonials Section -->

    <!-- ======= Contact Section ======= -->
    <section id="contact" class="contact">
      <div class="container">

        <div class="section-title">
          <h2>Contact</h2>
        </div>

        <div class="row" data-aos="fade-in">

          <div class="col-lg-5 d-flex align-items-stretch">
            <div class="info">
              <div class="address">
                <i class="bi bi-geo-alt"></i>
                <h4>Location:</h4>
                <p>Gumi-si, Gyeongsangbuk-do, Republic of Korea</p>
              </div>

              <div class="email">
                <i class="bi bi-envelope"></i>
                <h4>Email:</h4>
                <p>bcchoi518@gmail.com</p>
              </div>

              <div class="phone">
                <i class="bi bi-phone"></i>
                <h4>Call:</h4>
                <p>010 5266 2125</p>
              </div>

			  <div class="map" id="map" style="max-width:470px; height:300px;"></div>
			  <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=26e6a9e5511eedfc656a4c65e89a89bc"></script>
			  <script>
				  const container = document.getElementById('map');
				  const options = {
						center: new kakao.maps.LatLng(36.1213, 128.3391),
						level: 8
					};
				  const map = new kakao.maps.Map(container, options);
			  </script>
            </div>
          </div>

          <div class="col-lg-7 mt-5 mt-lg-0 d-flex align-items-stretch">
            <form action="" method="post" role="form" class="php-email-form">
              <div class="row">
                <div class="form-group col-md-6">
                  <label for="name">Your Name</label>
                  <input type="text" name="name" class="form-control" id="name" required>
                </div>
                <div class="form-group col-md-6">
                  <label for="name">Your Email</label>
                  <input type="email" class="form-control" name="email" id="email" required>
                </div>
              </div>
              <div class="form-group">
                <label for="name">Subject</label>
                <input type="text" class="form-control" name="subject" id="subject" required>
              </div>
              <div class="form-group">
                <label for="name">Message</label>
                <textarea class="form-control" name="message" rows="10" required></textarea>
              </div>
              <div class="my-3">
                <div class="loading">Loading</div>
                <div class="error-message"></div>
                <div class="sent-message">Your message has been sent. Thank you!</div>
              </div>
              <div class="text-center"><button type="submit">Send Message</button></div>
            </form>
          </div>

        </div>

      </div>
    </section><!-- End Contact Section -->

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong><span>iPortfolio</span></strong>
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/iportfolio-bootstrap-portfolio-websites-template/ -->
        Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
      </div>
    </div>
  </footer><!-- End  Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
      class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="assets/vendor/typed.js/typed.min.js"></script>
  <script src="assets/vendor/waypoints/noframework.waypoints.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>