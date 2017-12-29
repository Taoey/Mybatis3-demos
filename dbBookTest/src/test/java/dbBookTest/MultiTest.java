/**
time:2017年12月29日 下午1:03:24
author:黄为涛
projectName:dbBookTest
fileName:MultiTest.java
modify:

**/
package dbBookTest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hwtblog.bean.SC;
import cn.hwtblog.utils.MyBatisUtil;

public class MultiTest {
	
	
	@Test
	/**
	 * 选修c1课程的学生信息
	 */
	public void test00() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "mybatis.mapping.mutilMapper.getS";
		List<SC> scList = sqlSession.selectList(statement,"c1");
		sqlSession.close();
		System.out.println(scList);
	}
	@Test
	public void test01() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "mybatis.mapping.mutilMapper.getS2";
		List<SC> scList = sqlSession.selectList(statement,"c1");
		sqlSession.close();
		System.out.println(scList);
	}
	@Test
	public void test02() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "mybatis.mapping.mutilMapper.getS2";
		List<SC> scList = sqlSession.selectList(statement,"c1");
		sqlSession.close();
		System.out.println(scList);
	}
	

}
