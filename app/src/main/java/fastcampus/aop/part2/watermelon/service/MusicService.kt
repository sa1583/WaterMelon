package fastcampus.aop.part2.watermelon.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("/v3/8559e730-f373-4fcb-a624-3be0d0960baf")
    fun listMusics() : Call<MusicDto>
}