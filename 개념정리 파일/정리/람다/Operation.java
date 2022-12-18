package 정리.람다;

@FunctionalInterface
// 람다는 이것을 달아줘야한다.
// 추상 메서드를 두개 이상 만들 경우 에러를 뜨게 만든다.
public interface Operation {
    public int calc(int x, int y);

    public default String resultToString(int result){
        return "결과 : "+ result;
    }
}
