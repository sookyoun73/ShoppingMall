package ci.jvision.admin123456.web;

import ci.jvision.admin123456.service.ProductsService;
import ci.jvision.admin123456.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {

    private final ProductsService productsService;

    @PostMapping("/api/products")
    public long save(@RequestBody ProductsSaveRequestDto requestDto)
    {
        return productsService.save(requestDto);
    }

//    @PutMapping("/api/v1/posts/{id}")
//    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto)
//    {
//        return postsService.update(id, requestDto);
//    }
//
//    @DeleteMapping("/api/v1/posts/{id}")
//    public Long delete(@PathVariable Long id)
//    {
//        postsService.delete(id);
//        return id;
//    }
//
//    @GetMapping("/api/v1/posts/{id}")
//    public PostsResponseDto findById(@PathVariable Long id)
//    {
//        return postsService.findById(id);
//    }

}
