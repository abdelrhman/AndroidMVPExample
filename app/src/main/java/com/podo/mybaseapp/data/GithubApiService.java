package com.podo.mybaseapp.data;



import com.podo.mybaseapp.data.response.UserResponse;

import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by Miroslaw Stanek on 22.04.15.
 */
public interface GithubApiService {


    @GET("/users/{username}")
    Observable<UserResponse> getUser(
            @Path("username") String username
    );


}
