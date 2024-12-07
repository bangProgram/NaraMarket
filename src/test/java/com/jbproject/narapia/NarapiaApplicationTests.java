package com.jbproject.narapia;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.constants.ServerConstant;
import com.jbproject.narapia.rest.dto.model.*;
import com.jbproject.narapia.rest.dto.payload.*;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
import com.jbproject.narapia.rest.repository.WinbidAnalRepository;
import com.jbproject.narapia.rest.service.BidNotiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URISyntaxException;
import java.util.List;

import static org.springframework.util.StringUtils.hasText;

@SpringBootTest
class NarapiaApplicationTests {

	@Value("${naramarket.secret}")
	private String secret;

	@Autowired
	private WinbidAnalRepository winbidAnalRepository;


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

	@Test
	void saveNoti() throws Exception {

		BidNotiSearchPayload payload = new BidNotiSearchPayload();
		String apiUrl = ServerConstant.NARA_MAIN_URL;
		String path = ServerConstant.NARA_BIDNOTI_PATH;
		String method = ServerConstant.BIDNOTI_GOODS_METHOD;
		payload.setInqryDiv("2");
		payload.setBidNtceNo("20230301028");


		String parameter = setParameter(payload);

		// URL과 파라미터 조합
		String requestUri = apiUrl + path + method + parameter;

		ApiResponseModel<BidNotiModel> responseModel = CommonUtil.getNaraResponse(requestUri, "response", BidNotiModel.class);
		ApiResponseModel.Body<BidNotiModel> body = responseModel.getBody();

		List<BidNotiModel> items = body.getItems();
		int totalCnt = body.getTotalCount();
		int rowCnt = payload.getNumOfRows();
		int curPageNo = payload.getPageNo();

		System.out.println("totalCnt : "+totalCnt+" \n items : "+items);
	}

	@Test
	void getSearchList() throws Exception {
		BidNotiSearchPayload payload = new BidNotiSearchPayload();
		payload.setInqryDiv("2");
		payload.setBidNtceNo("20230301028");

		String bidNotiUrl = CommonUtil.naraUrlProvide(
				ServerConstant.NARA_BIDNOTI_PATH
				, ServerConstant.BIDNOTI_GOODS_METHOD
				, payload
		);

		String bidNotiDetailUrl = CommonUtil.naraUrlProvide(
				ServerConstant.NARA_BIDNOTI_PATH
				, ServerConstant.BIDNOTI_GOODS_DETAIL_METHOD
				, payload
		);

		ApiResponseModel<BidNotiModel> bidNotiRes = CommonUtil.getNaraResponse(bidNotiUrl, "response", BidNotiModel.class);
		ApiResponseModel<BidNotiDetailModel> bidNotiDetailRes = CommonUtil.getNaraResponse(bidNotiDetailUrl, "response", BidNotiDetailModel.class);

		BidNotiModel bidNotiModel = bidNotiRes.getBody().getItems().getFirst();
		BidNotiDetailModel bidNotiDetailModel = bidNotiDetailRes.getBody().getItems().getFirst();

	}

	public String setParameter(NaraSearchPayload payload){
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


	@Test
	void searchWinbidAnalSearch(){
		WinbidAnalSearchPayload payload = new WinbidAnalSearchPayload();
		payload.setDtilPrdctClsfcNo("4511170501");
		payload.setBssamtRate(100.1D);
		payload.setRateLevel("2");

		System.out.println("payload : "+payload.getBssamtRate());

		List<WinbidAnalSearchResult> result = winbidAnalRepository.searchWinbidAnalList(payload);
	}
}
