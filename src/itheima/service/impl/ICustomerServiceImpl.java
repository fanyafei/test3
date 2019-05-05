package itheima.service.impl;


import itheima.dao.ICustomerDao;
import itheima.service.ICustomerService;

/**
 * @Description:客户的业务层实现类
 * @Author:fanyafei
 * @Version:1.0
 * @Date:2019/4/2914:23.
 * @see:
 **/
public class ICustomerServiceImpl implements ICustomerService {
	private ICustomerDao customerDao=null;
	public void setCustomerDao(ICustomerDao customerDao){
		this.customerDao=customerDao;
	}
	@Override
	public void saveCunstomer() {
		System.out.println("业务层调用持久层" );
		customerDao.saveCunstomer();
	}
}
