package edu.jzxy.cbq.mapper;

import edu.jzxy.cbq.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Cola0817
 * @name EmployeeMapper
 * @date 2023/9/15 16:28
 * @since 1.0.0
 */
public interface EmployeeMapper {
    /**
     * 根据员工 id 查询员工数据方法
     * @param empId  员工 id
     * @return 员工实体对象
     */
    Employee findEmployeeById(Integer empId);

    /**
     * 根据员工 id 查询员工数据方法 (Result Map)
     * @param empId  员工 id
     * @return 员工实体对象
     */
    Employee findEmployeeByIdV2ForResultMap(Integer empId);


    /**
     * 插入员工
     * @param employee employee
     * @return count
     */
    int insertEmployee(Employee employee);


    /**
     * 插入员工 (自增长类型主键)
     * @param employee employee
     * @return 主键
     */
    int insertEmployeeV2(Employee employee);


    /**
     * 更新员工信息
     * @param empId empId
     * @param empSalary empSalary
     * @return count
     */
    int updateEmployee(@Param("empId") Integer empId, @Param("empSalary") Double empSalary);
//    int updateEmployee(Integer empId,Double empSalary);

    /**
     * 通过 map 传参修改员工信息
     * @param paramMap paramMap
     * @return count
     */
    int updateEmployeeByMap(Map<String, Object> paramMap);

    /**
     * 查询记录
     * @return counts
     */
    int selectEmpCount();


    /**
     * 回工资最高的员工的姓名和他的工资
     * @return map
     */
    Map<String,Object> selectEmpNameAndMaxSalary();

    /**
     * 查找全部员工
     * @return employee list
     */
    List<Employee> findAllEmployee();
}
