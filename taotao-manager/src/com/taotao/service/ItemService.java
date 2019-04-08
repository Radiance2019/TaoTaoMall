package com.taotao.service;

import com.taotao.pojo.TbItem;
import com.taotao.utils.EUDatagridResult;

public interface ItemService {
	
	TbItem getItemById(long item);
	
	EUDatagridResult getItemList(int page, int rows);

}
