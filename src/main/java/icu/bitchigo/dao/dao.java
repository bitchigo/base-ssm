package icu.bitchigo.dao;

import icu.bitchigo.domain.mo;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface dao {

    @Select("select id,name from test")
    public List<mo> select();
}
