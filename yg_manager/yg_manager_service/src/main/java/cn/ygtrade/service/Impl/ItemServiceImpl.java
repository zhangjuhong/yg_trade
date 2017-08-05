package cn.ygtrade.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ygtrade.dao.TbItemMapper;
import cn.ygtrade.pojo.TbItem;
import cn.ygtrade.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
      
	@Autowired
	private TbItemMapper itemMapper; 
	
	public TbItem getTbItemById(Long id){
		TbItem tbItem = itemMapper.selectByPrimaryKey(id);
		return tbItem;
	}
}
