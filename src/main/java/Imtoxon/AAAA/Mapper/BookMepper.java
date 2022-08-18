package Imtoxon.AAAA.Mapper;

import Imtoxon.AAAA.dto.BookDto;
import Imtoxon.AAAA.entity.BookEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookMepper {
    public static BookDto toDto(BookEntity book){
        return BookDto.builder()
                .id(book.getId())
                .name(book.getName())
                .aouthorName(book.getAouthor_name())
                .page(book.getPage())
                .publishedBy(book.getPublished_by())
                .price(book.getPrice())
                .publishedAt(book.getPublished_at())
                .build();
    }
    public static BookEntity ToEntity(BookDto bookDto){
        return BookEntity.builder()
                .id(bookDto.getId())
                .name(bookDto.getName())
                .price(bookDto.getPrice())
                .published_at(bookDto.getPublishedAt())
                .published_by(bookDto.getPublishedBy())
                .aouthor_name(bookDto.getAouthorName())
                .page(bookDto.getPage())
                .build();
    }

}
