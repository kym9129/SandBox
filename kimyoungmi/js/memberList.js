//value값인 배열을 다시 배열로 받는다. (회원정보배열을 담은 배열)
var memberArr = [];
for(var i = 0; i < localStorage.length; i++){
    memberArr.push(localStorage.getItem(i).split(","));
    // console.log(memberArr[i]);
}

window.onload = function(){
    //table하위에 tr생성
    for(var j = 0; j < memberArr.length; j++){
        var table = document.querySelector("table");
        var tr = document.createElement("tr");
        table.appendChild(tr);

        //tr하위에 td생성 및 회원정보 삽입
        for(var i = 0; i < memberArr[0].length; i++){
            //td Node
            var td = document.createElement("td");
            //text Node
            var textnode = document.createTextNode(memberArr[j][i]);
            tr.appendChild(td);
            td.appendChild(textnode);
        }
    }
};