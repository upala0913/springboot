package org.upala.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.upala.dao.StudentDAO;
import org.upala.pojo.Student;

@Repository("StudentDAO")
public class StudentDAOImpl implements StudentDAO {

	private Map<Integer, Student> map = new HashMap<Integer, Student>();
	
	public StudentDAOImpl () {
		map.put(1, new Student(1,"张三",12));
		map.put(2, new Student(2,"李四",13));
		map.put(3, new Student(3,"王五",14));
	}
	
	/**
	 * 查询所有
	 */
	@Override
	public Collection<Student> queryStudent() {
		// TODO Auto-generated method stub
		return map.values();
	}

	/**
	 * 根据id查询
	 */
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	/**
	 * 根据ID删除
	 * 之后返回所有学生对象
	 * @param id
	 * @return
	 */
	@Override
	public Collection<Student> deleteById(int id) {
		// TODO Auto-generated method stub
		map.remove(id);
		return map.values();
	}

	/**
	 * 添加学生
	 * 返回学生的所有的对象
	 * @param student
	 * @return
	 */
	@Override
	public Collection<Student> addStudent(Student student) {
		// TODO Auto-generated method stub
		map.put(4, student);
		return map.values();
	}

	/**
	 * 修改学生
	 * 返回学生的所有的对象
	 * @param student
	 * @return
	 */
	@Override
	public Collection<Student> updateStudent(Student student) {
		// TODO Auto-generated method stub
		map.put(student.getId(), student);
		return map.values();
	}

}
