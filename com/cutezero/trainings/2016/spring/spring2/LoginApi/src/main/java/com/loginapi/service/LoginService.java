package com.loginapi.service;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonParser;
import com.loginapi.dto.LoginStatusDTO;
import com.loginapi.util.ResponseDto;
import com.loginapi.util.UrlConnectionResponse;
@Component
public class LoginService {
		public LoginStatusDTO getLoginDetails(){
			UrlConnectionResponse connection = new UrlConnectionResponse();
			String jsonString = "{\"AndroidVersion\":\"7.0\",\"AppId\":\"0,66,18eeea31cd53b40a,AGS-L09,HUAWEI,7.0,864272034433482,3037186,89950616410375682603\",\"CellId\":3037186,\"DateOfBirth\":\"\",\"DeviceInfo\":{\"BSSID\":\"64:d1:54:09:ce:54\",\"BluetoothAddress\":\"02:00:00:00:00:00\",\"BluetoothName\":\"HUAWEI MediaPad T3 10\",\"ConnectedNetworkType\":\"WIFI\",\"DeviceSoftwareVersion\":\"03\",\"HiddenSSID\":false,\"IPAddress\":\"192.168.66.46\",\"LinkSpeed\":72,\"MACAddress\":\"8c:25:05:23:e2:74\",\"NetworkCountryIso\":\"mm\",\"NetworkID\":0,\"NetworkOperator\":\"41406\",\"NetworkOperatorName\":\"Telenor\",\"NetworkSignal\":4,\"NetworkType\":\"4G\",\"PhoneType\":\"GSM\",\"SIMCountryIso\":\"mm\",\"SIMOperator\":\"41406\",\"SIMOperatorName\":\"Telenor\",\"SSID\":\"\\\"MPT\\\"\",\"VoiceMailNo\":\"200\",\"isNetworkRoaming\":false},\"FatherName\":\"\",\"IdType\":\"\",\"IosOtp\":\"\",\"Latitude\":\"16.8166766\",\"Longitude\":\"96.1318943\",\"MobileNumber\":\"00959766378289\",\"Msid\":\"414061137568260\",\"Name\":\"\",\"Nrc\":\"\",\"OsType\":0,\"PassportCountry\":\"\",\"PassportExpiryDate\":\"\",\"PassportNumber\":\"\",\"Password\":\"B5BD6FF6IJ4Jd1J\",\"PasswordType\":-1,\"ProfilePic\":\"\",\"ReRegisterOtp\":\"\",\"SecurityAnswer\":\"\",\"SimId\":\"89950616410375682603\"}";
			String url = "http://103.242.99.234:8001/RestService.svc/Login";
			String jsonResponse;
			ResponseDto responseDto = new ResponseDto(); 
			try {
				jsonResponse=connection.postToUrl(jsonString,url);
				//responseDto = convertJsonToObject(jsonResponse);
				JSONObject jsonObj = new JSONObject(jsonResponse);
				System.out.println("Status code"+jsonObj.get("Code"));
				System.out.println("Status Data :"+jsonObj.get("Data"));
				System.out.println("Status Data :"+jsonObj.get("Msg"));
				responseDto.setCode((Integer)(jsonObj.get("Code")));
				responseDto.setData(jsonObj.get("Data").toString());
				responseDto.setMsg(jsonObj.get("Msg").toString());
			System.out.println(jsonResponse);
				if(responseDto.getCode()==200) {
					ObjectMapper mapper = new ObjectMapper();

					System.out.println("Success: \n"+responseDto.getMsg());
					System.out.println("Success: \n"+responseDto.getData());
					

					//Read more: http://www.java67.com/2016/10/3-ways-to-convert-string-to-json-object-in-java.html#ixzz53O0yGZnQ
					//com.loginapi.dto.Message staff1 =  mapper.readValue();
				//System.out.println("After converting  "+staff1.getApkVersion());
				}else {
					System.out.println("Fail: \n"+responseDto.getMsg());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return new LoginStatusDTO();
	    }
		
		 private ResponseDto convertJsonToObject(String postResponse) {
				ObjectMapper objMapper = new ObjectMapper();
				ResponseDto response = null;
				try {
					response = objMapper.readValue(postResponse, ResponseDto.class);
					//Message message = objMapper.readValue(response.getMsg(), Message.class);
					//Data data=objMapper.readValue(response.getData(), Data.class);
				   // LoginStatusDTO loginstatusdto=new LoginStatusDTO();
				   // loginstatusdto.setData(data);
				   // loginstatusdto.setMessage(message);
				   // loginstatusdto.setStatuccode(statuccode);
				} catch (IOException e) {
					System.out.println("JsonString not converted to object: " + e.getMessage());
				}
				return response;
			}
		
	}
