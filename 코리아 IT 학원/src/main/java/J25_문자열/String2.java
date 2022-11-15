package J25_문자열;

public class String2 {
    public static void main(String[] args) {
        String phoneNumber = "010-9988-1916";

        int firstHyphenIndex = phoneNumber.indexOf("-");
        int lastHyphenIndex = phoneNumber.lastIndexOf("-");

        System.out.println("index : "+lastHyphenIndex);

        String subStringLastNumber = phoneNumber.substring(lastHyphenIndex+1);
        String subStringMidNumber = phoneNumber.substring(firstHyphenIndex+1, lastHyphenIndex);

        System.out.println(subStringLastNumber);
        System.out.println(subStringMidNumber);
    }
}
