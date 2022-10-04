package com.example.goGreen.business;

import com.example.goGreen.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class ServiceGenerator {

    @Autowired
    DataRepository dataRep;


}
