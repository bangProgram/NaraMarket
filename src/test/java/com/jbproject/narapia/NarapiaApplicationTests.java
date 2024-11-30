package com.jbproject.narapia;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.constants.ServerConstant;
import com.jbproject.narapia.rest.dto.model.ApiResponseModel;
import com.jbproject.narapia.rest.dto.model.WinbidModel;
import com.jbproject.narapia.rest.dto.payload.WinbidSearchPayload;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URISyntaxException;
import java.util.List;

import static org.springframework.util.StringUtils.hasText;

@SpringBootTest
class NarapiaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void naraAPICheck() throws URISyntaxException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		WinbidSearchPayload payload = new WinbidSearchPayload();

		String apiUrl = ServerConstant.NARA_MAIN_URL;
		String path = ServerConstant.WINBID_PATH;
		String method = ServerConstant.WINBID_METHOD;
		payload.setInqryDiv("4");
		payload.setBidNtceNo("20230301028");

		String parameter = setParameter(payload);

		System.out.println("test1");
		// URL과 파라미터 조합
		String requestUri = apiUrl + path + method + parameter;
		System.out.println("test2");

		ApiResponseModel<WinbidModel> responseModel = CommonUtil.getNaraResponse(requestUri, "response", WinbidModel.class);
		System.out.println("GET Header : " + responseModel.getHeader());
		System.out.println("GET Body : " + responseModel.getBody());
		System.out.println("GET Items : " + responseModel.getBody().getItems());

		List<WinbidModel> items = responseModel.getBody().getItems();

		for(WinbidModel item : items){
			System.out.println("data : "+item);
			System.out.println("data instance : "+(item instanceof WinbidModel));
		}

		System.out.println("GET Items Instance check : " + (responseModel.getBody().getItems().getFirst() instanceof WinbidModel));
	}

	public String setParameter(WinbidSearchPayload payload) {
		String result = "?serviceKey=qD8YVKAXvCbeS6RBeEUljGCFc1TZmIpdU%2B6pHSPegrp2pneNvgKA%2BasdTjCFqaYTRgcfKlYURMpU3b57bxgx%2Fg%3D%3D";


		if(payload.getNumOfRows() != 0){
			result += "&numOfRows="+payload.getNumOfRows();
		}
		if(payload.getPageNo() != 0){
			result += "&pageNo="+payload.getPageNo();
		}
		if(hasText(payload.getInqryDiv())){
			result += "&inqryDiv="+payload.getInqryDiv();
		}
		if(hasText(payload.getType())){
			result += "&type="+payload.getType();
		}
		if(hasText(payload.getInqryBgnDt())){
			result += "&inqryBgnDt="+payload.getInqryBgnDt();
		}
		if(hasText(payload.getInqryEndDt())){
			result += "&inqryEndDt="+payload.getInqryEndDt();
		}
		if(hasText(payload.getBidNtceNo())){
			result += "&bidNtceNo="+payload.getBidNtceNo();
		}

		return result;
	}
}
