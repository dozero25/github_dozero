// let user = {
//     username : "ehdud",
//     password : "05264"
// };
// // 아래랑 같은 내용이다.

// console.log(user.username);
// console.log(user.password);


class User {
    username;
    password;
    name;
    email;
    // 접근 지정자 : 앞에 #을 붙인다.
    // 싱글톤을 줄 때 #을  해준다. 평소에 할땐 잘 안한다.
    
    // setUsername(username) {
    //     this.#username = username;
    // }
    // getUsername(username) {
    //     return this.#username;
    // }
}

class UserMain {
    main(){
        let user = new User();

        user.username = "ehdud";
        user.password = "05264";
        user.name = "윤도영"
        user.email = "ehdud@naver.com"
        
        console.log(user);
    }
}

window.onload = () => {
    let userMain = new UserMain();
    
    userMain.main();
}