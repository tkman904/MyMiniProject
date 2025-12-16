package com.sist.web.vo;
/*
	B_ID          NOT NULL VARCHAR2(30)  
	B_FILTER               VARCHAR2(60)  
	B_TITLE                VARCHAR2(200) 
	B_CONTENT              CLOB          
	B_VIEW_COUNT           NUMBER        
	B_THUMBNAIL            VARCHAR2(200) 
	B_CREATEDAT            DATE          
	B_UPDATEDAT            DATE          
	B_PROD_ON_OFF          VARCHAR2(10)  
	B_STATUS               VARCHAR2(10)  
	B_TYPE                 VARCHAR2(20)  
*/

import java.util.*;

import lombok.Data;

@Data
public class HobbyVO {
	private int b_view_count;
	private String b_id, b_filter, b_title, b_content, b_thumbnail, b_prod_on_off, b_status, b_type;
	private Date b_createdat, b_updatedat;
}
