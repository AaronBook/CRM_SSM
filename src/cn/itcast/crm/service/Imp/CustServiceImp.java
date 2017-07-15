package cn.itcast.crm.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.crm.mapper.CustMapper;
import cn.itcast.crm.pojo.Cust;
import cn.itcast.crm.pojo.QueryVo;
import cn.itcast.crm.service.CustService;


@Service
public class CustServiceImp implements CustService {

	@Autowired
	private CustMapper custMapper;;
	
	
	@Override
	public List<Cust> findall(QueryVo queryVo) {
		return this.custMapper.findall(queryVo);
	}


	@Override
	public void delete(Long id) {
		this.custMapper.delete(id);
	}


	@Override
	public void add(Cust cust) {
		this.custMapper.add(cust);
	}

}
