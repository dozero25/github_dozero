package J19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

// 별도로 class 정의
@AllArgsConstructor
@Data
class ProductImg{
    private int imgCode;
    private String imgName;
}
public class ProductMap {

    public static void main(String[] args) {

        Map<String, Object> product = new HashMap<String, Object>(); // object : 어떠한 값이든 다 들어간다. 숫자, list 등
        product.put("productCode", 1);
        product.put("productName", "스타벅스 블랙 텀블러");
        product.put("productColor", "Black");
        product.put("productSize", "Venti");

        // 상품 이미지 등록
        List<ProductImg> productImgs = new ArrayList<ProductImg>();
        productImgs.add(new ProductImg(1, "starbucks_black_tumbler1.png"));
        productImgs.add(new ProductImg(2, "starbucks_black_tumbler2.png"));
        productImgs.add(new ProductImg(3, "starbucks_black_tumbler3.png"));
        productImgs.add(new ProductImg(4, "starbucks_black_tumbler4.png"));

        product.put("productImg", productImgs);

        System.out.println(product);

        /*
            텀블러이미지1 : starbucks_black_tumbler1.png
            텀블러이미지2 : starbucks_black_tumbler2.png
            텀블러이미지3 : starbucks_black_tumbler3.png
            텀블러이미지4 : starbucks_black_tumbler4.png

            출력하기
        */
        // Object는 업캐스팅 되어있다.
        List<ProductImg> productImgList = (List<ProductImg>) product.get("productImg");
        // Object이기 때문에 다운캐스팅 해준 후 list로 변환한다.
        // List로 다운캐스팅 안하면 오류가 생긴다.
        for(ProductImg img : productImgList){
            System.out.println("텀블러이미지"+img.getImgCode()+" : "+img.getImgName());
            
        }





    }
}
