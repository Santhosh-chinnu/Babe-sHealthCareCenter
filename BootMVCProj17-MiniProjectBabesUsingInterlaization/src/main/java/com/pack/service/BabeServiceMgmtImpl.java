package com.pack.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pack.entity.Babes;
import com.pack.repository.IBabesRepository;

@Service("baeservice")
public class BabeServiceMgmtImpl implements IBabeServiceMgmt {
	
	@Autowired
	private IBabesRepository brepo;
	 
	@Override
	public String registerBabes(Babes babe) {
		Integer id=brepo.save(babe).getBid();
		return "Babe Details Registered :"+id;
	}
	
	@Override
	public Page<Babes> getBabesReportByDataBypage(Pageable pageable) {
		return brepo.findAll(pageable);
	}   
	@Override
	public Babes getBabesByid(int no) {
    Babes babe1=brepo.findById(no).orElseThrow(()->new IllegalArgumentException());
			return babe1;
	}
	
	@Override
	public String saveEditBabes(Babes babe) {
		return "babes Successfulley Updated"+brepo.save(babe).getBid();
	}
	
	@Override
	public String deleteBabes(Integer no) {
	Optional<Babes>   opt=brepo.findById(no);
	if(opt.isPresent()) {
		brepo.deleteById(no);
		return"babe data deleted ";
	}
	else {
		return"babe data not deleted";
	}
	}
	
    @Override
	public Babes getloginbyid(int no) {
    Optional<Babes>opt=brepo.findById(no);
    if(opt.isEmpty()) {
    	System.out.println("user not found");
    }
    return opt.get();			
}
}