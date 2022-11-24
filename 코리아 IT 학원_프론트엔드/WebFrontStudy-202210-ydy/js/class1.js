// let user = {
//     username : "ehdud",
//     password : "05264"
// };
// // 아래랑 같은 내용이다.

// console.log(user.username);
// console.log(user.password);

// 접근 지정자 : 앞에 #을 붙인다.
    // 싱글톤을 줄 때 #을  해준다. 평소에 할땐 잘 안한다.
    
    // setUsername(username) {
    //     this.#username = username;
    // }
    // getUsername(username) {
    //     return this.#username;
    // }


class User {
    username;
    password;
    name;
    email;

    // 생성자
    constructor(username, password, name, email){
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }
    // 메서드
    printName(){
        console.log(this.name + "님의 정보");
    }
    
}
// 싱글톤
class UserMain {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null){
            this.#instance = new UserMain();
        }
        return this.#instance;
    }


    main(){
        let user = new User("ehdud", "05264","윤도영","ehdud@naver.com");

        // user.username = "ehdud";
        // user.password = "05264";
        // user.name = "윤도영";
        // user.email = "ehdud@naver.com"
        
        console.log(user);

        localStorage.username = user.username;
        console.log("useranme : " + localStorage.username); // 전체 영역이다.

        user.printName();
    }
}

window.onload = () => {
    let userMain = UserMain.getInstance();
    
    userMain.main();
}