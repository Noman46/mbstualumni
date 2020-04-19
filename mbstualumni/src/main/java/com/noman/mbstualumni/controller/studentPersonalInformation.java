package com.noman.mbstualumni.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.noman.alumnibackend.dao.StudentImagesDao;
import com.noman.alumnibackend.dao.StudentJobInformationDao;
import com.noman.alumnibackend.dao.StudentPersonalInformationDao;
import com.noman.alumnibackend.dto.StudentImages;
import com.noman.alumnibackend.dto.StudentJobInformation;
import com.noman.alumnibackend.dto.StudentPersonalInformation;
import com.noman.mbstualumni.util.FileUploadUtility;

@Controller
public class studentPersonalInformation {

	@Autowired
	public StudentJobInformationDao studentJobInformationDao;

	@Autowired
	public StudentPersonalInformationDao studentPersonalInformationDao;
	
	@Autowired
	public StudentImagesDao studentImagesDao;

	@RequestMapping(value = { "/student/personalInformation" })
	public ModelAndView giveStudentPersonalInformationPage() {

		ModelAndView studentPersonalInformation = new ModelAndView("studentPersonalInformation");

		studentPersonalInformation.addObject("studentJobInformation", new StudentJobInformation());
		studentPersonalInformation.addObject("studentPersonalInformation", new StudentPersonalInformation());
		studentPersonalInformation.addObject("studentImages", new StudentImages());

		return studentPersonalInformation;
	}

	/*
	 * The following two methods are for submitting form through Spring I have
	 * created two REST API where form submitting occurs through AJAX
	 * saveStudentJobInformationREST() saveStudentPersonalInformationREST()
	 * --------------------------------------------------------------------
	 * 
	 * 
	 * 
	 * 
	 * @RequestMapping(value = { "student/sendStudentJobInformation" }, method =
	 * RequestMethod.POST) public String sendStudentJobInformation(
	 * 
	 * @ModelAttribute("studentJobInformation") StudentJobInformation
	 * studentJobInformation, ModelMap model) {
	 * 
	 * studentJobInformationDao.saveStudentJobInformation(studentJobInformation);
	 * 
	 * return "redirect:/student/personalInformation"; }
	 * 
	 * 
	 * 
	 * @RequestMapping(value = {"student/sendStudentPersonalInformation"}, method =
	 * RequestMethod.POST) public String
	 * sendStudentPersonalInformation(@ModelAttribute("studentPersonalInformation")
	 * StudentPersonalInformation studentPersonalInformation, ModelMap model) {
	 * 
	 * studentPersonalInformationDao.saveStudentPersonalInformation(
	 * studentPersonalInformation); return "redirect:/student/personalInformation";
	 * }
	 * 
	 * 
	 * ----------------------------------------------
	 * The above two methods are for submitting form through Spring I have created
	 * two REST API where form submitting occurs through AJAX
	 * saveStudentJobInformationREST() saveStudentPersonalInformationREST()
	 * ----------------------------------------------
	 */

	@RequestMapping(value = { "student/sendStudentImage" }, method = RequestMethod.POST)
	public String sendStudentImage(@ModelAttribute("studentImages") StudentImages studentImages, ModelMap model,
			HttpServletRequest request) {

		if (!studentImages.getFile().getOriginalFilename().equals("")) {
			
				FileUploadUtility.uploadFile(request, studentImages.getFile(),studentImages.getCode());
			
		}
		studentImagesDao.addStudentImage(2, "IT-12030", studentImages);
		
		return "redirect:/student/personalInformation";
	}

	// REST API METODS, alternate methods are above this section

	// To save the Job information of the student.
	@RequestMapping(value = "/student/sendStudentJobInformation", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> saveStudentJobInformationREST(
			@RequestBody StudentJobInformation studentJobInformation,HttpServletRequest request) {

		studentJobInformationDao.saveStudentJobInformation(studentJobInformation);
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}

	// To save the Personal Information of the student.

	@RequestMapping(value = {
			"student/sendStudentPersonalInformation" }, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> saveStudentPersonalInformationREST(
			@RequestBody StudentPersonalInformation studentPersonalInformation) {

		studentPersonalInformationDao.saveStudentPersonalInformation(studentPersonalInformation);
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}

	/*
	 * //REST API TEST
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value= {"/jobTestRes"}, method = RequestMethod.GET) public
	 * ArrayList<StudentJobInformation> giveStudentJobREST(){ StudentJobInformation
	 * job = new StudentJobInformation(); job.setCompanyName1("Orbund");
	 * StudentJobInformation job1 = new StudentJobInformation();
	 * job1.setCompanyName2("Selise");
	 * 
	 * ArrayList<StudentJobInformation> li = new ArrayList<StudentJobInformation>();
	 * li.add(job); li.add(job1); return li; }
	 * 
	 * @ResponseBody
	 * 
	 * @RequestMapping(value = {"/jobTestRes/{company}"}) public
	 * StudentJobInformation getJobInfo(@PathVariable("company") String companyname)
	 * {
	 * 
	 * StudentJobInformation st = new StudentJobInformation();
	 * st.setCompanyName1(companyname); st.setJobDuration1("1.5");
	 * 
	 * 
	 * return st; }
	 */

}