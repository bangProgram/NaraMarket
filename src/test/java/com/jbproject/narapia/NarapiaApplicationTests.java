package com.jbproject.narapia;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.constants.ServerConstant;
import com.jbproject.narapia.rest.dto.model.ApiResponseModel;
import com.jbproject.narapia.rest.dto.model.WinbidDetailModel;
import com.jbproject.narapia.rest.dto.model.WinbidModel;
import com.jbproject.narapia.rest.dto.payload.WinbidDetailSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidSearch;
import com.jbproject.narapia.rest.dto.payload.WinbidSearchPayload;
import com.jbproject.narapia.rest.entity.WinbidDetailEntity;
import com.jbproject.narapia.rest.entity.WinbidEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidDetailKey;
import com.jbproject.narapia.rest.entity.keys.WinbidKey;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import static org.springframework.util.StringUtils.hasText;

@SpringBootTest
class NarapiaApplicationTests {

	@Value("${naramarket.secret}")
	private String secret;

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

	@Test
	void saveWinbid() throws Exception {

		WinbidSearchPayload payload = new WinbidSearchPayload();

		String apiUrl = ServerConstant.NARA_MAIN_URL;
		String path = ServerConstant.WINBID_PATH;
		String method = ServerConstant.WINBID_METHOD;
		payload.setInqryDiv("4");
		payload.setBidNtceNo("20230301028");

		String parameter = setParameter(payload);

		// URL과 파라미터 조합
		String requestUri = apiUrl + path + method + parameter;

		ApiResponseModel<WinbidModel> responseModel = CommonUtil.getNaraResponse(requestUri, "response",WinbidModel.class);

		ApiResponseModel.Body<WinbidModel> body = responseModel.getBody();

		List<WinbidModel> items = body.getItems();
		int totalCnt = body.getTotalCount();
		int rowCnt = payload.getNumOfRows();
		int curPageNo = payload.getPageNo();


	}

	@Test
	void saveWinbidDetail() throws Exception {
		System.out.println("test start");
		WinbidDetailSearchPayload payload = new WinbidDetailSearchPayload();
		String apiUrl = ServerConstant.NARA_MAIN_URL;
		String path = ServerConstant.WINBID_PATH;
		String method = ServerConstant.WINBID_DETAIL_METHOD;

		payload.setInqryDiv("1");
		payload.setInqryBgnDt("202411010000");
		payload.setInqryEndDt("202411300000");

		System.out.println("test1");
		String parameter = setParameter(payload);
		System.out.println("test2");
		// URL과 파라미터 조합
		String requestUri = apiUrl + path + method + parameter;

		System.out.println("uri : "+requestUri);
		ApiResponseModel<WinbidDetailModel> responseModel = CommonUtil.getNaraResponse(requestUri, "response",WinbidDetailModel.class);

		System.out.println("response : "+responseModel);
		ApiResponseModel.Body<WinbidDetailModel> body = responseModel.getBody();

		List<WinbidDetailModel> items = body.getItems();
		int totalCnt = body.getTotalCount();
		int rowCnt = payload.getNumOfRows();
		int curPageNo = payload.getPageNo();


	}

	public String setParameter(WinbidSearch payload){
		String result = "?serviceKey="+secret;


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
