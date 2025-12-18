package com.sist.web.vo;

import lombok.Data;

@Data
public class CafeVO {
	private int id, calories_kcal, caffeine_mg, sodium_mg, sugar_g, saturated_fat_g, protein_g;
	private String category_name, menu_name, image_url;
}
