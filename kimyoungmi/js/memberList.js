window.onload = function(){
    //회원정보 가져오기
    var members = JSON.parse(localStorage.getItem("members")) || [];
    
    //table하위에 tr생성
    for(var j = 0; j < members.length; j++){
        //tr추가
        var table = document.querySelector("table");
        var tr = document.createElement("tr");
        table.appendChild(tr);
        
        //td내용삽입 : No.행
        insertTable(tr, j);

        //td내용삽입 : 각 속성 행
        for(var i in members[j]){
            insertTable(tr, members[j][i]);
        }
    }
};

function insertTable(tr, text){
    //td element, node 생성
    var td = document.createElement("td");
    var textNode = document.createTextNode(text);

    //tr에 td자식추가
    tr.appendChild(td);
    //td에 텍스트노드 추가
    td.appendChild(textNode);
}