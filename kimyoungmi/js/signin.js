/**
 * 로그인
 */

 console.log(localStorage.getItem("id"));
 console.log(localStorage.getItem("pwd"));
 console.log(localStorage.getItem("userName"));
 console.log(localStorage.getItem("phone"));
 console.log(localStorage.getItem("bday"));
 console.log(localStorage.getItem("gender"));
 console.log(localStorage.getItem("marketing"));


function login(){
    console.log(id.value);
    console.log(pwd.value);

    //id 비밀번호가 db(local storage)와 일치하는지 확인
    if(id.value == localStorage.getItem("id")
        && pwd.value == localStorage.getItem("pwd")){

        alert("로그인 성공! 환영합니다.");
        // location.href="./memberList.html";
        window.open("./memberList.html", "");
    }
    else{
        alert("아이디와 비밀번호가 일치하지 않습니다.");
        // console.log("login fail!");
    }
    
}