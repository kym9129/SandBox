/**
 * 회원가입
 */
  
//검사통과여부. submit할 때 참조함.
var idChecked = false;
var pwdChecked = false;
var nameChecked = false;
var phoneChecked = false;

window.onload = function(){

    //id 검사 : 영문대소문자숫자 4~12자리
    id.addEventListener('keyup', checkId);
    function checkId(){
        if(!/^[a-zA-Z]\w{3,11}$/.test(this.value)){
            //유효성검사에 걸릴 경우 메세지 피드백
            alertId.innerHTML = "유효하지 않은 id입니다."
        }
        else{
            alertId.innerHTML = "";
            idChecked = true;
        }
    }

    //password 검사 : 영문+대소문자+특수문자, id와 중복X
    pwd.addEventListener('keyup', checkPwd);

    function checkPwd(){
        var pwdRegex = /^[a-zA-Z0-9!@#$%^&*]{4,12}/;
        if(!pwdRegex.test(this.value)){
            alertPwd.innerHTML = "유효하지 않은 비밀번호입니다.";
        }
        else{
            //id와의 중복검사
            if(id.value == this.value){
                alertPwd.innerHTML = "아이디와 비밀번호를 다르게 입력해주세요.";
            }
            else{
                alertPwd.innerHTML = "";
                pwdChecked = true;
            }
        }
    }

    //이름 검사
    userName.addEventListener('keyup', checkName);
    function checkName(){
        var nameRegex = /^[가-힣]{2,}$/;
        if(!nameRegex.test(this.value)){
            alertName.innerHTML = "이름 형식이 맞지 않습니다";
        }
        else{
            alertName.innerHTML = "";
            nameChecked = true;
        }
    }

    //폰번호 검사
    phone.addEventListener('keyup', checkPhone);

    function checkPhone(){
        var phoneRegex = /^01[0|1|6|7|9][0-9]{7,8}$/;

        if(!phoneRegex.test(this.value)){
            alertPhone.innerHTML = "전화번호 형식이 맞지 않습니다";
            // return false;
        }else{
            //확인 완료 시
            alertPhone.innerHTML = "";
            // return true;
            phoneChecked = true;
        }
    }
};

//회원가입 버튼 누를 시 (제출 시)
function submitForm(){
    // console.log("submit pressed!");
   //모든 검사 통과 시
    if(idChecked && pwdChecked && nameChecked && phoneChecked){
        // * WebStorage에 정보담기
        var gender = document.querySelector("[name=gender]");
        localStorage.setItem("id", id.value);
        localStorage.setItem("pwd", pwd.value);
        localStorage.setItem("userName", userName.value);
        localStorage.setItem("phone", phone.value);
        localStorage.setItem("bday", bday.value);
        localStorage.setItem("gender", gender.value);
        localStorage.setItem("marketing", marketing.checked); //마케팅수신동의 여부

        console.log("----가입정보------");
        console.log(localStorage.getItem("id"));
        console.log(localStorage.getItem("pwd"));
        console.log(localStorage.getItem("userName"));
        console.log(localStorage.getItem("phone"));
        console.log(localStorage.getItem("bday"));
        console.log(localStorage.getItem("gender"));
        console.log(localStorage.getItem("marketing"));

        // * 회원가입완료 팝업알림
        console.log("submit complete!");
        alert("회원가입 완료! 로그인 화면으로 이동합니다.");
        return true;
        // return false;
    }
    else{
        // console.log("submit fail!");
        alert("회원정보를 올바르게 입력해주세요.");
        return false;
    }
}
