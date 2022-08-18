package Imtoxon.AAAA.repository;

import Imtoxon.AAAA.dto.ResponseDto;
import Imtoxon.AAAA.entity.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
