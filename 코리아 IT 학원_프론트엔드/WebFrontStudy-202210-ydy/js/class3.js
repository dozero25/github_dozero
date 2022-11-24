window.onload = () => {
    const btns = document.querySelectorAll("button");
    btns[0].onclick = () => {
        location.href = "https://www.naver.com/"; // history를 남기고 이동한다.
    }

    btns[1].onclick = () => {
        const urlInput = document.querySelector("input");
        urlInput.value = location.pathname; // 경로 가져오기
    }

    btns[2].onclick = () => {
        location.reload(); // 새로고침
    }
    
    btns[3].onclick = () => {
        location.replace("https://www.google.com"); // 대체, 되돌아가기 버튼이 안된다. history를 남기지 않는다.
    }
}
