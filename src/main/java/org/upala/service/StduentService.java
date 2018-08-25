package org.upala.service;

import java.util.Collection;

import org.upala.pojo.Student;

public interface StduentService {

	/**
	 * 获取所有学生对象
	 * @return
	 */
	public Collection<Student> queryStudent ();
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	public Student getStudentById (int id);
	
	/**
	 * 根据ID删除
	 * 之后返回所有学生对象
	 * @param id
	 * @return
	 */
	public Collection<Student> deleteById(int id);
	
	/**
	 * 添加学生
	 * 返回学生的所有的对象
	 * @param student
	 * @return
	 */
	public Collection<Student> addStudent(Student student);
	
	/**
	 * 添加学生
	 * 返回学生的所有的对象
	 * @param student
	 * @return
	 */
	public Collection<Student> updateStudent(Student student);
	
}
