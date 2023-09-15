package edu.jzxy.cbq.mapper;

import edu.jzxy.cbq.entity.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


class EmployeeMapperTest {

    private SqlSession session;
    @BeforeEach
    public void init() throws IOException {
        session = new SqlSessionFactoryBuilder()
            .build(
                Resources.getResourceAsStream("mybatis-config.xml"))
            .openSession();
    }

    @Test
    void findEmployeeById() throws IOException {

        /*创建 SqlSessionFactory 对象并声明 Mybatis 全局配置文件的路径*/
        String mybatisConfigFilePath = "mybatis-config.xml";

        /*以输入流的形式加载 Mybatis 配置文件*/
        InputStream inputStream = Resources.getResourceAsStream(mybatisConfigFilePath);

        /*基于读取 Mybatis 配置文件的输入流创建 SqlSessionFactory 对象*/
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        /*使用 SqlSessionFactory 对象开启一个会话*/
        SqlSession session = sessionFactory.openSession();

        /*根据 EmployeeMapper 接口的 Class 对象获取 Mapper 接口类型的对象(动态代理技术)*/
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        /*调用代理类方法既可以触发对应的 SQL 语句*/
        Employee employee = employeeMapper.findEmployeeById(1);

        System.out.println("employee = " + employee);

        /* 关闭 SqlSession
        *  提交事务 [DQL 不需要,其他需要]
        *  关闭会话
        * */
        session.commit();
        session.close();
    }

    @Test
    void findEmployeeByIdV2ForResultMap() {
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.findEmployeeByIdV2ForResultMap(2);

        System.out.println(employee);
    }

    @Test
    void insertEmployee() {
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();

        employee.setEmpName("Cola");
        employee.setEmpSalary(1.0);

        int count = employeeMapper.insertEmployee(employee);

        System.out.println(count);
    }

    @Test
    void insertEmployeeV2() {
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();

        employee.setEmpName("RH");
        employee.setEmpSalary(3.0);

        int key = employeeMapper.insertEmployeeV2(employee);

        System.out.println(employee.getEmpId());
    }

    @Test
    void updateEmployee() {
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        int count = employeeMapper.updateEmployee(4, 1.1);

        System.out.println(count);
    }


    @Test
    void updateEmployeeByMap() {
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Map<String, Object> paramMap = new HashMap<>();

        paramMap.put("empSalary", 999.99);
        paramMap.put("empId", 4);

        int count = employeeMapper.updateEmployeeByMap(paramMap);

        System.out.println(count);
    }

    @Test
    void selectEmpCount() {
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        int count = employeeMapper.selectEmpCount();

        System.out.println(count);
    }

    @Test
    void selectEmpNameAndMaxSalary() {
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Map<String, Object> resultMap = employeeMapper.selectEmpNameAndMaxSalary();
        Set<Map.Entry<String, Object>> entrySet = resultMap.entrySet();

        for (Map.Entry<String, Object> entry : entrySet) {

            String key = entry.getKey();

            Object value = entry.getValue();

            System.out.println(key + "=" + value);
        }
    }

    @Test
    void findAllEmployee() {
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = employeeMapper.findAllEmployee();

        employeeList.forEach(System.out::println);
    }




    @AfterEach
    public void clear() {
        session.commit();
        session.close();
    }
}
