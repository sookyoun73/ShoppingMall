package ci.jvision.admin123456.service;

import ci.jvision.admin123456.domain.products.ProductsRepository;
import ci.jvision.admin123456.web.dto.ProductsListResponseDto;
import ci.jvision.admin123456.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    @Transactional
    public long save(ProductsSaveRequestDto requestDto)
    {
        return productsRepository.save(requestDto.toEntity()).getP_id();
    }

//    @Transactional
//    public Long update(Long id, PostsUpdateRequestDto requestDto)
//    {
//        Posts posts = postsRepository.findById(id)
//                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
//        posts.update(requestDto.getTitle(), requestDto.getContent());
//        return id;
//    }
//
//    @Transactional
//    public void delete(Long id)
//    {
//        Posts posts = postsRepository.findById(id)
//                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
//        postsRepository.delete(posts);
//    }
//
//    @Transactional
//    public PostsResponseDto findById(Long id)
//    {
//        Posts entity = postsRepository.findById(id)
//                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
//        return new PostsResponseDto(entity);
//    }
//

    @Transactional
    public List<ProductsListResponseDto> findAllAsc()
    {
        return productsRepository.findAllAsc().stream()
                .map(ProductsListResponseDto::new)
                .collect(Collectors.toList());
    }
}
