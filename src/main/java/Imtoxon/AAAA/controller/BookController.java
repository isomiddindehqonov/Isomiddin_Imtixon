package Imtoxon.AAAA.controller;

import Imtoxon.AAAA.dto.BookDto;
import Imtoxon.AAAA.dto.ResponseDto;
import Imtoxon.AAAA.service.impl.BookImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
@RestController
@AllArgsConstructor
public class BookController {
    private final BookImpl book;
    @GetMapping("{/id}")
    public ResponseDto getByIdBook(@PathVariable Integer id,@PathVariable int page, @PathVariable int size){
        return book.getById(id,page,size);
    }
    @DeleteMapping("{/id}")
    public ResponseDto deleteByIdBook(@PathVariable Integer id){
        return book.deleteBook(id);
    }
    @PostMapping
    public ResponseDto add(@RequestBody BookDto bookDto){
        return book.add(bookDto);
    }
    @PutMapping
    public ResponseDto uppdateBook(@RequestBody BookDto bookDto){
        return book.updateBook(bookDto);
    }
    @GetMapping
    public ResponseDto getAll(){
        return book.getAll();
    }

}
