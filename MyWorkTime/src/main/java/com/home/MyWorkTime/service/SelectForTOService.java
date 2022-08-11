package com.home.MyWorkTime.service;

import com.home.MyWorkTime.repository.SelectForTORepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@NoArgsConstructor
public class SelectForTOService {

    @Autowired
    private SelectForTORepository selectForTORepository;



}
