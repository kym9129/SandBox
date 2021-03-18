window.onload = function(){

    function animation(){
        var sections; //섹션 유사배열
        var winH; //윈도우의 높이

        //모듈 초기화 함수
        function initModule(){
            sections = document.querySelectorAll(".text-transitionLeft")
            winH = window.innerHeight;
            _addEventHandlers();
        }

        //이벤트 핸들러 만드는 함수
        function _addEventHandlers(){
            window.addEventListener("scroll", _checkPosition);
            window.addEventListener("resize", initModule);
        }

        //포지션 체크 함수
        function _checkPosition(){
            for(var i = 0; i < sections.length; i++){
                //각 섹션의 top값
                //스크롤을 내릴 수록 값이 줄어들고 winH의 탑과 만나면 0이된다
                var posFromWinTop = sections[i].getBoundingClientRect().top;
                if(!sections[i].classList.contains('active')){
                    //페이드인 줄 시점 : posFromWinTop - winH < 0
                    if(winH > posFromWinTop){
                        sections[i].classList.add("active");
                    }
                } 
            }
        }
        //animation()이 객체로 함수를 리턴
        return{
            init : initModule
        }

    }
    //animation()의 init메소드 실행
    animation().init();

};