package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@AllArgsConstructor
@Data
class ProductImg {
    int imgCode;
    String imgName;
}

public class ProductMap {

    public static void main(String[] args) {

        Map<String, Object> product = new HashMap<>();
        product.put("productCode", 1);
        product.put("productName", "스타벅스 텀블러");
        product.put("productColor", "Black");
        product.put("productSize", "Venti");

        List<ProductImg> productImgs = new ArrayList<ProductImg>();
        productImgs.add(new ProductImg(1, "starbucks_black_tumbler1.png"));
        productImgs.add(new ProductImg(2, "starbucks_black_tumbler2.png"));
        productImgs.add(new ProductImg(3, "starbucks_black_tumbler3.png"));
        productImgs.add(new ProductImg(4, "starbucks_black_tumbler4.png"));

        product.put("productImg", productImgs);

        System.out.println(product);
        
        
        // 아래 결과가 나오도록 출력하기
        /*
            텀블러이미지1: starbucks_black_tumbler1.png
            텀블러이미지2: starbucks_black_tumbler2.png
            텀블러이미지3: starbucks_black_tumbler3.png
            텀블러이미지4: starbucks_black_tumbler4.png
         */

        // 리스트를 들고옴
        List<ProductImg> productImgList = (List<ProductImg>) product.get("productImg"); // 다운캐스팅(object)

        for(ProductImg img : productImgList) {
            System.out.println("텀블러이미지" + img.getImgCode() + ": " + img.getImgName());
        }






    }
}
