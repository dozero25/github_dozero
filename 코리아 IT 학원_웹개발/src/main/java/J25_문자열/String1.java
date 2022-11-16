package J25_문자열;

public class String1 {
    
    public static void main(String[] args) {
        
        String filePath = "C:/Users/junil/java-study/src/main/java/String.java";
        String filePath2 = "C:/Users/junil/project/java-study2/src/main/java/Integer.java";

        /*
        SubString() : 문자열을 잘라서 리턴한다.
        indexOf() : 내가 찾는 문자열의 위치 인덱스를 반환
        두가지 활용
         */
        int srcIndex = filePath.indexOf("/src");
        String projectPath = filePath.substring(0, srcIndex); // /src 전까지 잘라준다.

        String projectName = projectPath.substring(projectPath.lastIndexOf("/") + 1);
        String fileName =filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf("."));
        String extension = filePath.substring(filePath.lastIndexOf("."));

        System.out.println("프로젝트명 : "+projectName);
        System.out.println("파일명 : "+fileName);
        System.out.println("확장자명 : "+extension);


        
//        String projectName = "java-study";
//        String fileName = "String";
//        String extension = ".java";
//
//        System.out.println("프로젝트명 : "+projectName);
//        System.out.println("파일명 : "+fileName);
//        System.out.println("확장자명 : "+extension);
        
        
    }
}
