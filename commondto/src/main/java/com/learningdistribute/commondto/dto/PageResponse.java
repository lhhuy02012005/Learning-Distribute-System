package com.learningdistribute.commondto.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageResponse <T>{
    List<T> data;
    int pageNumber;
    int pageSize;
    int totalElements;
    int totalPages;
}
