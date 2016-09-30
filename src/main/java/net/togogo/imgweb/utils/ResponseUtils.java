package net.togogo.imgweb.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtils {

	//发送JSON
	public void renderJson(HttpServletResponse response,String text){
		render(response,"application/json;charset=UTF-8",text);
	}
	//发送xml
	public void renderXml(HttpServletResponse response,String text){
		render(response,"text/xml;charset=UTF-8",text);
	}
	//发送text
	public void renderText(HttpServletResponse response,String text){
		render(response,"text/plain;charset=UTF-8",text);
	}
	//发送
	public void render(HttpServletResponse response,String contextType,String text){
		//设置传输类型
		response.setContentType(contextType);
		//发送
		try {
			response.getWriter().write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

