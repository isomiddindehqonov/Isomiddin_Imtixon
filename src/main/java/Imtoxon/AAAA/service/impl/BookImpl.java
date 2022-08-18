package Imtoxon.AAAA.service.impl;
import Imtoxon.AAAA.Mapper.BookMepper;
import Imtoxon.AAAA.dto.BookDto;
import Imtoxon.AAAA.dto.ResponseDto;
import Imtoxon.AAAA.entity.BookEntity;
import Imtoxon.AAAA.repository.BookRepository;
import Imtoxon.AAAA.service.Book;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BookImpl implements Book {
    private final BookRepository bookRepository;
    @Override
    public ResponseDto add(BookDto bookDto) {
        bookRepository.save(BookMepper.ToEntity(bookDto));
        return ResponseDto.builder()
                .date(bookDto)
                .massage("ok")
                .code(2)
                .build();
    }

    @Override
    public ResponseDto getById(Integer id, int page,int size) {
        PageRequest request = PageRequest.of(page, size);
       BookEntity bookEntity = bookRepository.findById(id).get();
        return ResponseDto.builder()
                .code(2)
                .date(BookMepper.toDto(bookEntity))
                .massage("ok")
                .build();

    }

    @Override
    public ResponseDto deleteBook(Integer id) {
        BookEntity bookEntity = bookRepository.findById(id).get();
        Integer book = bookRepository.getById(id).getId();
        if(book == null) {
            bookRepository.deleteById(id);
            return ResponseDto.builder()
                    .massage("ok")
                    .code(2)
                    .date(bookEntity)
                    .build();
        }
        return ResponseDto.builder()
                .code(-1)
                .massage("buday id li malumot yoq")
                .build();
    }

    @Override
    public ResponseDto updateBook(BookDto bookDto) {
        Optional<BookEntity> optional = bookRepository.findById(bookDto.getId());
        if(optional != null){
            BookEntity bookEntity =optional.get();
            bookEntity.setName(bookDto.getName()!= null? bookDto.getName() : bookEntity.getName());
            bookEntity.setPage(bookDto.getPage()!=null ? bookDto.getPage() : bookEntity.getPage());
            bookEntity.setPrice(bookDto.getPrice()!=null? bookDto.getPrice() : bookEntity.getPrice());
            bookEntity.setPublished_at(bookDto.getPublishedAt()!=null? bookDto.getPublishedAt() : bookEntity.getPublished_at());
            bookEntity.setPublished_by(bookDto.getPublishedBy()!= null? bookDto.getPublishedBy() : bookEntity.getPublished_by());
            bookEntity.setAouthor_name(bookDto.getAouthorName()!= null? bookDto.getAouthorName() : bookEntity.getAouthor_name());
            return ResponseDto.builder()
                    .code(2)
                    .massage("ok")
                    .date(BookMepper.toDto(bookEntity))
                    .build();
        }
        return ResponseDto.builder()
                .code(-1)
                .massage("Null")
                .build();

    }
}
