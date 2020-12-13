package ci.jvision.admin123456.domain.products;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long p_id;

    @Column(nullable = false)
    private String p_name;

    @Column(nullable = false)
    private long p_price;

    @Column(length = 500, nullable = true)
    private String p_desc;

    @Builder
    public Products(String p_name, long p_price, String p_desc)
    {
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_desc = p_desc;
    }

//    public void update(String title, String content)
//    {
//        this.title = title;
//        this.content = content;
//    }
}
