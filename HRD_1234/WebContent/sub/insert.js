	//유효성 체크
	function checkWrite() {		
		//학번 입력여부 검사
		if(document.f.sno.value=="") {
			alert("학번을 입력하세요.");
			document.f.sno.focus();
			document.f.sno.select();
			return false;
		}
		//학번 유효성 검사(숫자만 허용)
		for(var i=0; i<document.f.sno.value.length; i++) {
			ch=document.f.sno.value.charAt(i);
			if(!(ch>='0'&&ch<='9')) {
				alert("학번은 숫자만 입력가능합니다.");
				document.f.sno.focus();
				document.f.sno.select();
				return false;
			}
		}
		//학번 길이 체크(5자)
		if(document.f.sno.value.length!=5) {
			alert("학번은 5자리로 구성되어 있습니다.");
			document.f.sno.focus();
			document.f.sno.select();
			return false;
		}
		//국어 입력여부 검사
		if(document.f.kor.value=="") {
			alert("국어 성적을 입력하세요.");
			document.f.kor.focus();
			document.f.kor.select();
			return false;
		}
		//국어 유효성 검사(숫자만 적용)
		for(var i=0; i<document.f.kor.value.length; i++) {
			ch=document.f.kor.value.charAt(i);
			if(!(ch>='0'&&ch<='9')) {
				alert("숫자만 입력가능합니다.");
				document.f.kor.focus();
				document.f.kor.select();
				return false;
			}
		}
		//영어 입력여부 검사
		if(document.f.eng.value=="") {
			alert("영어 성적을 입력하세요.");
			document.f.eng.focus();
			document.f.eng.select();
			return false;
		}
		//영어 유효성 검사(숫자만 적용)
		for(var i=0; i<document.f.eng.value.length; i++) {
			ch=document.f.eng.value.charAt(i);
			if(!(ch>='0'&&ch<='9')) {
				alert("숫자만 입력가능합니다.");
				document.f.eng.focus();
				document.f.eng.select();
				return false;
			}
		}
		//수학 입력여부 검사
		if(document.f.math.value=="") {
			alert("수학 성적을 입력하세요.");
			document.f.math.focus();
			document.f.math.select();
			return false;
		}
		//수학 유효성 검사(숫자만 적용)
		for(var i=0; i<document.f.math.value.length; i++) {
			ch=document.f.math.value.charAt(i);
			if(!(ch>='0'&&ch<='9')) {
				alert("숫자만 입력가능합니다.");
				document.f.math.focus();
				document.f.math.select();
				return false;
			}
		}
		//역사 입력여부 검사
		if(document.f.hist.value=="") {
			alert("역사 성적을 입력하세요.");
			document.f.hist.focus();
			document.f.hist.select();
			return false;
		}
		//역사 유효성 검사(숫자만 적용)
		for(var i=0; i<document.f.hist.value.length; i++) {
			ch=document.f.kor.value.charAt(i);
			if(!(ch>='0'&&ch<='9')) {
				alert("숫자만 입력가능합니다.");
				document.f.hist.focus();
				document.f.hist.select();
				return false;
			}
		}
		var sGrade=document.f.sno.value.substr(0,1);
		var sClass=document.f.sno.value.substr(1,3);
		var sNumber=document.f.sno.value.substr(3,5);
		if(sGrade>3 || sGrade<1) {
			alert("잘못된 학번입니다.");
			document.f.sno.focus();
			document.f.sno.select();
			return false;
		} else if(sClass>10 || sClass<1) {
			alert("잘못된 학번입니다.");
			document.f.sno.focus();
			document.f.sno.select();
			return false;
		} else if(sNumber>35 || sNumber<1) {
			alert("잘못된 학번입니다.");
			document.f.sno.focus();
			document.f.sno.select();
			return false;
		}	
		return true;
	}
