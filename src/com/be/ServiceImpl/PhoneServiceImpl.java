package com.be.ServiceImpl;

import com.be.Service.IPhoneService;
import com.be.dao.IPhoneDao;
import com.be.daoImpl.PhoneDaoImpl;
import com.be.pojo.Phone;

public class PhoneServiceImpl implements IPhoneService {
	IPhoneDao phonedao =new PhoneDaoImpl();

	@Override
	public Phone selectOne(int id) {
		return phonedao.selectOne(id);
	}
}
