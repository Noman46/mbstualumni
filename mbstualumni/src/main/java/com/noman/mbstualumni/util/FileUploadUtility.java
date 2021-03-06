package com.noman.mbstualumni.util;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtility {

	private static final String ABS_PATH = "I:\\MBSTU_ALUMNAI\\mbstualumni\\mbstualumni\\src\\main\\webapp\\assets\\images\\";
	private static final String ABS_PATH_MBSTU_LIFE = "I:\\MBSTU_ALUMNAI\\mbstualumni\\mbstualumni\\src\\main\\webapp\\assets\\mbstuImages\\";
	private static String REAL_PATH = null;
	private static String REAL_PATH_MBSTU_LIFE = null;

	public static boolean uploadFile(HttpServletRequest request, MultipartFile file, String code) {
		// get the real server path
		REAL_PATH = request.getSession().getServletContext().getRealPath("/assets/images/");
		System.out.println(REAL_PATH);

		// logger.info(REAL_PATH);
		// create the directories if it does not exist

		if (!new File(REAL_PATH).exists()) {
			new File(REAL_PATH).mkdirs();
		}

		if (!new File(ABS_PATH).exists()) {
			new File(ABS_PATH).mkdirs();
		}

		try {
			// Server Upload
			Random random = new Random();
			file.transferTo(new File(REAL_PATH + code + ".jpg"));
			System.out.println(REAL_PATH);
			// Project Directory Upload
			file.transferTo(new File(ABS_PATH + code + ".jpg"));
			System.out.println(REAL_PATH);
		} catch (IOException ex) {
			ex.printStackTrace();
			// System.out.println(REAL_PATH);
		}
		return true;
	}

	public static boolean uploadFileForMbstuLife(HttpServletRequest request, MultipartFile file, String imageCode) {

		// get the real server path
		REAL_PATH_MBSTU_LIFE = request.getSession().getServletContext().getRealPath("/assets/mbstuImages/");
		System.out.println(REAL_PATH_MBSTU_LIFE);

		// logger.info(REAL_PATH);
		// create the directories if it does not exist

		if (!new File(REAL_PATH_MBSTU_LIFE).exists()) {
			new File(REAL_PATH_MBSTU_LIFE).mkdirs();
		}

		if (!new File(ABS_PATH_MBSTU_LIFE).exists()) {
			new File(ABS_PATH_MBSTU_LIFE).mkdirs();
		}

		try {
			// Server Upload
			Random random = new Random();
			file.transferTo(new File(REAL_PATH_MBSTU_LIFE + imageCode + ".jpg"));
			System.out.println(REAL_PATH_MBSTU_LIFE);
			// Project Directory Upload
			file.transferTo(new File(ABS_PATH_MBSTU_LIFE + imageCode + ".jpg"));
			System.out.println(REAL_PATH_MBSTU_LIFE);
		} catch (IOException ex) {
			ex.printStackTrace();
			// System.out.println(REAL_PATH);
		}
		return true;
	}
}
