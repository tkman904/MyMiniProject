package com.sist.web.vo;

import java.util.*;

public interface BoardVO {
	public int getNo();
	public int getHit();
	public int getNum();
	
	public String getName();
	public String getSubject();
	public String getContent();
	public String getDbday();
	
	public Date getRegdate();	
}
