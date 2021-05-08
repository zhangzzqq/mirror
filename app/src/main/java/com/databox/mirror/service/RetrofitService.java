package com.databox.mirror.service;

import com.databox.mirror.model.Book;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by win764-1 on .
 */

public interface RetrofitService {
    @GET("book/search")
    Observable<Book> getSearchBooks(@Query("q") String name,
                                    @Query("tag") String tag, @Query("start") int start,
                                    @Query("count") int count);
}
