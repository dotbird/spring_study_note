package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    //我们的所有操作，都使用sqlSession来执行，在原来，现在都使用SqlsessionTemplate
    private SqlSessionTemplate sqlsession;

    public void setSqlsession(SqlSessionTemplate sqlsession) {
        this.sqlsession = sqlsession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
