window.onload = function(){
    animation();
    // //윈도우의 높이
    // var winH = window.innerHeight; //766

    // //스크롤 값 (수직 스크롤을 얼마나 했는지. 내릴 수록 값 커짐)
    // var scrollY = window.scrollY; //0

    // //#roadmap의 top값
    // //스크롤을 내릴 수록 값이 줄어들고 winH의 탑과 만나면 0이된다
    // //페이드인 줄 시점 : posFromWinTop - winH < 0
    // var posFromWinTop = roadmap.getBoundingClientRect().top; //3760

    // //#roadmap의 절대좌표값
    // var absolutePos = scrollY + posFromWinTop; //3760

    // console.log(winH, scrollY, posFromWinTop, absolutePos);

    function animation(){
        console.log("animation()!");
        var sections; //섹션 유사배열
        var winH; //윈도우의 높이
        initModule();

        //모듈 초기화 함수
        function initModule(){
            console.log("initModule!");
            // sections = document.querySelectorAll("section");
            sections = document.querySelectorAll(".text-transitionLeft")
            winH = window.innerHeight;
            _addEventHandlers();
        }

        //이벤트 핸들러 만드는 함수
        function _addEventHandlers(){
            console.log("_addEventHandlers!");
            window.addEventListener("scroll", _checkPosition);
            // window.addEventListener("load", _checkPosition);
            window.addEventListener("resize", _checkPosition);
        }

        //포지션 체크 함수
        function _checkPosition(){
            // console.log("_checkPosition");
            for(var i = 0; i < sections.length; i++){
                //각 섹션의 top값
                //스크롤을 내릴 수록 값이 줄어들고 winH의 탑과 만나면 0이된다
                var posFromWinTop = sections[i].getBoundingClientRect().top;
                // console.log("posFromWinTop=" + posFromWinTop);
                if(!sections[i].classList.contains('active')){
                    //페이드인 줄 시점 : posFromWinTop - winH < 0
                    if(winH > posFromWinTop){
                        console.log("fade-in!");
                        sections[i].classList.add("active");
                    }
                    //그럼 페이드 아웃 시점은?
                    else{
                        console.log("fade-out!")
                        sections[i].classList.remove("active");
                    }
                } 


            }
        }

        //이거뭐지?
        // return {
        //     init: initModule
        // }



    }






};