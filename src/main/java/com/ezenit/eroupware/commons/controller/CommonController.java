package com.ezenit.eroupware.commons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ezenit.eroupware.commons.service.CommonService;

@Controller
public class CommonController {
	
	@Autowired
	CommonService commonService;
	
//	@RequestMapping(value="/getMemberSelectList", method=RequestMethod.POST, produces="application/text; charset=UTF-8")
//	@ResponseBody
//	public String getSelecMemberList() {
//		List<MemberSelectListDTO> list = commonService.getMemberSelectList();
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
//		
//		JSONObject json = new JSONObject();
//		JSONArray items = new JSONArray();
//		
//		for(int i=0; i<list.size(); i++) {
//			MemberSelectListDTO dto = list.get(i);
//			JSONObject temp = new JSONObject();
//			temp.put("id", dto.getDeptno());
//			temp.put("title", dto.getName());
//			
//			items.put(i, temp);
//		}
//		
//		json.put("items", items);
//		json.put("list", list);
//		
//		return json.toString();
//	}

}
