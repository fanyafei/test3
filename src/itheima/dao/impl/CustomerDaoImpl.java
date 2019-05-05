package itheima.dao.impl;

import itheima.dao.ICustomerDao;

/**
 * @Description:
 * @Author:fanyafei
 * @Version:1.0
 * @Date:2019/5/516:38.
 * @see:
 **/
public class CustomerDaoImpl implements ICustomerDao {
	@Override
	public void saveCunstomer() {
		System.out.println("持久层保存了客户");
	}
}
