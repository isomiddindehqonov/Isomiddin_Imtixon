package Imtoxon.AAAA.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDto
{
    private Integer id;
    private String name;
    private Integer price;
    private String publishedAt;
    private String publishedBy;
    private String aouthorName;
    private Integer page;
}
