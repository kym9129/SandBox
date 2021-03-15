/**
 * 로그인
 */
// localStorage.removeItem("honggd");
// console.log(localStorage);



function login(){
    //value값인 배열을 다시 배열로 받는다. (회원정보배열을 담은 배열)
    var memberArr = [];
    for(var i = 0; i < localStorage.length; i++){
        memberArr.push(localStorage.getItem(i).split(","));
    }
    
    //id pw 판정
    for(var i = 0; i < memberArr.length; i++){
        if(id.value == memberArr[i][0] && pwd.value == memberArr[i][1]){
            alert("로그인 성공! 환영합니다.");
            window.open("./memberList.html", "");
            break;
        }
        else{
            // console.log("continue");
            continue;
        }
    }
    //memberArr[i]안에 맞는 id/pwd가 없을 경우
    console.log("로그인 실패!");
    // alert("아이디와 비밀번호가 일치하지 않습니다."); 
}