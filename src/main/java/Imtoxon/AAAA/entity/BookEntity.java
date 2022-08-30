package Imtoxon.AAAA.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    private Integer id;
    private String name;
    private Integer price;
    private String published_at;
    private String published_by;
    private String aouthor_name;
    private Integer page;

}


