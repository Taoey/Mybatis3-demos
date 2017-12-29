/**
time:2017年12月29日 下午12:57:28
author:黄为涛
projectName:dbBookTest
fileName:SCTest.java
modify:

**/
package dbBookTest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hwtblog.bean.SC;
import cn.hwtblog.utils.MyBatisUtil;

public class SCTest {
	
	@Test
	public void getAll() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "mybatis.mapping.scMapper.getAll";
		List<SC> scList = sqlSession.selectList(statement);
		sqlSession.close();
		System.out.println(scList);
	}
	
	@Test
	public void gets() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "mybatis.mapping.scMapper.getS";
		List<SC> scList = sqlSession.selectList(statement,"c1");
		sqlSession.close();
		System.out.println(scList);
	}
	
	
	
	
	
	
	
	
}
