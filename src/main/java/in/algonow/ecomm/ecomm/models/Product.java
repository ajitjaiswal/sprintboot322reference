package in.algonow.ecomm.ecomm.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    private Long productId;
    private String name;
    private String price;
    private Long weight;

}
