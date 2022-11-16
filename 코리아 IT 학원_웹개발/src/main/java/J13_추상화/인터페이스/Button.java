package J13_추상화.인터페이스;

public abstract class Button implements Press, Up, Down{ // Button에는 Press, Up, Down을 가지고 있다.

    // 아무것도 동작하지 않는 상태를 만든다 : PowerButton은 onPressed()만 사용하게 된다.
    @Override
    public void onDown() {}

    @Override
    public void onPressed() {}

    @Override
    public void onUp() {}
}
