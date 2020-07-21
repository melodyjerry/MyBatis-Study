package com.melodyhub.dao;

import com.melodyhub.pojo.User;
import com.melodyhub.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        //第二部：执行SQL
        //方式1：getMapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        //方式2：

        //遍历结果集
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession对象
        sqlSession.close();

    }
}
