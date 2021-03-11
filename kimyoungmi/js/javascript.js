

window.onload = function(){


    //페이지 로드하면 애니메이션 실행
    animation();

    function animation(){
        // console.log("animation()!");
        var sections; //섹션 유사배열
        var winH; //윈도우의 높이
        initModule();

        //모듈 초기화 함수
        function initModule(){
            // console.log("initModule!");
            // sections = document.querySelectorAll("section");
            sections = document.querySelectorAll(".text-transitionLeft")
            winH = window.innerHeight;
            _addEventHandlers();
        }

        //이벤트 핸들러 만드는 함수
        function _addEventHandlers(){
            // console.log("_addEventHandlers!");
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
                        // console.log("fade-in!");
                        sections[i].classList.add("active");
                    }
                    // //그럼 페이드 아웃은 어떻게 하지?
                    // //다른 홈피들도 안하넹..나도안해!!
                    // else{
                    //     console.log("fade-out!")
                    //     sections[i].classList.remove("active");
                    // }
                } 
            }
        }

    }

    // //섹션별 위치값
    // var posHome = document.querySelector('#home').offsetTop;
    // var posAbout = document.querySelector('#about').offsetTop;
    // var posProject = document.querySelector('#project').offsetTop;
    // var posFavorite = document.querySelector('#favorite').offsetTop;
    // var posRoadmap = document.querySelector('#roadmap').offsetTop;

    // function movePage(pos){
    //     window.scrollTo({top:pos, behavior: 'smooth'});
    // }
    



};