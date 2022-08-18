package Imtoxon.AAAA.service;

import Imtoxon.AAAA.dto.BookDto;
import Imtoxon.AAAA.dto.ResponseDto;

import java.util.Optional;

public interface Book {
    ResponseDto add(BookDto bookDto);
    ResponseDto getById(Integer id,int page,int size);
    ResponseDto deleteBook(Integer id);
    ResponseDto updateBook(BookDto bookDto);
    ResponseDto getAll();
}
