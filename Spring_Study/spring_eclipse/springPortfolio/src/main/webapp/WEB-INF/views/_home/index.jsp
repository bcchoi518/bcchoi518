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
              단계적으로 성장하여 Career Goal 달성을 목표로 배움에 임하는 개발자입니다. </em></p>
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

    <!-- ======= Portfolio Section ======= -->
    <section id="portfolio" class="portfolio section-bg">
      <div class="container">

        <div class="section-title">
          <h2>Portfolio</h2>
        </div>

        <div class="row" data-aos="fade-up">
          <div class="col-lg-12 d-flex justify-content-center">
            <ul id="portfolio-flters">
              <li data-filter="*" class="filter-active">All</li>
              <li data-filter=".filter-app">App</li>
              <li data-filter=".filter-card">Card</li>
              <li data-filter=".filter-web">Web</li>
            </ul>
          </div>
        </div>

        <div class="row portfolio-container" data-aos="fade-up" data-aos-delay="100">

          <div class="col-lg-4 col-md-6 portfolio-item filter-app">
            <div class="portfolio-wrap">
              <img src="assets/img/portfolio/portfolio-1.jpg" class="img-fluid" alt="">
              <div class="portfolio-links">
                <a href="assets/img/portfolio/portfolio-1.jpg" data-gallery="portfolioGallery"
                  class="portfolio-lightbox" title="App 1"><i class="bx bx-plus"></i></a>
                <a href="${path }/member/list" title="More Details"><i class="bx bx-link"></i></a>
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

    <!-- ======= Services Section ======= -->
<!--     <section id="services" class="services"> -->
<!--       <div class="container"> -->

<!--         <div class="section-title"> -->
<!--           <h2>Services</h2> -->
<!--           <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint -->
<!--             consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit -->
<!--             in iste officiis commodi quidem hic quas.</p> -->
<!--         </div> -->

<!--         <div class="row"> -->
<!--           <div class="col-lg-4 col-md-6 icon-box" data-aos="fade-up"> -->
<!--             <div class="icon"><i class="bi bi-briefcase"></i></div> -->
<!--             <h4 class="title"><a href="">Lorem Ipsum</a></h4> -->
<!--             <p class="description">Voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint -->
<!--               occaecati cupiditate non provident</p> -->
<!--           </div> -->
<!--           <div class="col-lg-4 col-md-6 icon-box" data-aos="fade-up" data-aos-delay="100"> -->
<!--             <div class="icon"><i class="bi bi-card-checklist"></i></div> -->
<!--             <h4 class="title"><a href="">Dolor Sitema</a></h4> -->
<!--             <p class="description">Minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo -->
<!--               consequat tarad limino ata</p> -->
<!--           </div> -->
<!--           <div class="col-lg-4 col-md-6 icon-box" data-aos="fade-up" data-aos-delay="200"> -->
<!--             <div class="icon"><i class="bi bi-bar-chart"></i></div> -->
<!--             <h4 class="title"><a href="">Sed ut perspiciatis</a></h4> -->
<!--             <p class="description">Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu -->
<!--               fugiat nulla pariatur</p> -->
<!--           </div> -->
<!--           <div class="col-lg-4 col-md-6 icon-box" data-aos="fade-up" data-aos-delay="300"> -->
<!--             <div class="icon"><i class="bi bi-binoculars"></i></div> -->
<!--             <h4 class="title"><a href="">Magni Dolores</a></h4> -->
<!--             <p class="description">Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt -->
<!--               mollit anim id est laborum</p> -->
<!--           </div> -->
<!--           <div class="col-lg-4 col-md-6 icon-box" data-aos="fade-up" data-aos-delay="400"> -->
<!--             <div class="icon"><i class="bi bi-brightness-high"></i></div> -->
<!--             <h4 class="title"><a href="">Nemo Enim</a></h4> -->
<!--             <p class="description">At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium -->
<!--               voluptatum deleniti atque</p> -->
<!--           </div> -->
<!--           <div class="col-lg-4 col-md-6 icon-box" data-aos="fade-up" data-aos-delay="500"> -->
<!--             <div class="icon"><i class="bi bi-calendar4-week"></i></div> -->
<!--             <h4 class="title"><a href="">Eiusmod Tempor</a></h4> -->
<!--             <p class="description">Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum -->
<!--               soluta nobis est eligendi</p> -->
<!--           </div> -->
<!--         </div> -->

<!--       </div> -->
<!--     </section> -->
    <!-- End Services Section -->

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
          <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint
            consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit
            in iste officiis commodi quidem hic quas.</p>
        </div>

        <div class="row" data-aos="fade-in">

          <div class="col-lg-5 d-flex align-items-stretch">
            <div class="info">
              <div class="address">
                <i class="bi bi-geo-alt"></i>
                <h4>Location:</h4>
                <p>A108 Adam Street, New York, NY 535022</p>
              </div>

              <div class="email">
                <i class="bi bi-envelope"></i>
                <h4>Email:</h4>
                <p>info@example.com</p>
              </div>

              <div class="phone">
                <i class="bi bi-phone"></i>
                <h4>Call:</h4>
                <p>+1 5589 55488 55s</p>
              </div>

              <iframe
                src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621"
                frameborder="0" style="border:0; width: 100%; height: 290px;" allowfullscreen></iframe>
            </div>

          </div>

          <div class="col-lg-7 mt-5 mt-lg-0 d-flex align-items-stretch">
            <form action="forms/contact.php" method="post" role="form" class="php-email-form">
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