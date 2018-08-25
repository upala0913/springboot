package org.upala.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.upala.dao.StudentDAO;
import org.upala.pojo.Student;
import org.upala.service.StduentService;

@Service("StduentService")
public class StudentServiceImpl implements StduentService {

	@Autowired
	private StudentDAO sd;
	
	/**
	 * 获取所有学生对象
	 * @return
	 */
	@Override
	public Collection<Student> queryStudent() {
		// TODO Auto-generated method stub
		return sd.queryStudent();
	}

	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return sd.getStudentById(id);
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
		return sd.deleteById(id);
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
		return sd.addStudent(student);
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
		return sd.updateStudent(student);
	}

}
