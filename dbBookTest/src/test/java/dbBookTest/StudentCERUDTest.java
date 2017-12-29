/**
time:2017年12月28日 下午3:51:25
author:黄为涛
projectName:dbBookTest
fileName:StudentCERUDTest.java
modify:

**/
package dbBookTest;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.hwtblog.bean.Student;
import cn.hwtblog.utils.MyBatisUtil;

public class StudentCERUDTest {
	/**
	 * 返回1，操作成功
	 * 返回0，操作失败
	 */
	@Test
	public void add(){
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement="mybatis.mapping.studentMapper.insertStudent";
		Student s=new Student("s4","维恩",25,0);
		int result =sqlSession.insert(statement,s);
		sqlSession.close();
		System.out.println(result);		
	}
	
	@Test
	public void delete() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "mybatis.mapping.studentMapper.deleteStudent";
		int result =sqlSession.delete(statement,"s4");
		sqlSession.close();
		System.out.println(result);
	}
	
	@Test
	public void update() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
		String statement = "mybatis.mapping.studentMapper.updateStudent";
		Student s =new Student("s4","风女",28,0);
		int result = sqlSession.update(statement,s);
		sqlSession.close();
		System.out.println(result);
	}

	@Test
	public void getOne() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		String statement = "mybatis.mapping.studentMapper.getStudent";
		Student s=sqlSession.selectOne(statement,"s1");
		sqlSession.close();
		System.out.println(s);
	}
	
	
	
	
	
	
	
	
}
