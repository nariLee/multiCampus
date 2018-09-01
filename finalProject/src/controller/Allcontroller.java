package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

import kr.or.kobis.kobisopenapi.consumer.rest.KobisOpenAPIRestService;
import kr.or.kobis.kobisopenapi.consumer.rest.exception.OpenAPIFault;
import model.movieDAO;

@WebServlet("/cont")
public class Allcontroller extends HttpServlet {
	String key="8fc9e2ace5ff38d5af86973eaa774996";
	KobisOpenAPIRestService service = new KobisOpenAPIRestService(key);
	
	
	
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		
		String command = request.getParameter("command");
		
		if(command.equals("movieDailyList")) {
			movieDailyList(request, response);
		}else if(command.equals("movieWeeklyList")) {
			movieWeeklyList(request, response);
		}else if(command.equals("peopleList")) {
			peopleList(request, response);
		}else if(command.equals("peopleList2")) {
			peopleList2(request, response);
		}else if(command.equals("movieList")){
			movieList(request, response);
		}else if(command.equals("companyList")) {
			companyList(request, response);
		}else if(command.equals("movieInfo")) {
			movieInfo(request, response);
		}else if(command.equals("naverMovie")) {
			naverMovie(request, response);
		}else if(command.equals("dailySummary")) {
			dailySummary(request, response);
		}
			
	}
	
	
	



	






	//영화사 정보
	private void companyList(HttpServletRequest request, HttpServletResponse response) {
		String curPage = request.getParameter("curPage")==null?"1":request.getParameter("curPage");					//현재페이지
		String itemPerPage = request.getParameter("itemPerPage")==null?"10":request.getParameter("itemPerPage");		//결과row수
		String companyNm = request.getParameter("companyNm")==null?"":request.getParameter("companyNm");				//영화사명
		String ceoNm = request.getParameter("ceoNm")==null?"":request.getParameter("ceoNm");				//영화사 대표명
		String[] companyPartCdArr = request.getParameterValues("companyPartCdArr")==null? null:request.getParameterValues("companyPartCdArr"); //영화사분류	

		
		String companyCdResponse;
		try {
			companyCdResponse = service.getCompanyList(true, curPage, itemPerPage, companyNm, ceoNm, companyPartCdArr);
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String,Object> companyResult = mapper.readValue(companyCdResponse, HashMap.class);

			request.setAttribute("companyResult",companyResult);
			request.setAttribute("curPage",curPage);
			request.setAttribute("itemPerPage",itemPerPage);
			request.setAttribute("companyNm",companyNm);
			request.setAttribute("ceoNm",ceoNm);
			request.setAttribute("companyPartCdArr",companyPartCdArr);
			
			// KOBIS 오픈 API Rest Client를 통해 코드 서비스 호출 (boolean isJson, String comCode )
			String companyPartCdResponse = service.getComCodeList(true,"2601");
			HashMap<String,Object> companyPartCd = mapper.readValue(companyPartCdResponse, HashMap.class);
			request.setAttribute("companyPartCd",companyPartCd);
			
			request.getRequestDispatcher("company/companyList.jsp").forward(request, response);
			
		} catch (OpenAPIFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Json 라이브러리를 통해 Handling
		
	}

	//영화 리스트
	private void movieList(HttpServletRequest request, HttpServletResponse response) {
		String curPage = request.getParameter("curPage")==null?"":request.getParameter("curPage");					//현재페이지
		String itemPerPage = request.getParameter("itemPerPage")==null?"10":request.getParameter("itemPerPage");		//결과row수
		String movieNm = request.getParameter("movieNm")==null?"":request.getParameter("movieNm");						//영화명
		
		String directorNm = request.getParameter("directorNm")==null?"":request.getParameter("directorNm");				//감독명
		String openStartDt = request.getParameter("openStartDt")==null?"":request.getParameter("openStartDt");			//개봉연도 시작조건 ( YYYY )
		String openEndDt = request.getParameter("openEndDt")==null?"":request.getParameter("openEndDt");				//개봉연도 끝조건 ( YYYY )	
		String prdtStartYear = request.getParameter("prdtStartYear")==null?"":request.getParameter("prdtStartYear");	//제작연도 시작조건 ( YYYY )
		String prdtEndYear = request.getParameter("prdtEndYear")==null?"":request.getParameter("prdtEndYear");			//제작연도 끝조건    ( YYYY )
		String repNationCd = request.getParameter("repNationCd")==null?"":request.getParameter("repNationCd");			//대표국적코드 (공통코드서비스에서 '2204'로 조회된 국가코드)
		String[] movieTypeCdArr = request.getParameterValues("movieTypeCdArr")==null? null:request.getParameterValues("movieTypeCdArr");	//영화형태코드 배열 (공통코드서비스에서 '2201'로 조회된 영화형태코드)
		
		
		String movieName = request.getParameter("movieName");
		
		String movieCdResponse;
		try {
			movieCdResponse = service.getMovieList(true, curPage, itemPerPage, movieNm, directorNm, openStartDt, openEndDt, prdtStartYear, prdtEndYear, repNationCd, movieTypeCdArr);
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String,Object> movieResult = mapper.readValue(movieCdResponse, HashMap.class);
			System.out.println(movieResult.get("movieListResult"));
			
			request.setAttribute("movieResult",movieResult);
			request.setAttribute("curPage",curPage);
			request.setAttribute("itemPerPage",itemPerPage);
			request.setAttribute("movieNm",movieNm);
			request.setAttribute("directorNm",directorNm);	
			request.setAttribute("openStartDt",openStartDt);
			request.setAttribute("openEndDt",openEndDt);
			request.setAttribute("prdtStartYear",prdtStartYear);
			request.setAttribute("prdtEndYear",prdtEndYear);
			request.setAttribute("repNationCd",repNationCd);
			request.setAttribute("movieTypeCdArr",movieTypeCdArr);
			
			
			
			String nationCdResponse = service.getComCodeList(true,"2204");
			HashMap<String,Object> nationCd = mapper.readValue(nationCdResponse, HashMap.class);
			request.setAttribute("nationCd",nationCd);

			String movieTypeCdResponse = service.getComCodeList(true,"2201");
			HashMap<String,Object> movieTypeCd = mapper.readValue(movieTypeCdResponse, HashMap.class);
			request.setAttribute("movieTypeCd",movieTypeCd);
			
			
			if(movieName!=null) {
				 //String movieName2 = URLDecoder.decode(movieName,"UTF-8");

				System.out.println("movieName: "+movieName);
				JSONObject items= movieDAO.naverMovie(movieName);
				request.setAttribute("items", items);
				System.out.println("itemCont"+items);
			}
			
			request.getRequestDispatcher("movie/movieList.jsp").forward(request, response);
		} catch (OpenAPIFault e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	private void naverMovie(HttpServletRequest request, HttpServletResponse response) {
		String movieName = request.getParameter("movieName")==null?"":request.getParameter("movieName");
		
			try {
				if(movieName!=null) {
					 String movieName2;
					 movieName2 = URLDecoder.decode(movieName,"UTF-8");
				
					System.out.println("movieName: "+movieName2);
					JSONObject items= movieDAO.naverMovie(movieName2);
					request.setAttribute("items", items);
					System.out.println("itemCont: "+items);
					
				
				}
				request.getRequestDispatcher("movie/movieList.jsp").forward(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		
		
	}

	
	//영화 상세 정보
		private void movieInfo(HttpServletRequest request, HttpServletResponse response) {
			
			String movieCd = request.getParameter("movieCd");				
			String movieNm = request.getParameter("movieNm");
			String movieNmEn = request.getParameter("movieNmEn");
			String audiAcc = request.getParameter("audiAcc");
			String rank = request.getParameter("rank");
			String review_score = request.getParameter("review_score");
			String review_variety = request.getParameter("review_variety");
			String pop_score = request.getParameter("pop_score");
			String rank2 = request.getParameter("rank2");
			
			String movieInfoResponse;
			try {
				String movieNm2 = URLDecoder.decode(movieNm,"EUC-KR");
				movieInfoResponse = service.getMovieInfo(true, movieCd);
				ObjectMapper mapper = new ObjectMapper();
				HashMap<String,Object> movieInfoResult = mapper.readValue(movieInfoResponse, HashMap.class);
				System.out.println(movieInfoResult);
				
				if(movieCd != null) {
					String movieName = movieNm2 + " "+movieNmEn;	//한글제목+영어제목으로 검색
					System.out.println("movieName 검색: "+movieName);
					JSONObject items= movieDAO.naverMovie(movieName);
					System.out.println(movieName);
					
					if(items == null) {
						items = movieDAO.naverMovie(movieNm2);	//검색이 안되면 한글제목으로만 검색
						System.out.println(movieNm2);
					}
					request.setAttribute("items", items);
					System.out.println("items: "+items);
				}
				
				
				request.setAttribute("audiAcc", audiAcc);
				request.setAttribute("rank", rank);
				request.setAttribute("movieCd", movieCd);
				request.setAttribute("movieInfoResult",movieInfoResult);
				
				request.setAttribute("review_score", review_score);
				request.setAttribute("review_variety", review_variety);
				request.setAttribute("pop_score", pop_score);
				request.setAttribute("rank2", rank2);
				
				request.getRequestDispatcher("movie/movieInfo.jsp").forward(request, response);
			} catch (OpenAPIFault e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	
	//일간 영화리스트
	protected void movieDailyList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		GregorianCalendar today = new GregorianCalendar();
		
		today.add(Calendar.DAY_OF_MONTH, -1);
		SimpleDateFormat format = new SimpleDateFormat("YYYYMMdd");
		String todayDate = format.format(today.getTime());
		

		
		
		String targetDt = request.getParameter("targetDt") == null?todayDate:request.getParameter("targetDt");
		String itemPerPage = request.getParameter("itemPerPage")==null?"10":request.getParameter("itemPerPage");
		String multiMovieYn = request.getParameter("multiMovieYn")==null?"":request.getParameter("multiMovieYn");
		String repNationCd = request.getParameter("repNationCd")==null?"":request.getParameter("repNationCd");
		String wideAreaCd = request.getParameter("wideAreaCd")==null?"":request.getParameter("wideAreaCd");
		
		//System.out.println(targetDt);
		
		try {
			String dailyResponse = service.getDailyBoxOffice(true, targetDt, itemPerPage,multiMovieYn,repNationCd,wideAreaCd);
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String, Object> dailyResult = mapper.readValue(dailyResponse,  HashMap.class);
			
			request.setAttribute("dailyResult", dailyResult);
			
			String codeResponse=service.getComCodeList(true, "0105000000");
			HashMap<String,Object> codeResult = mapper.readValue(codeResponse, HashMap.class);
			request.setAttribute("codeResult", codeResult);
			request.setAttribute("targetDt", targetDt);
			request.setAttribute("itemPerPage", itemPerPage);
			request.setAttribute("multiMovieYn", multiMovieYn);
			request.setAttribute("reqNationCd", repNationCd);
			request.setAttribute("wideAreaCd", wideAreaCd);
			request.getRequestDispatcher("boxoffice/dailyMovieList.jsp").forward(request, response);
		} catch (OpenAPIFault e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	//영화 주간리스트
	protected void movieWeeklyList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String targetDt = request.getParameter("targetDt");
		String targetDt = request.getParameter("targetDt") == null?"20180819":request.getParameter("targetDt");
		String itemPerPage = request.getParameter("itemPerPage")==null?"10":request.getParameter("itemPerPage");
		String weekGb = request.getParameter("weekGb")==null?"1":request.getParameter("weekGb");
		String multiMovieYn = request.getParameter("multiMovieYn")==null?"":request.getParameter("multiMovieYn");
		String reqNationCd = request.getParameter("multiMovieYn")==null?"":request.getParameter("multiMovieYn");
		String wideAreaCd = request.getParameter("wideAreaCd")==null?"":request.getParameter("wideAreaCd");
		
		
		try {
			String weeklyResponse = service.getWeeklyBoxOffice(true, targetDt, itemPerPage, weekGb, multiMovieYn, reqNationCd, wideAreaCd);
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String, Object> weeklyResult = mapper.readValue(weeklyResponse,  HashMap.class);
			
			request.setAttribute("weeklyResult", weeklyResult);
			
			String codeResponse=service.getComCodeList(true, "0105000000");
			HashMap<String,Object> codeResult = mapper.readValue(codeResponse, HashMap.class);
			request.setAttribute("codeResult", codeResult);
			request.setAttribute("targetDt", targetDt);
			request.setAttribute("itemPerPage", itemPerPage);
			request.setAttribute("weekGb", weekGb);
			request.setAttribute("multiMovieYn", multiMovieYn);
			request.setAttribute("reqNationCd", reqNationCd);
			request.setAttribute("wideAreaCd", wideAreaCd);
			request.getRequestDispatcher("boxoffice/weeklyMovieList.jsp").forward(request, response);
		} catch (OpenAPIFault e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//배우리스트
	protected void peopleList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		response.setContentType("text/plain;charset=EUC-KR");
		
		String curPage = request.getParameter("curPage")==null?"1":request.getParameter("curPage");					//현재페이지
		String itemPerPage = request.getParameter("itemPerPage")==null?"10":request.getParameter("itemPerPage");		//결과row수
		String peopleNm = request.getParameter("peopleNm")==null?"":request.getParameter("peopleNm");				//영화인명
		String filmoNames = request.getParameter("filmoNames")==null?"":request.getParameter("filmoNames");				//영화인 대표명
		//String reqRoleNm = request.getParameter("reqRoleNm");

		// 영화사코드조회 서비스 호출 
	    String peopleCdResponse;
		try {
			peopleCdResponse = service.getPeopleList(true, curPage, itemPerPage, peopleNm, filmoNames);
			// Json 라이브러리를 통해 Handling
			ObjectMapper mapper = new ObjectMapper();
			HashMap<String,Object> peopleResult = mapper.readValue(peopleCdResponse, HashMap.class);

			request.setAttribute("peopleResult",peopleResult);
			request.setAttribute("curPage", curPage);
			request.setAttribute("itemPerPage", itemPerPage);
			request.setAttribute("peopleNm", peopleNm);
			request.setAttribute("filmoNames", filmoNames);
			
			request.getRequestDispatcher("people/peopleList.jsp").forward(request, response);
		} catch (OpenAPIFault e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	
	
	
	//감독리스트
		protected void peopleList2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String curPage = request.getParameter("curPage")==null?"1":request.getParameter("curPage");					//현재페이지
			String itemPerPage = request.getParameter("itemPerPage")==null?"10":request.getParameter("itemPerPage");		//결과row수
			String peopleNm = request.getParameter("peopleNm")==null?"":request.getParameter("peopleNm");				//영화인명
			String filmoNames = request.getParameter("filmoNames")==null?"":request.getParameter("filmoNames");				//영화인 대표명
			//String reqRoleNm = request.getParameter("reqRoleNm");

			// 영화사코드조회 서비스 호출 
		    String peopleCdResponse;
			try {
				peopleCdResponse = service.getPeopleList(true, curPage, itemPerPage, peopleNm, filmoNames);
				// Json 라이브러리를 통해 Handling
				ObjectMapper mapper = new ObjectMapper();
				HashMap<String,Object> peopleResult = mapper.readValue(peopleCdResponse, HashMap.class);

				request.setAttribute("peopleResult",peopleResult);
				request.setAttribute("curPage", curPage);
				request.setAttribute("itemPerPage", itemPerPage);
				request.setAttribute("peopleNm", peopleNm);
				request.setAttribute("filmoNames", filmoNames);
				
				request.getRequestDispatcher("people/peopleList2.jsp").forward(request, response);
			} catch (OpenAPIFault e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		//일간 랭킹 간략 출력
		private void dailySummary(HttpServletRequest request, HttpServletResponse response) {
			System.out.println("cont");
			GregorianCalendar today = new GregorianCalendar();
			
			today.add(Calendar.DAY_OF_MONTH, -1);
			SimpleDateFormat format = new SimpleDateFormat("YYYYMMdd");
			String todayDate = format.format(today.getTime());
			

			
			
			String targetDt = request.getParameter("targetDt") == null?todayDate:request.getParameter("targetDt");
			String itemPerPage = request.getParameter("itemPerPage")==null?"10":request.getParameter("itemPerPage");
			String multiMovieYn = request.getParameter("multiMovieYn")==null?"":request.getParameter("multiMovieYn");
			String repNationCd = request.getParameter("repNationCd")==null?"":request.getParameter("repNationCd");
			String wideAreaCd = request.getParameter("wideAreaCd")==null?"":request.getParameter("wideAreaCd");
			
			
			try {
				String dailyResponse = service.getDailyBoxOffice(true, targetDt, itemPerPage,multiMovieYn,repNationCd,wideAreaCd);
				ObjectMapper mapper = new ObjectMapper();
				HashMap<String, Object> dailyResult = mapper.readValue(dailyResponse,  HashMap.class);
				
				request.setAttribute("dailyResult", dailyResult);
				
				String codeResponse=service.getComCodeList(true, "0105000000");
				HashMap<String,Object> codeResult = mapper.readValue(codeResponse, HashMap.class);
				request.setAttribute("codeResult", codeResult);
				request.setAttribute("targetDt", targetDt);
				request.setAttribute("itemPerPage", itemPerPage);
				request.setAttribute("multiMovieYn", multiMovieYn);
				request.setAttribute("reqNationCd", repNationCd);
				request.setAttribute("wideAreaCd", wideAreaCd);
				request.getRequestDispatcher("main.jsp").forward(request, response);
			} catch (OpenAPIFault e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
