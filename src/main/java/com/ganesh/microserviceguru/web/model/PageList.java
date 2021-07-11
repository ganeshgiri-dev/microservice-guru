package com.ganesh.microserviceguru.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PageList extends PageImpl<BeerDto>
{
    public PageList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public PageList(List<BeerDto> content) {
        super(content);
    }
}
