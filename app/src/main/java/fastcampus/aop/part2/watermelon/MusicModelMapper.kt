package fastcampus.aop.part2.watermelon

import com.google.android.exoplayer2.Player
import fastcampus.aop.part2.watermelon.service.MusicDto
import fastcampus.aop.part2.watermelon.service.MusicEntity

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )

fun MusicDto.mapper(): PlayerModel =
    PlayerModel(
        playMusicList = musics.mapIndexed { index, musicEntity ->
            musicEntity.mapper(index.toLong())
        }
    )