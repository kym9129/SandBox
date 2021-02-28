
function calculate(){
    // 사용자 입력값 가져오기=
    // var waist = 38;
    // var lim = 9;
    var waist = document.getElementById("waist").value;
    var lim = document.getElementById("lim").value;

    console.log(waist, lim);

    //체지방률 계산식
    var fatrate = ((1.5 * (waist - lim)) - 9);

    //체지방률 화면에 출력
    document.getElementById("fatrate").innerHTML = fatrate;

    //비만여부 화면에 출력
    if(fatrate >=16.0 && fatrate <=25.9){
        document.getElementById("judge").innerHTML = "정상";
    }
    else if(fatrate >= 26.0 && fatrate <= 35.9){
        document.getElementById("judge").innerHTML = "약간 비만";
    }else if(fatrate >= 35 && fatrate <= 45.9 ){
        document.getElementById("judge").innerHTML = "중간 비만";

    }else if(fatrate >= 46 && fatrate <= 55.9 ){
        document.getElementById("judge").innerHTML = "심각한 비만";
    }
    else if(fatrate >= 56 && fatrate <= 65.9 ){
        document.getElementById("judge").innerHTML = "극심한 비만";
    }
    else if(fatrate >= 65 ){
        document.getElementById("judge").innerHTML = "매우 극심한 비만";
    }
    else{
        document.getElementById("judge").innerHTML = "저체중";
    }

}