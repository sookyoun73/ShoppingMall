package ci.jvision.admin123456.web;

import ci.jvision.admin123456.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final ProductsService productsService;

    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("products", productsService.findAllAsc());
        return "index";
    }

    @GetMapping("/products/save")
    public String productsSave()
    {
        return "products-save";
    }

//    @GetMapping("/posts/update/{id}")
//    public String postsUpdate(@PathVariable Long id, Model model)
//    {
//        PostsResponseDto dto = postsService.findById(id);
//        model.addAttribute("posts", dto);
//        return "posts-update";
//    }
}
