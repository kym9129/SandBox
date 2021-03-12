/**
 * 회원가입
 */

//web storage 사용법
/**
 * // Store
localStorage.setItem("lastname", "Smith");

// Retrieve
document.getElementById("result").innerHTML = localStorage.getItem("lastname");
 */

/**
 * 멤버 생성자
 * @param {*} id string
 * @param {*} pwd string
 * @param {*} name string
 * @param {*} phone string
 * @param {*} birth string
 * @param {*} gender string : 'F' / 'M'
 * @param {*} marketing boolean 마케팅 정보 수신 동의 여부 T : Yes / F : No
 */
function Member(id, pwd, name, phone, birth, gender, marketing){
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.birth = birth;
    this.gender = gender;
    this.marketing = marketing;
}

window.onload = function(){
    var id, pwd, name, phone, birth, gender, marketing;









};