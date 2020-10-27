function checkWrite() {
	if(document.f.name.value=="") {
		alert("성명을 입력하세요.");
		document.f.name.focus();
		document.f.name.select();
		return false;
	}
	for(var i=0; i<document.f.name.value.length; i++) {
		ch=document.f.name.value.charAt(i);
		check=/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
		if(!(check.test(ch))) {
			alert("성명은 한글만 입력가능합니다.");
			document.f.name.focus();
			document.f.name.select();
			return false;
		}
	}
	if(document.f.duty.value=="") {
		alert("직책을 입력하세요.");
		document.f.duty.focus();
		document.f.duty.select();
		return false;
	}
	for(var i=0; i<document.f.duty.value.length; i++) {
		ch=document.f.duty.value.charAt(i);
		check=/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;
		if(!(check.test(ch))) {
			alert("직급은 한글만 입력가능합니다.");
			document.f.duty.focus();
			document.f.duty.select();
			return false;
		}
	}
	if(document.f.phone_2.value=="") {
		alert("전화번호 가운데 자리를 입력하세요.");
		document.f.phone_2.focus();
		document.f.phone_2.select();
		return false;
	}
	if(document.f.phone_3.value=="") {
		alert("전화번호 마지막 자리를 입력하세요.");
		document.f.phone_3.focus();
		document.f.phone_3.select();
		return false;
	}
	if(!(document.f.phone_2.value.length=="3" || document.f.phone_2.value.length=="4")) {
		alert("전화번호 가운데 자리는 숫자 3자리 혹은 4자리로 구성되어 있습니다.");
		document.f.phone_2.focus();
		document.f.phone_2.select();
		return false;
	}
	if(document.f.phone_3.value.length!=4) {
		alert("전화번호 마지막 자리는 숫자 4자리로 구성되어 있습니다.");
		document.f.phone_3.focus();
		document.f.phone_3.select();
		return false;
	}
	for(var i=0; i<document.f.phone_2.value.length; i++) {
		ch=document.f.phone_2.value.charAt(i);
		if(!(ch>='0'&&ch<='9')) {
			alert("전화번호에는 숫자만 입력할 수 있습니다.");
			document.f.phone_2.focus();
			document.f.phone_2.select();
			return false;
		}
	}
	for(var i=0; i<document.f.phone_3.value.length; i++) {
		ch=document.f.phone_3.value.charAt(i);
		if(!(ch>='0'&&ch<='9')) {
			alert("전화번호에는 숫자만 입력할 수 있습니다.");
			document.f.phone_3.focus();
			document.f.phone_3.select();
			return false;
		}
	}
}

function termin() {
	alert("프로그램을 종료합니다.");
}