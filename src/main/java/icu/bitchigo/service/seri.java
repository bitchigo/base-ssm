package icu.bitchigo.service;

import icu.bitchigo.dao.dao;
import icu.bitchigo.domain.mo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("seri")
public class seri implements ser {

    @Autowired
    private dao dao;

    public List<mo> ser() {
        return dao.select();
    }
}
