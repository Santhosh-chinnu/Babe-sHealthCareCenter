package com.pack.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pack.entity.Babes;


public interface IBabeServiceMgmt {
	
	public String registerBabes(Babes babe);
	public Page<Babes> getBabesReportByDataBypage(Pageable pageable);
	public Babes getBabesByid(int no);
	public String saveEditBabes(Babes babe);
	public String deleteBabes(Integer no);
	public Babes getloginbyid(int no);

}
