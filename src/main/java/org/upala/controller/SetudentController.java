package org.upala.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.upala.pojo.Student;
import org.upala.service.StduentService;

@RestController
public class SetudentController {

	@Autowired
	private StduentService ss;
	
	/**
	 * 获取所有学生对象
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public Collection<Student> getAll () {
		return ss.queryStudent();
	}
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Student getStudengById (@PathVariable int id) {
		return ss.getStudentById(id);
	}
	
	/**
	 * 删除学生
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public Collection<Student> deleteById (@PathVariable int id){
		return ss.deleteById(id);
	}
	
	/**
	 * 添加学生
	 * 返回学生的所有的对象
	 * @param student
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Collection<Student> addStudent (@RequestBody Student student) {
		return ss.addStudent(student);
	}
	
	/**
	 * 修改学生
	 * 返回学生的所有的对象
	 * @param student
	 * @return
	 */
	@RequestMapping(method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Collection<Student> updateStudent (@RequestBody Student student) {
		return ss.updateStudent(student);
	}
}
