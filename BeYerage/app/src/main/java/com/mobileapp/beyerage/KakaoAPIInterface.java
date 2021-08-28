package com.mobileapp.beyerage;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface KakaoAPIInterface{

    //장소이름으로 검색
    @GET("v2/local/search/keyword.json")
    Call<ResultSearchKeyword> getSearchKeyword(
            @Header("Authorization") String key,
            @Query("query") String query,
            @Query("x") String x,
            @Query("y") String y
            //파라미터로 중심점이 되는 좌표를 같이 보내면 그 중심에 위치한 지역에서만 검색을 시도합니다.
            //ex)x=126.9706248&y=37.4802984 는 사당1동의 좌표입니다. 이 x,y값을 파라미터에 넣어서 전송하면
            //사당 1동을 중심으로 하여 검색한 결과값을 보내줍니다.
    );

//    카테고리로 검색
    @GET("v2/local/search/category.json")
    Call<ResultSearchKeyword> getSearchCategory(
            @Header("Authorization") String token,
            @Query("category_group_code") String category_group_code,
            @Query("x") String x,
            @Query("y") String y,
            @Query("radius") Integer radius
    );

    //장소이름으로 특정위치기준으로 검색
    @GET("v2/local/search/keyword.json")
    Call<ResultSearchKeyword> getSearchLocationDetail(
            @Header("Authorization") String token,
            @Query("query") String query,
            @Query("x") String x,
            @Query("y") String y,
            @Query("size") int size
    );
}
