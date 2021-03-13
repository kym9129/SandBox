console.log("----가입정보------");
console.log(localStorage.getItem("id"));
console.log(localStorage.getItem("pwd"));
console.log(localStorage.getItem("userName"));
console.log(localStorage.getItem("phone"));
console.log(localStorage.getItem("bday"));
console.log(localStorage.getItem("gender"));
console.log(localStorage.getItem("marketing"));

window.onload = function(){
    var rows = document.querySelectorAll("tr>td");

    rows[0].innerHTML = localStorage.getItem("id");
    rows[1].innerHTML = localStorage.getItem("pwd");
    rows[2].innerHTML = localStorage.getItem("userName");
    rows[3].innerHTML = localStorage.getItem("phone");
    rows[4].innerHTML = localStorage.getItem("bday");
    rows[5].innerHTML = localStorage.getItem("gender");
    rows[6].innerHTML = localStorage.getItem("marketing");
};