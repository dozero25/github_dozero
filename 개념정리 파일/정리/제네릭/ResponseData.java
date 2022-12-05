package 정리.제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
    private T data;
    
    /*
        제네릭(Generic : 일반적인)
        : 자료 구조 같이 구조체를 직접 만들어 사용할 때 많이 사용하고 유용하다.
        : 데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
        : 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미
        : 특정(specific) 타입을 미리 지정해주는 것이 아닌 필요에 의해 지정할 수 있도록 하는 일반(Generic)타입

        장점
        : 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴팡리 단계에서 방지할 수 있다.
        : 클래스 외부에서 타입을 지정해주기 때문에 타입을 체크하고 변환해줄 필요가 없다. 즉 관리가 편하다.
        : 비슷한 기능을 지원하는 경우 코드으 재사용성이 높아진다.
        
        <T> Type
        <E> Element
        <K> Key
        <V> Value
        <N> Number
        많이 사용

        /클래스 및 인터페이스 선언/
        public class ClassName<T>{}
        public InterfaceName<T>{}

        public class HasMap <K, V>{}
        => ClassName<String, Integer> a = new ClassName<String, Integer>();

        /제네릭 클래스/
        class ClassName<E>{
            private E element;

            void set(E element) {
            this.element = element;
            }
            E get(){
            return element;
            }
        }
        Class Main{

        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();
        }


        /제네릭 메소드/
        static <E> E genericMethod(E o){
            return o;
        }

        static <T> T genericMethod(T o){
            return o;
        }



     */
}
