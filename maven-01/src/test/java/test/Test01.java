package test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import mavenBean.Student;
import utils.MyBatisUtil;

public class Test01 {
	@Test
	public void HelloMybatis(){
        String resource = "conf.xml";
        InputStream is = Test01.class.getClassLoader().getResourceAsStream(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();

        String statement = "mapping.studentMapper.getStudent";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        Student s=session.selectOne(statement,"s1");
        System.out.println(s);
	}
	
    @Test
    public void testGetAll(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String statement = "mapping.studentMapper.getAllStudents";
        List<Student> sList = sqlSession.selectList(statement);
        sqlSession.close();
        System.out.println(sList);
    }
}
