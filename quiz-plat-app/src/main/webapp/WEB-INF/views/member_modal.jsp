<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="resources/css/style.css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans:400,700|Roboto:400,500,700&display=swap">
  <title>PickVS</title>
</head>

<body>
  <!-- 회원 가입 모달창-->
  <div class="modal" id="join" style="display:none;width:85vw;">
    <button class="modal_close"><i class="fas fa-times fa-2x"></i></button>
    <div class="modal_cont">
      <div class="modal_inparea">
        <label for="join1" class="modal_inp_tit">아이디</label>
        <input type="text" class="modal_inp" placeholder="아이디를 입력해주세요" id="join1">
      </div>
      <div class="modal_inparea">
        <label for="join2" class="modal_inp_tit">닉네임</label>
        <input type="text" class="modal_inp" placeholder="행복한 돼지" id="join2">
      </div>
      <div class="modal_inparea">
        <label for="join3" class="modal_inp_tit">비밀번호</label>
        <input type="password" class="modal_inp" placeholder="비밀번호" id="join3">
      </div>
      <div class="modal_inparea">
        <label for="join4" class="modal_inp_tit">비밀번호 확인</label>
        <input type="password" class="modal_inp" placeholder="한번 더 입력해주세요" id="join4">
      </div>
      <button class="modal_submit modal_footbtn">회원가입</button>
    </div>
  </div>
  <a href="#join" id="join_trigger" class="blind" rel="leanModal">회원가입창</a>

  <!-- 로그인 모달창-->
  <div class="modal" id="login" style="display:none;width:85vw;">
    <button class="modal_close"><i class="fas fa-times fa-2x"></i></button>
    <div class="modal_cont">
      <div class="modal_inparea">
        <label for="login1" class="modal_inp_tit">아이디</label>
        <input type="text" class="modal_inp" placeholder="아이디를 입력해주세요" id="login1">
      </div>
      <div class="modal_inparea">
        <label for="login2" class="modal_inp_tit">비밀번호</label>
        <input type="password" class="modal_inp" placeholder="비밀번호" id="login2">
      </div>
      <div class="modal_inparea">
        <input type="checkbox" class="modal_chk" id="login_chk">
        <label for="login_chk" class="modal_chk_tit">자동로그인</label>
      </div>
      <button class="modal_footbtn modal_submit">로그인</button>
      <button class="modal_footbtn" onclick="$('.modal_close').click(); $('#join_trigger').click();">회원가입</button>
    </div>
  </div>
  <a href="#login" id="login_trigger" class="blind" rel="leanModal">로그인창</a>

  <script src="https://code.jquery.com/jquery-2.2.4.js"></script>
  <script src="resources/js/smoothState.js"></script>
  <script src="resources/js/jquery.leanModal.min.js"></script>
  <script src="resources/js/common.js"></script>
  <script>
    $("a[rel*=leanModal]").leanModal({ overlay: 0.4, slideinUp: 'join' }); //a태그에 모달 켜기 기능 추가
    //$("#join_trigger").click();
    $("#login_trigger").click();
  </script>
</body>

</html>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="resources/css/style.css">
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans:400,700|Roboto:400,500,700&display=swap">
  <title>PickVS</title>
</head>

<body>
  <!-- 회원 가입 모달창-->
  <div id="lean_overlay"></div>
  
  <div class="join" id="join" style="display:none;width:85vw;">
    <form action="/enroll" id="enroll" method="post" >
    <div class="join_cont">
      <div class="join_inparea">
        <label for="join1" class="join_inp_tit">아이디</label>
        <input type="text" class="join_inp" placeholder="아이디를 입력해주세요" name="join1" id="join1">
      </div>
      <div class="join_inparea">
        <label for="join1" class="join_inp_tit">닉네임</label>
        <input type="text" class="join_inp on" value=${nickname} name="join2" id="join2">
      </div>
      <div class="join_inparea">
        <label for="join3" class="join_inp_tit">비밀번호</label>
        <input type="password" class="join_inp" placeholder="비밀번호" name="join3" id="join3">
      </div>
      <div class="join_inparea">
        <label for="join4" class="join_inp_tit">비밀번호 확인</label>
        <input type="password" class="join_inp" placeholder="한번 더 입력해주세요" name="join4" id="join4">
      </div>
      <button class="join_submit">회원가입</button>
    </div>
    </form>
  </div>
  
  <a href="#join" id="join_trigger" class="blind">회원가입창</a>

  <script src="https://code.jquery.com/jquery-2.2.4.js"></script>
  <script src="resources/js/smoothState.js"></script>
  <script src="resources/js/common.js"></script>
  <script src="resources/js/jquery.leanModal.min.js"></script>
  <script>
    $("#join_trigger").leanModal({}); //a태그에 모달 켜기 기능 추가
    $("#join_trigger").click();
  </script>
</body>

</html>
>>>>>>> 37d670e97599041e3c95804aab4df32552a4fa77